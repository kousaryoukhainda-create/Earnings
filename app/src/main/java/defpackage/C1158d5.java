package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: d5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158d5 implements Collection {
    public final /* synthetic */ C1243e5 b;

    public C1158d5(C1243e5 c1243e5) {
        this.b = c1243e5;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.b.g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0820a5(this.b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1243e5 c1243e5 = this.b;
        int g = c1243e5.g(obj);
        if (g >= 0) {
            c1243e5.i(g);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1243e5 c1243e5 = this.b;
        int i = c1243e5.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c1243e5.k(i2))) {
                c1243e5.i(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1243e5 c1243e5 = this.b;
        int i = c1243e5.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c1243e5.k(i2))) {
                c1243e5.i(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b.d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1243e5 c1243e5 = this.b;
        int i = c1243e5.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c1243e5.k(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.m(1, objArr);
    }
}
