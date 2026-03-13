package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes3.dex */
public final class zziy extends zzme implements zznm {
    private static final zziy zzf;
    private int zzb;
    private String zzd = "";
    private zzmn zze = zzme.zzcv();

    static {
        zziy zziyVar = new zziy();
        zzf = zziyVar;
        zzme.zzcp(zziy.class, zziyVar);
    }

    private zziy() {
    }

    public final String zza() {
        return this.zzd;
    }

    public final List zzb() {
        return this.zze;
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
                    return new zzix(null);
                }
                return new zziy();
            }
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", zzje.class});
        }
        return (byte) 1;
    }
}
