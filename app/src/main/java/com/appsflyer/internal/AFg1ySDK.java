package com.appsflyer.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class AFg1ySDK {
    private static byte[] afDebugLog = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final byte[] AFInAppEventType = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] valueOf = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] AFInAppEventParameterName = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] values = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] AFKeystoreWrapper = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    private static int[] afInfoLog = new int[10];

    static {
        int i;
        byte b;
        byte[] bArr;
        int i2;
        byte b2 = 1;
        byte b3 = 1;
        do {
            int i3 = (b2 << 1) ^ b2;
            if ((b2 & 128) != 0) {
                i = 27;
            } else {
                i = 0;
            }
            b2 = (byte) (i ^ i3);
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            if ((b6 & 128) != 0) {
                b = 9;
            } else {
                b = 0;
            }
            b3 = (byte) (b6 ^ b);
            bArr = afDebugLog;
            i2 = b2 & 255;
            int i4 = b3 & 255;
            bArr[i2] = (byte) (((((b3 ^ 99) ^ ((i4 << 1) | (i4 >> 7))) ^ ((i4 << 2) | (i4 >> 6))) ^ ((i4 << 3) | (i4 >> 5))) ^ ((i4 >> 4) | (i4 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = afDebugLog[i5] & 255;
            AFInAppEventType[i6] = (byte) i5;
            int i7 = i5 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 << 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            int i10 = i9 ^ i5;
            int i11 = ((i7 ^ (i8 ^ i9)) << 24) | (i10 << 16) | ((i10 ^ i8) << 8) | (i10 ^ i7);
            valueOf[i6] = i11;
            AFInAppEventParameterName[i6] = (i11 >>> 8) | (i11 << 24);
            values[i6] = (i11 >>> 16) | (i11 << 16);
            AFKeystoreWrapper[i6] = (i11 << 8) | (i11 >>> 24);
        }
        afInfoLog[0] = 16777216;
        int i12 = 1;
        for (int i13 = 1; i13 < 10; i13++) {
            i12 <<= 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            afInfoLog[i13] = i12 << 24;
        }
    }

    public static byte[][] AFInAppEventParameterName(int i) {
        byte[][] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i3 & 3);
            bArr2[1] = (byte) ((i3 >> 2) & 3);
            bArr2[2] = (byte) ((i3 >> 4) & 3);
            bArr2[3] = (byte) ((i3 >> 6) & 3);
            bArr[i2] = bArr2;
        }
        return bArr;
    }

    public static int[] valueOf(byte[] bArr, int i) throws IllegalArgumentException {
        int i2 = i;
        if (bArr.length == 16) {
            int i3 = 4;
            int i4 = (i2 + 1) * 4;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                int i7 = ((bArr[i5 + 1] & 255) << 16) | (bArr[i5] << Ascii.CAN);
                int i8 = i5 + 3;
                i5 += 4;
                iArr[i6] = i7 | ((bArr[i5 + 2] & 255) << 8) | (bArr[i8] & 255);
            }
            int i9 = 4;
            int i10 = 0;
            int i11 = 0;
            while (i9 < i4) {
                int i12 = iArr[i9 - 1];
                if (i10 == 0) {
                    byte[] bArr2 = afDebugLog;
                    i12 = ((bArr2[i12 >>> 24] & 255) | (((bArr2[(i12 >>> 16) & 255] << Ascii.CAN) | ((bArr2[(i12 >>> 8) & 255] & 255) << 16)) | ((bArr2[i12 & 255] & 255) << 8))) ^ afInfoLog[i11];
                    i11++;
                    i10 = 4;
                }
                iArr[i9] = i12 ^ iArr[i9 - 4];
                i9++;
                i10--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i4];
                int i13 = i2 * 4;
                iArr2[0] = iArr[i13];
                int i14 = 1;
                iArr2[1] = iArr[i13 + 1];
                iArr2[2] = iArr[i13 + 2];
                iArr2[3] = iArr[i13 + 3];
                int i15 = i13 - 4;
                while (i14 < i2) {
                    int i16 = iArr[i15];
                    int[] iArr3 = valueOf;
                    byte[] bArr3 = afDebugLog;
                    int i17 = iArr3[bArr3[i16 >>> 24] & 255];
                    int[] iArr4 = AFInAppEventParameterName;
                    int i18 = i17 ^ iArr4[bArr3[(i16 >>> 16) & 255] & 255];
                    int[] iArr5 = values;
                    int i19 = i18 ^ iArr5[bArr3[(i16 >>> 8) & 255] & 255];
                    int[] iArr6 = AFKeystoreWrapper;
                    iArr2[i3] = iArr6[bArr3[i16 & 255] & 255] ^ i19;
                    int i20 = iArr[i15 + 1];
                    iArr2[i3 + 1] = ((iArr4[bArr3[(i20 >>> 16) & 255] & 255] ^ iArr3[bArr3[i20 >>> 24] & 255]) ^ iArr5[bArr3[(i20 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i20 & 255] & 255];
                    int i21 = iArr[i15 + 2];
                    int i22 = i3 + 3;
                    iArr2[i3 + 2] = iArr6[bArr3[i21 & 255] & 255] ^ ((iArr3[bArr3[i21 >>> 24] & 255] ^ iArr4[bArr3[(i21 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i21 >>> 8) & 255] & 255]);
                    int i23 = iArr[i15 + 3];
                    i3 += 4;
                    iArr2[i22] = iArr6[bArr3[i23 & 255] & 255] ^ ((iArr3[bArr3[i23 >>> 24] & 255] ^ iArr4[bArr3[(i23 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i23 >>> 8) & 255] & 255]);
                    i15 -= 4;
                    i14++;
                    i2 = i;
                }
                iArr2[i3] = iArr[i15];
                iArr2[i3 + 1] = iArr[i15 + 1];
                iArr2[i3 + 2] = iArr[i15 + 2];
                iArr2[i3 + 3] = iArr[i15 + 3];
                return iArr2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
