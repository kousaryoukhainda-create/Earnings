package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.fairbid.internal.Constants;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
/* loaded from: classes.dex */
public final class k {
    public static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] i = {44100, 48000, 32000};
    public static final int[] j = {32, 64, 96, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 288, Constants.BANNER_FALLBACK_AD_WIDTH, 352, 384, 416, 448};
    public static final int[] k = {32, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 144, 160, 176, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT};
    public static final int[] l = {32, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, Constants.BANNER_FALLBACK_AD_WIDTH, 384};
    public static final int[] m = {32, 40, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, Constants.BANNER_FALLBACK_AD_WIDTH};
    public static final int[] n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 144, 160};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
        } else {
            i7 = n[i5 - 1];
        }
        if (i3 == 3) {
            return BK.y(i7, 144000, i8, i9);
        }
        return BK.y(i4 == 1 ? 72000 : 144000, i7, i8, i9);
    }

    public static boolean a(int i2, k kVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int y;
        int i8;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            i7 = i3 == 3 ? j[i5 - 1] : k[i5 - 1];
            y = (((i7 * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i9) + i10) * 4;
            i8 = 384;
        } else {
            if (i3 == 3) {
                i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
                y = BK.y(i7, 144000, i9, i10);
                i8 = 1152;
            } else {
                i7 = n[i5 - 1];
                int i11 = i4 == 1 ? 576 : 1152;
                y = BK.y(i4 == 1 ? 72000 : 144000, i7, i9, i10);
                i8 = i11;
            }
        }
        String str = h[3 - i4];
        int i12 = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        kVar.a = i3;
        kVar.b = str;
        kVar.c = y;
        kVar.d = i9;
        kVar.e = i12;
        kVar.f = i7 * 1000;
        kVar.g = i8;
        return true;
    }
}
