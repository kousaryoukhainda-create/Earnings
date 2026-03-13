package defpackage;

import com.applovin.impl.te;
/* renamed from: al0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0879al0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ te c;

    public /* synthetic */ RunnableC0879al0(te teVar, int i) {
        this.b = i;
        this.c = teVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.h();
                return;
            default:
                this.c.d();
                return;
        }
    }
}
