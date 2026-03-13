package defpackage;
/* renamed from: nh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2265nh implements InterfaceC2164mZ {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public C2265nh(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.d = j3;
        this.f = (Math.max(0L, j3) * 8000000) / i;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        if (this.d == -1 && !this.g) {
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        long j2 = this.b;
        long j3 = this.d;
        int i = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        if (i == 0 && !this.g) {
            C2336oZ c2336oZ = new C2336oZ(0L, j2);
            return new C2078lZ(c2336oZ, c2336oZ);
        }
        int i2 = this.e;
        long j4 = this.c;
        long j5 = (((i2 * j) / 8000000) / j4) * j4;
        if (i != 0) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = Math.max(j5, 0L) + j2;
        long max2 = (Math.max(0L, max - j2) * 8000000) / i2;
        C2336oZ c2336oZ2 = new C2336oZ(max2, max);
        if (i != 0 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new C2078lZ(c2336oZ2, new C2336oZ((Math.max(0L, j6 - j2) * 8000000) / i2, j6));
            }
        }
        return new C2078lZ(c2336oZ2, c2336oZ2);
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        return this.f;
    }
}
