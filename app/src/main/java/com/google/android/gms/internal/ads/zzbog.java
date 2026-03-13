package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* loaded from: classes3.dex */
public final class zzbog {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzboe();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbof();
    private final zzbns zzc;

    public zzbog(Context context, VersionInfoParcel versionInfoParcel, String str, zzfhk zzfhkVar) {
        this.zzc = new zzbns(context, versionInfoParcel, str, zza, zzb, zzfhkVar);
    }

    public final zzbnw zza(String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        return new zzbok(this.zzc, str, zzbnzVar, zzbnyVar);
    }

    public final zzbop zzb() {
        return new zzbop(this.zzc);
    }
}
