package defpackage;

import android.animation.ValueAnimator;
/* renamed from: Vd  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0682Vd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0708Wd b;

    public /* synthetic */ C0682Vd(C0708Wd c0708Wd, int i) {
        this.a = i;
        this.b = c0708Wd;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0708Wd c0708Wd = this.b;
                c0708Wd.c.setScaleX(floatValue);
                c0708Wd.c.setScaleY(floatValue);
                return;
        }
    }
}
