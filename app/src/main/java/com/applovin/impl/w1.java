package com.applovin.impl;

import com.applovin.impl.yf;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class w1 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    private w1(List list, int i, int i2, int i3, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    private static byte[] a(ah ahVar) {
        int C = ahVar.C();
        int d = ahVar.d();
        ahVar.g(C);
        return o3.a(ahVar.c(), d, C);
    }

    public static w1 b(ah ahVar) {
        String str;
        int i;
        int i2;
        float f;
        try {
            ahVar.g(4);
            int w = (ahVar.w() & 3) + 1;
            if (w != 3) {
                ArrayList arrayList = new ArrayList();
                int w2 = ahVar.w() & 31;
                for (int i3 = 0; i3 < w2; i3++) {
                    arrayList.add(a(ahVar));
                }
                int w3 = ahVar.w();
                for (int i4 = 0; i4 < w3; i4++) {
                    arrayList.add(a(ahVar));
                }
                if (w2 > 0) {
                    yf.b c = yf.c((byte[]) arrayList.get(0), w, ((byte[]) arrayList.get(0)).length);
                    int i5 = c.e;
                    int i6 = c.f;
                    float f2 = c.g;
                    str = o3.a(c.a, c.b, c.c);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new w1(arrayList, w, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ch.a("Error parsing AVC config", e);
        }
    }
}
