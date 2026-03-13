package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.Log;
import io.flutter.view.TextureRegistry;
@TargetApi(29)
/* loaded from: classes2.dex */
public class ImageReaderPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final int MAX_IMAGES = 4;
    private static final String TAG = "ImageReaderPlatformViewRenderTarget";
    private ImageReader reader;
    private TextureRegistry.ImageTextureEntry textureEntry;
    private int bufferWidth = 0;
    private int bufferHeight = 0;
    private final Handler onImageAvailableHandler = new Handler();
    private final ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.1
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e) {
                Log.e(ImageReaderPlatformViewRenderTarget.TAG, "onImageAvailable acquireLatestImage failed: " + e.toString());
                image = null;
            }
            if (image == null) {
                return;
            }
            ImageReaderPlatformViewRenderTarget.this.textureEntry.pushImage(image);
        }
    };

    public ImageReaderPlatformViewRenderTarget(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.textureEntry = imageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    private void closeReader() {
        if (this.reader != null) {
            this.textureEntry.pushImage(null);
            this.reader.close();
            this.reader = null;
        }
    }

    public ImageReader createImageReader() {
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
    public ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.bufferWidth, this.bufferHeight, 34, 4, 256L);
        newInstance.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return newInstance;
    }

    @TargetApi(33)
    public ImageReader createImageReader33() {
        ImageReader build;
        I0.o();
        ImageReader.Builder d = I0.d(this.bufferWidth, this.bufferHeight);
        d.setMaxImages(4);
        d.setImageFormat(34);
        d.setUsage(256L);
        build = d.build();
        build.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return build;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.bufferHeight;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.textureEntry.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        return this.reader.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.bufferWidth;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        if (this.textureEntry == null) {
            return true;
        }
        return false;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        closeReader();
        this.textureEntry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i, int i2) {
        if (this.reader != null && this.bufferWidth == i && this.bufferHeight == i2) {
            return;
        }
        closeReader();
        this.bufferWidth = i;
        this.bufferHeight = i2;
        this.reader = createImageReader();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public final /* synthetic */ void scheduleFrame() {
        OR.a(this);
    }
}
