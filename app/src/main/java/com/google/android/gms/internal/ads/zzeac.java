package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzeac {
    private final zzdzy zza;
    private final zzgcs zzb;

    public zzeac(zzdzy zzdzyVar, zzgcs zzgcsVar) {
        this.zza = zzdzyVar;
        this.zzb = zzgcsVar;
    }

    public final void zza(zzffr zzffrVar) {
        final zzdzy zzdzyVar = this.zza;
        Objects.requireNonNull(zzdzyVar);
        zzgch.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdzy.this.getWritableDatabase();
            }
        }), new zzeab(this, zzffrVar), this.zzb);
    }
}
