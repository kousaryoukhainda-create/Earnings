package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzeqw implements zzetq {
    private final Integer zza;

    public zzeqw(Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (num != null) {
            zzcuvVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
