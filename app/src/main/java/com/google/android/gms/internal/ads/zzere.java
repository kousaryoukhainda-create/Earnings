package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzere implements zzetq {
    private final Boolean zza;

    public zzere(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Boolean bool = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (bool != null) {
            zzcuvVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
