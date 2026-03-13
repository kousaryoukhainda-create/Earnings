package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.r0;
import com.applovin.impl.s0;
/* renamed from: nk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2272nk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ int d;

    public /* synthetic */ C2272nk0(s0.a aVar, int i, int i2) {
        this.b = i2;
        this.c = aVar;
        this.d = i;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                s0Var.d(this.c, this.d);
                return;
            case 1:
                s0Var.c(this.c, this.d);
                return;
            case 2:
                s0Var.f(this.c, this.d);
                return;
            case 3:
                s0Var.e(this.c, this.d);
                return;
            default:
                r0.a(this.c, this.d, s0Var);
                return;
        }
    }
}
