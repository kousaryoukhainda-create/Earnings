package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;
/* renamed from: jk  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1927jk extends OutputStream {
    public FileOutputStream b;
    public String c;

    public final void a() {
        if (this.b == null) {
            this.b = new FileOutputStream(this.c);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
        this.b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        a();
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        a();
        this.b.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        a();
        this.b.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        a();
        this.b.write(bArr, i, i2);
    }
}
