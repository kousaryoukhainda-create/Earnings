package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public final class zzcha {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcha(zzcgy zzcgyVar, zzcgz zzcgzVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j;
        versionInfoParcel = zzcgyVar.zza;
        this.zza = versionInfoParcel;
        context = zzcgyVar.zzb;
        this.zzb = context;
        weakReference = zzcgyVar.zzd;
        this.zzd = weakReference;
        j = zzcgyVar.zzc;
        this.zzc = j;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzk zzc() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    public final zzbfe zzd() {
        return new zzbfe(this.zzb);
    }

    public final VersionInfoParcel zze() {
        return this.zza;
    }

    public final String zzf() {
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(this.zzb, this.zza.afmaVersion);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}
