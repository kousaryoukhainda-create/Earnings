package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
public final class zzfw extends zzme implements zznm {
    private static final zzfw zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzfw zzfwVar = new zzfw();
        zzf = zzfwVar;
        zzme.zzcp(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public final int zzb() {
        int zza = zzga.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc() {
        int zza = zzga.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
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
                    return new zzfv(null);
                }
                return new zzfw();
            }
            zzmj zzmjVar = zzfz.zza;
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzmjVar, "zze", zzmjVar});
        }
        return (byte) 1;
    }
}
