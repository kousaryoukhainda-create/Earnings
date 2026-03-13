package com.applovin.impl;

import com.applovin.impl.ij;
/* loaded from: classes.dex */
final class or implements ij {
    private final mr a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public or(mr mrVar, int i, long j, long j2) {
        this.a = mrVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / mrVar.e;
        this.d = j3;
        this.e = c(j3);
    }

    private long c(long j) {
        return xp.c(j * this.b, 1000000L, this.a.c);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.e;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        long b = xp.b((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = (this.a.e * b) + this.c;
        long c = c(b);
        kj kjVar = new kj(c, j2);
        if (c < j && b != this.d - 1) {
            long j3 = b + 1;
            return new ij.a(kjVar, new kj(c(j3), (this.a.e * j3) + this.c));
        }
        return new ij.a(kjVar);
    }
}
