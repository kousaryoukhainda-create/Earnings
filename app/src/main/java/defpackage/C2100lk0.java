package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.r0;
import com.applovin.impl.s0;
/* renamed from: lk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2100lk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    public /* synthetic */ C2100lk0(s0.a aVar, String str, long j, long j2, int i) {
        this.b = i;
        this.c = aVar;
        this.d = str;
        this.f = j;
        this.g = j2;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.d;
                long j = this.f;
                r0.b(this.c, str, j, this.g, (s0) obj);
                return;
            default:
                String str2 = this.d;
                long j2 = this.f;
                r0.a(this.c, str2, j2, this.g, (s0) obj);
                return;
        }
    }
}
