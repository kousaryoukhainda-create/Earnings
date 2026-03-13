package com.applovin.impl;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class j5 extends InputStream {
    private final h5 a;
    private final k5 b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public j5(h5 h5Var, k5 k5Var) {
        this.a = h5Var;
        this.b = k5Var;
    }

    private void a() {
        if (!this.d) {
            this.a.a(this.b);
            this.d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.e) {
            this.a.close();
            this.e = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        b1.b(!this.e);
        a();
        int a = this.a.a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f += a;
        return a;
    }
}
