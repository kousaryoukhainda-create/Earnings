package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes3.dex */
public final class zzcvc {
    private final Context zza;
    private final zzfcj zzb;
    private final Bundle zzc;
    private final zzfcb zzd;
    private final zzcut zze;
    private final zzedb zzf;
    private final int zzg;

    public /* synthetic */ zzcvc(zzcva zzcvaVar, zzcvb zzcvbVar) {
        this.zza = zzcva.zzb(zzcvaVar);
        this.zzb = zzcva.zzo(zzcvaVar);
        this.zzc = zzcva.zzc(zzcvaVar);
        this.zzd = zzcva.zzn(zzcvaVar);
        this.zze = zzcva.zzd(zzcvaVar);
        this.zzf = zzcva.zzm(zzcvaVar);
        this.zzg = zzcva.zza(zzcvaVar);
    }

    public final int zza() {
        return this.zzg;
    }

    public final Context zzb(Context context) {
        return this.zza;
    }

    public final Bundle zzc() {
        return this.zzc;
    }

    public final zzcut zzd() {
        return this.zze;
    }

    public final zzcva zze() {
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zzf(this.zza);
        zzcvaVar.zzk(this.zzb);
        zzcvaVar.zzg(this.zzc);
        zzcvaVar.zzh(this.zze);
        zzcvaVar.zze(this.zzf);
        return zzcvaVar;
    }

    public final zzedb zzf(String str) {
        zzedb zzedbVar = this.zzf;
        if (zzedbVar != null) {
            return zzedbVar;
        }
        return new zzedb(str);
    }

    public final zzfcb zzg() {
        return this.zzd;
    }

    public final zzfcj zzh() {
        return this.zzb;
    }
}
