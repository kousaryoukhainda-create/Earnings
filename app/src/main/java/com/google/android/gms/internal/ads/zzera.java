package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzera implements zzetq {
    private final boolean zza;

    public zzera(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuv) obj).zzb.putBoolean("is_gbid", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuv) obj).zza.putBoolean("is_gbid", this.zza);
    }
}
