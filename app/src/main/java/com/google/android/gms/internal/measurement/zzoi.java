package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class zzoi {
    private static final zzoi zza = new zzoi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoi(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzoi zza() {
        return zza;
    }

    public static zzoi zzb() {
        return new zzoi(0, new int[8], new Object[8], true);
    }

    public static zzoi zzc(zzoi zzoiVar, zzoi zzoiVar2) {
        int i = zzoiVar.zzb + zzoiVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzoiVar.zzc, i);
        System.arraycopy(zzoiVar2.zzc, 0, copyOf, zzoiVar.zzb, zzoiVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzoiVar.zzd, i);
        System.arraycopy(zzoiVar2.zzd, 0, copyOf2, zzoiVar.zzb, zzoiVar2.zzb);
        return new zzoi(i, copyOf, copyOf2, true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzoi)) {
            return false;
        }
        zzoi zzoiVar = (zzoi) obj;
        int i = this.zzb;
        if (i == zzoiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzoiVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzoiVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzf(zzou zzouVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzouVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzou zzouVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    zzouVar.zzk(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zzmp("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                zzouVar.zzt(i4);
                                ((zzoi) obj).zzg(zzouVar);
                                zzouVar.zzu(i4);
                            }
                        } else {
                            zzouVar.zzn(i4, (zzlg) obj);
                        }
                    } else {
                        zzouVar.zzj(i4, ((Long) obj).longValue());
                    }
                } else {
                    zzouVar.zzc(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int zzz = zzll.zzz(8);
                int zzz2 = zzll.zzz(this.zzc[i3] >>> 3) + zzll.zzz(16);
                int zzz3 = zzll.zzz(24);
                int zzc = ((zzlg) this.zzd[i3]).zzc();
                i2 += zzz + zzz + zzz2 + Kh0.q(zzc, zzc, zzz3);
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final int zzi() {
        int zzz;
        int zzA;
        int zzz2;
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = this.zzc[i3];
                int i5 = i4 >>> 3;
                int i6 = i4 & 7;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 5) {
                                    ((Integer) this.zzd[i3]).getClass();
                                    zzz2 = zzll.zzz(i5 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zzmp("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int zzz3 = zzll.zzz(i5 << 3);
                                zzz = zzz3 + zzz3;
                                zzA = ((zzoi) this.zzd[i3]).zzi();
                            }
                        } else {
                            int zzz4 = zzll.zzz(i5 << 3);
                            int zzc = ((zzlg) this.zzd[i3]).zzc();
                            i2 = zzll.zzz(zzc) + zzc + zzz4 + i2;
                        }
                    } else {
                        ((Long) this.zzd[i3]).getClass();
                        zzz2 = zzll.zzz(i5 << 3) + 8;
                    }
                    i2 = zzz2 + i2;
                } else {
                    int i7 = i5 << 3;
                    long longValue = ((Long) this.zzd[i3]).longValue();
                    zzz = zzll.zzz(i7);
                    zzA = zzll.zzA(longValue);
                }
                i2 = zzA + zzz + i2;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zznn.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzk(int i, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final zzoi zzl(zzoi zzoiVar) {
        if (zzoiVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzoiVar.zzb;
        zzm(i);
        System.arraycopy(zzoiVar.zzc, 0, this.zzc, this.zzb, zzoiVar.zzb);
        System.arraycopy(zzoiVar.zzd, 0, this.zzd, this.zzb, zzoiVar.zzb);
        this.zzb = i;
        return this;
    }

    private zzoi() {
        this(0, new int[8], new Object[8], true);
    }
}
