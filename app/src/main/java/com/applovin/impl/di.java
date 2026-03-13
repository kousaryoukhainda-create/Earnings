package com.applovin.impl;

import com.applovin.impl.ci;
import java.util.ArrayList;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
abstract class di {
    private static int a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static ci.a b(ah ahVar) {
        int j = ahVar.j();
        if (j > 10000) {
            return null;
        }
        float[] fArr = new float[j];
        for (int i = 0; i < j; i++) {
            fArr[i] = ahVar.i();
        }
        int j2 = ahVar.j();
        if (j2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(j * 2.0d) / log);
        zg zgVar = new zg(ahVar.c());
        int i2 = 8;
        zgVar.c(ahVar.d() * 8);
        float[] fArr2 = new float[j2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < j2) {
            int i6 = 0;
            while (i6 < i3) {
                int a = iArr[i6] + a(zgVar.a(ceil));
                if (a >= j || a < 0) {
                    return null;
                }
                fArr2[i5] = fArr[a];
                iArr[i6] = a;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        zgVar.c((zgVar.e() + 7) & (-8));
        int i7 = 32;
        int a2 = zgVar.a(32);
        ci.b[] bVarArr = new ci.b[a2];
        int i8 = 0;
        while (i8 < a2) {
            int a3 = zgVar.a(i2);
            int a4 = zgVar.a(i2);
            int a5 = zgVar.a(i7);
            if (a5 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(j2 * d) / log);
            float[] fArr3 = new float[a5 * 3];
            float[] fArr4 = new float[a5 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < a5; i10++) {
                i9 += a(zgVar.a(ceil2));
                if (i9 < 0 || i9 >= j2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            bVarArr[i8] = new ci.b(a3, fArr3, fArr4, a4);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new ci.a(bVarArr);
    }

    private static ArrayList c(ah ahVar) {
        if (ahVar.w() != 0) {
            return null;
        }
        ahVar.g(7);
        int j = ahVar.j();
        if (j == 1684433976) {
            ah ahVar2 = new ah();
            Inflater inflater = new Inflater(true);
            try {
                if (!xp.a(ahVar, ahVar2, inflater)) {
                    return null;
                }
                inflater.end();
                ahVar = ahVar2;
            } finally {
                inflater.end();
            }
        } else if (j != 1918990112) {
            return null;
        }
        return e(ahVar);
    }

    private static ArrayList d(ah ahVar) {
        int j;
        ahVar.g(8);
        int d = ahVar.d();
        int e = ahVar.e();
        while (d < e && (j = ahVar.j() + d) > d && j <= e) {
            int j2 = ahVar.j();
            if (j2 != 2037673328 && j2 != 1836279920) {
                ahVar.f(j);
                d = j;
            } else {
                ahVar.e(j);
                return c(ahVar);
            }
        }
        return null;
    }

    private static ArrayList e(ah ahVar) {
        ArrayList arrayList = new ArrayList();
        int d = ahVar.d();
        int e = ahVar.e();
        while (d < e) {
            int j = ahVar.j() + d;
            if (j <= d || j > e) {
                return null;
            }
            if (ahVar.j() == 1835365224) {
                ci.a b = b(ahVar);
                if (b == null) {
                    return null;
                }
                arrayList.add(b);
            }
            ahVar.f(j);
            d = j;
        }
        return arrayList;
    }

    private static boolean a(ah ahVar) {
        ahVar.g(4);
        int j = ahVar.j();
        ahVar.f(0);
        return j == 1886547818;
    }

    public static ci a(byte[] bArr, int i) {
        ArrayList arrayList;
        ah ahVar = new ah(bArr);
        try {
            arrayList = a(ahVar) ? d(ahVar) : c(ahVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new ci((ci.a) arrayList.get(0), (ci.a) arrayList.get(1), i);
        }
        return new ci((ci.a) arrayList.get(0), i);
    }
}
