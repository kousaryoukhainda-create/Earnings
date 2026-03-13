package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzxi {
    private static final zzxg zza = new zzxh();
    private static final zzxg zzb;

    static {
        zzxg zzxgVar = null;
        try {
            zzxgVar = (zzxg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzxgVar;
    }

    public static zzxg zza() {
        zzxg zzxgVar = zzb;
        if (zzxgVar != null) {
            return zzxgVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzxg zzb() {
        return zza;
    }
}
