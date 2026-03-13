package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamq  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzamq<E> extends zzajj<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzamq<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzamq<>(objArr, 0, false);
    }

    public zzamq() {
        this(zza, 0, true);
    }

    private static int zzb(int i) {
        return Kh0.b(i, 3, 2, 1, 10);
    }

    private final String zzc(int i) {
        return AbstractC0324Hi.d(i, this.zzd, "Index:", ", Size:");
    }

    public static <E> zzamq<E> zzd() {
        return (zzamq<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zza();
        if (i >= 0 && i <= (i2 = this.zzd)) {
            E[] eArr = this.zzc;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
                System.arraycopy(this.zzc, 0, eArr2, 0, i);
                System.arraycopy(this.zzc, i, eArr2, i + 1, this.zzd - i);
                this.zzc = eArr2;
            }
            this.zzc[i] = e;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzd(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        zza();
        zzd(i);
        E[] eArr = this.zzc;
        E e = eArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zza();
        zzd(i);
        E[] eArr = this.zzc;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalc zza(int i) {
        Object[] copyOf;
        if (i >= this.zzd) {
            if (i == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzc, i);
            }
            return new zzamq(copyOf, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzamq(E[] eArr, int i, boolean z) {
        super(z);
        this.zzc = eArr;
        this.zzd = i;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zza();
        int i = this.zzd;
        E[] eArr = this.zzc;
        if (i == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
