package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzat {
    private CharSequence zza;
    private CharSequence zzb;
    private CharSequence zzc;
    private CharSequence zzd;
    private CharSequence zze;
    private byte[] zzf;
    private Integer zzg;
    private Integer zzh;
    private Integer zzi;
    private Integer zzj;
    private Boolean zzk;
    private Integer zzl;
    private Integer zzm;
    private Integer zzn;
    private Integer zzo;
    private Integer zzp;
    private Integer zzq;
    private CharSequence zzr;
    private CharSequence zzs;
    private CharSequence zzt;
    private CharSequence zzu;
    private CharSequence zzv;
    private Integer zzw;
    private final zzfxn zzx;

    public /* synthetic */ zzat(zzav zzavVar, zzau zzauVar) {
        this.zza = zzavVar.zzb;
        this.zzb = zzavVar.zzc;
        this.zzc = zzavVar.zzd;
        this.zzd = zzavVar.zze;
        this.zze = zzavVar.zzf;
        this.zzf = zzavVar.zzg;
        this.zzg = zzavVar.zzh;
        this.zzh = zzavVar.zzi;
        this.zzi = zzavVar.zzj;
        this.zzj = zzavVar.zzk;
        this.zzk = zzavVar.zzl;
        this.zzl = zzavVar.zzn;
        this.zzm = zzavVar.zzo;
        this.zzn = zzavVar.zzp;
        this.zzo = zzavVar.zzq;
        this.zzp = zzavVar.zzr;
        this.zzq = zzavVar.zzs;
        this.zzr = zzavVar.zzt;
        this.zzs = zzavVar.zzu;
        this.zzt = zzavVar.zzv;
        this.zzu = zzavVar.zzw;
        this.zzv = zzavVar.zzx;
        this.zzw = zzavVar.zzy;
        this.zzx = zzavVar.zzz;
    }

    public final zzat zza(byte[] bArr, int i) {
        if (this.zzf == null || Integer.valueOf(i).equals(3) || !Objects.equals(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzat zzb(zzav zzavVar) {
        if (zzavVar != null) {
            CharSequence charSequence = zzavVar.zzb;
            if (charSequence != null) {
                this.zza = charSequence;
            }
            CharSequence charSequence2 = zzavVar.zzc;
            if (charSequence2 != null) {
                this.zzb = charSequence2;
            }
            CharSequence charSequence3 = zzavVar.zzd;
            if (charSequence3 != null) {
                this.zzc = charSequence3;
            }
            CharSequence charSequence4 = zzavVar.zze;
            if (charSequence4 != null) {
                this.zzd = charSequence4;
            }
            CharSequence charSequence5 = zzavVar.zzf;
            if (charSequence5 != null) {
                this.zze = charSequence5;
            }
            byte[] bArr = zzavVar.zzg;
            if (bArr != null) {
                Integer num = zzavVar.zzh;
                this.zzf = (byte[]) bArr.clone();
                this.zzg = num;
            }
            Integer num2 = zzavVar.zzi;
            if (num2 != null) {
                this.zzh = num2;
            }
            Integer num3 = zzavVar.zzj;
            if (num3 != null) {
                this.zzi = num3;
            }
            Integer num4 = zzavVar.zzk;
            if (num4 != null) {
                this.zzj = num4;
            }
            Boolean bool = zzavVar.zzl;
            if (bool != null) {
                this.zzk = bool;
            }
            Integer num5 = zzavVar.zzm;
            if (num5 != null) {
                this.zzl = num5;
            }
            Integer num6 = zzavVar.zzn;
            if (num6 != null) {
                this.zzl = num6;
            }
            Integer num7 = zzavVar.zzo;
            if (num7 != null) {
                this.zzm = num7;
            }
            Integer num8 = zzavVar.zzp;
            if (num8 != null) {
                this.zzn = num8;
            }
            Integer num9 = zzavVar.zzq;
            if (num9 != null) {
                this.zzo = num9;
            }
            Integer num10 = zzavVar.zzr;
            if (num10 != null) {
                this.zzp = num10;
            }
            Integer num11 = zzavVar.zzs;
            if (num11 != null) {
                this.zzq = num11;
            }
            CharSequence charSequence6 = zzavVar.zzt;
            if (charSequence6 != null) {
                this.zzr = charSequence6;
            }
            CharSequence charSequence7 = zzavVar.zzu;
            if (charSequence7 != null) {
                this.zzs = charSequence7;
            }
            CharSequence charSequence8 = zzavVar.zzv;
            if (charSequence8 != null) {
                this.zzt = charSequence8;
            }
            CharSequence charSequence9 = zzavVar.zzw;
            if (charSequence9 != null) {
                this.zzu = charSequence9;
            }
            CharSequence charSequence10 = zzavVar.zzx;
            if (charSequence10 != null) {
                this.zzv = charSequence10;
            }
            Integer num12 = zzavVar.zzy;
            if (num12 != null) {
                this.zzw = num12;
            }
        }
        return this;
    }

    public final zzat zzc(CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzat zzd(CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzat zze(CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzat zzf(CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzat zzg(CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzat zzh(CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzat zzi(CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzat zzj(Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzat zzk(Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzat zzl(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzat zzm(Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzat zzn(Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzat zzo(Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzat zzp(CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzat zzq(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzat zzr(Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzat zzs(Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzat zzt(CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzav zzu() {
        return new zzav(this);
    }

    public zzat() {
        this.zzx = zzfxn.zzn();
    }
}
