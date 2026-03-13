package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;
/* renamed from: T9  reason: default package */
/* loaded from: classes3.dex */
public final class T9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC1279ea b;

    public /* synthetic */ T9(AbstractC1279ea abstractC1279ea, int i) {
        this.a = i;
        this.b = abstractC1279ea;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c();
                return;
            case 1:
                this.b.b();
                return;
            case 2:
                this.b.c();
                return;
            default:
                this.b.b();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                SnackbarContentLayout snackbarContentLayout = this.b.d;
                snackbarContentLayout.b.setAlpha(0.0f);
                long j = 180;
                long j2 = 70;
                snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                if (snackbarContentLayout.c.getVisibility() == 0) {
                    snackbarContentLayout.c.setAlpha(0.0f);
                    snackbarContentLayout.c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                    return;
                }
                return;
            case 3:
                SnackbarContentLayout snackbarContentLayout2 = this.b.d;
                snackbarContentLayout2.b.setAlpha(1.0f);
                long j3 = 180;
                long j4 = 0;
                snackbarContentLayout2.b.animate().alpha(0.0f).setDuration(j3).setStartDelay(j4).start();
                if (snackbarContentLayout2.c.getVisibility() == 0) {
                    snackbarContentLayout2.c.setAlpha(1.0f);
                    snackbarContentLayout2.c.animate().alpha(0.0f).setDuration(j3).setStartDelay(j4).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ T9(AbstractC1279ea abstractC1279ea, int i, int i2) {
        this.a = i2;
        this.b = abstractC1279ea;
    }
}
