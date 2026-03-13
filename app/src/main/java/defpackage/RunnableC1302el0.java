package defpackage;

import com.applovin.impl.u9;
/* renamed from: el0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1302el0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ u9 c;

    public /* synthetic */ RunnableC1302el0(u9 u9Var, int i) {
        this.b = i;
        this.c = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                u9.B(this.c);
                return;
            case 1:
                u9.A(this.c);
                return;
            case 2:
                u9.F(this.c);
                return;
            case 3:
                u9.H(this.c);
                return;
            case 4:
                u9.E(this.c);
                return;
            case 5:
                u9.I(this.c);
                return;
            case 6:
                u9.G(this.c);
                return;
            default:
                u9.C(this.c);
                return;
        }
    }
}
