package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hk extends hb {
    final transient Object c;
    private transient int d;

    public hk(Object obj) {
        this.c = Preconditions.checkNotNull(obj);
    }

    @Override // com.applovin.impl.bb
    public int a(Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.applovin.impl.bb
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.hb
    public db f() {
        return db.a(this.c);
    }

    @Override // com.applovin.impl.hb
    public boolean g() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.hb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = this.c.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public pp iterator() {
        return wb.a(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.c.toString() + ']';
    }

    public hk(Object obj, int i) {
        this.c = obj;
        this.d = i;
    }
}
