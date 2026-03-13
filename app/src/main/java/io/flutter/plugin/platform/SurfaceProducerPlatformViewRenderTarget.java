package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
@TargetApi(29)
/* loaded from: classes2.dex */
public class SurfaceProducerPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final String TAG = "SurfaceProducerRenderTarget";
    private TextureRegistry.SurfaceProducer producer;

    public SurfaceProducerPlatformViewRenderTarget(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.producer = surfaceProducer;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.producer.getHeight();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.producer.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        return this.producer.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.producer.getWidth();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        if (this.producer == null) {
            return true;
        }
        return false;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        this.producer.release();
        this.producer = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i, int i2) {
        this.producer.setSize(i, i2);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void scheduleFrame() {
        this.producer.scheduleFrame();
    }
}
