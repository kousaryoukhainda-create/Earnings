package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzvi implements zzxx {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvg
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvi.zzb(i);
        }
    };
    private final int zzf;

    zzvi(int i) {
        this.zzf = i;
    }

    public static zzvi zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CLOSED;
            }
            return OPEN;
        }
        return ENUM_TYPE_UNKNOWN;
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
