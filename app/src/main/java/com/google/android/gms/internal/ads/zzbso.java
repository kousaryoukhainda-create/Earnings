package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzbso extends zzbgz {
    final /* synthetic */ zzbsr zza;

    public /* synthetic */ zzbso(zzbsr zzbsrVar, zzbsq zzbsqVar) {
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbsr zzbsrVar = this.zza;
        if (zzbsr.zzc(zzbsrVar) == null) {
            return;
        }
        zzbsr.zzc(zzbsrVar).onCustomClick(zzbsr.zze(zzbsrVar, zzbgqVar), str);
    }
}
