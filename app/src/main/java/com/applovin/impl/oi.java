package com.applovin.impl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class oi extends hb {
    static final oi i = new oi(new Object[0], 0, null, 0, 0);
    final transient Object[] c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;
    private final transient int h;

    public oi(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.c = objArr;
        this.d = objArr2;
        this.f = i3;
        this.g = i2;
        this.h = i4;
    }

    @Override // com.applovin.impl.bb
    public int a(Object[] objArr, int i2) {
        System.arraycopy(this.c, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    @Override // com.applovin.impl.bb
    public Object[] b() {
        return this.c;
    }

    @Override // com.applovin.impl.bb
    public int c() {
        return this.h;
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = ja.a(obj);
        while (true) {
            int i2 = a & this.f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i2 + 1;
        }
    }

    @Override // com.applovin.impl.bb
    public int d() {
        return 0;
    }

    @Override // com.applovin.impl.bb
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.hb
    public db f() {
        return db.b(this.c, this.h);
    }

    @Override // com.applovin.impl.hb
    public boolean g() {
        return true;
    }

    @Override // com.applovin.impl.hb, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public pp iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.h;
    }
}
