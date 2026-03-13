package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzxo implements zzze {
    private static final zzxo zza = new zzxo();

    private zzxo() {
    }

    public static zzxo zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzze
    public final zzzd zzb(Class cls) {
        if (zzxv.class.isAssignableFrom(cls)) {
            try {
                return (zzzd) zzxv.zzac(cls.asSubclass(zzxv.class)).zzb(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.gtm.zzze
    public final boolean zzc(Class cls) {
        return zzxv.class.isAssignableFrom(cls);
    }
}
