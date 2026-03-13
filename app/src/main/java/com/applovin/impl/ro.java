package com.applovin.impl;
/* loaded from: classes.dex */
final class ro {
    public final lo a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ro(lo loVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        b1.a(z2);
        b1.a(iArr2.length == jArr2.length);
        this.a = loVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int b = xp.b(this.f, j, true, false); b >= 0; b--) {
            if ((this.g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int a = xp.a(this.f, j, true, false); a < this.f.length; a++) {
            if ((this.g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
