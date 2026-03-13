package defpackage;

import java.io.OutputStream;
/* renamed from: tG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2746tG extends OutputStream {
    public long b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
