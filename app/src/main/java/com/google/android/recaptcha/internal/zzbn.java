package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbn {
    private final long zza = System.currentTimeMillis();
    @NotNull
    private final zzjh zzb = zzjh.zzb();

    public final long zza(@NotNull TimeUnit timeUnit) {
        return this.zzb.zza(timeUnit);
    }

    public final long zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zzb.zzf();
    }
}
