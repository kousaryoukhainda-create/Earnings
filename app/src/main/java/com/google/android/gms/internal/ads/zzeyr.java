package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final class zzeyr implements zzezf {
    private final zzfdw zza;
    private final Executor zzb;
    private final zzgcd zzc = new zzeyp(this);

    public zzeyr(zzfdw zzfdwVar, Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = executor;
    }

    public final /* synthetic */ InterfaceFutureC2490qH zza(zzcuz zzcuzVar, zzeyz zzeyzVar) throws Exception {
        zzfdw zzfdwVar = this.zza;
        zzfeg zzfegVar = zzeyzVar.zzb;
        zzbvk zzbvkVar = zzeyzVar.zza;
        zzfef zzb = zzfdwVar.zzb(zzfegVar);
        if (zzb != null && zzbvkVar != null) {
            zzgch.zzr(zzcuzVar.zzb().zzg(zzbvkVar), this.zzc, this.zzb);
        }
        return zzgch.zzh(new zzeyq(zzfegVar, zzbvkVar, zzb));
    }

    public final InterfaceFutureC2490qH zzb(zzezg zzezgVar, zzeze zzezeVar, final zzcuz zzcuzVar) {
        return (zzgby) zzgch.zze((zzgby) zzgch.zzn(zzgby.zzu(new zzezb(this.zza, zzcuzVar, this.zzb).zzc()), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                return zzeyr.this.zza(zzcuzVar, (zzeyz) obj);
            }
        }, this.zzb), Exception.class, new zzeyo(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ InterfaceFutureC2490qH zzc(zzezg zzezgVar, zzeze zzezeVar, Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
