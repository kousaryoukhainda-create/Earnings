package com.fyber.fairbid;
/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ q9 c;

    public /* synthetic */ J0(q9 q9Var, int i) {
        this.b = i;
        this.c = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                q9.b(this.c);
                return;
            default:
                q9.a(this.c);
                return;
        }
    }
}
