package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzadk {
    public final zzadn zza;
    public final zzadn zzb;

    public zzadk(zzadn zzadnVar, zzadn zzadnVar2) {
        this.zza = zzadnVar;
        this.zzb = zzadnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (this.zza.equals(zzadkVar.zza) && this.zzb.equals(zzadkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String concat;
        zzadn zzadnVar = this.zza;
        zzadn zzadnVar2 = this.zzb;
        String zzadnVar3 = zzadnVar.toString();
        if (zzadnVar.equals(zzadnVar2)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return AbstractC2437ph.i("[", zzadnVar3, concat, "]");
    }
}
