package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.r0;
import com.applovin.impl.s0;
/* renamed from: mk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2186mk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ C2186mk0(s0.a aVar, boolean z, int i) {
        this.b = i;
        this.c = aVar;
        this.d = z;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                s0Var.b(this.c, this.d);
                return;
            case 1:
                s0Var.d(this.c, this.d);
                return;
            case 2:
                s0Var.a(this.c, this.d);
                return;
            default:
                r0.a(this.c, this.d, s0Var);
                return;
        }
    }
}
