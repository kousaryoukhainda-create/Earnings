package com.applovin.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public abstract class v8 {

    /* loaded from: classes.dex */
    public static final class a {
        public long a;
    }

    private static boolean a(ah ahVar, z8 z8Var, int i) {
        int b = b(ahVar, i);
        return b != -1 && b <= z8Var.b;
    }

    private static boolean b(ah ahVar, z8 z8Var, int i) {
        int i2 = z8Var.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == z8Var.f;
        } else if (i == 12) {
            return ahVar.w() * 1000 == i2;
        } else if (i <= 14) {
            int C = ahVar.C();
            if (i == 14) {
                C *= 10;
            }
            return C == i2;
        } else {
            return false;
        }
    }

    private static boolean a(ah ahVar, int i) {
        return ahVar.w() == xp.b(ahVar.c(), i, ahVar.d() - 1, 0);
    }

    private static boolean b(int i, z8 z8Var) {
        return i <= 7 ? i == z8Var.g - 1 : i <= 10 && z8Var.g == 2;
    }

    private static boolean a(ah ahVar, z8 z8Var, boolean z, a aVar) {
        try {
            long D = ahVar.D();
            if (!z) {
                D *= z8Var.b;
            }
            aVar.a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(ah ahVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ahVar.w() + 1;
            case 7:
                return ahVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean a(ah ahVar, z8 z8Var, int i, a aVar) {
        int d = ahVar.d();
        long y = ahVar.y();
        long j = y >>> 16;
        if (j != i) {
            return false;
        }
        return b((int) (15 & (y >> 4)), z8Var) && a((int) ((y >> 1) & 7), z8Var) && !(((y & 1) > 1L ? 1 : ((y & 1) == 1L ? 0 : -1)) == 0) && a(ahVar, z8Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(ahVar, z8Var, (int) ((y >> 12) & 15)) && b(ahVar, z8Var, (int) ((y >> 8) & 15)) && a(ahVar, d);
    }

    private static boolean a(int i, z8 z8Var) {
        return i == 0 || i == z8Var.i;
    }

    public static boolean a(k8 k8Var, z8 z8Var, int i, a aVar) {
        long d = k8Var.d();
        byte[] bArr = new byte[2];
        k8Var.c(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            k8Var.b();
            k8Var.c((int) (d - k8Var.f()));
            return false;
        }
        ah ahVar = new ah(16);
        System.arraycopy(bArr, 0, ahVar.c(), 0, 2);
        ahVar.e(m8.a(k8Var, ahVar.c(), 2, 14));
        k8Var.b();
        k8Var.c((int) (d - k8Var.f()));
        return a(ahVar, z8Var, i, aVar);
    }

    public static long a(k8 k8Var, z8 z8Var) {
        k8Var.b();
        k8Var.c(1);
        byte[] bArr = new byte[1];
        k8Var.c(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        k8Var.c(2);
        int i = z ? 7 : 6;
        ah ahVar = new ah(i);
        ahVar.e(m8.a(k8Var, ahVar.c(), 0, i));
        k8Var.b();
        a aVar = new a();
        if (a(ahVar, z8Var, z, aVar)) {
            return aVar.a;
        }
        throw ch.a(null, null);
    }
}
