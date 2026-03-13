package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterRenderer.ImageReaderSurfaceProducer.a((FlutterRenderer.ImageReaderSurfaceProducer) this.c);
                return;
            default:
                FlutterRenderer.SurfaceTextureRegistryEntry.b((FlutterRenderer.SurfaceTextureRegistryEntry) this.c);
                return;
        }
    }
}
