package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbao implements zzazd {
    final /* synthetic */ zzbar zza;

    public zzbao(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbar.zzh(this.zza);
        }
    }
}
