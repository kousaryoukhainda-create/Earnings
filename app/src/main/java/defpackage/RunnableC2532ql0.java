package defpackage;

import com.applovin.impl.m5;
import com.applovin.impl.wq;
/* renamed from: ql0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2532ql0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ wq.a c;
    public final /* synthetic */ m5 d;

    public /* synthetic */ RunnableC2532ql0(wq.a aVar, m5 m5Var, int i) {
        this.b = i;
        this.c = aVar;
        this.d = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.c(this.d);
                return;
            default:
                this.c.d(this.d);
                return;
        }
    }
}
