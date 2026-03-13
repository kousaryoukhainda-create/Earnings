package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class mi extends db {
    static final db f = new mi(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    public mi(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.applovin.impl.db, com.applovin.impl.bb
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, i, this.d);
        return i + this.d;
    }

    @Override // com.applovin.impl.bb
    public Object[] b() {
        return this.c;
    }

    @Override // com.applovin.impl.bb
    public int c() {
        return this.d;
    }

    @Override // com.applovin.impl.bb
    public int d() {
        return 0;
    }

    @Override // com.applovin.impl.bb
    public boolean e() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i) {
        Preconditions.checkElementIndex(i, this.d);
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }
}
