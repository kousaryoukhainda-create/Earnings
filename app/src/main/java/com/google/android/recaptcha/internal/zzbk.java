package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    @NotNull
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzbj();
        }
        zzbj zzbjVar = (zzbj) obj;
        zzbjVar.zzg(zzbjVar.zzb() + 1);
        zzbjVar.zzf(zzbjVar.zzd() + j);
        zzbjVar.zze(Math.max(j, zzbjVar.zzc()));
        concurrentHashMap.put(valueOf, zzbjVar);
    }
}
