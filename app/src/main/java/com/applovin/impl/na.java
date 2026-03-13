package com.applovin.impl;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class na {
    public final List a;
    public final int b;
    public final String c;

    private na(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public static na a(ah ahVar) {
        List singletonList;
        try {
            ahVar.g(21);
            int w = ahVar.w() & 3;
            int w2 = ahVar.w();
            int d = ahVar.d();
            int i = 0;
            for (int i2 = 0; i2 < w2; i2++) {
                ahVar.g(1);
                int C = ahVar.C();
                for (int i3 = 0; i3 < C; i3++) {
                    int C2 = ahVar.C();
                    i += C2 + 4;
                    ahVar.g(C2);
                }
            }
            ahVar.f(d);
            byte[] bArr = new byte[i];
            String str = null;
            int i4 = 0;
            for (int i5 = 0; i5 < w2; i5++) {
                int w3 = ahVar.w() & 127;
                int C3 = ahVar.C();
                for (int i6 = 0; i6 < C3; i6++) {
                    int C4 = ahVar.C();
                    byte[] bArr2 = yf.a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(ahVar.c(), ahVar.d(), bArr, length, C4);
                    if (w3 == 33 && i6 == 0) {
                        str = o3.a(new bh(bArr, length, length + C4));
                    }
                    i4 = length + C4;
                    ahVar.g(C4);
                }
            }
            if (i == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new na(singletonList, w + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ch.a("Error parsing HEVC config", e);
        }
    }
}
