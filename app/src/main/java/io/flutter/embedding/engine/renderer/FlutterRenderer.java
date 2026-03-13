package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";
    public static boolean debugDisableSurfaceClear = false;
    public static boolean debugForceSurfaceProducerGlTextures = false;
    @NonNull
    private final FlutterJNI flutterJNI;
    @NonNull
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private Surface surface;
    @NonNull
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private boolean isDisplayingFlutterUi = false;
    private final Handler handler = new Handler();
    @NonNull
    private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();
    @NonNull
    private final List<ImageReaderSurfaceProducer> imageReaderProducers = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    /* loaded from: classes2.dex */
    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int encodedValue;

        DisplayFeatureState(int i) {
            this.encodedValue = i;
        }
    }

    /* loaded from: classes2.dex */
    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int encodedValue;

        DisplayFeatureType(int i) {
            this.encodedValue = i;
        }
    }

    @Keep
    @TargetApi(29)
    /* loaded from: classes2.dex */
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 6;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        private final long id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private boolean notifiedDestroy = false;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap<>();
        private ArrayList<PerImage> lastDequeuedImage = new ArrayList<>();
        private PerImageReader lastReaderDequeuedFrom = null;
        private TextureRegistry.SurfaceProducer.Callback callback = null;

        /* loaded from: classes2.dex */
        public class PerImage {
            public final Image image;
            public final long queuedTime;

            public PerImage(Image image, long j) {
                ImageReaderSurfaceProducer.this = r1;
                this.image = image;
                this.queuedTime = j;
            }
        }

        /* loaded from: classes2.dex */
        public class PerImageReader {
            public final ImageReader reader;
            private final ArrayDeque<PerImage> imageQueue = new ArrayDeque<>();
            private boolean closed = false;

            public PerImageReader(ImageReader imageReader) {
                ImageReaderSurfaceProducer.this = r3;
                this.reader = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.b
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader.this.lambda$new$0(imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            public /* synthetic */ void lambda$new$0(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e) {
                    Log.e(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (!ImageReaderSurfaceProducer.this.released && !this.closed) {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                } else {
                    image.close();
                }
            }

            public boolean canPrune() {
                if (this.imageQueue.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this) {
                    return true;
                }
                return false;
            }

            public void close() {
                this.closed = true;
                this.reader.close();
                this.imageQueue.clear();
            }

            public PerImage dequeueImage() {
                if (this.imageQueue.isEmpty()) {
                    return null;
                }
                return this.imageQueue.removeFirst();
            }

            public boolean imageQueueIsEmpty() {
                return this.imageQueue.isEmpty();
            }

            public PerImage queueImage(Image image) {
                if (this.closed) {
                    return null;
                }
                PerImage perImage = new PerImage(image, System.nanoTime());
                this.imageQueue.add(perImage);
                while (this.imageQueue.size() > 2) {
                    this.imageQueue.removeFirst().image.close();
                }
                return perImage;
            }
        }

        public ImageReaderSurfaceProducer(long j) {
            FlutterRenderer.this = r3;
            this.id = j;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (PerImageReader perImageReader : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == perImageReader) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        perImageReader.close();
                    }
                    this.perImageReaders.clear();
                    if (this.lastDequeuedImage.size() > 0) {
                        Iterator<PerImage> it = this.lastDequeuedImage.iterator();
                        while (it.hasNext()) {
                            it.next().image.close();
                        }
                        this.lastDequeuedImage.clear();
                    }
                    PerImageReader perImageReader2 = this.lastReaderDequeuedFrom;
                    if (perImageReader2 != null) {
                        perImageReader2.close();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                return createImageReader33();
            }
            if (i >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            ImageReader newInstance;
            newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
            return newInstance;
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            ImageReader build;
            I0.o();
            ImageReader.Builder d = I0.d(this.requestedWidth, this.requestedHeight);
            d.setMaxImages(6);
            d.setImageFormat(34);
            d.setUsage(256L);
            build = d.build();
            return build;
        }

        private PerImageReader getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (this.createNewReader) {
                        this.createNewReader = false;
                        return getOrCreatePerImageReader(createImageReader());
                    }
                    return this.imageReaderQueue.peekLast();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ void lambda$dequeueImage$0() {
            if (!this.released) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
            FlutterRenderer.this.imageReaderProducers.remove(this);
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            PerImage dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.image);
            return dequeueImage.image;
        }

        public double deltaMillis(long j) {
            return j / 1000000.0d;
        }

        public PerImage dequeueImage() {
            PerImage perImage;
            boolean z;
            synchronized (this.lock) {
                try {
                    Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                    perImage = null;
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        PerImageReader next = it.next();
                        PerImage dequeueImage = next.dequeueImage();
                        if (dequeueImage == null) {
                            perImage = dequeueImage;
                        } else {
                            while (this.lastDequeuedImage.size() > 2) {
                                this.lastDequeuedImage.remove(0).image.close();
                            }
                            this.lastDequeuedImage.add(dequeueImage);
                            this.lastReaderDequeuedFrom = next;
                            perImage = dequeueImage;
                        }
                    }
                    pruneImageReaderQueue();
                    Iterator<PerImageReader> it2 = this.imageReaderQueue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (!it2.next().imageQueueIsEmpty()) {
                            z = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                FlutterRenderer.this.handler.post(new a(this, 0));
            }
            return perImage;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        public PerImageReader getOrCreatePerImageReader(ImageReader imageReader) {
            PerImageReader perImageReader = this.perImageReaders.get(imageReader);
            if (perImageReader == null) {
                PerImageReader perImageReader2 = new PerImageReader(imageReader);
                this.perImageReaders.put(imageReader, perImageReader2);
                this.imageReaderQueue.add(perImageReader2);
                return perImageReader2;
            }
            return perImageReader;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().reader.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public boolean handlesCropAndRotation() {
            return false;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i;
            synchronized (this.lock) {
                try {
                    Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += it.next().imageQueue.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        public int numTrims() {
            int i;
            synchronized (this.lock) {
                i = this.numTrims;
            }
            return i;
        }

        public void onImage(ImageReader imageReader, Image image) {
            PerImage queueImage;
            synchronized (this.lock) {
                queueImage = getOrCreatePerImageReader(imageReader).queueImage(image);
            }
            if (queueImage == null) {
                return;
            }
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i) {
            if (i < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            TextureRegistry.SurfaceProducer.Callback callback = this.callback;
            if (callback != null) {
                this.notifiedDestroy = true;
                callback.onSurfaceCleanup();
            }
            cleanup();
            this.createNewReader = true;
        }

        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            PerImageReader peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.canPrune()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.reader);
                peekFirst.close();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.unregisterTexture(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
            this.callback = callback;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i, int i2) {
            int max = Math.max(1, i);
            int max2 = Math.max(1, i2);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j) {
            FlutterRenderer.this = r1;
            this.id = j;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                Log.e(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.unregisterTexture(this.id);
        }
    }

    /* loaded from: classes2.dex */
    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {
        private TextureRegistry.OnFrameConsumedListener frameConsumedListener;
        private final long id;
        private boolean released;
        @NonNull
        private final SurfaceTextureWrapper textureWrapper;
        private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        public SurfaceTextureRegistryEntry(long j, @NonNull SurfaceTexture surfaceTexture) {
            FlutterRenderer.this = r1;
            this.id = j;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, new a(this, 1));
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.c
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    FlutterRenderer.SurfaceTextureRegistryEntry.this.lambda$new$1(surfaceTexture2);
                }
            }, new Handler());
        }

        public /* synthetic */ void lambda$new$0() {
            TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = this.frameConsumedListener;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.onFrameConsumed();
            }
        }

        public /* synthetic */ void lambda$new$1(SurfaceTexture surfaceTexture) {
            if (!this.released && FlutterRenderer.this.flutterJNI.isAttached()) {
                this.textureWrapper.markDirty();
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        private void removeListener() {
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i);
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            Log.v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.id + ").");
            this.textureWrapper.release();
            FlutterRenderer.this.unregisterTexture(this.id);
            removeListener();
            this.released = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        @NonNull
        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        @NonNull
        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;
        private final long id;

        public TextureFinalizerRunnable(long j, @NonNull FlutterJNI flutterJNI) {
            this.id = j;
            this.flutterJNI = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.flutterJNI.isAttached()) {
                return;
            }
            Log.v(FlutterRenderer.TAG, "Releasing a Texture (" + this.id + ").");
            this.flutterJNI.unregisterTexture(this.id);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public int width = 0;
        public int height = 0;
        public int viewPaddingTop = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewInsetTop = 0;
        public int viewInsetRight = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int systemGestureInsetTop = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int physicalTouchSlop = -1;
        private final List<DisplayFeature> displayFeatures = new ArrayList();
        private final List<DisplayFeature> displayCutouts = new ArrayList();

        public List<DisplayFeature> getDisplayCutouts() {
            return this.displayCutouts;
        }

        public List<DisplayFeature> getDisplayFeatures() {
            return this.displayFeatures;
        }

        public void setDisplayCutouts(List<DisplayFeature> list) {
            this.displayCutouts.clear();
            this.displayCutouts.addAll(list);
        }

        public void setDisplayFeatures(List<DisplayFeature> list) {
            this.displayFeatures.clear();
            this.displayFeatures.addAll(list);
        }

        public boolean validate() {
            if (this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f) {
                return true;
            }
            return false;
        }
    }

    public FlutterRenderer(@NonNull FlutterJNI flutterJNI) {
        FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
            {
                FlutterRenderer.this = this;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = flutterUiDisplayListener;
        this.flutterJNI = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        C1444gT.k.h.a(new InterfaceC0484Nn() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.2
            {
                FlutterRenderer.this = this;
            }

            @Override // defpackage.InterfaceC0484Nn
            public void onCreate(@NotNull HG owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
            }

            @Override // defpackage.InterfaceC0484Nn
            public void onDestroy(@NotNull HG owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
            }

            @Override // defpackage.InterfaceC0484Nn
            public void onPause(@NotNull HG owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
            }

            @Override // defpackage.InterfaceC0484Nn
            public void onResume(@NonNull HG hg) {
                Log.v(FlutterRenderer.TAG, "onResume called; notifying SurfaceProducers");
                for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : FlutterRenderer.this.imageReaderProducers) {
                    if (imageReaderSurfaceProducer.callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
                        imageReaderSurfaceProducer.notifiedDestroy = false;
                        imageReaderSurfaceProducer.callback.onSurfaceAvailable();
                    }
                }
            }

            @Override // defpackage.InterfaceC0484Nn
            public void onStart(@NotNull HG owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
            }

            @Override // defpackage.InterfaceC0484Nn
            public void onStop(@NotNull HG owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
            }
        });
    }

    private void clearDeadListeners() {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void registerImageTexture(long j, @NonNull TextureRegistry.ImageConsumer imageConsumer, boolean z) {
        this.flutterJNI.registerImageTexture(j, imageConsumer, z);
    }

    private void registerTexture(long j, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j, surfaceTextureWrapper);
    }

    private void translateFeatureBounds(int[] iArr, int i, Rect rect) {
        iArr[i] = rect.left;
        iArr[i + 1] = rect.top;
        iArr[i + 2] = rect.right;
        iArr[i + 3] = rect.bottom;
    }

    public void unregisterTexture(long j) {
        this.flutterJNI.unregisterTexture(j);
    }

    public void addIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public void addOnTrimMemoryListener(@NonNull TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new WeakReference<>(onTrimMemoryListener));
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.ImageTextureEntry createImageTexture() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
        Log.v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        registerImageTexture(imageTextureRegistryEntry.id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public final /* synthetic */ TextureRegistry.SurfaceProducer createSurfaceProducer() {
        return AbstractC2132m60.a(this);
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        this.flutterJNI.dispatchSemanticsAction(i, i2, byteBuffer, i3);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    @Override // io.flutter.view.TextureRegistry
    public void onTrimMemory(int i) {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(@NonNull SurfaceTexture surfaceTexture) {
        return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
    }

    public void removeIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    public void removeOnTrimMemoryListener(@NonNull TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (WeakReference<TextureRegistry.OnTrimMemoryListener> weakReference : this.onTrimMemoryListeners) {
            if (weakReference.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(weakReference);
                return;
            }
        }
    }

    public void scheduleEngineFrame() {
        this.flutterJNI.scheduleFrame();
    }

    public void setAccessibilityFeatures(int i) {
        this.flutterJNI.setAccessibilityFeatures(i);
    }

    public void setSemanticsEnabled(boolean z) {
        this.flutterJNI.setSemanticsEnabled(z);
    }

    public void setViewportMetrics(@NonNull ViewportMetrics viewportMetrics) {
        if (!viewportMetrics.validate()) {
            return;
        }
        Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.width + " x " + viewportMetrics.height + "\nPadding - L: " + viewportMetrics.viewPaddingLeft + ", T: " + viewportMetrics.viewPaddingTop + ", R: " + viewportMetrics.viewPaddingRight + ", B: " + viewportMetrics.viewPaddingBottom + "\nInsets - L: " + viewportMetrics.viewInsetLeft + ", T: " + viewportMetrics.viewInsetTop + ", R: " + viewportMetrics.viewInsetRight + ", B: " + viewportMetrics.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics.systemGestureInsetLeft + ", T: " + viewportMetrics.systemGestureInsetTop + ", R: " + viewportMetrics.systemGestureInsetRight + ", B: " + viewportMetrics.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size() + "\nDisplay Cutouts: " + viewportMetrics.displayCutouts.size());
        int size = viewportMetrics.displayCutouts.size() + viewportMetrics.displayFeatures.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i = 0; i < viewportMetrics.displayFeatures.size(); i++) {
            DisplayFeature displayFeature = (DisplayFeature) viewportMetrics.displayFeatures.get(i);
            translateFeatureBounds(iArr, i * 4, displayFeature.bounds);
            iArr2[i] = displayFeature.type.encodedValue;
            iArr3[i] = displayFeature.state.encodedValue;
        }
        int size2 = viewportMetrics.displayFeatures.size() * 4;
        for (int i2 = 0; i2 < viewportMetrics.displayCutouts.size(); i2++) {
            DisplayFeature displayFeature2 = (DisplayFeature) viewportMetrics.displayCutouts.get(i2);
            translateFeatureBounds(iArr, (i2 * 4) + size2, displayFeature2.bounds);
            iArr2[viewportMetrics.displayFeatures.size() + i2] = displayFeature2.type.encodedValue;
            iArr3[viewportMetrics.displayFeatures.size() + i2] = displayFeature2.state.encodedValue;
        }
        this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.viewPaddingTop, viewportMetrics.viewPaddingRight, viewportMetrics.viewPaddingBottom, viewportMetrics.viewPaddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, iArr, iArr2, iArr3);
    }

    public void startRenderingToSurface(@NonNull Surface surface, boolean z) {
        if (!z) {
            stopRenderingToSurface();
        }
        this.surface = surface;
        if (z) {
            this.flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            this.flutterJNI.onSurfaceCreated(surface);
        }
    }

    public void stopRenderingToSurface() {
        if (this.surface != null) {
            this.flutterJNI.onSurfaceDestroyed();
            if (this.isDisplayingFlutterUi) {
                this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
            }
            this.isDisplayingFlutterUi = false;
            this.surface = null;
        }
    }

    public void surfaceChanged(int i, int i2) {
        this.flutterJNI.onSurfaceChanged(i, i2);
    }

    public void swapSurface(@NonNull Surface surface) {
        this.surface = surface;
        this.flutterJNI.onSurfaceWindowChanged(surface);
    }

    @NonNull
    private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j, @NonNull SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(j, surfaceTexture);
        Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id());
        registerTexture(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.SurfaceProducer createSurfaceProducer(TextureRegistry.SurfaceLifecycle surfaceLifecycle) {
        if (!debugForceSurfaceProducerGlTextures && Build.VERSION.SDK_INT >= 29) {
            long andIncrement = this.nextTextureId.getAndIncrement();
            ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
            boolean z = surfaceLifecycle == TextureRegistry.SurfaceLifecycle.resetInBackground;
            registerImageTexture(andIncrement, imageReaderSurfaceProducer, z);
            if (z) {
                addOnTrimMemoryListener(imageReaderSurfaceProducer);
            }
            this.imageReaderProducers.add(imageReaderSurfaceProducer);
            Log.v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
            return imageReaderSurfaceProducer;
        }
        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = createSurfaceTexture();
        SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new SurfaceTextureSurfaceProducer(createSurfaceTexture.id(), this.handler, this.flutterJNI, createSurfaceTexture);
        Log.v(TAG, "New SurfaceTextureSurfaceProducer ID: " + createSurfaceTexture.id());
        return surfaceTextureSurfaceProducer;
    }
}
