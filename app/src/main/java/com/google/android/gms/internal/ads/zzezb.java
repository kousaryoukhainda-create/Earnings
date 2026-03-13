package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
final class zzezb {
    private final zzfdw zza;
    private final zzcuz zzb;
    private final Executor zzc;
    private zzeyz zzd;

    public zzezb(zzfdw zzfdwVar, zzcuz zzcuzVar, Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfeg zze() {
        zzfcj zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final InterfaceFutureC2490qH zzc() {
        InterfaceFutureC2490qH interfaceFutureC2490qH;
        zzeyz zzeyzVar = this.zzd;
        if (zzeyzVar == null) {
            if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
                zzeyz zzeyzVar2 = new zzeyz(null, zze(), null);
                this.zzd = zzeyzVar2;
                interfaceFutureC2490qH = zzgch.zzh(zzeyzVar2);
            } else {
                interfaceFutureC2490qH = (zzgby) zzgch.zze((zzgby) zzgch.zzm(zzgby.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyy(this), this.zzc), zzdyh.class, new zzeyx(this), this.zzc);
            }
            return zzgch.zzm(interfaceFutureC2490qH, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeyw
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final Object apply(Object obj) {
                    return (zzeyz) obj;
                }
            }, this.zzc);
        }
        return zzgch.zzh(zzeyzVar);
    }
}
