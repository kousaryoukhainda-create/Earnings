package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ah {
    private byte[] a;
    private int b;
    private int c;

    public ah() {
        this.a = xp.f;
    }

    public int A() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(j, "Top bit not zero: "));
    }

    public long B() {
        long s = s();
        if (s >= 0) {
            return s;
        }
        throw new IllegalStateException(BK.l(s, "Top bit not zero: "));
    }

    public int C() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 2;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public long D() {
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

    public int a() {
        return this.c - this.b;
    }

    public int b() {
        return this.a.length;
    }

    public byte[] c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public char f() {
        byte[] bArr = this.a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int g() {
        return this.a[this.b] & 255;
    }

    public double h() {
        return Double.longBitsToDouble(s());
    }

    public float i() {
        return Float.intBitsToFloat(j());
    }

    public int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        this.b = i + 4;
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    public int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.b = i + 3;
        return (bArr[i + 2] & 255) | i2 | (((bArr[i] & 255) << 24) >> 8);
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !xp.h(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.b;
        String a = xp.a(bArr2, i3, i - i3);
        this.b = i;
        int i4 = this.c;
        if (i == i4) {
            return a;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.b = i5;
            if (i5 == i4) {
                return a;
            }
        }
        int i6 = this.b;
        if (bArr3[i6] == 10) {
            this.b = i6 + 1;
        }
        return a;
    }

    public int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    public long n() {
        byte[] bArr = this.a;
        int i = this.b;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40);
        this.b = i + 8;
        return ((bArr[i + 7] & 255) << 56) | j | ((bArr[i + 6] & 255) << 48);
    }

    public short o() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 2;
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public long p() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public int q() {
        int m = m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(m, "Top bit not zero: "));
    }

    public int r() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 2;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public long s() {
        byte[] bArr = this.a;
        int i = this.b;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
        this.b = i + 8;
        return (bArr[i + 7] & 255) | j | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public String t() {
        return a((char) 0);
    }

    public short u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 2;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public int w() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return i2;
    }

    public long y() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 4;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.b = i + 3;
        return (bArr[i + 2] & 255) | i2 | ((bArr[i] & 255) << 16);
    }

    public void a(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public String b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a = xp.a(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a;
    }

    public String c(int i) {
        return a(i, Charsets.UTF_8);
    }

    public void d(int i) {
        a(b() < i ? new byte[i] : this.a, i);
    }

    public void e(int i) {
        b1.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void f(int i) {
        b1.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void g(int i) {
        f(this.b + i);
    }

    public ah(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public void a(zg zgVar, int i) {
        a(zgVar.a, 0, i);
        zgVar.c(0);
    }

    public ah(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public String a(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != c) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String a = xp.a(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return a;
    }

    public ah(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }
}
