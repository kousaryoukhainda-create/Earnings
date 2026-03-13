package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: X  reason: default package */
/* loaded from: classes.dex */
public class X extends AbstractCollection implements List {
    public final Object b;
    public Collection c;
    public final X d;
    public final Collection f;
    public final /* synthetic */ C2753tN g;
    public final /* synthetic */ C2753tN h;

    public X(C2753tN c2753tN, Object obj, List list, X x) {
        Collection collection;
        this.h = c2753tN;
        this.g = c2753tN;
        this.b = obj;
        this.c = list;
        this.d = x;
        if (x == null) {
            collection = null;
        } else {
            collection = x.c;
        }
        this.f = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        boolean isEmpty = this.c.isEmpty();
        boolean add = this.c.add(obj);
        if (add) {
            this.g.g++;
            if (isEmpty) {
                e();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.c.addAll(collection);
        if (addAll) {
            this.g.g += this.c.size() - size;
            if (size == 0) {
                e();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.c.clear();
        this.g.g -= size;
        g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        f();
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        f();
        return this.c.containsAll(collection);
    }

    public final void e() {
        X x = this.d;
        if (x != null) {
            x.e();
        } else {
            this.g.f.put(this.b, this.c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        f();
        return this.c.equals(obj);
    }

    public final void f() {
        Collection collection;
        X x = this.d;
        if (x != null) {
            x.f();
            if (x.c != this.f) {
                throw new ConcurrentModificationException();
            }
        } else if (this.c.isEmpty() && (collection = (Collection) this.g.f.get(this.b)) != null) {
            this.c = collection;
        }
    }

    public final void g() {
        X x = this.d;
        if (x != null) {
            x.g();
        } else if (this.c.isEmpty()) {
            this.g.f.remove(this.b);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        f();
        return ((List) this.c).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        return this.c.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        f();
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        f();
        return new N(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        f();
        return new W(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        boolean remove = this.c.remove(obj);
        if (remove) {
            C2753tN c2753tN = this.g;
            c2753tN.g--;
            g();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.c.removeAll(collection);
        if (removeAll) {
            this.g.g += this.c.size() - size;
            g();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.c.retainAll(collection);
        if (retainAll) {
            this.g.g += this.c.size() - size;
            g();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        f();
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        f();
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        f();
        List subList = ((List) this.c).subList(i, i2);
        X x = this.d;
        if (x == null) {
            x = this;
        }
        C2753tN c2753tN = this.h;
        c2753tN.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.b;
        if (z) {
            return new X(c2753tN, obj, subList, x);
        }
        return new X(c2753tN, obj, subList, x);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return this.c.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        f();
        return new W(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        f();
        Object remove = ((List) this.c).remove(i);
        C2753tN c2753tN = this.h;
        c2753tN.g--;
        g();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        f();
        boolean isEmpty = this.c.isEmpty();
        ((List) this.c).add(i, obj);
        this.h.g++;
        if (isEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.c).addAll(i, collection);
        if (addAll) {
            this.h.g += this.c.size() - size;
            if (size == 0) {
                e();
            }
        }
        return addAll;
    }
}
