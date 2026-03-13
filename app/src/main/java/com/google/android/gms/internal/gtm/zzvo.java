package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzvo implements zzxx {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvm
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvo.zzb(i);
        }
    };
    private final int zzf;

    zzvo(int i) {
        this.zzf = i;
    }

    public static zzvo zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return LEGACY_BEST_EFFORT;
            }
            return ALLOW;
        }
        return JSON_FORMAT_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzf;
    }
}
