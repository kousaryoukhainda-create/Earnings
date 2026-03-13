package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.s0;
/* renamed from: xk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3131xk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int f;

    public /* synthetic */ C3131xk0(s0.a aVar, boolean z, int i, int i2) {
        this.b = i2;
        this.c = aVar;
        this.d = z;
        this.f = i;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                s0Var.a(this.c, this.d, this.f);
                return;
            default:
                s0Var.b(this.c, this.d, this.f);
                return;
        }
    }
}
