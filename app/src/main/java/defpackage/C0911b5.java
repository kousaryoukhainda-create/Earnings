package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* renamed from: b5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911b5 implements Set {
    public final /* synthetic */ C1243e5 b;

    public C0911b5(C1243e5 c1243e5) {
        this.b = c1243e5;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C1243e5 c1243e5 = this.b;
        c1243e5.getClass();
        for (Object obj : collection) {
            if (!c1243e5.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        C1243e5 c1243e5 = this.b;
        int i = 0;
        for (int i2 = c1243e5.d - 1; i2 >= 0; i2--) {
            Object h = c1243e5.h(i2);
            if (h == null) {
                hashCode = 0;
            } else {
                hashCode = h.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0820a5(this.b, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1243e5 c1243e5 = this.b;
        int e = c1243e5.e(obj);
        if (e >= 0) {
            c1243e5.i(e);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1243e5 c1243e5 = this.b;
        int i = c1243e5.d;
        for (Object obj : collection) {
            c1243e5.remove(obj);
        }
        if (i != c1243e5.d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.b.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.b.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1243e5 c1243e5 = this.b;
        int i = c1243e5.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c1243e5.h(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.m(0, objArr);
    }
}
