package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzug {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzug(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzug)) {
            return false;
        }
        zzug zzugVar = (zzug) obj;
        if (this.zza.equals(zzugVar.zza) && this.zzb == zzugVar.zzb && this.zzc == zzugVar.zzc && this.zzd == zzugVar.zzd && this.zze == zzugVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzug zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zzug(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzug(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public zzug(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzug(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
