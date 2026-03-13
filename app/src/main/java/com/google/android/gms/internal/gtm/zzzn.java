package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzzn {
    private static final zzzm zza;
    private static final zzzm zzb;

    static {
        zzzm zzzmVar = null;
        try {
            zzzmVar = (zzzm) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzzmVar;
        zzb = new zzzm();
    }

    public static zzzm zza() {
        return zza;
    }

    public static zzzm zzb() {
        return zzb;
    }
}
