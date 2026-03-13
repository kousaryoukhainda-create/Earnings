package defpackage;

import java.io.InputStream;
/* renamed from: kU  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987kU extends InputStream {
    public int b;
    public int c;
    public final /* synthetic */ C2159mU d;

    public C1987kU(C2159mU c2159mU, C1901jU c1901jU) {
        this.d = c2159mU;
        this.b = c2159mU.p(c1901jU.b + 4);
        this.c = c1901jU.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.c;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    int i4 = this.b;
                    C2159mU c2159mU = this.d;
                    c2159mU.k(i4, i, i2, bArr);
                    this.b = c2159mU.p(this.b + i2);
                    this.c -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.c == 0) {
            return -1;
        }
        C2159mU c2159mU = this.d;
        c2159mU.b.seek(this.b);
        int read = c2159mU.b.read();
        this.b = c2159mU.p(this.b + 1);
        this.c--;
        return read;
    }
}
