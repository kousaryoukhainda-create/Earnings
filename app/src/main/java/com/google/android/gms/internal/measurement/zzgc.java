package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
public final class zzgc extends zzme implements zznm {
    private static final zzgc zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzgc zzgcVar = new zzgc();
        zzf = zzgcVar;
        zzme.zzcp(zzgc.class, zzgcVar);
    }

    private zzgc() {
    }

    public final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzf;
                        }
                        throw null;
                    }
                    return new zzgb(null);
                }
                return new zzgc();
            }
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
