package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.fairbid.internal.Constants;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes.dex */
public final class a {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, Constants.BANNER_FALLBACK_AD_WIDTH, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, LocationRequest.PRIORITY_LOW_POWER, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = b;
            if (i < iArr.length && i2 >= 0) {
                int[] iArr2 = f;
                if (i3 < iArr2.length) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return ((i2 % 2) + iArr2[i3]) * 2;
                    }
                    int i5 = e[i3];
                    if (i4 == 32000) {
                        return i5 * 6;
                    }
                    return i5 * 4;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
}
