package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.mc;
import com.applovin.impl.s0;
import com.applovin.impl.td;
/* renamed from: pk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2444pk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ mc d;
    public final /* synthetic */ td f;

    public /* synthetic */ C2444pk0(s0.a aVar, mc mcVar, td tdVar, int i) {
        this.b = i;
        this.c = aVar;
        this.d = mcVar;
        this.f = tdVar;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                s0Var.b(this.c, this.d, this.f);
                return;
            case 1:
                s0Var.c(this.c, this.d, this.f);
                return;
            default:
                s0Var.a(this.c, this.d, this.f);
                return;
        }
    }
}
