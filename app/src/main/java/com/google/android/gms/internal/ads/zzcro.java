package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class zzcro {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final InterfaceFutureC2490qH zzc;
    private volatile boolean zzd = true;

    public zzcro(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceFutureC2490qH interfaceFutureC2490qH) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = interfaceFutureC2490qH;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcro zzcroVar, List list, final zzgcd zzgcdVar) {
        if (list != null && !list.isEmpty()) {
            InterfaceFutureC2490qH zzh = zzgch.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final InterfaceFutureC2490qH interfaceFutureC2490qH = (InterfaceFutureC2490qH) it.next();
                zzh = zzgch.zzn(zzgch.zzf(zzh, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrk
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final InterfaceFutureC2490qH zza(Object obj) {
                        zzgcd.this.zza((Throwable) obj);
                        return zzgch.zzh(null);
                    }
                }, zzcroVar.zza), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrl
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final InterfaceFutureC2490qH zza(Object obj) {
                        return zzcro.this.zza(zzgcdVar, interfaceFutureC2490qH, (zzcqz) obj);
                    }
                }, zzcroVar.zza);
            }
            zzgch.zzr(zzh, new zzcrn(zzcroVar, zzgcdVar), zzcroVar.zza);
            return;
        }
        zzcroVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
            @Override // java.lang.Runnable
            public final void run() {
                zzgcd.this.zza(new zzdvy(3));
            }
        });
    }

    public final /* synthetic */ InterfaceFutureC2490qH zza(zzgcd zzgcdVar, InterfaceFutureC2490qH interfaceFutureC2490qH, zzcqz zzcqzVar) throws Exception {
        if (zzcqzVar != null) {
            zzgcdVar.zzb(zzcqzVar);
        }
        return zzgch.zzo(interfaceFutureC2490qH, ((Long) zzbey.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgcd zzgcdVar) {
        zzgch.zzr(this.zzc, new zzcrm(this, zzgcdVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
