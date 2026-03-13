package com.applovin.impl;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class qc {
    private int a;
    private long[] b;

    public qc() {
        this(32);
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long[] b() {
        return Arrays.copyOf(this.b, this.a);
    }

    public qc(int i) {
        this.b = new long[i];
    }

    public long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        StringBuilder i2 = AbstractC0324Hi.i(i, "Invalid index ", ", size is ");
        i2.append(this.a);
        throw new IndexOutOfBoundsException(i2.toString());
    }

    public int a() {
        return this.a;
    }
}
