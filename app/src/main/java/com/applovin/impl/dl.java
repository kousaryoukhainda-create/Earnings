package com.applovin.impl;
/* loaded from: classes.dex */
final class dl extends g9 {
    private final long b;

    public dl(k8 k8Var, long j) {
        super(k8Var);
        boolean z;
        if (k8Var.f() >= j) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        this.b = j;
    }

    @Override // com.applovin.impl.g9, com.applovin.impl.k8
    public long a() {
        return super.a() - this.b;
    }

    @Override // com.applovin.impl.g9, com.applovin.impl.k8
    public long d() {
        return super.d() - this.b;
    }

    @Override // com.applovin.impl.g9, com.applovin.impl.k8
    public long f() {
        return super.f() - this.b;
    }
}
