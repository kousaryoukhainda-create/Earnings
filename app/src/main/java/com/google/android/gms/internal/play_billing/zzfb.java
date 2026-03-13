package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public final class zzfb {
    public static zzev zza(ExecutorService executorService) {
        zzev zzexVar;
        if (executorService instanceof zzev) {
            return (zzev) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzexVar = new zzfa((ScheduledExecutorService) executorService);
        } else {
            zzexVar = new zzex(executorService);
        }
        return zzexVar;
    }

    public static zzew zzb(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof zzew) {
            return (zzew) scheduledExecutorService;
        }
        return new zzfa(scheduledExecutorService);
    }
}
