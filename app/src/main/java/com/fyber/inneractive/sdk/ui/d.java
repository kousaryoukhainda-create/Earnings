package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {
    public final /* synthetic */ FyberAdIdentifier a;

    public d(FyberAdIdentifier fyberAdIdentifier) {
        this.a = fyberAdIdentifier;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifier fyberAdIdentifier = this.a;
        fyberAdIdentifier.e = null;
        fyberAdIdentifier.d = !fyberAdIdentifier.d;
    }
}
