package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzcsy implements com.google.android.gms.ads.internal.client.zza {
    private final zzctc zza;
    private final zzfcj zzb;

    public zzcsy(zzctc zzctcVar, zzfcj zzfcjVar) {
        this.zza = zzctcVar;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
