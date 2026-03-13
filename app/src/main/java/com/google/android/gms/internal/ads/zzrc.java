package com.google.android.gms.internal.ads;

import com.huawei.hms.support.api.entity.auth.AuthCode;
/* loaded from: classes3.dex */
final class zzrc implements zzrf {
    @Override // com.google.android.gms.internal.ads.zzrf
    public final int zza(zzab zzabVar) {
        return zzabVar.zzs != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final /* synthetic */ zzre zzb(zzra zzraVar, zzab zzabVar) {
        return zzre.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final zzrg zzc(zzra zzraVar, zzab zzabVar) {
        if (zzabVar.zzs == null) {
            return null;
        }
        return new zzrg(new zzqy(new zzri(1), AuthCode.StatusCode.WAITING_CONNECT));
    }
}
