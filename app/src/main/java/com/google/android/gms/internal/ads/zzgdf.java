package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgdf extends zzgbx {
    private InterfaceFutureC2490qH zza;
    private ScheduledFuture zzb;

    private zzgdf(InterfaceFutureC2490qH interfaceFutureC2490qH) {
        interfaceFutureC2490qH.getClass();
        this.zza = interfaceFutureC2490qH;
    }

    public static InterfaceFutureC2490qH zzf(InterfaceFutureC2490qH interfaceFutureC2490qH, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdf zzgdfVar = new zzgdf(interfaceFutureC2490qH);
        zzgdc zzgdcVar = new zzgdc(zzgdfVar);
        zzgdfVar.zzb = scheduledExecutorService.schedule(zzgdcVar, j, timeUnit);
        interfaceFutureC2490qH.addListener(zzgdcVar, zzgbv.INSTANCE);
        return zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        InterfaceFutureC2490qH interfaceFutureC2490qH = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (interfaceFutureC2490qH != null) {
            String h = AbstractC2437ph.h("inputFuture=[", interfaceFutureC2490qH.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return h + ", remaining delay=[" + delay + " ms]";
                }
                return h;
            }
            return h;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
