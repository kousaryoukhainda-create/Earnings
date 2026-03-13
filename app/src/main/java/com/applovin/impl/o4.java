package com.applovin.impl;

import com.applovin.impl.ij;
/* loaded from: classes.dex */
public class o4 implements ij {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public o4(long j, long j2, int i, int i2, boolean z) {
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
        this.d = j - j2;
        this.f = a(j, j2, i);
    }

    private static long a(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    private long c(long j) {
        long j2 = this.c;
        long j3 = (((j * this.e) / 8000000) / j2) * j2;
        long j4 = this.d;
        if (j4 != -1) {
            j3 = Math.min(j3, j4 - j2);
        }
        return this.b + Math.max(j3, 0L);
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        if (this.d == -1 && !this.g) {
            return new ij.a(new kj(0L, this.b));
        }
        long c = c(j);
        long d = d(c);
        kj kjVar = new kj(d, c);
        if (this.d != -1 && d < j) {
            long j2 = c + this.c;
            if (j2 < this.a) {
                return new ij.a(kjVar, new kj(d(j2), j2));
            }
        }
        return new ij.a(kjVar);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f;
    }

    public long d(long j) {
        return a(j, this.b, this.e);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.d != -1 || this.g;
    }
}
