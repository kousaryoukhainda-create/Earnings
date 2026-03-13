package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
final class zzetn implements zzetq {
    private final Bundle zza;

    public zzetn(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!this.zza.isEmpty()) {
            zzcuvVar.zzb.putBundle("shared_pref", this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!this.zza.isEmpty()) {
            zzcuvVar.zza.putBundle("shared_pref", this.zza);
        }
    }
}
