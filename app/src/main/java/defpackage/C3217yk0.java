package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.s0;
/* renamed from: yk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3217yk0 implements gc.a {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int f;

    public /* synthetic */ C3217yk0(s0.a aVar, int i, long j) {
        this.c = aVar;
        this.f = i;
        this.d = j;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                s0Var.a(this.c, this.f, this.d);
                return;
            default:
                s0Var.a(this.c, this.d, this.f);
                return;
        }
    }

    public /* synthetic */ C3217yk0(s0.a aVar, long j, int i) {
        this.c = aVar;
        this.d = j;
        this.f = i;
    }
}
