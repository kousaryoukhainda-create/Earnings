package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes3.dex */
public final class zzdye implements zzdyg {
    private final Map zza;
    private final zzgcs zzb;
    private final zzcyo zzc;

    public zzdye(Map map, zzgcs zzgcsVar, zzcyo zzcyoVar) {
        this.zza = map;
        this.zzb = zzgcsVar;
        this.zzc = zzcyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyg
    public final InterfaceFutureC2490qH zzb(final zzbvk zzbvkVar) {
        this.zzc.zzdl(zzbvkVar);
        InterfaceFutureC2490qH zzg = zzgch.zzg(new zzdvy(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzic)).split(",")) {
            final zzhfj zzhfjVar = (zzhfj) this.zza.get(str.trim());
            if (zzhfjVar != null) {
                zzg = zzgch.zzf(zzg, zzdvy.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyc
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final InterfaceFutureC2490qH zza(Object obj) {
                        zzdvy zzdvyVar = (zzdvy) obj;
                        return ((zzdyg) zzhfj.this.zzb()).zzb(zzbvkVar);
                    }
                }, this.zzb);
            }
        }
        zzgch.zzr(zzg, new zzdyd(this), zzbzw.zzg);
        return zzg;
    }
}
