package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzwd implements zzxx {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzwb
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzwd.zzb(i);
        }
    };
    private final int zzf;

    zzwd(int i) {
        this.zzf = i;
    }

    public static zzwd zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }
            return CORD;
        }
        return STRING;
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
