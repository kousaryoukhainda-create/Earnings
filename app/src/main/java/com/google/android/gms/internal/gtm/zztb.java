package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
final class zztb extends zzsx {
    private final transient zzsw zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zztb(zzsw zzswVar, Object[] objArr, int i, int i2) {
        this.zza = zzswVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzsx, com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final int zza(Object[] objArr, int i) {
        return zzg().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzsx, com.google.android.gms.internal.gtm.zzsq
    public final zzti zzd() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.gtm.zzsx
    public final zzst zzh() {
        return new zzta(this);
    }
}
