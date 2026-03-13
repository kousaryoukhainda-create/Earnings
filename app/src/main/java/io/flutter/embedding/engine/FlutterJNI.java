package io.flutter.embedding.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceControl;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import io.flutter.util.Preconditions;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
@Keep
/* loaded from: classes2.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private AccessibilityDelegate accessibilityDelegate;
    private DeferredComponentManager deferredComponentManager;
    private LocalizationPlugin localizationPlugin;
    private Long nativeShellHolderId;
    private PlatformMessageHandler platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    @NonNull
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
    @NonNull
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    @NonNull
    private final Looper mainLooper = Looper.getMainLooper();

    /* loaded from: classes2.dex */
    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr);

        void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr);
    }

    /* loaded from: classes2.dex */
    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j);
    }

    /* loaded from: classes2.dex */
    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    public static /* synthetic */ void a(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        lambda$decodeImage$0(j, imageDecoder, imageInfo, source);
    }

    private static void asyncWaitForVsync(long j) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 != null) {
            asyncWaitForVsyncDelegate2.asyncWaitForVsync(j);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Ix] */
    public static Bitmap decodeImage(@NonNull ByteBuffer byteBuffer, final long j) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: Ix
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.a(j, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e) {
                Log.e(TAG, "Failed to decode image", e);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(i, byteBuffer);
        }
    }

    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(@NonNull FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i, @NonNull String str, boolean z);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, @NonNull String str, int i);

    private native void nativeDispatchPlatformMessage(long j, @NonNull String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, @NonNull ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i, int i2);

    private static native void nativeInit(@NonNull Context context, @NonNull String[] strArr, String str, @NonNull String str2, @NonNull String str3, long j, int i);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i, @NonNull String[] strArr);

    @NonNull
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j2, long j3);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j2, @NonNull WeakReference<TextureRegistry.ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j, long j2, @NonNull WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, @NonNull String str, String str2, String str3, @NonNull AssetManager assetManager, List<String> list, long j2);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j2);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, @NonNull Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, @NonNull Surface surface);

    private native void nativeUnregisterTexture(long j, long j2);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, @NonNull AssetManager assetManager, @NonNull String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        for (FlutterEngine.EngineLifecycleListener engineLifecycleListener : this.engineLifecycleListeners) {
            engineLifecycleListener.onPreEngineRestart();
        }
    }

    private void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    private void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(@NonNull FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void addIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.applyTransactions();
            return;
        }
        throw new RuntimeException("");
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    public String[] computePlatformResolvedLocale(@NonNull String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i += 3) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            String str3 = strArr[i + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale resolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        if (resolveNativeLocale == null) {
            return new String[0];
        }
        return new String[]{resolveNativeLocale.getLanguage(), resolveNativeLocale.getCountry(), resolveNativeLocale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createTransaction();
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i, @NonNull String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.destroyOverlaySurface();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.destroyOverlaySurfaces();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(@NonNull String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, @NonNull AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i, action, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.onEndFrame();
            return;
        }
        throw new RuntimeException("");
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f, int i) {
        DisplayMetrics pastDisplayMetrics = SettingsChannel.getPastDisplayMetrics(i);
        if (pastDisplayMetrics == null) {
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i) + ", which can't be found.");
            return -1.0f;
        }
        return TypedValue.applyDimension(2, f, pastDisplayMetrics) / pastDisplayMetrics.density;
    }

    public void handlePlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i, long j) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(str, byteBuffer, i, j);
        } else {
            nativeCleanupMessageData(j);
        }
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.hideOverlaySurface();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void init(@NonNull Context context, @NonNull String[] strArr, String str, @NonNull String str2, @NonNull String str3, long j, int i) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j, i);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i, @NonNull ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
                } else {
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
                }
                this.shellHolderLock.readLock().unlock();
                return;
            } catch (Throwable th) {
                this.shellHolderLock.readLock().unlock();
                throw th;
            }
        }
        throw new IllegalArgumentException("Expected a direct ByteBuffer.");
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary(Context context) {
        C0750Xt c0750Xt;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C3244z4 c3244z4 = new C3244z4();
        if (context != null) {
            C3244z4.T("Beginning load of %s...", "flutter");
            C1486gw c1486gw = (C1486gw) c3244z4.c;
            HashSet hashSet = (HashSet) c3244z4.d;
            if (hashSet.contains("flutter")) {
                C3244z4.T("%s already loaded previously!", "flutter");
            } else {
                try {
                    c1486gw.getClass();
                    System.loadLibrary("flutter");
                    hashSet.add("flutter");
                    C3244z4.T("%s (%s) was loaded normally!", "flutter", null);
                } catch (UnsatisfiedLinkError e) {
                    C3244z4.T("Loading the library normally failed: %s", android.util.Log.getStackTraceString(e));
                    C3244z4.T("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                    File L = c3244z4.L(context);
                    if (!L.exists()) {
                        File dir = context.getDir("lib", 0);
                        File L2 = c3244z4.L(context);
                        c1486gw.getClass();
                        File[] listFiles = dir.listFiles(new LU(System.mapLibraryName("flutter")));
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.getAbsolutePath().equals(L2.getAbsolutePath())) {
                                    file.delete();
                                }
                            }
                        }
                        String[] strArr2 = Build.SUPPORTED_ABIS;
                        if (strArr2.length <= 0) {
                            String str = Build.CPU_ABI2;
                            if (str != null && str.length() != 0) {
                                strArr2 = new String[]{Build.CPU_ABI, str};
                            } else {
                                strArr2 = new String[]{Build.CPU_ABI};
                            }
                        }
                        String mapLibraryName = System.mapLibraryName("flutter");
                        ((C2999wB) c3244z4.f).getClass();
                        try {
                            C0750Xt p = C2999wB.p(context, strArr2, mapLibraryName, c3244z4);
                            try {
                                if (p != null) {
                                    int i = 0;
                                    while (true) {
                                        int i2 = i + 1;
                                        zipFile = (ZipFile) p.c;
                                        if (i < 5) {
                                            Object[] objArr = new Object[1];
                                            objArr[c] = mapLibraryName;
                                            C3244z4.T("Found %s! Extracting...", objArr);
                                            try {
                                                if (L.exists() || L.createNewFile()) {
                                                    try {
                                                        inputStream2 = zipFile.getInputStream((ZipEntry) p.d);
                                                    } catch (FileNotFoundException unused) {
                                                        inputStream2 = null;
                                                    } catch (IOException unused2) {
                                                        inputStream2 = null;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        inputStream = null;
                                                    }
                                                    try {
                                                        fileOutputStream2 = new FileOutputStream(L);
                                                        try {
                                                            byte[] bArr = new byte[4096];
                                                            long j = 0;
                                                            while (true) {
                                                                int read = inputStream2.read(bArr);
                                                                if (read == -1) {
                                                                    break;
                                                                }
                                                                fileOutputStream2.write(bArr, 0, read);
                                                                j += read;
                                                            }
                                                            fileOutputStream2.flush();
                                                            fileOutputStream2.getFD().sync();
                                                            if (j != L.length()) {
                                                                C2999wB.m(inputStream2);
                                                                C2999wB.m(fileOutputStream2);
                                                            } else {
                                                                C2999wB.m(inputStream2);
                                                                C2999wB.m(fileOutputStream2);
                                                                L.setReadable(true, false);
                                                                L.setExecutable(true, false);
                                                                L.setWritable(true);
                                                                break;
                                                            }
                                                        } catch (FileNotFoundException unused3) {
                                                            C2999wB.m(inputStream2);
                                                            C2999wB.m(fileOutputStream2);
                                                            i = i2;
                                                            c = 0;
                                                        } catch (IOException unused4) {
                                                            C2999wB.m(inputStream2);
                                                            C2999wB.m(fileOutputStream2);
                                                            i = i2;
                                                            c = 0;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = inputStream2;
                                                            fileOutputStream = fileOutputStream2;
                                                            C2999wB.m(inputStream);
                                                            C2999wB.m(fileOutputStream);
                                                            throw th;
                                                        }
                                                    } catch (FileNotFoundException unused5) {
                                                        fileOutputStream2 = null;
                                                        C2999wB.m(inputStream2);
                                                        C2999wB.m(fileOutputStream2);
                                                        i = i2;
                                                        c = 0;
                                                    } catch (IOException unused6) {
                                                        fileOutputStream2 = null;
                                                        C2999wB.m(inputStream2);
                                                        C2999wB.m(fileOutputStream2);
                                                        i = i2;
                                                        c = 0;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = null;
                                                        C2999wB.m(inputStream);
                                                        C2999wB.m(fileOutputStream);
                                                        throw th;
                                                    }
                                                }
                                            } catch (IOException unused7) {
                                            }
                                            i = i2;
                                            c = 0;
                                        }
                                    }
                                    try {
                                        zipFile.close();
                                    } catch (IOException unused8) {
                                        String absolutePath = L.getAbsolutePath();
                                        c1486gw.getClass();
                                        System.load(absolutePath);
                                        hashSet.add("flutter");
                                        C3244z4.T("%s (%s) was re-linked!", "flutter", null);
                                        loadLibraryCalled = true;
                                        return;
                                    }
                                } else {
                                    try {
                                        strArr = C2999wB.w(context, mapLibraryName);
                                    } catch (Exception e2) {
                                        strArr = new String[]{e2.toString()};
                                    }
                                    StringBuilder m = AbstractC0324Hi.m("Could not find '", mapLibraryName, "'. Looked for: ");
                                    m.append(Arrays.toString(strArr2));
                                    m.append(", but only found: ");
                                    throw new RuntimeException(AbstractC0324Hi.h(m, Arrays.toString(strArr), "."));
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c0750Xt = p;
                                if (c0750Xt != null) {
                                    try {
                                        ((ZipFile) c0750Xt.c).close();
                                    } catch (IOException unused9) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c0750Xt = null;
                        }
                    }
                    String absolutePath2 = L.getAbsolutePath();
                    c1486gw.getClass();
                    System.load(absolutePath2);
                    hashSet.add("flutter");
                    C3244z4.T("%s (%s) was re-linked!", "flutter", null);
                }
            }
            loadLibraryCalled = true;
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onBeginFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onDisplayOverlaySurface(i, i2, i3, i4, i5);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onDisplayPlatformView(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.onDisplayPlatformView(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.onEndFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (FlutterUiDisplayListener flutterUiDisplayListener : this.flutterUiDisplayListeners) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (FlutterUiDisplayListener flutterUiDisplayListener : this.flutterUiDisplayListeners) {
            flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
    }

    public void onSurfaceCreated(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j2, long j3) {
        nativeOnVsync(j, j2, j3);
    }

    public long performNativeAttach(@NonNull FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j, @NonNull TextureRegistry.ImageConsumer imageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(imageConsumer), z);
    }

    public void registerTexture(long j, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(@NonNull FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    public void removeIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void requestDartDeferredLibrary(int i) {
        DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.installDeferredComponent(i, null);
        } else {
            Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void runBundleAndSnapshotFromLibrary(@NonNull String str, String str2, String str3, @NonNull AssetManager assetManager, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    public void setLocalizationPlugin(LocalizationPlugin localizationPlugin) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    public void setPlatformViewsController(@NonNull PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setPlatformViewsController2(@NonNull PlatformViewsController2 platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = platformViewsController2;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z);
        }
    }

    public void setSemanticsEnabledInNative(boolean z) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.showOverlaySurface();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    @NonNull
    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        boolean z;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l = nativeSpawn.nativeShellHolderId;
        if (l != null && l.longValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            platformViewsController2.swapTransactions();
            return;
        }
        throw new RuntimeException("");
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i, float f, float f2, float f3) {
        displayWidth = f;
        displayHeight = f2;
        displayDensity = f3;
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
    }

    public void updateJavaAssetManager(@NonNull AssetManager assetManager, @NonNull String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateRefreshRate(refreshRateFPS);
    }

    public void dispatchSemanticsAction(int i, @NonNull AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, action.value, byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }
}
