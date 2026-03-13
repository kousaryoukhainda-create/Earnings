package com.applovin.impl;

import com.applovin.impl.fo;
/* loaded from: classes.dex */
public abstract class h9 extends fo {
    protected final fo c;

    public h9(fo foVar) {
        this.c = foVar;
    }

    @Override // com.applovin.impl.fo
    public int a(boolean z) {
        return this.c.a(z);
    }

    @Override // com.applovin.impl.fo
    public int b(boolean z) {
        return this.c.b(z);
    }

    @Override // com.applovin.impl.fo
    public int a(Object obj) {
        return this.c.a(obj);
    }

    @Override // com.applovin.impl.fo
    public int b(int i, int i2, boolean z) {
        return this.c.b(i, i2, z);
    }

    @Override // com.applovin.impl.fo
    public int a(int i, int i2, boolean z) {
        return this.c.a(i, i2, z);
    }

    @Override // com.applovin.impl.fo
    public Object b(int i) {
        return this.c.b(i);
    }

    @Override // com.applovin.impl.fo
    public fo.b a(int i, fo.b bVar, boolean z) {
        return this.c.a(i, bVar, z);
    }

    @Override // com.applovin.impl.fo
    public int b() {
        return this.c.b();
    }

    @Override // com.applovin.impl.fo
    public int a() {
        return this.c.a();
    }

    @Override // com.applovin.impl.fo
    public fo.d a(int i, fo.d dVar, long j) {
        return this.c.a(i, dVar, j);
    }
}
