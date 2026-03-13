package com.applovin.impl;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class eo {
    private long[] a;
    private Object[] b;
    private int c;
    private int d;

    public eo() {
        this(10);
    }

    private void b(long j, Object obj) {
        int i = this.c;
        int i2 = this.d;
        Object[] objArr = this.b;
        int length = (i + i2) % objArr.length;
        this.a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    private Object d() {
        boolean z;
        if (this.d > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.b(z);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public synchronized void a(long j, Object obj) {
        a(j);
        b();
        b(j, obj);
    }

    public synchronized Object c() {
        return this.d == 0 ? null : d();
    }

    public synchronized int e() {
        return this.d;
    }

    public eo(int i) {
        this.a = new long[i];
        this.b = a(i);
    }

    public synchronized Object c(long j) {
        return a(j, true);
    }

    public synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    private void b() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] a = a(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, a, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, a, i3, this.c);
        }
        this.a = jArr;
        this.b = a;
        this.c = 0;
    }

    private void a(long j) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                a();
            }
        }
    }

    private static Object[] a(int i) {
        return new Object[i];
    }

    private Object a(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = d();
            j2 = j3;
        }
        return obj;
    }

    public synchronized Object b(long j) {
        return a(j, false);
    }
}
