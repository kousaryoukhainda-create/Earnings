package defpackage;
/* renamed from: Ka  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394Ka implements InterfaceC2164mZ {
    public final InterfaceC0445Ma a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public C0394Ka(InterfaceC0445Ma interfaceC0445Ma, long j, long j2, long j3, long j4, long j5) {
        this.a = interfaceC0445Ma;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        return true;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        C2336oZ c2336oZ = new C2336oZ(j, C0420La.a(this.a.b(j), 0L, this.c, this.d, this.e, this.f));
        return new C2078lZ(c2336oZ, c2336oZ);
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        return this.b;
    }
}
