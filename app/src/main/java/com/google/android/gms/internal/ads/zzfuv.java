package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzfuv extends zzfva {
    final /* synthetic */ zzftz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuv(zzfuw zzfuwVar, zzfvc zzfvcVar, CharSequence charSequence, zzftz zzftzVar) {
        super(zzfvcVar, charSequence);
        this.zza = zzftzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int i) {
        return ((zzfud) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int i) {
        if (((zzfud) this.zza).zza.find(i)) {
            return ((zzfud) this.zza).zza.start();
        }
        return -1;
    }
}
