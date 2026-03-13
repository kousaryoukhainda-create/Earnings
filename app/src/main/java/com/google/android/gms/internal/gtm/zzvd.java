package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzvd implements zzxx {
    DECLARATION(0),
    UNVERIFIED(1);
    
    private static final zzxy zzc = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvb
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvd.zzb(i);
        }
    };
    private final int zze;

    zzvd(int i) {
        this.zze = i;
    }

    public static zzvd zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return UNVERIFIED;
        }
        return DECLARATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zze;
    }
}
