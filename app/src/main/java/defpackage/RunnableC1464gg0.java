package defpackage;

import com.applovin.impl.be;
import com.applovin.impl.mc;
import com.applovin.impl.td;
/* renamed from: gg0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1464gg0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ be.a c;
    public final /* synthetic */ be d;
    public final /* synthetic */ mc f;
    public final /* synthetic */ td g;

    public /* synthetic */ RunnableC1464gg0(be.a aVar, be beVar, mc mcVar, td tdVar, int i) {
        this.b = i;
        this.c = aVar;
        this.d = beVar;
        this.f = mcVar;
        this.g = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                be.a.d(this.c, this.d, this.f, this.g);
                return;
            case 1:
                be.a.c(this.c, this.d, this.f, this.g);
                return;
            default:
                be.a.a(this.c, this.d, this.f, this.g);
                return;
        }
    }
}
