package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
abstract class zzaex {
    protected final zzadt zza;

    public zzaex(zzadt zzadtVar) {
        this.zza = zzadtVar;
    }

    public abstract boolean zza(zzdy zzdyVar) throws zzbc;

    public abstract boolean zzb(zzdy zzdyVar, long j) throws zzbc;

    public final boolean zzf(zzdy zzdyVar, long j) throws zzbc {
        if (zza(zzdyVar) && zzb(zzdyVar, j)) {
            return true;
        }
        return false;
    }
}
