package com.applovin.impl;

import java.util.List;
/* loaded from: classes.dex */
public abstract class sl extends yg implements nl {
    private nl d;
    private long f;

    @Override // com.applovin.impl.nl
    public long a(int i) {
        return ((nl) b1.a(this.d)).a(i) + this.f;
    }

    @Override // com.applovin.impl.l2
    public void b() {
        super.b();
        this.d = null;
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return ((nl) b1.a(this.d)).a();
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        return ((nl) b1.a(this.d)).a(j - this.f);
    }

    @Override // com.applovin.impl.nl
    public List b(long j) {
        return ((nl) b1.a(this.d)).b(j - this.f);
    }

    public void a(long j, nl nlVar, long j2) {
        this.b = j;
        this.d = nlVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
