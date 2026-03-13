package defpackage;

import com.applovin.impl.w9;
/* renamed from: nl0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2274nl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ w9 c;

    public /* synthetic */ RunnableC2274nl0(w9 w9Var, int i) {
        this.b = i;
        this.c = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                w9.D(this.c);
                return;
            case 1:
                w9.B(this.c);
                return;
            case 2:
                w9.A(this.c);
                return;
            default:
                w9.C(this.c);
                return;
        }
    }
}
