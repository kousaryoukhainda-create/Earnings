package com.applovin.impl;

import com.applovin.impl.qo;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class h7 implements qo {
    private final byte[] a = new byte[4096];

    @Override // com.applovin.impl.qo
    public final /* synthetic */ int a(f5 f5Var, int i, boolean z) {
        return AbstractC1928jk0.a(this, f5Var, i, z);
    }

    @Override // com.applovin.impl.qo
    public void a(long j, int i, int i2, int i3, qo.a aVar) {
    }

    @Override // com.applovin.impl.qo
    public final /* synthetic */ void a(ah ahVar, int i) {
        AbstractC1928jk0.b(this, ahVar, i);
    }

    @Override // com.applovin.impl.qo
    public void a(e9 e9Var) {
    }

    @Override // com.applovin.impl.qo
    public int a(f5 f5Var, int i, boolean z, int i2) {
        int a = f5Var.a(this.a, 0, Math.min(this.a.length, i));
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return a;
    }

    @Override // com.applovin.impl.qo
    public void a(ah ahVar, int i, int i2) {
        ahVar.g(i);
    }
}
