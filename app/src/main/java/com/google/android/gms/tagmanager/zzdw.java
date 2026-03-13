package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzdw extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.PLATFORM.toString();
    private static final com.google.android.gms.internal.gtm.zzam zzb = zzfu.zzb("Android");

    public zzdw() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        return zzb;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
