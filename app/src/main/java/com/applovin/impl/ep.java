package com.applovin.impl;
/* loaded from: classes.dex */
public abstract class ep {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long a(ah ahVar, int i, int i2) {
        ahVar.f(i);
        if (ahVar.a() < 5) {
            return -9223372036854775807L;
        }
        int j = ahVar.j();
        if ((8388608 & j) == 0 && ((2096896 & j) >> 8) == i2 && (j & 32) != 0 && ahVar.w() >= 7 && ahVar.a() >= 7 && (ahVar.w() & 16) == 16) {
            byte[] bArr = new byte[6];
            ahVar.a(bArr, 0, 6);
            return a(bArr);
        }
        return -9223372036854775807L;
    }

    private static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
