package com.google.android.gms.internal.p002firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzib  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzib {
    private static long zza(byte[] bArr, int i, int i2) {
        return (zza(bArr, i) >> i2) & 67108863;
    }

    private static long zza(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & KeyboardMap.kValueMask;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j = zza2 * 5;
            long j2 = zza3 * 5;
            long j3 = zza4 * 5;
            long j4 = zza5 * 5;
            int i = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i2 = 0;
            while (i2 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, (byte) 0);
                }
                long zza6 = j9 + zza(bArr3, 0, 0);
                long zza7 = j5 + zza(bArr3, 3, 2);
                long zza8 = j6 + zza(bArr3, 6, 4);
                long zza9 = j7 + zza(bArr3, 9, 6);
                long zza10 = j8 + (zza(bArr3, 12, 8) | (bArr3[16] << Ascii.CAN));
                long j10 = (zza10 * j) + (zza9 * j2) + (zza8 * j3) + (zza7 * j4) + (zza6 * zza);
                long j11 = (zza10 * j2) + (zza9 * j3) + (zza8 * j4) + (zza7 * zza) + (zza6 * zza2);
                long j12 = (zza10 * j3) + (zza9 * j4) + (zza8 * zza) + (zza7 * zza2) + (zza6 * zza3);
                long j13 = (zza9 * zza) + (zza8 * zza2) + (zza7 * zza3) + (zza6 * zza4);
                long j14 = zza9 * zza2;
                long j15 = zza10 * zza;
                long j16 = j11 + (j10 >> 26);
                long j17 = j12 + (j16 >> 26);
                long j18 = (zza10 * j4) + j13 + (j17 >> 26);
                long j19 = j15 + j14 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j18 >> 26);
                long j20 = j19 >> 26;
                j8 = j19 & 67108863;
                long j21 = (j20 * 5) + (j10 & 67108863);
                i2 += 16;
                j6 = j17 & 67108863;
                j7 = j18 & 67108863;
                i = 17;
                j9 = j21 & 67108863;
                j5 = (j16 & 67108863) + (j21 >> 26);
            }
            long j22 = j6 + (j5 >> 26);
            long j23 = j22 & 67108863;
            long j24 = j7 + (j22 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j8 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = ((j26 >> 26) * 5) + j9;
            long j29 = j28 >> 26;
            long j30 = j28 & 67108863;
            long j31 = (j5 & 67108863) + j29;
            long j32 = j30 + 5;
            long j33 = j32 & 67108863;
            long j34 = (j32 >> 26) + j31;
            long j35 = j23 + (j34 >> 26);
            long j36 = j25 + (j35 >> 26);
            long j37 = (j27 + (j36 >> 26)) - 67108864;
            long j38 = j37 >> 63;
            long j39 = j30 & j38;
            long j40 = j31 & j38;
            long j41 = j23 & j38;
            long j42 = j25 & j38;
            long j43 = j27 & j38;
            long j44 = ~j38;
            long j45 = j40 | (j34 & 67108863 & j44);
            long j46 = j41 | (j35 & 67108863 & j44);
            long j47 = j42 | (j36 & 67108863 & j44);
            long j48 = (j39 | (j33 & j44) | (j45 << 26)) & KeyboardMap.kValueMask;
            long j49 = ((j45 >> 6) | (j46 << 20)) & KeyboardMap.kValueMask;
            long j50 = ((j46 >> 12) | (j47 << 14)) & KeyboardMap.kValueMask;
            long j51 = ((j47 >> 18) | ((j43 | (j37 & j44)) << 8)) & KeyboardMap.kValueMask;
            long zza11 = j48 + zza(bArr, 16);
            long j52 = zza11 & KeyboardMap.kValueMask;
            long zza12 = j49 + zza(bArr, 20) + (zza11 >> 32);
            long j53 = zza12 & KeyboardMap.kValueMask;
            long zza13 = j50 + zza(bArr, 24) + (zza12 >> 32);
            long j54 = zza13 & KeyboardMap.kValueMask;
            long zza14 = (j51 + zza(bArr, 28) + (zza13 >> 32)) & KeyboardMap.kValueMask;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j52, 0);
            zza(bArr4, j53, 4);
            zza(bArr4, j54, 8);
            zza(bArr4, zza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
