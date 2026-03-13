package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.e9;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class l7 implements p7 {
    private final List a;
    private final qo[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public l7(List list) {
        this.a = list;
        this.b = new qo[list.size()];
    }

    private boolean a(ah ahVar, int i) {
        if (ahVar.a() == 0) {
            return false;
        }
        if (ahVar.w() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // com.applovin.impl.p7
    public void b() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (qo qoVar : this.b) {
                    qoVar.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(ah ahVar) {
        qo[] qoVarArr;
        if (this.c) {
            if (this.d != 2 || a(ahVar, 32)) {
                if (this.d != 1 || a(ahVar, 0)) {
                    int d = ahVar.d();
                    int a = ahVar.a();
                    for (qo qoVar : this.b) {
                        ahVar.f(d);
                        qoVar.a(ahVar, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    @Override // com.applovin.impl.p7
    public void a(l8 l8Var, dp.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dp.a aVar = (dp.a) this.a.get(i);
            dVar.a();
            qo a = l8Var.a(dVar.c(), 3);
            a.a(new e9.b().c(dVar.b()).f("application/dvbsubs").a(Collections.singletonList(aVar.c)).e(aVar.a).a());
            this.b[i] = a;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
