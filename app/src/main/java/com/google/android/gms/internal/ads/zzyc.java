package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzyc {
    public final int zza;
    public final zzln[] zzb;
    public final zzxv[] zzc;
    public final zzby zzd;
    public final Object zze;

    public zzyc(zzln[] zzlnVarArr, zzxv[] zzxvVarArr, zzby zzbyVar, Object obj) {
        boolean z;
        int length = zzlnVarArr.length;
        if (length == zzxvVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        this.zzb = zzlnVarArr;
        this.zzc = (zzxv[]) zzxvVarArr.clone();
        this.zzd = zzbyVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzyc zzycVar, int i) {
        if (zzycVar == null || !Objects.equals(this.zzb[i], zzycVar.zzb[i]) || !Objects.equals(this.zzc[i], zzycVar.zzc[i])) {
            return false;
        }
        return true;
    }

    public final boolean zzb(int i) {
        if (this.zzb[i] != null) {
            return true;
        }
        return false;
    }
}
