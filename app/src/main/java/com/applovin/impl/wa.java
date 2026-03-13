package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class wa extends dk {
    public static final a b = new Fk0(12);
    private final a a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final int a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public wa() {
        this(null);
    }

    private static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static vh d(ah ahVar, int i) {
        byte[] bArr = new byte[i];
        ahVar.a(bArr, 0, i);
        int b2 = b(bArr, 0);
        return new vh(new String(bArr, 0, b2, "ISO-8859-1"), a(bArr, b2 + 1, i));
    }

    private static zn e(ah ahVar, int i) {
        if (i < 1) {
            return null;
        }
        int w = ahVar.w();
        String b2 = b(w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        int b3 = b(bArr, 0, w);
        String str = new String(bArr, 0, b3, b2);
        int a2 = b3 + a(w);
        return new zn("TXXX", str, a(bArr, a2, b(bArr, a2, w), b2));
    }

    private static up f(ah ahVar, int i) {
        if (i < 1) {
            return null;
        }
        int w = ahVar.w();
        String b2 = b(w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        int b3 = b(bArr, 0, w);
        String str = new String(bArr, 0, b3, b2);
        int a2 = b3 + a(w);
        return new up("WXXX", str, a(bArr, a2, b(bArr, a2), "ISO-8859-1"));
    }

    private static int g(ah ahVar, int i) {
        byte[] c = ahVar.c();
        int d = ahVar.d();
        int i2 = d;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < d + i) {
                if ((c[i2] & 255) == 255 && c[i3] == 0) {
                    System.arraycopy(c, i2 + 2, c, i3, (i - (i2 - d)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    public wa(a aVar) {
        this.a = aVar;
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return xp.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static f3 b(ah ahVar, int i, int i2, boolean z, int i3, a aVar) {
        int d = ahVar.d();
        int b2 = b(ahVar.c(), d);
        String str = new String(ahVar.c(), d, b2 - d, "ISO-8859-1");
        ahVar.f(b2 + 1);
        int w = ahVar.w();
        boolean z2 = (w & 2) != 0;
        boolean z3 = (w & 1) != 0;
        int w2 = ahVar.w();
        String[] strArr = new String[w2];
        for (int i4 = 0; i4 < w2; i4++) {
            int d2 = ahVar.d();
            int b3 = b(ahVar.c(), d2);
            strArr[i4] = new String(ahVar.c(), d2, b3 - d2, "ISO-8859-1");
            ahVar.f(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = d + i;
        while (ahVar.d() < i5) {
            xa a2 = a(i2, ahVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new f3(str, z2, z3, strArr, (xa[]) arrayList.toArray(new xa[0]));
    }

    private static Cif c(ah ahVar, int i) {
        int C = ahVar.C();
        int z = ahVar.z();
        int z2 = ahVar.z();
        int w = ahVar.w();
        int w2 = ahVar.w();
        zg zgVar = new zg();
        zgVar.a(ahVar);
        int i2 = ((i - 10) * 8) / (w + w2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a2 = zgVar.a(w);
            int a3 = zgVar.a(w2);
            iArr[i3] = a2;
            iArr2[i3] = a3;
        }
        return new Cif(C, z, z2, iArr, iArr2);
    }

    @Override // com.applovin.impl.dk
    public af a(df dfVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static v0 a(ah ahVar, int i, int i2) {
        int b2;
        String lowerCase;
        int w = ahVar.w();
        String b3 = b(w);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ahVar.a(bArr, 0, i3);
        if (i2 == 2) {
            lowerCase = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(lowerCase)) {
                lowerCase = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(bArr, 0);
            lowerCase = Ascii.toLowerCase(new String(bArr, 0, b2, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i4 = b2 + 2;
        int b4 = b(bArr, i4, w);
        return new v0(lowerCase, new String(bArr, i4, b4 - i4, b3), bArr[b2 + 1] & 255, a(bArr, b4 + a(w), i3));
    }

    private static up c(ah ahVar, int i, String str) {
        byte[] bArr = new byte[i];
        ahVar.a(bArr, 0, i);
        return new up(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static z9 b(ah ahVar, int i) {
        int w = ahVar.w();
        String b2 = b(w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        int b3 = b(bArr, 0);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i3 = b3 + 1;
        int b4 = b(bArr, i3, w);
        String a2 = a(bArr, i3, b4, b2);
        int a3 = b4 + a(w);
        int b5 = b(bArr, a3, w);
        return new z9(str, a2, a(bArr, a3, b5, b2), a(bArr, b5 + a(w), i2));
    }

    private static h2 a(ah ahVar, int i, String str) {
        byte[] bArr = new byte[i];
        ahVar.a(bArr, 0, i);
        return new h2(str, bArr);
    }

    private static e3 a(ah ahVar, int i, int i2, boolean z, int i3, a aVar) {
        int d = ahVar.d();
        int b2 = b(ahVar.c(), d);
        String str = new String(ahVar.c(), d, b2 - d, "ISO-8859-1");
        ahVar.f(b2 + 1);
        int j = ahVar.j();
        int j2 = ahVar.j();
        long y = ahVar.y();
        long j3 = y == KeyboardMap.kValueMask ? -1L : y;
        long y2 = ahVar.y();
        long j4 = y2 == KeyboardMap.kValueMask ? -1L : y2;
        ArrayList arrayList = new ArrayList();
        int i4 = d + i;
        while (ahVar.d() < i4) {
            xa a2 = a(i2, ahVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new e3(str, j, j2, j3, j4, (xa[]) arrayList.toArray(new xa[0]));
    }

    private static zn b(ah ahVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int w = ahVar.w();
        String b2 = b(w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        return new zn(str, null, new String(bArr, 0, b(bArr, 0, w), b2));
    }

    private static u3 a(ah ahVar, int i) {
        if (i < 4) {
            return null;
        }
        int w = ahVar.w();
        String b2 = b(w);
        byte[] bArr = new byte[3];
        ahVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ahVar.a(bArr2, 0, i2);
        int b3 = b(bArr2, 0, w);
        String str2 = new String(bArr2, 0, b3, b2);
        int a2 = b3 + a(w);
        return new u3(str, str2, a(bArr2, a2, b(bArr2, a2, w), b2));
    }

    private static String b(int i) {
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

    private static int b(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if ((b2 - i) % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x0193, code lost:
        if (r14 == 67) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.xa a(int r20, com.applovin.impl.ah r21, boolean r22, int r23, com.applovin.impl.wa.a r24) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.wa.a(int, com.applovin.impl.ah, boolean, int, com.applovin.impl.wa$a):com.applovin.impl.xa");
    }

    private static b a(ah ahVar) {
        boolean z = false;
        if (ahVar.a() < 10) {
            oc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int z2 = ahVar.z();
        if (z2 != 4801587) {
            oc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(z2))));
            return null;
        }
        int w = ahVar.w();
        ahVar.g(1);
        int w2 = ahVar.w();
        int v = ahVar.v();
        if (w == 2) {
            if ((w2 & 64) != 0) {
                oc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (w == 3) {
            if ((w2 & 64) != 0) {
                int j = ahVar.j();
                ahVar.g(j);
                v -= j + 4;
            }
        } else if (w != 4) {
            Kh0.i(w, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
            return null;
        } else {
            if ((w2 & 64) != 0) {
                int v2 = ahVar.v();
                ahVar.g(v2 - 4);
                v -= v2;
            }
            if ((w2 & 16) != 0) {
                v -= 10;
            }
        }
        if (w < 4 && (w2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z = true;
        }
        return new b(w, z, v);
    }

    private static String a(byte[] bArr, int i, int i2, String str) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, str);
        }
        return "";
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0079, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0087, code lost:
        if ((r10 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.applovin.impl.ah r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.d()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.j()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.y()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.C()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.z()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.z()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = 0
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.f(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4e
            r1.f(r2)
            return r6
        L4e:
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
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = 1
            goto L77
        L76:
            r3 = 0
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8a
            goto L8e
        L7c:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L8a
            goto L8e
        L8a:
            r4 = 0
            goto L8e
        L8c:
            r3 = 0
            goto L8a
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L9b
            r1.f(r2)
            return r6
        L9b:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La8
            r1.f(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.g(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.f(r2)
            return r4
        Lb2:
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.wa.a(com.applovin.impl.ah, int, int, boolean):boolean");
    }

    public af a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        ah ahVar = new ah(bArr, i);
        b a2 = a(ahVar);
        if (a2 == null) {
            return null;
        }
        int d = ahVar.d();
        int i2 = a2.a == 2 ? 6 : 10;
        int i3 = a2.c;
        if (a2.b) {
            i3 = g(ahVar, a2.c);
        }
        ahVar.e(d + i3);
        boolean z = false;
        if (!a(ahVar, a2.a, i2, false)) {
            if (a2.a != 4 || !a(ahVar, 4, i2, true)) {
                oc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a2.a);
                return null;
            }
            z = true;
        }
        while (ahVar.a() >= i2) {
            xa a3 = a(a2.a, ahVar, z, i2, this.a);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new af(arrayList);
    }
}
