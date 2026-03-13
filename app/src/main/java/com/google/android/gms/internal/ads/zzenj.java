package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class zzenj implements zzetq {
    final String zza;
    final int zzb;

    public zzenj(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle zza = zzfcx.zza(bundle, "pii");
            bundle.putBundle("pii", zza);
            zza.putString("pvid", this.zza);
            zza.putInt("pvid_s", this.zzb);
        }
    }
}
