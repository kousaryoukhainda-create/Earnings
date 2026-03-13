package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
final class zze extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ADVERTISER_ID.toString();
    private final zzd zzb;

    public zze(zzd zzdVar) {
        super(zza, new String[0]);
        this.zzb = zzdVar;
        zzdVar.zzc();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzc = this.zzb.zzc();
        if (zzc == null) {
            return zzfu.zza();
        }
        return zzfu.zzb(zzc);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
