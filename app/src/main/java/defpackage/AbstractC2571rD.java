package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: rD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2571rD extends AbstractC2056lD implements List, RandomAccess {
    public static final C2400pD c = new C2400pD(FV.g, 0);

    public static FV A(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = objArr.length + 12;
            Object[] objArr2 = new Object[length];
            objArr2[0] = str;
            objArr2[1] = str2;
            objArr2[2] = str3;
            objArr2[3] = str4;
            objArr2[4] = str5;
            objArr2[5] = str6;
            objArr2[6] = str7;
            objArr2[7] = str8;
            objArr2[8] = str9;
            objArr2[9] = str10;
            objArr2[10] = str11;
            objArr2[11] = str12;
            System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
            AbstractC1906jZ.l(length, objArr2);
            return o(length, objArr2);
        }
        throw new IllegalArgumentException("the total number of elements must fit in an int");
    }

    public static FV B(AbstractC3014wQ abstractC3014wQ, Collection collection) {
        Collection collection2;
        abstractC3014wQ.getClass();
        if (collection instanceof Collection) {
            collection2 = collection;
        } else {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        AbstractC1906jZ.l(array.length, array);
        Arrays.sort(array, abstractC3014wQ);
        return o(array.length, array);
    }

    public static FV o(int i, Object[] objArr) {
        if (i == 0) {
            return FV.g;
        }
        return new FV(objArr, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oD, kD] */
    public static C2314oD p() {
        return new AbstractC1970kD(4);
    }

    public static AbstractC2571rD r(Collection collection) {
        if (collection instanceof AbstractC2056lD) {
            AbstractC2571rD e = ((AbstractC2056lD) collection).e();
            if (e.l()) {
                Object[] array = e.toArray(AbstractC2056lD.b);
                return o(array.length, array);
            }
            return e;
        }
        Object[] array2 = collection.toArray();
        AbstractC1906jZ.l(array2.length, array2);
        return o(array2.length, array2);
    }

    public static FV t(Object[] objArr) {
        if (objArr.length == 0) {
            return FV.g;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC1906jZ.l(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static FV v() {
        return FV.g;
    }

    public static FV w(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC1906jZ.l(5, objArr);
        return o(5, objArr);
    }

    public static FV x(Object obj) {
        Object[] objArr = {obj};
        AbstractC1906jZ.l(1, objArr);
        return o(1, objArr);
    }

    public static FV y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1906jZ.l(2, objArr);
        return o(2, objArr);
    }

    public static FV z(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC1906jZ.l(3, objArr);
        return o(3, objArr);
    }

    @Override // java.util.List
    /* renamed from: C */
    public AbstractC2571rD subList(int i, int i2) {
        B10.s(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return FV.g;
        }
        return new C2486qD(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC2056lD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (B10.C(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object obj2 : this) {
                    if (it.hasNext()) {
                        if (!B10.C(obj2, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC2056lD
    public int f(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
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

    @Override // defpackage.AbstractC2056lD, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
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

    @Override // defpackage.AbstractC2056lD
    public final H90 n() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public final C2400pD listIterator(int i) {
        B10.r(i, size());
        if (isEmpty()) {
            return c;
        }
        return new C2400pD(this, i);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC2056lD
    public final AbstractC2571rD e() {
        return this;
    }
}
