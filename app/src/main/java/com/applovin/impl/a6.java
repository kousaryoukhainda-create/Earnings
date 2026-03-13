package com.applovin.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a6 implements k8 {
    private final f5 b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];
    private final byte[] a = new byte[4096];

    public a6(f5 f5Var, long j, long j2) {
        this.b = f5Var;
        this.d = j;
        this.c = j2;
    }

    private void d(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    private void e(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, xp.a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private void g(int i) {
        byte[] bArr;
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr2 = this.e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.e = bArr;
    }

    @Override // com.applovin.impl.k8
    public boolean a(int i, boolean z) {
        e(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = a(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    @Override // com.applovin.impl.k8
    public int b(byte[] bArr, int i, int i2) {
        int min;
        e(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = a(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    @Override // com.applovin.impl.k8
    public void c(int i) {
        a(i, false);
    }

    @Override // com.applovin.impl.k8
    public long f() {
        return this.d;
    }

    private int f(int i) {
        int min = Math.min(this.g, i);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.k8
    public void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    @Override // com.applovin.impl.k8
    public long d() {
        return this.d + this.f;
    }

    @Override // com.applovin.impl.k8
    public void d(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    private int e(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.k8
    public long a() {
        return this.c;
    }

    @Override // com.applovin.impl.k8, com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        int e = e(bArr, i, i2);
        if (e == 0) {
            e = a(bArr, i, i2, 0, true);
        }
        d(e);
        return e;
    }

    @Override // com.applovin.impl.k8
    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (a(i2, z)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.k8
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        int e = e(bArr, i, i2);
        while (e < i2 && e != -1) {
            e = a(bArr, i, i2, e, z);
        }
        d(e);
        return e != -1;
    }

    @Override // com.applovin.impl.k8
    public void b() {
        this.f = 0;
    }

    @Override // com.applovin.impl.k8
    public int b(int i) {
        int f = f(i);
        if (f == 0) {
            byte[] bArr = this.a;
            f = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        d(f);
        return f;
    }

    @Override // com.applovin.impl.k8
    public void a(int i) {
        b(i, false);
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.b.a(bArr, i + i3, i2 - i3);
            if (a == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + a;
        }
        throw new InterruptedIOException();
    }

    public boolean b(int i, boolean z) {
        int f = f(i);
        while (f < i && f != -1) {
            f = a(this.a, -f, Math.min(i, this.a.length + f), f, z);
        }
        d(f);
        return f != -1;
    }
}
