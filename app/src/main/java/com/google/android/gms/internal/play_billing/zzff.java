package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
final class zzff extends zzee {
    private zzeu zzc;
    private ScheduledFuture zzd;

    private zzff(zzeu zzeuVar) {
        this.zzc = zzeuVar;
    }

    public static zzeu zzs(zzeu zzeuVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzff zzffVar = new zzff(zzeuVar);
        zzfc zzfcVar = new zzfc(zzffVar);
        zzffVar.zzd = scheduledExecutorService.schedule(zzfcVar, 28500L, timeUnit);
        zzeuVar.zzb(zzfcVar, zzed.INSTANCE);
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final String zzg() {
        zzeu zzeuVar = this.zzc;
        ScheduledFuture scheduledFuture = this.zzd;
        if (zzeuVar != null) {
            String h = AbstractC2437ph.h("inputFuture=[", zzeuVar.toString(), "]");
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

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzm() {
        boolean z;
        zzeu zzeuVar = this.zzc;
        if (zzeuVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            zzeuVar.cancel(zzq());
        }
        ScheduledFuture scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc = null;
        this.zzd = null;
    }
}
