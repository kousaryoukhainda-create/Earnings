package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class zzesi implements zzetq {
    private final Bundle zza;

    public zzesi(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (bundle != null) {
            zzcuvVar.zzb.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (bundle != null) {
            zzcuvVar.zza.putAll(bundle);
        }
    }
}
