package defpackage;

import com.applovin.impl.adview.a;
/* renamed from: df0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1205df0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    public /* synthetic */ RunnableC1205df0(a aVar, int i) {
        this.b = i;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.t();
                return;
            case 1:
                this.c.q();
                return;
            case 2:
                this.c.s();
                return;
            case 3:
                this.c.r();
                return;
            case 4:
                this.c.u();
                return;
            default:
                this.c.p();
                return;
        }
    }
}
