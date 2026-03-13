package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzaiu {
    public final zzajb zza;
    public final zzaje zzb;
    public final zzadt zzc;
    public final zzadu zzd;
    public int zze;

    public zzaiu(zzajb zzajbVar, zzaje zzajeVar, zzadt zzadtVar) {
        zzadu zzaduVar;
        this.zza = zzajbVar;
        this.zzb = zzajeVar;
        this.zzc = zzadtVar;
        if ("audio/true-hd".equals(zzajbVar.zzg.zzo)) {
            zzaduVar = new zzadu();
        } else {
            zzaduVar = null;
        }
        this.zzd = zzaduVar;
    }
}
