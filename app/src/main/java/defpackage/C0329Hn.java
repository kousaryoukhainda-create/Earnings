package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;
/* renamed from: Hn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329Hn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ i b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ C0458Mn e;

    public C0329Hn(C0458Mn c0458Mn, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = c0458Mn;
        this.b = iVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
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
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                C0458Mn c0458Mn = this.e;
                i iVar = this.b;
                c0458Mn.c(iVar);
                c0458Mn.q.remove(iVar);
                c0458Mn.i();
                return;
            default:
                this.d.setListener(null);
                C0458Mn c0458Mn2 = this.e;
                i iVar2 = this.b;
                c0458Mn2.c(iVar2);
                c0458Mn2.o.remove(iVar2);
                c0458Mn2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public C0329Hn(C0458Mn c0458Mn, i iVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = c0458Mn;
        this.b = iVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
