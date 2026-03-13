package com.applovin.impl;
/* loaded from: classes.dex */
final class hi {
    private boolean c;
    private boolean d;
    private boolean e;
    private final ho a = new ho(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final ah b = new ah();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public ho b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    private int b(k8 k8Var, th thVar) {
        int min = (int) Math.min(20000L, k8Var.a());
        long j = 0;
        if (k8Var.f() != j) {
            thVar.a = j;
            return 1;
        }
        this.b.d(min);
        k8Var.b();
        k8Var.c(this.b.c(), 0, min);
        this.f = a(this.b);
        this.d = true;
        return 0;
    }

    private int c(k8 k8Var, th thVar) {
        long a = k8Var.a();
        int min = (int) Math.min(20000L, a);
        long j = a - min;
        if (k8Var.f() != j) {
            thVar.a = j;
            return 1;
        }
        this.b.d(min);
        k8Var.b();
        k8Var.c(this.b.c(), 0, min);
        this.g = b(this.b);
        this.e = true;
        return 0;
    }

    private int a(k8 k8Var) {
        this.b.a(xp.f);
        this.c = true;
        k8Var.b();
        return 0;
    }

    public long a() {
        return this.h;
    }

    private int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private long b(ah ahVar) {
        int d = ahVar.d();
        for (int e = ahVar.e() - 4; e >= d; e--) {
            if (a(ahVar.c(), e) == 442) {
                ahVar.f(e + 4);
                long c = c(ahVar);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long c(ah ahVar) {
        int d = ahVar.d();
        if (ahVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ahVar.a(bArr, 0, 9);
        ahVar.f(d);
        if (a(bArr)) {
            return b(bArr);
        }
        return -9223372036854775807L;
    }

    public int a(k8 k8Var, th thVar) {
        if (!this.e) {
            return c(k8Var, thVar);
        }
        if (this.g == -9223372036854775807L) {
            return a(k8Var);
        }
        if (!this.d) {
            return b(k8Var, thVar);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return a(k8Var);
        }
        long b = this.a.b(this.g) - this.a.b(j);
        this.h = b;
        if (b < 0) {
            oc.d("PsDurationReader", "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = -9223372036854775807L;
        }
        return a(k8Var);
    }

    private static long b(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private long a(ah ahVar) {
        int e = ahVar.e();
        for (int d = ahVar.d(); d < e - 3; d++) {
            if (a(ahVar.c(), d) == 442) {
                ahVar.f(d + 4);
                long c = c(ahVar);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
