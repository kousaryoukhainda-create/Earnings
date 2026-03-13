package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzzc {
    private static final zzzb zza;
    private static final zzzb zzb;

    static {
        zzzb zzzbVar = null;
        try {
            zzzbVar = (zzzb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzzbVar;
        zzb = new zzzb();
    }

    public static zzzb zza() {
        return zza;
    }

    public static zzzb zzb() {
        return zzb;
    }
}
