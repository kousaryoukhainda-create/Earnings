package defpackage;

import android.view.View;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
/* renamed from: QR  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class QR implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PlatformViewsAccessibilityDelegate c;

    public /* synthetic */ QR(PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate, int i, int i2) {
        this.a = i2;
        this.c = platformViewsAccessibilityDelegate;
        this.b = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                PlatformViewsController.d((PlatformViewsController) this.c, this.b, view, z);
                return;
            default:
                PlatformViewsController2.a((PlatformViewsController2) this.c, this.b, view, z);
                return;
        }
    }
}
