package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzfrq extends zzfsc {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsd zzc() {
        return new zzfrs(this.zza, this.zzb, null);
    }
}
