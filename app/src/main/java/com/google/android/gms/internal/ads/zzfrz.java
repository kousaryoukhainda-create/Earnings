package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzfrz extends zzftc {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzftc
    public final zzftc zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftc
    public final zzftc zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftc
    public final zzftd zzc() {
        return new zzfsb(this.zza, this.zzb, null);
    }
}
