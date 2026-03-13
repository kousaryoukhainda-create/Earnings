package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
@TargetApi(11)
/* loaded from: classes.dex */
public class IAsmoothProgressBar extends ProgressBar {
    public static final Interpolator c = new AccelerateDecelerateInterpolator();
    public ValueAnimator a;
    public ValueAnimator b;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        try {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.a;
            if (valueAnimator2 == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
                this.a = ofInt;
                ofInt.setInterpolator(c);
                this.a.addUpdateListener(new a());
            } else {
                valueAnimator2.setIntValues(getProgress(), i);
            }
            this.a.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        try {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.b;
            if (valueAnimator2 == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
                this.b = ofInt;
                ofInt.setInterpolator(c);
                this.b.addUpdateListener(new b());
            } else {
                valueAnimator2.setIntValues(getProgress(), i);
            }
            this.b.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
