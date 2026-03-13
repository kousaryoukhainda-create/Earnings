package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzfw extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.UPPERCASE_STRING.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();

    public zzfw() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        return zzfu.zzb(zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzb))).toUpperCase());
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
