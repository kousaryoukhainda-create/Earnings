package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes3.dex */
final class zzfvr extends zzfyg {
    final /* synthetic */ zzfvt zza;

    public zzfvr(zzfvt zzfvtVar) {
        this.zza = zzfvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfwm.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfvs(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfvt zzfvtVar = this.zza;
        zzfwg.zzo(zzfvtVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    public final Map zza() {
        return this.zza;
    }
}
