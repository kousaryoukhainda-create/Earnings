package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* loaded from: classes3.dex */
public final class zzegz {
    private zzegq zza;

    public zzegz() {
    }

    public static zzegz zzb(zzegq zzegqVar) {
        return new zzegz(zzegqVar);
    }

    public final zzegq zza(Clock clock, zzegs zzegsVar, zzedb zzedbVar, zzfja zzfjaVar) {
        zzegq zzegqVar = this.zza;
        if (zzegqVar != null) {
            return zzegqVar;
        }
        return new zzegq(clock, zzegsVar, zzedbVar, zzfjaVar);
    }

    private zzegz(zzegq zzegqVar) {
        this.zza = zzegqVar;
    }
}
