package com.applovin.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
/* renamed from: com.applovin.impl.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1060a {
    private static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.applovin.impl.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        private b(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & UserVerificationMethods.USER_VERIFY_PATTERN) | ((i3 << 3) & 120))};
    }

    private static int b(zg zgVar) {
        int a2 = zgVar.a(4);
        if (a2 == 15) {
            return zgVar.a(24);
        }
        if (a2 < 13) {
            return a[a2];
        }
        throw ch.a(null, null);
    }

    private static int a(zg zgVar) {
        int a2 = zgVar.a(5);
        return a2 == 31 ? zgVar.a(6) + 32 : a2;
    }

    public static b a(zg zgVar, boolean z) {
        int a2 = a(zgVar);
        int b2 = b(zgVar);
        int a3 = zgVar.a(4);
        String e = AbstractC0324Hi.e(a2, "mp4a.40.");
        if (a2 == 5 || a2 == 29) {
            b2 = b(zgVar);
            a2 = a(zgVar);
            if (a2 == 22) {
                a3 = zgVar.a(4);
            }
        }
        if (z) {
            if (a2 != 6 && a2 != 7 && a2 != 17 && a2 != 1 && a2 != 2 && a2 != 3 && a2 != 4) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ch.a("Unsupported audio object type: " + a2);
                }
            }
            a(zgVar, a2, a3);
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a4 = zgVar.a(2);
                    if (a4 == 2 || a4 == 3) {
                        throw ch.a("Unsupported epConfig: " + a4);
                    }
            }
        }
        int i = b[a3];
        if (i != -1) {
            return new b(b2, i, e);
        }
        throw ch.a(null, null);
    }

    private static void a(zg zgVar, int i, int i2) {
        if (zgVar.f()) {
            oc.d("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zgVar.f()) {
            zgVar.d(14);
        }
        boolean f = zgVar.f();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            zgVar.d(3);
        }
        if (f) {
            if (i == 22) {
                zgVar.d(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                zgVar.d(3);
            }
            zgVar.d(1);
        }
    }

    public static b a(byte[] bArr) {
        return a(new zg(bArr), false);
    }
}
