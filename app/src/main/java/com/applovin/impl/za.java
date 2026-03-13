package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.e9;
/* loaded from: classes.dex */
public final class za implements p7 {
    private qo b;
    private boolean c;
    private int e;
    private int f;
    private final ah a = new ah(10);
    private long d = -9223372036854775807L;

    @Override // com.applovin.impl.p7
    public void a(ah ahVar) {
        b1.b(this.b);
        if (this.c) {
            int a = ahVar.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(ahVar.c(), ahVar.d(), this.a.c(), this.f, min);
                if (this.f + min == 10) {
                    this.a.f(0);
                    if (73 == this.a.w() && 68 == this.a.w() && 51 == this.a.w()) {
                        this.a.g(3);
                        this.e = this.a.v() + 10;
                    } else {
                        oc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.a(ahVar, min2);
            this.f += min2;
        }
    }

    @Override // com.applovin.impl.p7
    public void b() {
        int i;
        b1.b(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.a(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(l8 l8Var, dp.d dVar) {
        dVar.a();
        qo a = l8Var.a(dVar.c(), 5);
        this.b = a;
        a.a(new e9.b().c(dVar.b()).f("application/id3").a());
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
