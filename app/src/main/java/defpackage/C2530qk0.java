package defpackage;

import com.applovin.impl.gc;
import com.applovin.impl.s0;
/* renamed from: qk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2530qk0 implements gc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ s0.a c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    public /* synthetic */ C2530qk0(s0.a aVar, int i, long j, long j2, int i2) {
        this.b = i2;
        this.c = aVar;
        this.d = i;
        this.f = j;
        this.g = j2;
    }

    @Override // com.applovin.impl.gc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((s0) obj).a(this.c, this.d, this.f, this.g);
                return;
            default:
                ((s0) obj).b(this.c, this.d, this.f, this.g);
                return;
        }
    }
}
