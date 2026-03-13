package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzacj {
    public final String zza;

    private zzacj(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzacj zza(zzdy zzdyVar) {
        String str;
        zzdyVar.zzM(2);
        int zzm = zzdyVar.zzm();
        int i = zzm >> 1;
        int i2 = zzm & 1;
        int zzm2 = zzdyVar.zzm() >> 3;
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i3 = zzm2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (i3 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(i3);
        return new zzacj(i, i3, sb.toString());
    }
}
