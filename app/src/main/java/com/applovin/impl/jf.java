package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.ij;
/* loaded from: classes.dex */
final class jf implements lj {
    private final long[] a;
    private final long[] b;
    private final long c;

    private jf(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? t2.a(jArr2[jArr2.length - 1]) : j;
    }

    public static jf a(long j, Cif cif, long j2) {
        int length = cif.f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += cif.c + cif.f[i3];
            j3 += cif.d + cif.g[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new jf(jArr, jArr2, j2);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return -1L;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        Pair a = a(t2.b(xp.b(j, 0L, this.c)), this.b, this.a);
        return new ij.a(new kj(t2.a(((Long) a.first).longValue()), ((Long) a.second).longValue()));
    }

    @Override // com.applovin.impl.lj
    public long a(long j) {
        return t2.a(((Long) a(j, this.a, this.b).second).longValue());
    }

    private static Pair a(long j, long[] jArr, long[] jArr2) {
        int b = xp.b(jArr, j, true, true);
        long j2 = jArr[b];
        long j3 = jArr2[b];
        int i = b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
