package defpackage;

import j$.util.List;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.SequencedCollection;
import java.util.function.UnaryOperator;
/* renamed from: Ef0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Ef0 extends Bf0 implements List, RandomAccess, j$.util.List {
    public static final Cf0 c = new Cf0(Gf0.f, 0);

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void addFirst(Object obj) {
        List.CC.$default$addFirst(this, obj);
    }

    public final /* synthetic */ void addLast(Object obj) {
        List.CC.$default$addLast(this, obj);
    }

    @Override // defpackage.Bf0
    public int b(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                Cf0 listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final /* synthetic */ Object getFirst() {
        return List.CC.$default$getFirst(this);
    }

    public final /* synthetic */ Object getLast() {
        return List.CC.$default$getLast(this);
    }

    @Override // java.util.List
    /* renamed from: h */
    public Ef0 subList(int i, int i2) {
        AbstractC1281eb.i(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return Gf0.f;
        }
        return new Df0(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j */
    public final Cf0 listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return c;
            }
            return new Cf0(this, i);
        }
        throw new IndexOutOfBoundsException(AbstractC1281eb.q(i, size, "index"));
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object removeFirst() {
        return List.CC.$default$removeFirst(this);
    }

    public final /* synthetic */ Object removeLast() {
        return List.CC.$default$removeLast(this);
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    public final /* synthetic */ java.util.List reversed() {
        return List.CC.$default$reversed(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(j$.util.function.UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    /* renamed from: reversed  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ SequencedCollection m0reversed() {
        return List.CC.$default$reversed(this);
    }
}
