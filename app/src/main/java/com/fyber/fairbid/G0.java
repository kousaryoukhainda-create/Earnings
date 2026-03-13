package com.fyber.fairbid;
/* loaded from: classes.dex */
public final /* synthetic */ class G0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ p9 c;

    public /* synthetic */ G0(p9 p9Var, int i) {
        this.b = i;
        this.c = p9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                p9.a(this.c);
                return;
            default:
                p9.b(this.c);
                return;
        }
    }
}
