package defpackage;

import com.applovin.exoplayer2.common.base.Ascii;
/* renamed from: CB  reason: default package */
/* loaded from: classes.dex */
public abstract class CB {
    public static final char[] a = "0123456789ABCDEF".toCharArray();

    public static byte[] a(String str) {
        char[] charArray = str.toCharArray();
        if ((charArray.length & 1) == 0) {
            byte[] bArr = new byte[charArray.length >> 1];
            int i = 0;
            int i2 = 0;
            while (i < charArray.length) {
                int digit = Character.digit(charArray[i], 16);
                if (digit != -1) {
                    int i3 = i + 1;
                    int digit2 = Character.digit(charArray[i3], 16);
                    if (digit2 != -1) {
                        i += 2;
                        bArr[i2] = (byte) (((digit << 4) | digit2) & 255);
                        i2++;
                    } else {
                        throw new IllegalArgumentException(AbstractC0324Hi.e(i3, "Illegal hexadecimal character at index "));
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC0324Hi.e(i, "Illegal hexadecimal character at index "));
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & Ascii.SI]);
        }
        return sb.toString();
    }
}
