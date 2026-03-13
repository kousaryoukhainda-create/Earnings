package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class zzgkd {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 < length) {
                int min = Math.min(16, length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, (byte) 0);
                }
                long j6 = zzb5 * 5;
                long j7 = zzb4 * 5;
                long j8 = zzb3 * 5;
                long zzb6 = j5 + zzb(bArr3, 0, 0);
                long zzb7 = j2 + zzb(bArr3, 3, 2);
                long zzb8 = j + zzb(bArr3, 6, 4);
                long zzb9 = j3 + zzb(bArr3, 9, 6);
                long zzb10 = j4 + (zzb(bArr3, 12, 8) | (bArr3[16] << Ascii.CAN));
                long j9 = zzb7 * zzb;
                long j10 = zzb7 * zzb2;
                long j11 = zzb8 * zzb;
                long j12 = zzb7 * zzb3;
                long j13 = zzb8 * zzb2;
                long j14 = zzb9 * zzb;
                long j15 = zzb7 * zzb4;
                long j16 = zzb8 * zzb3;
                long j17 = zzb9 * zzb2;
                long j18 = zzb10 * zzb;
                long j19 = (zzb2 * 5 * zzb10) + (zzb9 * j8) + (zzb8 * j7) + (zzb7 * j6) + (zzb6 * zzb);
                long j20 = j19 & 67108863;
                long j21 = zzb9 * j7;
                long j22 = j8 * zzb10;
                long j23 = j22 + j21 + (zzb8 * j6) + (zzb6 * zzb2) + j9 + (j19 >> 26);
                long j24 = j7 * zzb10;
                long j25 = j24 + (zzb9 * j6) + (zzb6 * zzb3) + j10 + j11 + (j23 >> 26);
                long j26 = (zzb10 * j6) + (zzb6 * zzb4) + j12 + j13 + j14 + (j25 >> 26);
                long j27 = (zzb6 * zzb5) + j15 + j16 + j17 + j18 + (j26 >> 26);
                long j28 = ((j27 >> 26) * 5) + j20;
                j2 = (j23 & 67108863) + (j28 >> 26);
                i2 += 16;
                j = j25 & 67108863;
                j3 = j26 & 67108863;
                j4 = j27 & 67108863;
                i = 17;
                j5 = j28 & 67108863;
            } else {
                long j29 = j + (j2 >> 26);
                long j30 = j29 & 67108863;
                long j31 = j3 + (j29 >> 26);
                long j32 = j31 & 67108863;
                long j33 = j4 + (j31 >> 26);
                long j34 = j33 & 67108863;
                long j35 = ((j33 >> 26) * 5) + j5;
                long j36 = j35 >> 26;
                long j37 = j35 & 67108863;
                long j38 = j37 + 5;
                long j39 = (j2 & 67108863) + j36;
                long j40 = j39 + (j38 >> 26);
                long j41 = (j40 >> 26) + j30;
                long j42 = j32 + (j41 >> 26);
                long j43 = (j34 + (j42 >> 26)) - 67108864;
                long j44 = j43 >> 63;
                long j45 = ~j44;
                long j46 = (j39 & j44) | (j40 & 67108863 & j45);
                long j47 = (j30 & j44) | (j41 & 67108863 & j45);
                long j48 = (j32 & j44) | (j42 & 67108863 & j45);
                long j49 = (j34 & j44) | (j43 & j45);
                long zzc = (((j37 & j44) | (j38 & 67108863 & j45) | (j46 << 26)) & KeyboardMap.kValueMask) + zzc(bArr, 16);
                long zzc2 = (((j46 >> 6) | (j47 << 20)) & KeyboardMap.kValueMask) + zzc(bArr, 20);
                long zzc3 = (((j48 << 14) | (j47 >> 12)) & KeyboardMap.kValueMask) + zzc(bArr, 24);
                long zzc4 = (((j48 >> 18) | (j49 << 8)) & KeyboardMap.kValueMask) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & KeyboardMap.kValueMask, 0);
                long j50 = zzc2 + (zzc >> 32);
                zzd(bArr4, j50 & KeyboardMap.kValueMask, 4);
                long j51 = zzc3 + (j50 >> 32);
                zzd(bArr4, j51 & KeyboardMap.kValueMask, 8);
                zzd(bArr4, (zzc4 + (j51 >> 32)) & KeyboardMap.kValueMask, 12);
                return bArr4;
            }
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return (((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16)) & KeyboardMap.kValueMask;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
