package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public abstract class zzfgf {
    private static final InterfaceFutureC2490qH zza = zzgch.zzh(null);
    private final zzgcs zzb;
    private final ScheduledExecutorService zzc;
    private final zzfgg zzd;

    public zzfgf(zzgcs zzgcsVar, ScheduledExecutorService scheduledExecutorService, zzfgg zzfggVar) {
        this.zzb = zzgcsVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfggVar;
    }

    public final zzffv zza(Object obj, InterfaceFutureC2490qH... interfaceFutureC2490qHArr) {
        return new zzffv(this, obj, Arrays.asList(interfaceFutureC2490qHArr), null);
    }

    public final zzfgd zzb(Object obj, InterfaceFutureC2490qH interfaceFutureC2490qH) {
        return new zzfgd(this, obj, interfaceFutureC2490qH, Collections.singletonList(interfaceFutureC2490qH), interfaceFutureC2490qH);
    }

    public abstract String zzf(Object obj);
}
