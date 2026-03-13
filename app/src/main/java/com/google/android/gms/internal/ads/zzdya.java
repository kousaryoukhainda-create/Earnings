package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes3.dex */
final class zzdya implements zzcyq {
    private final Context zza;
    private final zzbyi zzb;

    public zzdya(Context context, zzbyi zzbyiVar) {
        this.zza = context;
        this.zzb = zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zze)) {
            this.zzb.zzm(this.zza, zzfcaVar.zza.zza.zzd);
            this.zzb.zzi(this.zza, zzfcaVar.zzb.zzb.zze);
        }
    }
}
