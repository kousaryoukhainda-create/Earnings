package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzr implements zzxx {
    NO_CACHE(1),
    PRIVATE(2),
    PUBLIC(3);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzp
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzr.zzb(i);
        }
    };
    private final int zzf;

    zzr(int i) {
        this.zzf = i;
    }

    public static zzr zzb(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return PUBLIC;
            }
            return PRIVATE;
        }
        return NO_CACHE;
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
