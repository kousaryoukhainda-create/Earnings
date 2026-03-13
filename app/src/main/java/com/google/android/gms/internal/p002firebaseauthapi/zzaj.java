package com.google.android.gms.internal.p002firebaseauthapi;

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
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaj  reason: invalid package */
/* loaded from: classes3.dex */
public abstract class zzaj<E> extends zzai<E> implements List<E>, RandomAccess, j$.util.List {
    private static final zzaz<Object> zza = new zzal(zzar.zza, 0);

    public static <E> zzaj<E> zzb(Object[] objArr, int i) {
        if (i == 0) {
            return (zzaj<E>) zzar.zza;
        }
        return new zzar(objArr, i);
    }

    public static <E> zzam<E> zzg() {
        return new zzam<>();
    }

    public static <E> zzaj<E> zzh() {
        return (zzaj<E>) zzar.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void addFirst(Object obj) {
        List.CC.$default$addFirst(this, obj);
    }

    public final /* synthetic */ void addLast(Object obj) {
        List.CC.$default$addLast(this, obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzw.zza(this)) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzp.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!zzp.zza(e, it.next())) {
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
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
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
    public /* synthetic */ ListIterator listIterator() {
        return (zzaz) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
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
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    @Deprecated
    public final zzaj<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzba<E> iterator() {
        return (zzaz) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        zzw.zzb(i, size());
        if (isEmpty()) {
            return zza;
        }
        return new zzal(this, i);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(j$.util.function.UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    /* renamed from: reversed  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ SequencedCollection m7reversed() {
        return List.CC.$default$reversed(this);
    }

    public static <E> zzaj<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzaj<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(AbstractC0324Hi.e(i, "at index "));
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzaj<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzai) {
            zzaj<E> zzc = ((zzai) collection).zzc();
            if (zzc.zze()) {
                Object[] array = zzc.toArray();
                return zzb(array, array.length);
            }
            return zzc;
        }
        return zzb(collection.toArray());
    }

    public static <E> zzaj<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return zzb(e, e2, e3, e4, e5, e6, e7, e8);
    }

    @Override // java.util.List
    /* renamed from: zza */
    public zzaj<E> subList(int i, int i2) {
        zzw.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (zzaj<E>) zzar.zza;
        }
        return new zzao(this, i, i3);
    }
}
