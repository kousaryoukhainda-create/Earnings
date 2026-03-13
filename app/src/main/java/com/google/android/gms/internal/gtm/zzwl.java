package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzwl implements zzxx {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzwj
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzwl.zzb(i);
        }
    };
    private final int zzf;

    zzwl(int i) {
        this.zzf = i;
    }

    public static zzwl zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RETENTION_SOURCE;
            }
            return RETENTION_RUNTIME;
        }
        return RETENTION_UNKNOWN;
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
