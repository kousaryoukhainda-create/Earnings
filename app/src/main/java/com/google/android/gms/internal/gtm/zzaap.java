package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
@Deprecated
/* loaded from: classes3.dex */
public final class zzaap extends AbstractList implements RandomAccess, zzyo {
    private final zzyo zza;

    public zzaap(zzyo zzyoVar) {
        this.zza = zzyoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzyn) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzaao(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzaan(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzyo
    public final zzyo zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzyo
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.gtm.zzyo
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzyo
    public final void zzi(zzud zzudVar) {
        throw new UnsupportedOperationException();
    }
}
