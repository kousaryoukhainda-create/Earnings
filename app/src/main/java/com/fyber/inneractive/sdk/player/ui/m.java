package com.fyber.inneractive.sdk.player.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {
    public final /* synthetic */ l a;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        l lVar = this.a;
        ViewGroup viewGroup = lVar.A;
        if (viewGroup != null && viewGroup.getParent() != null) {
            ((View) lVar.A.getParent()).setOnTouchListener(null);
        }
    }
}
