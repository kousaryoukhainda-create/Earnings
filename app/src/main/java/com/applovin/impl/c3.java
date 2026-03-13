package com.applovin.impl;
/* loaded from: classes.dex */
public abstract class c3 {
    public static void a(long j, ah ahVar, qo[] qoVarArr) {
        while (true) {
            if (ahVar.a() <= 1) {
                return;
            }
            int a = a(ahVar);
            int a2 = a(ahVar);
            int d = ahVar.d() + a2;
            if (a2 == -1 || a2 > ahVar.a()) {
                oc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                d = ahVar.e();
            } else if (a == 4 && a2 >= 8) {
                int w = ahVar.w();
                int C = ahVar.C();
                int j2 = C == 49 ? ahVar.j() : 0;
                int w2 = ahVar.w();
                if (C == 47) {
                    ahVar.g(1);
                }
                boolean z = w == 181 && (C == 49 || C == 47) && w2 == 3;
                if (C == 49) {
                    z &= j2 == 1195456820;
                }
                if (z) {
                    b(j, ahVar, qoVarArr);
                }
            }
            ahVar.f(d);
        }
    }

    public static void b(long j, ah ahVar, qo[] qoVarArr) {
        int w = ahVar.w();
        if ((w & 64) != 0) {
            ahVar.g(1);
            int i = (w & 31) * 3;
            int d = ahVar.d();
            for (qo qoVar : qoVarArr) {
                ahVar.f(d);
                qoVar.a(ahVar, i);
                if (j != -9223372036854775807L) {
                    qoVar.a(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int a(ah ahVar) {
        int i = 0;
        while (ahVar.a() != 0) {
            int w = ahVar.w();
            i += w;
            if (w != 255) {
                return i;
            }
        }
        return -1;
    }
}
