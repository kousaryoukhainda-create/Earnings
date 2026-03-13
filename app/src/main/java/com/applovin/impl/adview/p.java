package com.applovin.impl.adview;
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ f c;

    public /* synthetic */ p(f fVar, int i) {
        this.b = i;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                f.c(this.c);
                return;
            default:
                f.e(this.c);
                return;
        }
    }
}
