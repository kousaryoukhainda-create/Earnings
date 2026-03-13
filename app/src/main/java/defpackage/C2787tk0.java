package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.m5;
import com.applovin.impl.r0;
import com.applovin.impl.s0;
/* renamed from: tk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2787tk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ m5 d;

    public /* synthetic */ C2787tk0(s0.a aVar, int i, m5 m5Var) {
        this.b = i;
        this.c = aVar;
        this.d = m5Var;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                r0.d(this.c, this.d, s0Var);
                return;
            case 1:
                r0.a(this.c, this.d, s0Var);
                return;
            case 2:
                r0.b(this.c, this.d, s0Var);
                return;
            default:
                r0.c(this.c, this.d, s0Var);
                return;
        }
    }
}
