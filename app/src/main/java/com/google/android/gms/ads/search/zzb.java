package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.mediation.NetworkExtras;
/* loaded from: classes3.dex */
public final class zzb {
    private final zzeh zza = new zzeh();
    private String zzb;

    public static /* bridge */ /* synthetic */ zzeh zza(zzb zzbVar) {
        return zzbVar.zza;
    }

    public static /* bridge */ /* synthetic */ String zzf(zzb zzbVar) {
        return zzbVar.zzb;
    }

    public final zzb zzb(Class cls, Bundle bundle) {
        this.zza.zzo(cls, bundle);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras) {
        this.zza.zzs(networkExtras);
        return this;
    }

    public final zzb zzd(Class cls, Bundle bundle) {
        this.zza.zzr(cls, bundle);
        return this;
    }

    public final zzb zze(String str) {
        this.zzb = str;
        return this;
    }
}
