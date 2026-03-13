package com.applovin.impl;

import com.applovin.impl.ij;
import com.applovin.impl.z8;
/* loaded from: classes.dex */
public final class y8 implements ij {
    private final z8 a;
    private final long b;

    public y8(z8 z8Var, long j) {
        this.a = z8Var;
        this.b = j;
    }

    private kj a(long j, long j2) {
        return new kj((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.a.b();
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        b1.b(this.a.k);
        z8 z8Var = this.a;
        z8.a aVar = z8Var.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int b = xp.b(jArr, z8Var.a(j), true, false);
        kj a = a(b == -1 ? 0L : jArr[b], b != -1 ? jArr2[b] : 0L);
        if (a.a != j && b != jArr.length - 1) {
            int i = b + 1;
            return new ij.a(a, a(jArr[i], jArr2[i]));
        }
        return new ij.a(a);
    }
}
