package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
/* renamed from: NQ  reason: default package */
/* loaded from: classes.dex */
public final class NQ {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final AbstractC3001wD f = AbstractC3001wD.p(5, AbstractC1629id.a, AbstractC1629id.c, AbstractC1629id.f, AbstractC1629id.d, AbstractC1629id.e);
    public byte[] a;
    public int b;
    public int c;

    public NQ() {
        this.a = Ha0.f;
    }

    public final int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long B() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.a[this.b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException(BK.l(j, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException(BK.l(j, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return AbstractC1629id.c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.a;
            int i2 = this.b;
            byte b = bArr2[i2];
            if (b == -2 && bArr2[i2 + 1] == -1) {
                this.b = i2 + 2;
                return AbstractC1629id.d;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return AbstractC1629id.e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void D(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        E(i, bArr);
    }

    public final void E(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void F(int i) {
        boolean z;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        this.c = i;
    }

    public final void G(int i) {
        boolean z;
        if (i >= 0 && i <= this.c) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        this.b = i;
    }

    public final void H(int i) {
        G(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f.contains(charset);
        B10.i("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        boolean z;
        byte b;
        int i;
        byte b2;
        byte b3;
        boolean z2 = false;
        if ((charset.equals(AbstractC1629id.c) || charset.equals(AbstractC1629id.a)) && a() >= 1) {
            long j = this.a[this.b] & 255;
            char c = (char) j;
            if (c == j) {
                z = true;
            } else {
                z = false;
            }
            B10.k(z, "Out of range: %s", j);
            b = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(AbstractC1629id.f) || charset.equals(AbstractC1629id.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b2 = bArr[i2];
                b3 = bArr[i2 + 1];
            } else if (!charset.equals(AbstractC1629id.e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b2 = bArr2[i3 + 1];
                b3 = bArr2[i3];
            }
            b = (byte) ((char) ((b3 & 255) | (b2 << 8)));
        }
        long j2 = b;
        char c2 = (char) j2;
        if (c2 == j2) {
            z2 = true;
        }
        B10.k(z2, "Out of range: %s", j2);
        return (c2 << 16) + i;
    }

    public final int e() {
        return this.a[this.b] & 255;
    }

    public final void f(int i, byte[] bArr, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char g(Charset charset, char[] cArr) {
        int d2 = d(charset);
        if (d2 != 0) {
            char c = (char) (d2 >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.b += d2 & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return (bArr[i5] & 255) | i4 | ((bArr[i3] & 255) << 8);
    }

    public final String i(Charset charset) {
        int i;
        boolean contains = f.contains(charset);
        B10.i("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = AbstractC1629id.a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (!charset.equals(AbstractC1629id.c) && !charset.equals(charset2)) {
            if (!charset.equals(AbstractC1629id.f) && !charset.equals(AbstractC1629id.e) && !charset.equals(AbstractC1629id.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(AbstractC1629id.c) || charset.equals(AbstractC1629id.a)) && Ha0.K(this.a[i2])) {
                    break;
                }
                if (charset.equals(AbstractC1629id.f) || charset.equals(AbstractC1629id.d)) {
                    byte[] bArr = this.a;
                    if (bArr[i2] == 0 && Ha0.K(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(AbstractC1629id.e)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0 && Ha0.K(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String s = s(i2 - this.b, charset);
        if (this.b == this.c) {
            return s;
        }
        if (g(charset, d) == '\r') {
            g(charset, e);
        }
        return s;
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return ((bArr[i5] & 255) << 24) | i4 | ((bArr[i3] & 255) << 16);
    }

    public final long k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        long j = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        int i5 = i + 4;
        this.b = i5;
        long j2 = j | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        int i7 = i + 6;
        this.b = i7;
        long j3 = j2 | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return ((bArr[i8] & 255) << 56) | j3 | ((bArr[i7] & 255) << 48);
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public final int m() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(j, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return (bArr[i8] & 255) | j2 | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = Ha0.a;
        String str = new String(bArr, i2, i - i2, AbstractC1629id.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String q(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        byte[] bArr = this.a;
        int i5 = Ha0.a;
        String str = new String(bArr, i3, i2, AbstractC1629id.c);
        this.b += i;
        return str;
    }

    public final short r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return i3;
    }

    public final long w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public final int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return (bArr[i3] & 255) | i4 | ((bArr[i] & 255) << 16);
    }

    public final int y() {
        int h = h();
        if (h >= 0) {
            return h;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(h, "Top bit not zero: "));
    }

    public final long z() {
        long o = o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException(BK.l(o, "Top bit not zero: "));
    }

    public NQ(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public NQ(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public NQ(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
