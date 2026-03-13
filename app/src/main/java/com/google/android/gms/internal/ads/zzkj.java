package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes3.dex */
public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzkj(zzkh zzkhVar, zzki zzkiVar) {
        this.zza = zzkh.zzc(zzkhVar);
        this.zzb = zzkh.zza(zzkhVar);
        this.zzc = zzkh.zzb(zzkhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkjVar = (zzkj) obj;
        if (this.zza == zzkjVar.zza && this.zzb == zzkjVar.zzb && this.zzc == zzkjVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkh zza() {
        return new zzkh(this, null);
    }
}
