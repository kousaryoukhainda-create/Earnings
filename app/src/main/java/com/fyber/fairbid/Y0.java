package com.fyber.fairbid;
/* loaded from: classes.dex */
public final /* synthetic */ class Y0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ z3 c;
    public final /* synthetic */ int d;

    public /* synthetic */ Y0(z3 z3Var, int i, int i2) {
        this.b = i2;
        this.c = z3Var;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                z3.a(this.c, this.d);
                return;
            default:
                z3.b(this.c, this.d);
                return;
        }
    }
}
