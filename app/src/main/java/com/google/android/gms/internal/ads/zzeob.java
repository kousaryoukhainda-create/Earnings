package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class zzeob implements zzetq {
    private final double zza;
    private final boolean zzb;

    public zzeob(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        Bundle zza = zzfcx.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfcx.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
