package defpackage;

import java.math.RoundingMode;
/* renamed from: Kc0  reason: default package */
/* loaded from: classes.dex */
public final class Kc0 implements InterfaceC2164mZ {
    public final M5 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public Kc0(M5 m5, int i, long j, long j2) {
        this.a = m5;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / m5.c;
        this.d = j3;
        this.e = b(j3);
    }

    public final long b(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        int i = Ha0.a;
        return Ha0.U(j2, 1000000L, j3, RoundingMode.FLOOR);
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        return true;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        M5 m5 = this.a;
        long j2 = (m5.b * j) / (this.b * 1000000);
        long j3 = this.d;
        long k = Ha0.k(j2, 0L, j3 - 1);
        long j4 = this.c;
        long b = b(k);
        C2336oZ c2336oZ = new C2336oZ(b, (m5.c * k) + j4);
        if (b < j && k != j3 - 1) {
            long j5 = k + 1;
            return new C2078lZ(c2336oZ, new C2336oZ(b(j5), (m5.c * j5) + j4));
        }
        return new C2078lZ(c2336oZ, c2336oZ);
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        return this.e;
    }
}
