package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* loaded from: classes3.dex */
public final class zzbv {
    public static final String zza;
    public static final String zzb;

    static {
        String replaceAll = String.valueOf(GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = replaceAll;
        zzb = "ma".concat(String.valueOf(replaceAll));
    }
}
