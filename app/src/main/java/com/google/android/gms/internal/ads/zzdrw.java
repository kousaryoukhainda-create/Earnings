package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final class zzdrw {
    private final zzdsb zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdrw(zzdsb zzdsbVar, Executor executor) {
        this.zza = zzdsbVar;
        this.zzc = zzdsbVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdsb zzb(zzdrw zzdrwVar) {
        return zzdrwVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzdrw zzdrwVar) {
        return zzdrwVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdrw zzdrwVar) {
        return zzdrwVar.zzb;
    }

    public final zzdrv zza() {
        zzdrv zzdrvVar = new zzdrv(this);
        zzdrv.zza(zzdrvVar);
        return zzdrvVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlw)).booleanValue()) {
            return;
        }
        zzdrv zza = zza();
        zza.zzb("action", "pecr");
        zza.zzg();
    }
}
