package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    @NotNull
    private final zztd zzb;
    @NotNull
    private final int zzc;
    @NotNull
    private final int zzd;

    public zzce(@NotNull int i, @NotNull int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zztd zzf = zzte.zzf();
        zzf.zzq(i2);
        zzf.zzr(i);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zztd zza() {
        return this.zzb;
    }

    @NotNull
    public final int zzb() {
        return this.zzd;
    }
}
