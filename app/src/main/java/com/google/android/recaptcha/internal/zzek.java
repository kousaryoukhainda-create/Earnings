package com.google.android.recaptcha.internal;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzek {
    @NotNull
    private final String zza;
    @NotNull
    private String zzb;
    @NotNull
    private String zzc;
    @NotNull
    private final Context zzd;
    @NotNull
    private final zzeo zze;
    private String zzf;
    private Integer zzg;
    @NotNull
    private final int zzh;

    private zzek(String str, String str2, String str3, int i, Context context, zzeo zzeoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzh = i;
        this.zzd = context;
        this.zze = zzeoVar;
    }

    @NotNull
    public final zzek zza() {
        return new zzek(this);
    }

    @NotNull
    public final zzek zzb(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    @NotNull
    public final zzek zzc(@NotNull String str) {
        this.zzf = str;
        return this;
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    public final void zze(@NotNull zztx zztxVar) {
        this.zze.zza(zztxVar);
    }

    @NotNull
    public final zzen zzf(@NotNull int i) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzcc zzccVar = new zzcc();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzen(i, this.zza, this.zzh, str, str2, str3, null, this.zze, zzccVar, context, num);
    }

    public /* synthetic */ zzek(String str, String str2, String str3, int i, Context context, zzeo zzeoVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, context, zzeoVar);
    }

    private zzek(zzek zzekVar) {
        this(zzekVar.zza, zzekVar.zzb, zzekVar.zzc, zzekVar.zzh, zzekVar.zzd, zzekVar.zze);
        this.zzf = zzekVar.zzf;
        this.zzg = zzekVar.zzg;
    }
}
