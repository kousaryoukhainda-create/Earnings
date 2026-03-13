package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;
/* renamed from: Jn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381Jn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0407Kn b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ C0458Mn e;

    public /* synthetic */ C0381Jn(C0458Mn c0458Mn, C0407Kn c0407Kn, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = c0458Mn;
        this.b = c0407Kn;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0407Kn c0407Kn = this.b;
                i iVar = c0407Kn.a;
                C0458Mn c0458Mn = this.e;
                c0458Mn.c(iVar);
                c0458Mn.r.remove(c0407Kn.a);
                c0458Mn.i();
                return;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0407Kn c0407Kn2 = this.b;
                i iVar2 = c0407Kn2.b;
                C0458Mn c0458Mn2 = this.e;
                c0458Mn2.c(iVar2);
                c0458Mn2.r.remove(c0407Kn2.b);
                c0458Mn2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                i iVar = this.b.a;
                this.e.getClass();
                return;
            default:
                i iVar2 = this.b.b;
                this.e.getClass();
                return;
        }
    }
}
