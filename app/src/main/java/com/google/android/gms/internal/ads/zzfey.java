package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzfey {
    private final zzfer zza;
    private final InterfaceFutureC2490qH zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfey(final zzfdw zzfdwVar, final zzfeq zzfeqVar, final zzfer zzferVar) {
        this.zza = zzferVar;
        this.zzb = zzgch.zzf(zzgch.zzn(zzfeqVar.zza(zzferVar), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzfew
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                return zzfey.this.zzb(zzfeqVar, zzfdwVar, zzferVar, (zzfef) obj);
            }
        }, zzferVar.zzb()), Exception.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzfex
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                return zzfey.this.zzc(zzfeqVar, (Exception) obj);
            }
        }, zzferVar.zzb());
    }

    public final synchronized InterfaceFutureC2490qH zza(zzfer zzferVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzferVar.zza() != null && this.zza.zza().equals(zzferVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final /* synthetic */ InterfaceFutureC2490qH zzb(zzfeq zzfeqVar, zzfdw zzfdwVar, zzfer zzferVar, zzfef zzfefVar) throws Exception {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfeqVar.zzb(zzfefVar);
                if (!this.zzc) {
                    zzfdwVar.zzd(zzferVar.zza(), zzfefVar);
                    return zzgch.zzh(null);
                }
                return zzgch.zzh(new zzfep(zzfefVar, zzferVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ InterfaceFutureC2490qH zzc(zzfeq zzfeqVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgcd zzgcdVar) {
        zzgch.zzr(zzgch.zzn(this.zzb, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzfev
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                zzfep zzfepVar = (zzfep) obj;
                return zzgch.zzi();
            }
        }, this.zza.zzb()), zzgcdVar, this.zza.zzb());
    }
}
