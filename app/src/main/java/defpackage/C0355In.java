package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;
/* renamed from: In  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355In extends AnimatorListenerAdapter {
    public final /* synthetic */ i a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ C0458Mn f;

    public C0355In(C0458Mn c0458Mn, i iVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = c0458Mn;
        this.a = iVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        C0458Mn c0458Mn = this.f;
        i iVar = this.a;
        c0458Mn.c(iVar);
        c0458Mn.p.remove(iVar);
        c0458Mn.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
