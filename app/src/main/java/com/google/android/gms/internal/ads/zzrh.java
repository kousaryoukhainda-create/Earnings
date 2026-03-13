package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzrh {
    public static final boolean zza;

    static {
        boolean z = false;
        if ("Amazon".equals(zzei.zzc)) {
            String str = zzei.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        zza = z;
    }
}
