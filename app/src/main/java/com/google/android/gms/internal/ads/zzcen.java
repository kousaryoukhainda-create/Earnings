package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class zzcen {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzcen(String str) {
    }

    public final void zza() {
        this.zza.set(false);
    }

    public final void zzb() {
        this.zza.set(true);
    }

    public final void zzc() {
        this.zza.set(false);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
