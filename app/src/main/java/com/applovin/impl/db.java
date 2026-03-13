package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.bb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class db extends bb implements List, RandomAccess {
    private static final qp b = new b(mi.f, 0);

    /* loaded from: classes.dex */
    public static final class a extends bb.a {
        public a() {
            this(4);
        }

        public db a() {
            this.c = true;
            return db.b(this.a, this.b);
        }

        public a b(Object obj) {
            super.a(obj);
            return this;
        }

        public a(int i) {
            super(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbstractC1062c {
        private final db c;

        public b(db dbVar, int i) {
            super(dbVar.size(), i);
            this.c = dbVar;
        }

        @Override // com.applovin.impl.AbstractC1062c
        public Object a(int i) {
            return this.c.get(i);
        }
    }

    /* loaded from: classes.dex */
    public class c extends db {
        final transient int c;
        final transient int d;

        public c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // com.applovin.impl.db, java.util.List
        /* renamed from: a */
        public db subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.d);
            db dbVar = db.this;
            int i3 = this.c;
            return dbVar.subList(i + i3, i2 + i3);
        }

        @Override // com.applovin.impl.bb
        public Object[] b() {
            return db.this.b();
        }

        @Override // com.applovin.impl.bb
        public int c() {
            return db.this.d() + this.c + this.d;
        }

        @Override // com.applovin.impl.bb
        public int d() {
            return db.this.d() + this.c;
        }

        @Override // com.applovin.impl.bb
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.d);
            return db.this.get(i + this.c);
        }

        @Override // com.applovin.impl.db, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.impl.db, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d;
        }

        @Override // com.applovin.impl.db, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static db b(Object[] objArr, int i) {
        if (i == 0) {
            return h();
        }
        return new mi(objArr, i);
    }

    public static db c(Object[] objArr) {
        if (objArr.length == 0) {
            return h();
        }
        return b((Object[]) objArr.clone());
    }

    public static a f() {
        return new a();
    }

    public static db h() {
        return mi.f;
    }

    @Override // com.applovin.impl.bb
    public final db a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return hc.a(this, obj);
    }

    @Override // java.util.List
    /* renamed from: g */
    public qp listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return hc.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public pp iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return hc.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static db a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    private static db b(Object... objArr) {
        return a(fg.a(objArr));
    }

    @Override // com.applovin.impl.bb
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public db b(int i, int i2) {
        return new c(i, i2 - i);
    }

    public static db a(Collection collection) {
        if (collection instanceof bb) {
            db a2 = ((bb) collection).a();
            return a2.e() ? a(a2.toArray()) : a2;
        }
        return b(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a */
    public qp listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return b;
        }
        return new b(this, i);
    }

    public static db a(Object obj) {
        return b(obj);
    }

    public static db a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public static db a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b(obj, obj2, obj3, obj4, obj5);
    }

    public static db a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static db a(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] c2 = vb.c(iterable);
        fg.a(c2);
        Arrays.sort(c2, comparator);
        return a(c2);
    }

    @Override // java.util.List
    /* renamed from: a */
    public db subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return h();
        }
        return b(i, i2);
    }
}
