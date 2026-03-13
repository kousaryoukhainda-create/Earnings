package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.e9;
import java.util.List;
/* loaded from: classes.dex */
final class vp {
    private final List a;
    private final qo[] b;

    public vp(List list) {
        this.a = list;
        this.b = new qo[list.size()];
    }

    public void a(long j, ah ahVar) {
        if (ahVar.a() < 9) {
            return;
        }
        int j2 = ahVar.j();
        int j3 = ahVar.j();
        int w = ahVar.w();
        if (j2 == 434 && j3 == 1195456820 && w == 3) {
            c3.b(j, ahVar, this.b);
        }
    }

    public void a(l8 l8Var, dp.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            qo a = l8Var.a(dVar.c(), 3);
            e9 e9Var = (e9) this.a.get(i);
            String str = e9Var.m;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            b1.a(z, "Invalid closed caption mime type provided: " + str);
            a.a(new e9.b().c(dVar.b()).f(str).o(e9Var.d).e(e9Var.c).a(e9Var.E).a(e9Var.o).a());
            this.b[i] = a;
        }
    }
}
