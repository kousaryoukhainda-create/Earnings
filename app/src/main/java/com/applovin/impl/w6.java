package com.applovin.impl;
/* loaded from: classes.dex */
public final class w6 {
    public final int a;
    public final int b;
    public final String c;

    private w6(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static w6 a(ah ahVar) {
        String str;
        ahVar.g(2);
        int w = ahVar.w();
        int i = w >> 1;
        int w2 = ((ahVar.w() >> 3) & 31) | ((w & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (w2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(w2);
        return new w6(i, w2, sb.toString());
    }
}
