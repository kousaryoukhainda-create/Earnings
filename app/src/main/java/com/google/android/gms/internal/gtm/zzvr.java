package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzvr implements zzxx {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvp
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvr.zzb(i);
        }
    };
    private final int zzf;

    zzvr(int i) {
        this.zzf = i;
    }

    public static zzvr zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DELIMITED;
            }
            return LENGTH_PREFIXED;
        }
        return MESSAGE_ENCODING_UNKNOWN;
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
