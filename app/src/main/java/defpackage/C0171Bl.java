package defpackage;

import java.io.InputStream;
/* renamed from: Bl  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171Bl extends InputStream {
    public final InterfaceC3304zl b;
    public final C0223Dl c;
    public boolean f = false;
    public boolean g = false;
    public final byte[] d = new byte[1];

    public C0171Bl(InterfaceC3304zl interfaceC3304zl, C0223Dl c0223Dl) {
        this.b = interfaceC3304zl;
        this.c = c0223Dl;
    }

    public final void a() {
        if (!this.f) {
            this.b.g(this.c);
            this.f = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.g) {
            this.b.close();
            this.g = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        B10.u(!this.g);
        a();
        int read = this.b.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
