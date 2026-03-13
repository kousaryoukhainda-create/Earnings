package com.google.android.gms.internal.gtm;

import java.util.Iterator;
/* loaded from: classes3.dex */
final class zztc extends zzsx {
    private final transient zzsw zza;
    private final transient zzst zzb;

    public zztc(zzsw zzswVar, zzst zzstVar) {
        this.zza = zzswVar;
        this.zzb = zzstVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzsx, com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzsx, com.google.android.gms.internal.gtm.zzsq
    public final zzti zzd() {
        return this.zzb.listIterator(0);
    }
}
