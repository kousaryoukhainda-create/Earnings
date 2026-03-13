package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
final class zzgcw extends zzgcb implements zzgcr {
    private final ScheduledFuture zza;

    public zzgcw(InterfaceFutureC2490qH interfaceFutureC2490qH, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC2490qH);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgca, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = zzb().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
