package com.google.android.recaptcha.internal;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzgf {
    @NotNull
    private final zzge zza;
    @NotNull
    private final HashMap zzb;
    @NotNull
    private final zzfw zzc;
    @NotNull
    private final zzcg zzd;

    public zzgf(@NotNull zzfw zzfwVar, @NotNull zzcg zzcgVar, @NotNull zzbo zzboVar) {
        this.zzc = zzfwVar;
        this.zzd = zzcgVar;
        zzge zzgeVar = new zzge();
        this.zza = zzgeVar;
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        zzgeVar.zzd(173, hashMap);
    }

    @NotNull
    public final zzge zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(173, this.zzb);
    }

    @NotNull
    public final zzcg zzc() {
        return this.zzd;
    }

    @NotNull
    public final zzfw zzd() {
        return this.zzc;
    }

    public final void zze(@NotNull int i, @NotNull Object obj) {
        this.zzb.put(Integer.valueOf(i - 2), obj);
    }
}
