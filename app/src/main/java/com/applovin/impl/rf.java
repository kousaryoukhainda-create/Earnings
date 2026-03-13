package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.e9;
import com.applovin.impl.sf;
/* loaded from: classes.dex */
public final class rf implements p7 {
    private final ah a;
    private final sf.a b;
    private final String c;
    private qo d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public rf() {
        this(null);
    }

    private void c(ah ahVar) {
        int min = Math.min(ahVar.a(), this.k - this.g);
        this.d.a(ahVar, min);
        int i = this.g + min;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            this.d.a(j, 1, i2, 0, null);
            this.l += this.j;
        }
        this.g = 0;
        this.f = 0;
    }

    private void d(ah ahVar) {
        int min = Math.min(ahVar.a(), 4 - this.g);
        ahVar.a(this.a.c(), this.g, min);
        int i = this.g + min;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.a.f(0);
        if (!this.b.a(this.a.j())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        sf.a aVar = this.b;
        this.k = aVar.c;
        if (!this.h) {
            this.j = (aVar.g * 1000000) / aVar.d;
            this.d.a(new e9.b().c(this.e).f(this.b.b).i(4096).c(this.b.e).n(this.b.d).e(this.c).a());
            this.h = true;
        }
        this.a.f(0);
        this.d.a(this.a, 4);
        this.f = 2;
    }

    @Override // com.applovin.impl.p7
    public void a(ah ahVar) {
        b1.b(this.d);
        while (ahVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                b(ahVar);
            } else if (i == 1) {
                d(ahVar);
            } else if (i == 2) {
                c(ahVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.p7
    public void b() {
    }

    public rf(String str) {
        this.f = 0;
        ah ahVar = new ah(4);
        this.a = ahVar;
        ahVar.c()[0] = -1;
        this.b = new sf.a();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    private void b(ah ahVar) {
        byte[] c = ahVar.c();
        int e = ahVar.e();
        for (int d = ahVar.d(); d < e; d++) {
            byte b = c[d];
            boolean z = (b & 255) == 255;
            boolean z2 = this.i && (b & 224) == 224;
            this.i = z;
            if (z2) {
                ahVar.f(d + 1);
                this.i = false;
                this.a.c()[1] = c[d];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        ahVar.f(e);
    }

    @Override // com.applovin.impl.p7
    public void a(l8 l8Var, dp.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = l8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
