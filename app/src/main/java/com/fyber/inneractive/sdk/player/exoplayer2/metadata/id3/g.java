package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import io.flutter.embedding.android.KeyboardMap;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class g {
    public static final int b = u.a("ID3");
    public final a a;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public g() {
        this(null);
    }

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static d b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = kVar.b;
        int b2 = b(kVar.a, i4);
        String str = new String(kVar.a, i4, b2 - i4, "ISO-8859-1");
        kVar.e(b2 + 1);
        int l = kVar.l();
        boolean z2 = (l & 2) != 0;
        boolean z3 = (l & 1) != 0;
        int l2 = kVar.l();
        String[] strArr = new String[l2];
        for (int i5 = 0; i5 < l2; i5++) {
            int i6 = kVar.b;
            int b3 = b(kVar.a, i6);
            strArr[i5] = new String(kVar.a, i6, b3 - i6, "ISO-8859-1");
            kVar.e(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kVar.b < i7) {
            h a2 = a(i2, kVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z2, z3, strArr, hVarArr);
    }

    public static k c(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i);
        kVar.b += i;
        return new k(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    public static j d(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        String str;
        if (i < 1) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        int a2 = a(bArr, 0, l);
        String str2 = new String(bArr, 0, a2, b2);
        int a3 = a(l) + a2;
        if (a3 < i2) {
            str = new String(bArr, a3, a(bArr, a3, l) - a3, b2);
        } else {
            str = "";
        }
        return new j("TXXX", str2, str);
    }

    public static k e(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        String str;
        if (i < 1) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        int a2 = a(bArr, 0, l);
        String str2 = new String(bArr, 0, a2, b2);
        int a3 = a(l) + a2;
        if (a3 < i2) {
            str = new String(bArr, a3, b(bArr, a3) - a3, "ISO-8859-1");
        } else {
            str = "";
        }
        return new k("WXXX", str2, str);
    }

    public static int f(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) {
        byte[] bArr = kVar.a;
        int i2 = kVar.b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < i) {
                if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                    System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    public g(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.a a(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(byte[], int):com.fyber.inneractive.sdk.player.exoplayer2.metadata.a");
    }

    public static i c(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArr2 = new byte[i];
        System.arraycopy(kVar.a, kVar.b, bArr2, 0, i);
        kVar.b += i;
        int b2 = b(bArr2, 0);
        String str = new String(bArr2, 0, b2, "ISO-8859-1");
        int i2 = b2 + 1;
        if (i2 < i) {
            bArr = Arrays.copyOfRange(bArr2, i2, i);
        } else {
            bArr = new byte[0];
        }
        return new i(str, bArr);
    }

    public static j b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        return new j(str, null, new String(bArr, 0, a(bArr, 0, l), b2));
    }

    public static f b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        int b3 = b(bArr, 0);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i3 = b3 + 1;
        int a2 = a(bArr, i3, l);
        String str2 = new String(bArr, i3, a2 - i3, b2);
        int a3 = a(l) + a2;
        int a4 = a(bArr, a3, l);
        return new f(str, str2, new String(bArr, a3, a4 - a3, b2), Arrays.copyOfRange(bArr, a(l) + a4, i2));
    }

    public static String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "ISO-8859-1";
                }
                return "UTF-8";
            }
            return "UTF-16BE";
        }
        return "UTF-16";
    }

    public static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static c a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = kVar.b;
        int b2 = b(kVar.a, i4);
        String str = new String(kVar.a, i4, b2 - i4, "ISO-8859-1");
        kVar.e(b2 + 1);
        int c = kVar.c();
        int c2 = kVar.c();
        long m = kVar.m();
        long j = m == KeyboardMap.kValueMask ? -1L : m;
        long m2 = kVar.m();
        long j2 = m2 == KeyboardMap.kValueMask ? -1L : m2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kVar.b < i5) {
            h a2 = a(i2, kVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, c, c2, j, j2, hVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        if ((r10 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.c()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.m()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.q()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.n()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.n()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = 0
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.e(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.e(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = 1
            goto L75
        L74:
            r3 = 0
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L88
            goto L8c
        L7a:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L88
            goto L8c
        L88:
            r4 = 0
            goto L8c
        L8a:
            r3 = 0
            goto L88
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L99
            r1.e(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La6
            r1.e(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.f(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.e(r2)
            return r4
        Lb0:
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0187, code lost:
        if (r12 == 67) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h a(int r20, com.fyber.inneractive.sdk.player.exoplayer2.util.k r21, boolean r22, int r23, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a r24) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.k, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2) throws UnsupportedEncodingException {
        int b2;
        String lowerCase;
        int l = kVar.l();
        String b3 = b(l);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i3);
        kVar.b += i3;
        if (i2 == 2) {
            lowerCase = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.equals("image/jpg")) {
                lowerCase = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(bArr, 0);
            lowerCase = new String(bArr, 0, b2, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i4 = b2 + 2;
        int a2 = a(bArr, i4, l);
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a(lowerCase, new String(bArr, i4, a2 - i4, b3), bArr[b2 + 1] & 255, Arrays.copyOfRange(bArr, a(l) + a2, i3));
    }

    public static e a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        String str;
        if (i < 4) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        byte[] bArr = new byte[3];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, 3);
        kVar.b += 3;
        String str2 = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr2, 0, i2);
        kVar.b += i2;
        int a2 = a(bArr2, 0, l);
        String str3 = new String(bArr2, 0, a2, b2);
        int a3 = a(l) + a2;
        if (a3 < i2) {
            str = new String(bArr2, a3, a(bArr2, a3, l) - a3, b2);
        } else {
            str = "";
        }
        return new e(str2, str3, str);
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i);
        kVar.b += i;
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b(str, bArr);
    }

    public static String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int a(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if (b2 % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }
}
