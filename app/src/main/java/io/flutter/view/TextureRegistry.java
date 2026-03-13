package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.BuildConfig;
/* loaded from: classes2.dex */
public interface TextureRegistry {

    @Keep
    /* loaded from: classes2.dex */
    public interface GLTextureConsumer {
        @NonNull
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    /* loaded from: classes2.dex */
    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    /* loaded from: classes2.dex */
    public interface OnTrimMemoryListener {
        void onTrimMemory(int i);
    }

    /* loaded from: classes2.dex */
    public enum SurfaceLifecycle {
        manual,
        resetInBackground
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface SurfaceProducer extends TextureEntry {

        /* loaded from: classes2.dex */
        public interface Callback {
            void onSurfaceAvailable();

            void onSurfaceCleanup();

            @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.27")
            void onSurfaceCreated();

            @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.28")
            void onSurfaceDestroyed();
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(Callback callback);

        void setSize(int i, int i2);
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface SurfaceTextureEntry extends TextureEntry {
        void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener);

        void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener);

        @NonNull
        SurfaceTexture surfaceTexture();
    }

    /* loaded from: classes2.dex */
    public interface TextureEntry {
        long id();

        void release();
    }

    @NonNull
    ImageTextureEntry createImageTexture();

    @NonNull
    SurfaceProducer createSurfaceProducer();

    @NonNull
    SurfaceProducer createSurfaceProducer(SurfaceLifecycle surfaceLifecycle);

    @NonNull
    SurfaceTextureEntry createSurfaceTexture();

    void onTrimMemory(int i);

    @NonNull
    SurfaceTextureEntry registerSurfaceTexture(@NonNull SurfaceTexture surfaceTexture);
}
