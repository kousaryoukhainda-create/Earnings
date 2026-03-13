package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzaup implements zzfol {
    final /* synthetic */ zzfni zza;

    public zzaup(zzfni zzfniVar) {
        this.zza = zzfniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
