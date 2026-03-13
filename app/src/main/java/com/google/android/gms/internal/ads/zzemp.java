package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class zzemp {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemo zzb;

    public final zzemo zza() {
        return this.zzb;
    }

    public final void zzb(zzemo zzemoVar) {
        this.zzb = zzemoVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
