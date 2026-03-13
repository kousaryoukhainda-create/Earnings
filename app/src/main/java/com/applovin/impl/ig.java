package com.applovin.impl;
/* loaded from: classes.dex */
final class ig {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final ah k = new ah(255);

    public boolean a(k8 k8Var, boolean z) {
        a();
        this.k.d(27);
        if (m8.a(k8Var, this.k.c(), 0, 27, z) && this.k.y() == 1332176723) {
            int w = this.k.w();
            this.a = w;
            if (w != 0) {
                if (z) {
                    return false;
                }
                throw ch.a("unsupported bit stream revision");
            }
            this.b = this.k.w();
            this.c = this.k.n();
            this.d = this.k.p();
            this.e = this.k.p();
            this.f = this.k.p();
            int w2 = this.k.w();
            this.g = w2;
            this.h = w2 + 27;
            this.k.d(w2);
            if (m8.a(k8Var, this.k.c(), 0, this.g, z)) {
                for (int i = 0; i < this.g; i++) {
                    this.j[i] = this.k.w();
                    this.i += this.j[i];
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void a() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean a(k8 k8Var) {
        return a(k8Var, -1L);
    }

    public boolean a(k8 k8Var, long j) {
        int i;
        b1.a(k8Var.f() == k8Var.d());
        this.k.d(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || k8Var.f() + 4 < j) && m8.a(k8Var, this.k.c(), 0, 4, true)) {
                this.k.f(0);
                if (this.k.y() == 1332176723) {
                    k8Var.b();
                    return true;
                }
                k8Var.a(1);
            }
        }
        do {
            if (i != 0 && k8Var.f() >= j) {
                break;
            }
        } while (k8Var.b(1) != -1);
        return false;
    }
}
