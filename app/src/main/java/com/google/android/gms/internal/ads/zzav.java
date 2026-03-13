package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzav {
    public static final zzav zza = new zzav(new zzat());
    public final CharSequence zzb;
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final byte[] zzg;
    public final Integer zzh;
    public final Integer zzi;
    public final Integer zzj;
    @Deprecated
    public final Integer zzk;
    public final Boolean zzl;
    @Deprecated
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final CharSequence zzx;
    public final Integer zzy;
    public final zzfxn zzz;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(1000, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzav.class == obj.getClass()) {
            zzav zzavVar = (zzav) obj;
            if (Objects.equals(this.zzb, zzavVar.zzb) && Objects.equals(this.zzc, zzavVar.zzc) && Objects.equals(this.zzd, zzavVar.zzd) && Objects.equals(this.zze, zzavVar.zze) && Objects.equals(this.zzf, zzavVar.zzf) && Arrays.equals(this.zzg, zzavVar.zzg) && Objects.equals(this.zzh, zzavVar.zzh) && Objects.equals(this.zzi, zzavVar.zzi) && Objects.equals(this.zzj, zzavVar.zzj) && Objects.equals(this.zzk, zzavVar.zzk) && Objects.equals(this.zzl, zzavVar.zzl) && Objects.equals(this.zzn, zzavVar.zzn) && Objects.equals(this.zzo, zzavVar.zzo) && Objects.equals(this.zzp, zzavVar.zzp) && Objects.equals(this.zzq, zzavVar.zzq) && Objects.equals(this.zzr, zzavVar.zzr) && Objects.equals(this.zzs, zzavVar.zzs) && Objects.equals(this.zzt, zzavVar.zzt) && Objects.equals(this.zzu, zzavVar.zzu) && Objects.equals(this.zzv, zzavVar.zzv) && Objects.equals(this.zzw, zzavVar.zzw) && Objects.equals(this.zzx, zzavVar.zzx) && Objects.equals(this.zzy, zzavVar.zzy)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, null, null, this.zzw, null, this.zzx, this.zzy, Boolean.TRUE});
    }

    public final zzat zza() {
        return new zzat(this, null);
    }

    private zzav(zzat zzatVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        zzfxn zzfxnVar;
        bool = zzatVar.zzk;
        num = zzatVar.zzj;
        num2 = zzatVar.zzw;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        } else {
            num = null;
        }
        charSequence = zzatVar.zza;
        this.zzb = charSequence;
        charSequence2 = zzatVar.zzb;
        this.zzc = charSequence2;
        charSequence3 = zzatVar.zzc;
        this.zzd = charSequence3;
        charSequence4 = zzatVar.zzd;
        this.zze = charSequence4;
        charSequence5 = zzatVar.zze;
        this.zzf = charSequence5;
        bArr = zzatVar.zzf;
        this.zzg = bArr;
        num3 = zzatVar.zzg;
        this.zzh = num3;
        num4 = zzatVar.zzh;
        this.zzi = num4;
        num5 = zzatVar.zzi;
        this.zzj = num5;
        this.zzk = num;
        this.zzl = bool;
        num6 = zzatVar.zzl;
        this.zzm = num6;
        num7 = zzatVar.zzl;
        this.zzn = num7;
        num8 = zzatVar.zzm;
        this.zzo = num8;
        num9 = zzatVar.zzn;
        this.zzp = num9;
        num10 = zzatVar.zzo;
        this.zzq = num10;
        num11 = zzatVar.zzp;
        this.zzr = num11;
        num12 = zzatVar.zzq;
        this.zzs = num12;
        charSequence6 = zzatVar.zzr;
        this.zzt = charSequence6;
        charSequence7 = zzatVar.zzs;
        this.zzu = charSequence7;
        charSequence8 = zzatVar.zzt;
        this.zzv = charSequence8;
        charSequence9 = zzatVar.zzu;
        this.zzw = charSequence9;
        charSequence10 = zzatVar.zzv;
        this.zzx = charSequence10;
        this.zzy = num2;
        zzfxnVar = zzatVar.zzx;
        this.zzz = zzfxnVar;
    }
}
