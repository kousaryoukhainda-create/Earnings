package com.applovin.impl;

import com.applovin.impl.wa;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class ya {
    private final ah a = new ah(10);

    public af a(k8 k8Var, wa.a aVar) {
        af afVar = null;
        int i = 0;
        while (true) {
            try {
                k8Var.c(this.a.c(), 0, 10);
                this.a.f(0);
                if (this.a.z() != 4801587) {
                    break;
                }
                this.a.g(3);
                int v = this.a.v();
                int i2 = v + 10;
                if (afVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.c(), 0, bArr, 0, 10);
                    k8Var.c(bArr, 10, v);
                    afVar = new wa(aVar).a(bArr, i2);
                } else {
                    k8Var.c(v);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        k8Var.b();
        k8Var.c(i);
        return afVar;
    }
}
