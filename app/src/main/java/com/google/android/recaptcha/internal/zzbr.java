package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbr {
    @NotNull
    private final String zza;
    @NotNull
    private final String zzb;
    @NotNull
    private final String zzc;
    @NotNull
    private final String zzd;

    public zzbr(@NotNull String str) {
        this.zza = "https://www.recaptcha.net/recaptcha/api3";
        this.zzb = "https://www.recaptcha.net/recaptcha/api3".concat("/mri");
        this.zzc = "https://www.recaptcha.net/recaptcha/api3".concat("/mlg");
        this.zzd = "https://www.recaptcha.net/recaptcha/api3".concat("/mrr");
    }

    @NotNull
    public final String zza() {
        return this.zza;
    }

    @NotNull
    public final String zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zzc;
    }

    @NotNull
    public final String zzd() {
        return this.zzd;
    }

    public zzbr() {
        this("https://www.recaptcha.net/recaptcha/api3");
    }
}
