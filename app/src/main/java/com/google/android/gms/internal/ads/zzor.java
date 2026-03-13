package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzor {
    public static final zzor zza = new zzop().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzor(zzop zzopVar, zzoq zzoqVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzopVar.zza;
        this.zzb = z;
        z2 = zzopVar.zzb;
        this.zzc = z2;
        z3 = zzopVar.zzc;
        this.zzd = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzor.class == obj.getClass()) {
            zzor zzorVar = (zzor) obj;
            if (this.zzb == zzorVar.zzb && this.zzc == zzorVar.zzc && this.zzd == zzorVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return (z2 ? 1 : 0) + (z2 ? 1 : 0) + ((z ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
