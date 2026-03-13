package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class zzesy implements zzetq {
    private final String zza;
    private final Bundle zzb;

    public zzesy(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        zzcuvVar.zza.putString("rtb", this.zza);
        if (!this.zzb.isEmpty()) {
            zzcuvVar.zza.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}
