package com.applovin.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class bh {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public bh(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    private void a() {
        int i;
        int i2 = this.c;
        b1.b(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    private int d() {
        int i = 0;
        while (!c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? b(i) : 0);
    }

    public boolean b() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !c()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.d = i2;
        return !z && a((i3 * 2) + 1);
    }

    public boolean c() {
        boolean z = (this.a[this.c] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.d)) != 0;
        g();
        return z;
    }

    public int e() {
        int i;
        int d = d();
        if (d % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((d + 1) / 2) * i;
    }

    public int f() {
        return d();
    }

    public void g() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (c(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        a();
    }

    public boolean a(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 > i4 || i4 >= this.b) {
                break;
            } else if (c(i6)) {
                i4++;
                i2 += 3;
            } else {
                i2 = i6;
            }
        }
        int i7 = this.b;
        return i4 < i7 || (i4 == i7 && i5 == 0);
    }

    private boolean c(int i) {
        if (2 <= i && i < this.b) {
            byte[] bArr = this.a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void d(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (c(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        a();
    }

    public int b(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.d = i4;
            byte[] bArr = this.a;
            int i5 = this.c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!c(i5 + 1)) {
                r3 = 1;
            }
            this.c = i5 + r3;
        }
        byte[] bArr2 = this.a;
        int i6 = this.c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i6 + (c(i6 + 1) ? 2 : 1);
        }
        a();
        return i7;
    }
}
