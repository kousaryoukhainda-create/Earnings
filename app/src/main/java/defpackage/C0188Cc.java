package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.embedding.android.KeyboardMap;
/* renamed from: Cc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188Cc {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public C0188Cc() {
        this.a = 1;
        this.b = Ha0.f;
    }

    public void a() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        switch (this.a) {
            case 1:
                int i3 = this.c;
                if (i3 >= 0 && (i3 < (i = this.e) || (i3 == i && this.d == 0))) {
                    z = true;
                } else {
                    z = false;
                }
                B10.u(z);
                return;
            default:
                int i4 = this.d;
                if (i4 >= 0 && (i4 < (i2 = this.c) || (i4 == i2 && this.e == 0))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                B10.u(z2);
                return;
        }
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public boolean d(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.c) {
                break;
            } else if (r(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.c;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z;
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.c && !h()) {
            i3++;
        }
        if (this.d == this.c) {
            z = true;
        } else {
            z = false;
        }
        this.d = i;
        this.e = i2;
        if (z || !d((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        return this.c;
    }

    public int g() {
        return (this.c * 8) + this.d;
    }

    public boolean h() {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 1:
                if ((this.b[this.c] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.d)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                s();
                return z;
            case 2:
                if ((this.b[this.d] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.e)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                s();
                return z2;
            default:
                if ((((this.b[this.d] & 255) >> this.e) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                t(1);
                return z3;
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.d;
                    if (i3 > 8) {
                        int i4 = i3 - 8;
                        this.d = i4;
                        byte[] bArr = this.b;
                        int i5 = this.c;
                        this.c = i5 + 1;
                        i2 |= (bArr[i5] & 255) << i4;
                    } else {
                        byte[] bArr2 = this.b;
                        int i6 = this.c;
                        int i7 = ((-1) >>> (32 - i)) & (i2 | ((bArr2[i6] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.d = 0;
                            this.c = i6 + 1;
                        }
                        a();
                        return i7;
                    }
                }
            case 2:
                this.e += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.e;
                    int i10 = 2;
                    if (i9 > 8) {
                        int i11 = i9 - 8;
                        this.e = i11;
                        byte[] bArr3 = this.b;
                        int i12 = this.d;
                        i8 |= (bArr3[i12] & 255) << i11;
                        if (!r(i12 + 1)) {
                            i10 = 1;
                        }
                        this.d = i12 + i10;
                    } else {
                        byte[] bArr4 = this.b;
                        int i13 = this.d;
                        int i14 = ((-1) >>> (32 - i)) & (i8 | ((bArr4[i13] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.e = 0;
                            if (!r(i13 + 1)) {
                                i10 = 1;
                            }
                            this.d = i13 + i10;
                        }
                        a();
                        return i14;
                    }
                }
            default:
                int i15 = this.d;
                int min = Math.min(i, 8 - this.e);
                int i16 = i15 + 1;
                byte[] bArr5 = this.b;
                int i17 = ((bArr5[i15] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i) {
                    i17 |= (bArr5[i16] & 255) << min;
                    min += 8;
                    i16++;
                }
                int i18 = i17 & ((-1) >>> (32 - i));
                t(i);
                return i18;
        }
    }

    public void j(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            byte b = bArr2[i4];
            int i6 = this.d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.b;
            int i9 = this.c;
            this.c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.d = i8 - 8;
        }
        int i10 = this.d + i7;
        this.d = i10;
        byte[] bArr4 = this.b;
        int i11 = this.c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.d = 0;
            this.c = i11 + 1;
        }
        a();
    }

    public long k(int i) {
        if (i <= 32) {
            int i2 = i(i);
            int i3 = Ha0.a;
            return KeyboardMap.kValueMask & i2;
        }
        int i4 = i(i - 32);
        int i5 = i(32);
        int i6 = Ha0.a;
        return (KeyboardMap.kValueMask & i5) | ((i4 & KeyboardMap.kValueMask) << 32);
    }

    public void l(int i, byte[] bArr) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        System.arraycopy(this.b, this.c, bArr, 0, i);
        this.c += i;
        a();
    }

    public int m() {
        int i = 0;
        int i2 = 0;
        while (!h()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = i(i2);
        }
        return i3 + i;
    }

    public int n() {
        int i;
        int m = m();
        if (m % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((m + 1) / 2) * i;
    }

    public void o(int i, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i;
    }

    public void p(NQ nq) {
        o(nq.c, nq.a);
        q(nq.b * 8);
    }

    public void q(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        a();
    }

    public boolean r(int i) {
        if (2 <= i && i < this.c) {
            byte[] bArr = this.b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void s() {
        switch (this.a) {
            case 1:
                int i = this.d + 1;
                this.d = i;
                if (i == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                return;
            default:
                int i2 = 1;
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 == 8) {
                    this.e = 0;
                    int i4 = this.d;
                    if (r(i4 + 1)) {
                        i2 = 2;
                    }
                    this.d = i4 + i2;
                }
                a();
                return;
        }
    }

    public void t(int i) {
        int i2;
        switch (this.a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.c + i3;
                this.c = i4;
                int i5 = (i - (i3 * 8)) + this.d;
                this.d = i5;
                if (i5 > 7) {
                    this.c = i4 + 1;
                    this.d = i5 - 8;
                }
                a();
                return;
            case 2:
                int i6 = this.d;
                int i7 = i / 8;
                int i8 = i6 + i7;
                this.d = i8;
                int i9 = (i - (i7 * 8)) + this.e;
                this.e = i9;
                if (i9 > 7) {
                    this.d = i8 + 1;
                    this.e = i9 - 8;
                }
                while (true) {
                    i6++;
                    if (i6 <= this.d) {
                        if (r(i6)) {
                            this.d++;
                            i6 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i10 = i / 8;
                int i11 = this.d + i10;
                this.d = i11;
                int i12 = (i - (i10 * 8)) + this.e;
                this.e = i12;
                boolean z = true;
                if (i12 > 7) {
                    this.d = i11 + 1;
                    this.e = i12 - 8;
                }
                int i13 = this.d;
                if (i13 < 0 || (i13 >= (i2 = this.c) && (i13 != i2 || this.e != 0))) {
                    z = false;
                }
                B10.u(z);
                return;
        }
    }

    public void u(int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        this.c += i;
        a();
    }

    public C0188Cc(byte[] bArr) {
        this.a = 3;
        this.b = bArr;
        this.c = bArr.length;
    }

    public C0188Cc(byte[] bArr, int i, int i2) {
        this.a = 2;
        this.b = bArr;
        this.d = i;
        this.c = i2;
        this.e = 0;
        a();
    }

    public C0188Cc(byte[] bArr, int i) {
        this.a = 1;
        this.b = bArr;
        this.e = i;
    }

    public C0188Cc(int i, int i2) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = new byte[(i2 * 2) - 1];
        this.e = 0;
    }
}
