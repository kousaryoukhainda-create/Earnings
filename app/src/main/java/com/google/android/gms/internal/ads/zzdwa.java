package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes3.dex */
public final class zzdwa implements zzcyq, zzdee {
    private final Context zza;
    private final zzdrw zzb;

    public zzdwa(Context context, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdrwVar;
    }

    private final void zzd(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwa.this.zzc(context);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzv.zzf().zzb(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(String str) {
    }
}
