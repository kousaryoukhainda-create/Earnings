package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;
/* loaded from: classes3.dex */
final class zzbtx extends zzbts {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbtx(zzbub zzbubVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
