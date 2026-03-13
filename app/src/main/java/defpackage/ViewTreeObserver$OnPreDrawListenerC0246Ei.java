package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: Ei  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0246Ei implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout b;

    public ViewTreeObserver$OnPreDrawListenerC0246Ei(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.p(0);
        return true;
    }
}
