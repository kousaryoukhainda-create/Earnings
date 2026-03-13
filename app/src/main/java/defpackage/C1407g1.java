package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
/* renamed from: g1  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1407g1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1407g1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.v = null;
                actionBarOverlayLayout.k = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.v = null;
                actionBarOverlayLayout.k = false;
                return;
            case 1:
                C2795tq c2795tq = (C2795tq) this.b;
                c2795tq.c.setChecked(c2795tq.k);
                c2795tq.q.start();
                return;
            case 2:
                ((HideBottomViewOnScrollBehavior) this.b).c = null;
                return;
            default:
                ((AbstractC1165d80) this.b).p();
                animator.removeListener(this);
                return;
        }
    }
}
