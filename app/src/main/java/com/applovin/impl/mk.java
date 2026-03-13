package com.applovin.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
final class mk {
    private final ah a = new ah(8);
    private int b;

    private long a(k8 k8Var) {
        int i = 0;
        k8Var.c(this.a.c(), 0, 1);
        int i2 = this.a.c()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        k8Var.c(this.a.c(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.a.c()[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public boolean b(k8 k8Var) {
        long a;
        int i;
        long a2 = k8Var.a();
        long j = 1024;
        int i2 = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
        if (i2 != 0 && a2 <= 1024) {
            j = a2;
        }
        int i3 = (int) j;
        k8Var.c(this.a.c(), 0, 4);
        long y = this.a.y();
        this.b = 4;
        while (y != 440786851) {
            int i4 = this.b + 1;
            this.b = i4;
            if (i4 == i3) {
                return false;
            }
            k8Var.c(this.a.c(), 0, 1);
            y = ((y << 8) & (-256)) | (this.a.c()[0] & 255);
        }
        long a3 = a(k8Var);
        long j2 = this.b;
        if (a3 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a3 >= a2) {
            return false;
        }
        while (true) {
            int i5 = (this.b > (j2 + a3) ? 1 : (this.b == (j2 + a3) ? 0 : -1));
            if (i5 < 0) {
                if (a(k8Var) != Long.MIN_VALUE && (a(k8Var)) >= 0 && a <= 2147483647L) {
                    if (i != 0) {
                        int i6 = (int) a;
                        k8Var.c(i6);
                        this.b += i6;
                    }
                }
            } else if (i5 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
