package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.s0;
/* renamed from: uk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2873uk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ String d;

    public /* synthetic */ C2873uk0(s0.a aVar, String str, int i) {
        this.b = i;
        this.c = aVar;
        this.d = str;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.b) {
            case 0:
                s0Var.b(this.c, this.d);
                return;
            default:
                s0Var.a(this.c, this.d);
                return;
        }
    }
}
