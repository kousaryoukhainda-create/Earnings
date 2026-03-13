package defpackage;

import android.util.Pair;
/* renamed from: WM  reason: default package */
/* loaded from: classes.dex */
public final class WM implements InterfaceC2508qZ {
    public final long[] a;
    public final long[] b;
    public final long c;

    public WM(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? Ha0.M(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        double d;
        int f = Ha0.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // defpackage.InterfaceC2508qZ
    public final long a(long j) {
        return Ha0.M(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.InterfaceC2508qZ
    public final long d() {
        return -1L;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        return true;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        Pair b = b(Ha0.Z(Ha0.k(j, 0L, this.c)), this.b, this.a);
        C2336oZ c2336oZ = new C2336oZ(Ha0.M(((Long) b.first).longValue()), ((Long) b.second).longValue());
        return new C2078lZ(c2336oZ, c2336oZ);
    }

    @Override // defpackage.InterfaceC2508qZ
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        return this.c;
    }
}
