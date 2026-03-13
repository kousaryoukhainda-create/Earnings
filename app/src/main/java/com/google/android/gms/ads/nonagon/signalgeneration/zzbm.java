package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdee;
/* loaded from: classes3.dex */
public final class zzbm implements zzdee {
    private final zzb zza;
    private final int zzb;
    private final String zzc;

    public zzbm(zzb zzbVar, int i, String str) {
        this.zza = zzbVar;
        this.zzb = i;
        this.zzc = str;
    }

    public final /* synthetic */ void zza(zzbk zzbkVar) {
        this.zza.zzd(this.zzc, zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(final zzbk zzbkVar) {
        if (zzbkVar != null && this.zzb == 2 && !TextUtils.isEmpty(this.zzc)) {
            com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
                @Override // java.lang.Runnable
                public final void run() {
                    zzbm.this.zza(zzbkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(String str) {
    }
}
