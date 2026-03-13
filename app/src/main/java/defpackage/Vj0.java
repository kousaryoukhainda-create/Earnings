package defpackage;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.regex.Pattern;
/* renamed from: Vj0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Vj0 {
    public static final Pattern a = Pattern.compile("^[0-9a-f]{64}$");
    public static final byte[] b = {-10, -72, -36, -70, 112, 87, -71, -63, -86, -2, -65, -10, 4, 86, -32, -122, -98, 0, -71, -20, -100, -95, -30, 105, 79, 66, Ascii.DC2, -22, 118, -121, -10, 43, 64, 107, -60, -83, -84, 38, 78, -76, -115, 63, -2, 64, -58, Ascii.RS, 117, -2, -6, -116, -55, 48, 91, Ascii.ESC, 62, -22, -1, 50, -108, 5, -98, Ascii.DC4, 10, -85, -35, 46, -87, -124, 73, Ascii.EM, 55, Byte.MIN_VALUE, 85, Ascii.ESC, -109, -124, -55, 17, 33, 105, 95, 52, 55, 1, -22, -10, 109, -113, Ascii.DEL, -5, -116, 47, -86, 78, -1, -123, 108, Ascii.DLE, 70, 37, 111, Byte.MIN_VALUE, -54, 6, -84, 84, -105, 123, 97, 5, -95, 80, -7, -46, -16, -26, 108, -14, -102, -54, Ascii.SYN, -42, -38, -72, -121, -87, 5, 78, 77, -21, -19, 51, 36, 109, Byte.MIN_VALUE, 103, 100, -60, -89, 59, -30, -52, 80, -107, 76, 42, 65, 2, 86, -109, -4, -107, 17, 8, Ascii.VT, 32, 82, 57, Ascii.GS, 63, -27, 97, -120, -68, -30, 121, 84, -117, -32, 96, Ascii.RS, -100, -9, -67, -79, -57, -115, 93, -66, -70, -127, 46, 83, 69, 126, -64, -16, -91, 9, 7, -116, Ascii.DC4, -123, -109, -46, -93, 92, -5, 105, -1, -100, -17, -98, Ascii.DLE, -107, -116, Ascii.DLE, -16, -16, 111, Ascii.SYN, 81, 46, 39, 76, -60, -116, -88, -66, Ascii.NAK, -28, -92, 87, Ascii.SI, 71, -20, -118, 96, 110, 100, 112, 75, 117, 108, -99, 87, -81, -91, 82, 87, -11, -45, -121, Ascii.EM, 68, Ascii.DLE, -48, -51, 54, -73, 99, 10, 95, -40, -15};
    public static MessageDigest c = null;

    public static String a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] ^ bArr2[i];
                byte[] bArr4 = b;
                bArr3[i] = (byte) (i2 ^ bArr4[i % bArr4.length]);
            }
            return new String(bArr3, StandardCharsets.UTF_8);
        }
        throw new IllegalArgumentException("encoded and salt need to have equal byte length");
    }
}
