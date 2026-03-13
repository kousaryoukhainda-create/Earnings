package com.fyber.fairbid;
/* loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ u1 c;
    public final /* synthetic */ hj d;

    public /* synthetic */ O(hj hjVar, u1 u1Var) {
        this.d = hjVar;
        this.c = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hj.a(this.d, this.c);
                return;
            default:
                hj.a(this.c, this.d);
                return;
        }
    }

    public /* synthetic */ O(u1 u1Var, hj hjVar) {
        this.c = u1Var;
        this.d = hjVar;
    }
}
