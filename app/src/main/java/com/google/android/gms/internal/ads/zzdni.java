package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final class zzdni implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdrw zzc;
    private final zzebk zzd;
    private final Executor zze;
    private final zzava zzf;
    private final VersionInfoParcel zzg;
    private final zzfja zzh;
    private final zzebv zzi;
    private final zzfcn zzj;

    public zzdni(Context context, Executor executor, zzava zzavaVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcfk zzcfkVar, zzebk zzebkVar, zzfja zzfjaVar, zzdrw zzdrwVar, zzebv zzebvVar, zzfcn zzfcnVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavaVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzebkVar;
        this.zzh = zzfjaVar;
        this.zzc = zzdrwVar;
        this.zzi = zzebvVar;
        this.zzj = zzfcnVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdni zzdniVar) {
        return zzdniVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzava zzb(zzdni zzdniVar) {
        return zzdniVar.zzf;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdni zzdniVar) {
        return zzdniVar.zza;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdni zzdniVar) {
        return zzdniVar.zzg;
    }

    public static /* bridge */ /* synthetic */ zzdrw zze(zzdni zzdniVar) {
        return zzdniVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzebk zzf(zzdni zzdniVar) {
        return zzdniVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzebv zzg(zzdni zzdniVar) {
        return zzdniVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfcn zzh(zzdni zzdniVar) {
        return zzdniVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfja zzi(zzdni zzdniVar) {
        return zzdniVar.zzh;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdni zzdniVar) {
        return zzdniVar.zze;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdnl zzdnlVar = new zzdnl(this);
        zzdnlVar.zzk();
        return zzdnlVar;
    }
}
