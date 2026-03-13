package com.applovin.impl;
/* loaded from: classes.dex */
final class bp {
    private final int a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final ho b = new ho(0);
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private final ah c = new ah();

    public bp(int i) {
        this.a = i;
    }

    private int a(k8 k8Var) {
        this.c.a(xp.f);
        this.d = true;
        k8Var.b();
        return 0;
    }

    public ho b() {
        return this.b;
    }

    public boolean c() {
        return this.d;
    }

    private int b(k8 k8Var, th thVar, int i) {
        int min = (int) Math.min(this.a, k8Var.a());
        long j = 0;
        if (k8Var.f() != j) {
            thVar.a = j;
            return 1;
        }
        this.c.d(min);
        k8Var.b();
        k8Var.c(this.c.c(), 0, min);
        this.g = a(this.c, i);
        this.e = true;
        return 0;
    }

    private int c(k8 k8Var, th thVar, int i) {
        long a = k8Var.a();
        int min = (int) Math.min(this.a, a);
        long j = a - min;
        if (k8Var.f() != j) {
            thVar.a = j;
            return 1;
        }
        this.c.d(min);
        k8Var.b();
        k8Var.c(this.c.c(), 0, min);
        this.h = b(this.c, i);
        this.f = true;
        return 0;
    }

    public long a() {
        return this.i;
    }

    public int a(k8 k8Var, th thVar, int i) {
        if (i <= 0) {
            return a(k8Var);
        }
        if (!this.f) {
            return c(k8Var, thVar, i);
        }
        if (this.h == -9223372036854775807L) {
            return a(k8Var);
        }
        if (!this.e) {
            return b(k8Var, thVar, i);
        }
        long j = this.g;
        if (j == -9223372036854775807L) {
            return a(k8Var);
        }
        long b = this.b.b(this.h) - this.b.b(j);
        this.i = b;
        if (b < 0) {
            oc.d("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = -9223372036854775807L;
        }
        return a(k8Var);
    }

    private long b(ah ahVar, int i) {
        int d = ahVar.d();
        int e = ahVar.e();
        for (int i2 = e - 188; i2 >= d; i2--) {
            if (ep.a(ahVar.c(), d, e, i2)) {
                long a = ep.a(ahVar, i2, i);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long a(ah ahVar, int i) {
        int e = ahVar.e();
        for (int d = ahVar.d(); d < e; d++) {
            if (ahVar.c()[d] == 71) {
                long a = ep.a(ahVar, d, i);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }
}
