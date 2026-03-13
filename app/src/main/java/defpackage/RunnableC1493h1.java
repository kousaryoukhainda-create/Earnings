package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: h1  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1493h1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ActionBarOverlayLayout c;

    public /* synthetic */ RunnableC1493h1(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.b = i;
        this.c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.v = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.w);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.v = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.w);
                return;
        }
    }
}
