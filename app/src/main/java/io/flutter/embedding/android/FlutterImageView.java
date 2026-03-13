package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;
import java.nio.ByteBuffer;
import java.util.Locale;
/* loaded from: classes2.dex */
public class FlutterImageView extends View implements RenderSurface {
    private static final String TAG = "FlutterImageView";
    private Bitmap currentBitmap;
    private Image currentImage;
    private FlutterRenderer flutterRenderer;
    @NonNull
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private SurfaceKind kind;

    /* renamed from: io.flutter.embedding.android.FlutterImageView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind;

        static {
            int[] iArr = new int[SurfaceKind.values().length];
            $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind = iArr;
            try {
                iArr[SurfaceKind.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind[SurfaceKind.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    public FlutterImageView(@NonNull Context context, int i, int i2, SurfaceKind surfaceKind) {
        this(context, createImageReader(i, i2), surfaceKind);
    }

    private void closeCurrentImage() {
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private static ImageReader createImageReader(int i, int i2) {
        ImageReader newInstance;
        if (i <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i = 1;
        }
        if (i2 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i2 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            newInstance = ImageReader.newInstance(i, i2, 1, 3, 768L);
            return newInstance;
        }
        return ImageReader.newInstance(i, i2, 1, 3);
    }

    private void init() {
        setAlpha(0.0f);
    }

    private static void logW(String str, Object... objArr) {
        Log.w(TAG, String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void updateCurrentBitmap() {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            hardwareBuffer = this.currentImage.getHardwareBuffer();
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
            this.currentBitmap = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.currentImage.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.currentImage.getHeight();
        Bitmap bitmap = this.currentBitmap;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
            this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.currentBitmap.copyPixelsFromBuffer(buffer);
    }

    public boolean acquireLatestImage() {
        if (!this.isAttachedToFlutterRenderer) {
            return false;
        }
        Image acquireLatestImage = this.imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            closeCurrentImage();
            this.currentImage = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage == null) {
            return false;
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(@NonNull FlutterRenderer flutterRenderer) {
        if (AnonymousClass1.$SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind[this.kind.ordinal()] == 1) {
            flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
        setAlpha(1.0f);
        this.flutterRenderer = flutterRenderer;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        this.imageReader.close();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (!this.isAttachedToFlutterRenderer) {
            return;
        }
        setAlpha(0.0f);
        acquireLatestImage();
        this.currentBitmap = null;
        closeCurrentImage();
        invalidate();
        this.isAttachedToFlutterRenderer = false;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    @NonNull
    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if ((i != this.imageReader.getWidth() || i2 != this.imageReader.getHeight()) && this.kind == SurfaceKind.background && this.isAttachedToFlutterRenderer) {
            resizeIfNeeded(i, i2);
            this.flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
    }

    public void resizeIfNeeded(int i, int i2) {
        if (this.flutterRenderer == null) {
            return;
        }
        if (i == this.imageReader.getWidth() && i2 == this.imageReader.getHeight()) {
            return;
        }
        closeCurrentImage();
        closeImageReader();
        this.imageReader = createImageReader(i, i2);
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void resume() {
    }

    public FlutterImageView(@NonNull Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(@NonNull Context context, @NonNull ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, null);
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
    }
}
