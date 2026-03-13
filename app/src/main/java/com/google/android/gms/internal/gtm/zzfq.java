package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfq {
    private final Clock zza;
    private long zzb;

    public zzfq(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long j) {
        if (this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb > j) {
            return true;
        }
        return false;
    }

    public zzfq(Clock clock, long j) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
        this.zzb = j;
    }
}
