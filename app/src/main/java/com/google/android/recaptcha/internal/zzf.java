package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzf {
    @NotNull
    public static final zzbd zza(@NotNull Exception exc, @NotNull zzbd zzbdVar) {
        if (exc instanceof H60) {
            return new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage());
        }
        if (exc instanceof zzbd) {
            return (zzbd) exc;
        }
        return zzbdVar;
    }
}
