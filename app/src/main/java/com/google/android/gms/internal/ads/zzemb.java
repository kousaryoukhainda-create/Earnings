package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes3.dex */
public final class zzemb implements zzetr {
    private final InterfaceFutureC2490qH zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzemb(InterfaceFutureC2490qH interfaceFutureC2490qH, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = interfaceFutureC2490qH;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        InterfaceFutureC2490qH zzn = zzgch.zzn(this.zza, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                return zzgch.zzh(new zzemc((String) obj));
            }
        }, this.zzb);
        zzbcc zzbccVar = zzbcl.zzmp;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue() > 0) {
            zzn = zzgch.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgch.zzf(zzn, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgch.zzh(new zzemc(Integer.toString(17)));
                }
                return zzgch.zzh(new zzemc(null));
            }
        }, this.zzb);
    }
}
