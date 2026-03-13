package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes3.dex */
public final class zzdeh extends zzdbj {
    public zzdeh(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdef
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzdee) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk.this);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdeg
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzdee) obj).zzf(str);
            }
        });
    }
}
