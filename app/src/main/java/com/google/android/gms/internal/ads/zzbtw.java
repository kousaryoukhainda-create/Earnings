package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;
/* loaded from: classes3.dex */
final class zzbtw extends zzbts {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbtw(zzbub zzbubVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
