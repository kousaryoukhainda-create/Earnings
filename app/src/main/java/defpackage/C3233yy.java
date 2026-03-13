package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: yy  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3233yy extends G60 {
    public G60 e;

    public C3233yy(G60 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // defpackage.G60
    public final G60 a() {
        return this.e.a();
    }

    @Override // defpackage.G60
    public final G60 b() {
        return this.e.b();
    }

    @Override // defpackage.G60
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.G60
    public final G60 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.G60
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.G60
    public final void f() {
        this.e.f();
    }

    @Override // defpackage.G60
    public final G60 g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.e.g(j, unit);
    }
}
