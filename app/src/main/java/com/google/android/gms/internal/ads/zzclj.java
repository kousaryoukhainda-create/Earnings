package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzclj implements zzcla {
    private final zzecu zza;

    public zzclj(zzecu zzecuVar) {
        this.zza = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            return;
        }
        zzgby zzgbyVar = (zzgby) zzgch.zzf(zzgby.zzu(this.zza.zza(true)), Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcli
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                Throwable th = (Throwable) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkn)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return zzgch.zzh(new TA(zzfxn.zzn()));
            }
        }, zzbzw.zza);
    }
}
