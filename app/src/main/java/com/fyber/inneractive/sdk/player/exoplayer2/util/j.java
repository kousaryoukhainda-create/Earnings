package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class j {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public int a(int i) {
        int i2;
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        a();
        return i7;
    }

    public void b(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public void c(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public j(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public boolean b() {
        byte[] bArr = this.a;
        int i = this.b;
        byte b = bArr[i];
        int i2 = this.c;
        boolean z = (b & (UserVerificationMethods.USER_VERIFY_PATTERN >> i2)) != 0;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 == 8) {
            this.c = 0;
            this.b = i + 1;
        }
        a();
        return z;
    }

    public final void a() {
        int i;
        int i2 = this.b;
        a.b(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }
}
