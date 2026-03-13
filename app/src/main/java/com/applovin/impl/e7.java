package com.applovin.impl;

import com.applovin.impl.e9;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class e7 {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 24000, 48000, -1, -1};
    private static final int[] c = {64, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    private static zg b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new zg(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b2 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b2;
            }
        }
        zg zgVar = new zg(copyOf);
        if (copyOf[0] == 31) {
            zg zgVar2 = new zg(copyOf);
            while (zgVar2.b() >= 16) {
                zgVar2.d(2);
                zgVar.a(zgVar2.a(14), 14);
            }
        }
        zgVar.a(copyOf);
        return zgVar;
    }

    private static boolean c(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 != -2 && b2 != -1) {
            return false;
        }
        return true;
    }

    public static int d(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 != -1) {
                if (b4 != 31) {
                    i = (bArr[4] & 1) << 6;
                    b2 = bArr[5];
                } else {
                    i = (bArr[5] & 7) << 4;
                    b3 = bArr[6];
                }
            } else {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e7.a(byte[]):int");
    }

    public static int a(ByteBuffer byteBuffer) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static e9 a(byte[] bArr, String str, String str2, x6 x6Var) {
        zg b2 = b(bArr);
        b2.d(60);
        int i = a[b2.a(6)];
        int i2 = b[b2.a(4)];
        int a2 = b2.a(5);
        int[] iArr = c;
        int i3 = a2 >= iArr.length ? -1 : (iArr[a2] * 1000) / 2;
        b2.d(10);
        return new e9.b().c(str).f("audio/vnd.dts").b(i3).c(i + (b2.a(2) > 0 ? 1 : 0)).n(i2).a(x6Var).e(str2).a();
    }
}
