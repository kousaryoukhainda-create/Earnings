package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public class zzdeu {
    private final zzdgc zza;
    private final zzcex zzb;

    public zzdeu(zzdgc zzdgcVar, zzcex zzcexVar) {
        this.zza = zzdgcVar;
        this.zzb = zzcexVar;
    }

    public final View zza() {
        zzcex zzcexVar = this.zzb;
        if (zzcexVar == null) {
            return null;
        }
        return zzcexVar.zzG();
    }

    public final View zzb() {
        zzcex zzcexVar = this.zzb;
        if (zzcexVar != null) {
            return zzcexVar.zzG();
        }
        return null;
    }

    public final zzcex zzc() {
        return this.zzb;
    }

    public final zzddk zzd(Executor executor) {
        final zzcex zzcexVar = this.zzb;
        return new zzddk(new zzdai() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdai
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzcex zzcexVar2 = zzcex.this;
                if (zzcexVar2 != null && (zzL = zzcexVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdgc zze() {
        return this.zza;
    }

    public Set zzf(zzcuo zzcuoVar) {
        return Collections.singleton(new zzddk(zzcuoVar, zzbzw.zzg));
    }

    public Set zzg(zzcuo zzcuoVar) {
        return Collections.singleton(new zzddk(zzcuoVar, zzbzw.zzg));
    }
}
