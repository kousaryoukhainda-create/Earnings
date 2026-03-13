package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzgaq extends zzgar {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] != i) {
                i2++;
            } else {
                return i2;
            }
        }
        return -1;
    }

    public static int zzb(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzh(z, "Out of range: %s", j);
        return i;
    }

    public static int zzc(int i, int i2, int i3) {
        zzfun.zzj(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        int[] iArr = {i, i2};
        int i4 = iArr[0];
        for (char c = 1; c < 2; c = 2) {
            int i5 = iArr[1];
            if (i5 > i4) {
                i4 = i5;
            }
        }
        int[] iArr2 = {i4, 1073741823};
        int i6 = iArr2[0];
        for (char c2 = 1; c2 < 2; c2 = 2) {
            int i7 = iArr2[1];
            if (i7 < i6) {
                i6 = i7;
            }
        }
        return i6;
    }

    public static int zzd(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzj(z, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << Ascii.CAN) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static Integer zzf(String str, int i) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i2 = 1;
            }
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int zza = zzgas.zza(str.charAt(i2));
                if (zza >= 0 && zza < 10) {
                    long j = -zza;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            int zza2 = zzgas.zza(str.charAt(i3));
                            if (zza2 < 0 || zza2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = zza2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i3 = i4;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzgap(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
