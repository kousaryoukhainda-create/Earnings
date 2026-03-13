package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* loaded from: classes3.dex */
final class zzeoi {
    public final InterfaceFutureC2490qH zza;
    private final long zzb;
    private final Clock zzc;

    public zzeoi(InterfaceFutureC2490qH interfaceFutureC2490qH, long j, Clock clock) {
        this.zza = interfaceFutureC2490qH;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        if (this.zzb < this.zzc.elapsedRealtime()) {
            return true;
        }
        return false;
    }
}
