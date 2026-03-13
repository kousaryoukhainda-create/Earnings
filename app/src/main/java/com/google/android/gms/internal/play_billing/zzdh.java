package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
/* loaded from: classes3.dex */
public final class zzdh extends zzdi implements Serializable {
    public static final /* synthetic */ int zzc = 0;
    private static final zzdh zzd;
    final zzce zza;
    final zzce zzb;

    static {
        zzcd zzcdVar;
        zzcb zzcbVar;
        zzcdVar = zzcd.zzb;
        zzcbVar = zzcb.zzb;
        zzd = new zzdh(zzcdVar, zzcbVar);
    }

    private zzdh(zzce zzceVar, zzce zzceVar2) {
        zzcb zzcbVar;
        zzcd zzcdVar;
        this.zza = zzceVar;
        this.zzb = zzceVar2;
        if (zzceVar.compareTo(zzceVar2) <= 0) {
            zzcbVar = zzcb.zzb;
            if (zzceVar != zzcbVar) {
                zzcdVar = zzcd.zzb;
                if (zzceVar2 != zzcdVar) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Invalid range: ".concat(zze(zzceVar, zzceVar2)));
    }

    public static zzdh zza() {
        return zzd;
    }

    private static String zze(zzce zzceVar, zzce zzceVar2) {
        StringBuilder sb = new StringBuilder(16);
        zzceVar.zzc(sb);
        sb.append("..");
        zzceVar2.zzd(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.zza.equals(zzdhVar.zza) && this.zzb.equals(zzdhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zze(this.zza, this.zzb);
    }

    public final zzdh zzb(zzdh zzdhVar) {
        zzce zzceVar;
        zzce zzceVar2;
        boolean z;
        int compareTo = this.zza.compareTo(zzdhVar.zza);
        int compareTo2 = this.zzb.compareTo(zzdhVar.zzb);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return zzdhVar;
        }
        if (compareTo >= 0) {
            zzceVar = this.zza;
        } else {
            zzceVar = zzdhVar.zza;
        }
        if (compareTo2 <= 0) {
            zzceVar2 = this.zzb;
        } else {
            zzceVar2 = zzdhVar.zzb;
        }
        if (zzceVar.compareTo(zzceVar2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        zzbe.zzd(z, "intersection is undefined for disconnected ranges %s and %s", this, zzdhVar);
        return new zzdh(zzceVar, zzceVar2);
    }

    public final zzdh zzc(zzdh zzdhVar) {
        zzce zzceVar;
        int compareTo = this.zza.compareTo(zzdhVar.zza);
        int compareTo2 = this.zzb.compareTo(zzdhVar.zzb);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo >= 0 && compareTo2 <= 0) {
            return zzdhVar;
        }
        if (compareTo <= 0) {
            zzceVar = this.zza;
        } else {
            zzceVar = zzdhVar.zza;
        }
        if (compareTo2 >= 0) {
            zzdhVar = this;
        }
        return new zzdh(zzceVar, zzdhVar.zzb);
    }

    public final boolean zzd() {
        return this.zza.equals(this.zzb);
    }
}
