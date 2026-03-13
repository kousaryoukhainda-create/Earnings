package defpackage;

import com.applovin.impl.m5;
import com.applovin.impl.q1;
/* renamed from: ck0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1053ck0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ q1.a c;
    public final /* synthetic */ m5 d;

    public /* synthetic */ RunnableC1053ck0(q1.a aVar, m5 m5Var, int i) {
        this.b = i;
        this.c = aVar;
        this.d = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.d(this.d);
                return;
            default:
                this.c.c(this.d);
                return;
        }
    }
}
