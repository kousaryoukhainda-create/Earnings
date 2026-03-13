package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes3.dex */
public final class zzk {
    public static final zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzi zziVar = new zzi();
        zziVar.zzc(1);
        zziVar.zzb(2);
        zziVar.zzd(3);
        zza = zziVar.zzg();
        zzi zziVar2 = new zzi();
        zziVar2.zzc(1);
        zziVar2.zzb(1);
        zziVar2.zzd(2);
        zziVar2.zzg();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzk(int i, int i2, int i3, byte[] bArr, int i4, int i5, zzj zzjVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
        this.zzf = i4;
        this.zzg = i5;
    }

    public static int zza(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int zzb(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i != 16) {
                        if (i != 18) {
                            return (i == 6 || i == 7) ? 3 : -1;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public static boolean zzg(zzk zzkVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (zzkVar == null) {
            return true;
        }
        int i5 = zzkVar.zzb;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = zzkVar.zzc) == -1 || i == 2) && (((i2 = zzkVar.zzd) == -1 || i2 == 3) && zzkVar.zze == null && (((i3 = zzkVar.zzg) == -1 || i3 == 8) && ((i4 = zzkVar.zzf) == -1 || i4 == 8)));
    }

    private static String zzh(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return AbstractC0324Hi.e(i, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String zzi(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return AbstractC0324Hi.e(i, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String zzj(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return AbstractC0324Hi.e(i, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzk.class == obj.getClass()) {
            zzk zzkVar = (zzk) obj;
            if (this.zzb == zzkVar.zzb && this.zzc == zzkVar.zzc && this.zzd == zzkVar.zzd && Arrays.equals(this.zze, zzkVar.zze) && this.zzf == zzkVar.zzf && this.zzg == zzkVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            int i2 = this.zzd;
            int hashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + i2) * 31)) * 31) + this.zzf) * 31) + this.zzg;
            this.zzh = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str;
        boolean z;
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzc;
        String zzi = zzi(this.zzb);
        String zzh = zzh(i3);
        String zzj = zzj(i2);
        String str2 = "NA";
        if (i == -1) {
            str = "NA";
        } else {
            str = i + "bit Luma";
        }
        int i4 = this.zzg;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        if (this.zze != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder q = BK.q("ColorInfo(", zzi, ", ", zzh, ", ");
        q.append(zzj);
        q.append(", ");
        q.append(z);
        q.append(", ");
        return AbstractC2437ph.m(q, str, ", ", str2, ")");
    }

    public final zzi zzc() {
        return new zzi(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String zzi = zzi(this.zzb);
            String zzh = zzh(this.zzc);
            String zzj = zzj(this.zzd);
            Locale locale = Locale.US;
            str = zzi + "/" + zzh + "/" + zzj;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return AbstractC0324Hi.g(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
