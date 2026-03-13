package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
public final class zzgh extends zzme implements zznm {
    private static final zzgh zzg;
    private int zzb;
    private String zzd = "";
    private zzmn zze = zzme.zzcv();
    private boolean zzf;

    static {
        zzgh zzghVar = new zzgh();
        zzg = zzghVar;
        zzme.zzcp(zzgh.class, zzghVar);
    }

    private zzgh() {
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
                            return zzg;
                        }
                        throw null;
                    }
                    return new zzgg(null);
                }
                return new zzgh();
            }
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", zzgr.class, "zzf"});
        }
        return (byte) 1;
    }
}
