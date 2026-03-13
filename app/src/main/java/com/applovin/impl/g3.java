package com.applovin.impl;

import com.applovin.impl.ij;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class g3 implements ij {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public g3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
            return;
        }
        this.f = 0L;
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public int c(long j) {
        return xp.b(this.e, j, true, true);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        int c = c(j);
        kj kjVar = new kj(this.e[c], this.c[c]);
        if (kjVar.a < j && c != this.a - 1) {
            int i = c + 1;
            return new ij.a(kjVar, new kj(this.e[i], this.c[i]));
        }
        return new ij.a(kjVar);
    }
}
