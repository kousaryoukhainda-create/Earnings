package defpackage;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
/* renamed from: ll0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2102ll0 {
    public static final CountDownLatch a = new CountDownLatch(1);
    public static Pattern b = Pattern.compile(Vj0.a(new byte[]{-44, -22, 106, -28, -36, 77, 75, -118, -69, -37, -70, Ascii.EM, -80, -70, 123, 103, 123, -127, 3, -52, 94, 76, 46, Ascii.DC2, 96, 40, 9, 47, -113, Ascii.CAN, Ascii.SI, -22, 80, -90, -42, 33, -29, 84, 102}, new byte[]{10, 36, -58, 48, -123, 102, -38, 59, 99, 74, 125, -106, -99, -112, -77, -110, -118, -30, -47, 9, -66, -59, -72, Ascii.SO, 65, 66, 36, -28, -47, -6, -48, -67, 56, -92, 124, -21, 102, 91, 1}));
    public static final HashSet c;
    public static final HashSet d;
    public static final Set e;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new byte[]{-54, 94, -43, 82, 19, -31, -36, -69, -45, -74, 108, -118, 116, Ascii.DC2, 81, 61, 62, -62, -127, -39, -108, -3, 32, 103, Ascii.GS, -90, -125, -44, 84, -124, -86, 45}, new byte[]{-40, -80, 46, 110, 48, -6, 52, 35, -100, 113, 108, Ascii.ETB, 6, 78, 96, 7, Ascii.NAK, 50, -105, -124, -8, -71, 44, 117, 52, -36, -4, -49, -17, 3, -123, 113}, new byte[]{-49, -17, -27, 57, 96, 77, -37, -41, -69, 78, 41, 104, 40, 36, -13, -92, 10, -50, -87, 49, -121, 103, 115, -36, -95, -23, -103, -5, -34, -34, 102, -108}, new byte[]{65, -72, -105, 4, 119, 75, -57, 60, 94, -107, 64, -20, 71, -38, 78, -70, -12, 58, 98, -57, 73, 53, -32, 78, -59, -20, -123, 87, -96, 41, -3, 1}, new byte[]{60, -85, -58, -33, 41, 99, 37, 119, -20, -99, -119, -88, 120, -109, -71, -90, -64, -4, 9, 53, -72, -12, 52, -114, 9, -1, -50, -34, 80, -41, -76, -38}, new byte[]{-108, -28, 5, 95, 111, 5, 54, 8, -108, -126, -72, 17, 49, 92, 38, 90, -24, -27, -117, -3, 121, -90, -8, -70, -120, 86, -21, -13, 10, 19, -55, 47}, new byte[]{99, Ascii.VT, -119, 115, 41, 3, 109, Ascii.CAN, 79, Ascii.ETB, 36, 65, 5, -38, -96, 96, -15, -4, -30, 80, -90, -111, 105, 6, -116, 43, -13, -53, Ascii.FS, 125, 47, 69}, new byte[]{120, -120, 85, 33, 33, Ascii.DC4, Byte.MIN_VALUE, -83, -47, -6, 116, -55, -7, 49, -43, -67, 63, -3, -44, Ascii.SO, -1, 44, -38, -101, 82, 56, -17, 7, -67, -66, 119, Ascii.FS}, new byte[]{-87, -66, 98, Ascii.SUB, 54, 112, -124, 73, 102, -29, 92, -73, 50, 110, -107, -9, -48, -62, 45, 62, 114, -58, -104, Ascii.US, -14, 4, -85, 117, -64, -101, -39, -11}, new byte[]{-116, 101, -11, 65, 61, 78, -103, -110, 107, 106, -93, -116, 37, -19, Ascii.CR, -49, 112, -51, 124, 74, -83, 106, -64, -105, 46, -71, -87, -96, Ascii.CAN, -74, -105, 117}, new byte[]{-3, -57, 122, Byte.MIN_VALUE, 58, 10, 48, -16, -72, -10, -8, Ascii.FF, -23, 7, Byte.MIN_VALUE, 113, 83, 61, -75, -30, 102, Ascii.DC4, -99, -15, -41, 17, -27, Ascii.SI, 51, 60, -85, 117}, new byte[]{-126, 2, 61, 94, -30, -107, -55, 117, 39, -74, -112, -18, 122, 56, 106, 56, 47, 4, 106, 96, -66, -87, -16, -90, 105, 126, Ascii.SI, -116, 48, -64, 5, -4}, new byte[]{115, 119, -40, 126, 71, Ascii.RS, 108, -119, -23, Ascii.FF, -105, 104, -22, 9, 107, 9, 39, 126, -69, Ascii.SUB, -3, -94, 59, -71, 61, 88, -94, -56, -65, -125, -101, -72}, new byte[]{81, Ascii.FS, Ascii.US, -78, 6, -123, -47, 33, -107, -21, -1, -7, -86, 110, 56, -75, 36, 111, 2, -34, -41, 104, 76, -11, -37, Ascii.DC4, 74, -76, -13, -22, 92, Ascii.ESC}, new byte[]{99, -44, 40, 80, 78, 85, -18, -100, -18, -14, 61, -51, 76, Ascii.SI, -15, 110, 104, 124, -13, 122, -53, -82, -8, -30, 118, -67, -100, -77, Ascii.NAK, -27, -28, -101}, new byte[]{-3, -90, -34, -75, 93, 9, -46, -24, 48, -43, 125, Ascii.EM, -10, -59, 116, -1, 83, 43, 100, 121, -71, -43, -90, 121, 60, -107, Ascii.FS, -41, -57, -98, 57, 98}, new byte[]{117, -94, 63, 92, Ascii.VT, 102, -8, 41, 49, 19, 40, 75, -120, -70, 65, -87, 110, 38, -57, -43, 47, 47, 53, 3, Ascii.VT, 108, -53, Ascii.FF, -36, -16, 61, 44}, new byte[]{Ascii.SUB, -121, -82, -110, 89, 61, 99, 110, Ascii.ESC, 70, 110, -107, 5, 69, -6, -5, 34, 116, -7, -82, 78, -122, 106, Ascii.RS, 95, -107, 50, -44, 56, 70, -83, 122}, new byte[]{-10, Ascii.CAN, Ascii.US, 56, 97, Ascii.US, 19, 108, Ascii.DC4, -108, -33, 41, -102, -99, 124, -55, 77, -65, 63, -8, -59, -85, 4, -66, -120, Ascii.SYN, 19, -61, -53, -36, Ascii.EM, 100}, new byte[]{121, -112, -29, -109, Ascii.SYN, 7, 95, -77, -49, -6, 94, -48, 119, -89, 0, 41, 104, 124, Ascii.ESC, -78, 111, -17, -115, Ascii.NAK, 79, 103, -111, 49, Ascii.ESC, 7, 71, -66}, new byte[]{Ascii.DC2, 70, Ascii.DC4, Ascii.ETB, -30, 101, 66, -101, Ascii.DEL, -85, 71, -127, 125, -38, -71, 86, 56, 52, -41, -22, Ascii.FF, -62, -72, Ascii.CR, -113, 113, 111, -75, -36, -38, 122, -88}, new byte[]{107, -60, Ascii.GS, 57, -23, -37, 125, 105, -54, 59, -14, 36, -116, Ascii.ESC, 62, -45, Ascii.ETB, -40, Ascii.SO, -21, -42, Ascii.CAN, 89, 124, 124, 72, -105, 34, 39, 64, 34, Ascii.DEL}));
        c = hashSet;
        d = new HashSet(Arrays.asList(new byte[]{-31, Ascii.SYN, 70, 111, 79, -32, 2, -109, -123, 102, -9, -78, 82, -104, 93, -75, -66, 97, 67, -7, 36, 124, 113, Ascii.VT, Ascii.DEL, -13, 105, -96, -62, -55, 5, 5}, new byte[]{-111, 87, 88, 79, 120, 2, 112, -52, -80, 83, -107, 8, 123, 7, 98, 120, 5, Byte.MIN_VALUE, -80, -2, 4, Ascii.DLE, -60, -123, -82, 93, -126, 77, -94, -117, -65, 34}, new byte[]{-18, -32, 96, -58, 63, Ascii.GS, 100, -71, 61, 51, -72, -120, -74, -9, 86, 63, -1, 10, 79, 86, -46, 97, 40, -104, 63, 126, 41, -15, -54, 33, 83, -110}, new byte[]{-122, -100, 104, -97, -82, -55, 45, 116, 82, 77, 50, 48, 101, -111, Ascii.FS, -40, 66, -68, 36, -115, 68, -79, -97, 71, 89, -125, 102, -4, -127, -62, -51, -67}, new byte[]{-125, -119, -99, -18, 60, -63, 107, -120, -66, 55, 109, -92, 93, -121, -124, -114, -25, -110, 108, 33, 40, -120, Ascii.DC4, 125, 92, -54, 51, 58, 100, -108, -83, 55}, new byte[]{Ascii.SYN, -45, 59, -105, -89, -1, -110, -93, -103, 17, -28, -98, -19, 100, 65, 55, Ascii.DC2, 61, -65, 112, 116, -98, -113, 109, 122, 125, -96, 59, Ascii.SUB, -80, 114, -80}, new byte[]{Ascii.DEL, 2, Ascii.DLE, 50, 83, -70, 57, 61, 63, 50, -83, 54, -71, -82, -104, 68, 17, -86, 104, 113, -26, 10, -101, -49, -99, 54, 35, -50, -54, -24, 17, 100}, new byte[]{-39, 77, -19, -9, 70, 37, -7, -74, -6, -109, 120, -124, 124, 47, -28, 106, -103, -102, -65, -46, 101, -122, Ascii.SYN, -126, 7, 52, -65, -25, -115, -61, 87, -37}, new byte[]{Ascii.CR, Ascii.US, -68, -114, -60, -100, 88, -43, -24, 88, -26, -127, -49, 34, Ascii.DC2, -122, -82, -19, -98, -77, 41, 71, 62, 111, 56, -101, Ascii.RS, 118, -124, 106, -122, -21}, new byte[]{-24, -34, -21, -60, 84, -125, -73, -31, -75, -109, 75, -32, -49, Ascii.DLE, -13, -33, -106, 121, -27, 0, -52, -22, -84, 110, 111, 94, 121, Ascii.SI, 106, -34, 52, 65}, new byte[]{-76, -124, 52, Ascii.FS, -120, 74, -3, -96, Ascii.NAK, -126, -54, -51, 55, -2, 55, -19, Ascii.SI, -34, 54, -89, Ascii.EM, Ascii.ETB, -120, 1, -31, 36, 17, -87, -18, Ascii.SYN, -59, -68}, new byte[]{6, -54, -126, -86, 8, 81, -8, 109, 65, 40, 74, -11, -26, -77, -47, 0, -59, -5, -94, 84, -83, 93, -108, 61, -24, 87, 126, 94, 119, 56, -21, -96}, new byte[]{-116, -77, -56, 118, Ascii.SUB, -119, -48, 109, 44, 121, 105, -127, -55, -66, -4, 57, 46, 33, 76, 40, -111, -97, Ascii.RS, -22, -15, -1, 38, -81, -22, 50, -119, -44}, new byte[]{Ascii.EM, -34, 51, Ascii.SI, 84, Ascii.SO, -18, 116, -75, 56, 102, 9, 116, 61, 124, -48, 110, 42, 55, -108, 45, -68, -26, Ascii.EM, 117, Ascii.ETB, 113, -47, -53, -97, 43, 48}));
        e = Collections.synchronizedSet(new HashSet(hashSet));
    }

    public static boolean a(String str) {
        byte[] bArr;
        CountDownLatch countDownLatch = a;
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            countDownLatch.countDown();
        }
        String lowerCase = str.trim().toLowerCase();
        if (Vj0.c == null) {
            try {
                Vj0.c = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e2) {
                e2.toString();
                bArr = new byte[0];
            }
        }
        bArr = Vj0.c.digest(lowerCase.getBytes(StandardCharsets.UTF_8));
        Vj0.c.reset();
        if (d.contains(bArr)) {
            return false;
        }
        Set set = e;
        if (set.contains(bArr)) {
            return true;
        }
        if (!b.matcher(lowerCase).find()) {
            return false;
        }
        set.add(bArr);
        return true;
    }
}
