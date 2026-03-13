package defpackage;

import androidx.fragment.app.n;
/* renamed from: Ay  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0158Ay implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ n c;

    public /* synthetic */ RunnableC0158Ay(n nVar, int i) {
        this.b = i;
        this.c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.startPostponedEnterTransition();
                return;
            default:
                this.c.callStartTransitionListener(false);
                return;
        }
    }
}
