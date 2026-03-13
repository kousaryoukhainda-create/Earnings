package com.google.android.gms.internal.common;

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
import org.jspecify.annotations.NullMarked;
@NullMarked
/* loaded from: classes3.dex */
public abstract class zzak extends zzag implements List, RandomAccess, j$.util.List {
    private static final zzao zza = new zzai(zzam.zza, 0);

    public static zzak zzi(Object[] objArr, int i) {
        if (i == 0) {
            return zzam.zza;
        }
        return new zzam(objArr, i);
    }

    public static zzak zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzam.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        zzah zzahVar = new zzah(4);
        zzahVar.zzb(next);
        zzahVar.zzc(it);
        zzahVar.zzc = true;
        return zzi(zzahVar.zza, zzahVar.zzb);
    }

    public static zzak zzk(Collection collection) {
        if (collection instanceof zzag) {
            zzak zzd = ((zzag) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzi(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzal.zza(array2, length);
        return zzi(array2, length);
    }

    public static zzak zzl() {
        return zzam.zza;
    }

    public static zzak zzm(Object obj) {
        Object[] objArr = {obj};
        zzal.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzak zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzal.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void addFirst(Object obj) {
        List.CC.$default$addFirst(this, obj);
    }

    public final /* synthetic */ void addLast(Object obj) {
        List.CC.$default$addLast(this, obj);
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzu.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzu.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
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

    @Override // com.google.android.gms.internal.common.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
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
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.common.zzag
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzag
    @Deprecated
    public final zzak zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final zzan zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzak subList(int i, int i2) {
        zzv.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzam.zza;
        }
        return new zzaj(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzo */
    public final zzao listIterator(int i) {
        zzv.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzai(this, i);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(j$.util.function.UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    /* renamed from: reversed  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ SequencedCollection m5reversed() {
        return List.CC.$default$reversed(this);
    }
}
