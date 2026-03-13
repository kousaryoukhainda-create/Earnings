package com.applovin.impl;

import android.util.Pair;
/* loaded from: classes.dex */
abstract class nr {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(k8 k8Var, ah ahVar) {
            k8Var.c(ahVar.c(), 0, 8);
            ahVar.f(0);
            return new a(ahVar.j(), ahVar.p());
        }
    }

    public static mr a(k8 k8Var) {
        boolean z;
        byte[] bArr;
        b1.a(k8Var);
        ah ahVar = new ah(16);
        if (a.a(k8Var, ahVar).a != 1380533830) {
            return null;
        }
        k8Var.c(ahVar.c(), 0, 4);
        ahVar.f(0);
        int j = ahVar.j();
        if (j != 1463899717) {
            oc.b("WavHeaderReader", "Unsupported RIFF format: " + j);
            return null;
        }
        a a2 = a.a(k8Var, ahVar);
        while (a2.a != 1718449184) {
            k8Var.c((int) a2.b);
            a2 = a.a(k8Var, ahVar);
        }
        if (a2.b >= 16) {
            z = true;
        } else {
            z = false;
        }
        b1.b(z);
        k8Var.c(ahVar.c(), 0, 16);
        ahVar.f(0);
        int r = ahVar.r();
        int r2 = ahVar.r();
        int q = ahVar.q();
        int q2 = ahVar.q();
        int r3 = ahVar.r();
        int r4 = ahVar.r();
        int i = ((int) a2.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            k8Var.c(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = xp.f;
        }
        return new mr(r, r2, q, q2, r3, r4, bArr);
    }

    public static Pair b(k8 k8Var) {
        b1.a(k8Var);
        k8Var.b();
        ah ahVar = new ah(8);
        a a2 = a.a(k8Var, ahVar);
        while (true) {
            int i = a2.a;
            if (i != 1684108385) {
                if (i != 1380533830 && i != 1718449184) {
                    oc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.a);
                }
                long j = a2.b + 8;
                if (a2.a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    k8Var.a((int) j);
                    a2 = a.a(k8Var, ahVar);
                } else {
                    throw ch.a("Chunk is too large (~2GB+) to skip; id: " + a2.a);
                }
            } else {
                k8Var.a(8);
                long f = k8Var.f();
                long j2 = a2.b + f;
                long a3 = k8Var.a();
                if (a3 != -1 && j2 > a3) {
                    StringBuilder k = AbstractC0324Hi.k(j2, "Data exceeds input length: ", ", ");
                    k.append(a3);
                    oc.d("WavHeaderReader", k.toString());
                    j2 = a3;
                }
                return Pair.create(Long.valueOf(f), Long.valueOf(j2));
            }
        }
    }
}
