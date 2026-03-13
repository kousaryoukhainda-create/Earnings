package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzpz {
    static {
        zzmj zzi = zzml.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzml zzmlVar = (zzml) zzi.zzk();
        zzmj zzi2 = zzml.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzml zzmlVar2 = (zzml) zzi2.zzk();
        zzmj zzi3 = zzml.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
        zzml zzmlVar3 = (zzml) zzi3.zzk();
    }

    public static zzml zza(long j) {
        int i;
        int i2 = (int) (j % 1000000000);
        long j2 = j / 1000000000;
        if (i2 <= -1000000000 || i2 >= 1000000000) {
            j2 = zzkk.zza(j2, i2 / 1000000000);
            i2 %= 1000000000;
        }
        if (j2 > 0 && i2 < 0) {
            i2 += 1000000000;
            j2--;
        }
        if (j2 < 0 && i2 > 0) {
            i2 -= 1000000000;
            j2++;
        }
        zzmj zzi = zzml.zzi();
        zzi.zzf(j2);
        zzi.zze(i2);
        zzml zzmlVar = (zzml) zzi.zzk();
        long zzg = zzmlVar.zzg();
        int zzf = zzmlVar.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && zzf >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (i <= 0 && zzf <= 0))) {
            return zzmlVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + zzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
