package com.applovin.impl;

import com.applovin.impl.ij;
/* loaded from: classes.dex */
public final class lb implements ij {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public lb(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.a = jArr;
            this.b = jArr2;
        }
        this.c = j;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        if (!this.d) {
            return new ij.a(kj.c);
        }
        int b = xp.b(this.b, j, true, true);
        kj kjVar = new kj(this.b[b], this.a[b]);
        if (kjVar.a != j && b != this.b.length - 1) {
            int i = b + 1;
            return new ij.a(kjVar, new kj(this.b[i], this.a[i]));
        }
        return new ij.a(kjVar);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.d;
    }
}
