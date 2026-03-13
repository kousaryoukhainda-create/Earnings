package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzgd {
    public zzbn zza;
    @NotNull
    private final zzgf zzb;
    private int zzd;
    @NotNull
    private final zzge zze;
    @NotNull
    private final zzfw zzg;
    @NotNull
    private final zzcg zzh;
    @NotNull
    private String zzc = "recaptcha.m.Main.rge";
    @NotNull
    private final zzbn zzf = new zzbn();

    public zzgd(@NotNull zzgf zzgfVar) {
        this.zzb = zzgfVar;
        this.zze = zzgfVar.zza();
        this.zzg = zzgfVar.zzd();
        this.zzh = zzgfVar.zzc();
    }

    public final int zza() {
        return this.zzd;
    }

    @NotNull
    public final zzbn zzb() {
        return this.zzf;
    }

    @NotNull
    public final zzge zzc() {
        return this.zze;
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    public final void zze() {
        this.zzb.zzb();
    }

    public final void zzf(@NotNull String str) {
        this.zzc = str;
    }

    public final void zzg(int i) {
        this.zzd = i;
    }

    @NotNull
    public final zzcg zzh() {
        return this.zzh;
    }

    @NotNull
    public final zzfw zzi() {
        return this.zzg;
    }
}
