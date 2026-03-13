package defpackage;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.platform.PlatformViewsController;
/* renamed from: RR  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class RR implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlatformViewsController b;
    public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest c;

    public /* synthetic */ RR(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, int i) {
        this.a = i;
        this.b = platformViewsController;
        this.c = platformViewCreationRequest;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                this.b.lambda$configureForTextureLayerComposition$1(this.c, view, z);
                return;
            default:
                this.b.lambda$configureForVirtualDisplay$0(this.c, view, z);
                return;
        }
    }
}
