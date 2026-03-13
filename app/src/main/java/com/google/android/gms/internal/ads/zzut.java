package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzut implements zzxv {
    private final zzxv zza;
    private final zzbr zzb;

    public zzut(zzxv zzxvVar, zzbr zzbrVar) {
        this.zza = zzxvVar;
        this.zzb = zzbrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzut)) {
            return false;
        }
        zzut zzutVar = (zzut) obj;
        if (this.zza.equals(zzutVar.zza) && this.zzb.equals(zzutVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + ((this.zzb.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zza(int i) {
        return this.zza.zza(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzc(int i) {
        return this.zza.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzab zze(int i) {
        return this.zzb.zzb(this.zza.zza(i));
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final zzab zzf() {
        return this.zzb.zzb(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzbr zzg() {
        return this.zzb;
    }
}
