package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class zzro extends zzxv implements zzzh {
    private static final zzro zza;
    private int zzd;
    private long zze;
    private zzac zzf;
    private zzak zzg;
    private byte zzh = 2;

    static {
        zzro zzroVar = new zzro();
        zza = zzroVar;
        zzxv.zzan(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzrn zze() {
        return (zzrn) zza.zzY();
    }

    public static zzro zzg(InputStream inputStream, zzxf zzxfVar) throws IOException {
        return (zzro) zzxv.zzae(zza, inputStream, zzxfVar);
    }

    public static /* synthetic */ void zzh(zzro zzroVar, long j) {
        zzroVar.zzd |= 1;
        zzroVar.zze = j;
    }

    public static /* synthetic */ void zzi(zzro zzroVar, zzac zzacVar) {
        zzacVar.getClass();
        zzroVar.zzf = zzacVar;
        zzroVar.zzd |= 2;
    }

    public static /* synthetic */ void zzj(zzro zzroVar, zzak zzakVar) {
        zzakVar.getClass();
        zzroVar.zzg = zzakVar;
        zzroVar.zzd |= 4;
    }

    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        byte b = 1;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzrn(null);
                }
                return new zzro();
            }
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    public final zzac zzc() {
        zzac zzacVar = this.zzf;
        if (zzacVar == null) {
            return zzac.zzk();
        }
        return zzacVar;
    }

    public final zzak zzd() {
        zzak zzakVar = this.zzg;
        if (zzakVar == null) {
            return zzak.zzf();
        }
        return zzakVar;
    }

    public final boolean zzk() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzl() {
        return (this.zzd & 4) != 0;
    }
}
