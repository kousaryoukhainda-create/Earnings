package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzfhf implements zzgcd {
    final /* synthetic */ zzfhh zza;
    final /* synthetic */ zzfgw zzb;

    public zzfhf(zzfhh zzfhhVar, zzfgw zzfgwVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfgw zzfgwVar = this.zzb;
        zzfgwVar.zzh(th);
        zzfgwVar.zzg(false);
        this.zza.zza(zzfgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object obj) {
    }
}
