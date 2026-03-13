package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzwi implements zzxx {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);
    
    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzwg
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzwi.zzb(i);
        }
    };
    private final int zzf;

    zzwi(int i) {
        this.zzf = i;
    }

    public static zzwi zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }
            return JS_STRING;
        }
        return JS_NORMAL;
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
