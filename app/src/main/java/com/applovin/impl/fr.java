package com.applovin.impl;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class fr {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static void b(cr crVar) {
        int a2 = crVar.a(6) + 1;
        for (int i = 0; i < a2; i++) {
            int a3 = crVar.a(16);
            if (a3 == 0) {
                crVar.b(8);
                crVar.b(16);
                crVar.b(16);
                crVar.b(6);
                crVar.b(8);
                int a4 = crVar.a(4) + 1;
                for (int i2 = 0; i2 < a4; i2++) {
                    crVar.b(8);
                }
            } else if (a3 != 1) {
                throw ch.a("floor type greater than 1 not decodable: " + a3, null);
            } else {
                int a5 = crVar.a(5);
                int[] iArr = new int[a5];
                int i3 = -1;
                for (int i4 = 0; i4 < a5; i4++) {
                    int a6 = crVar.a(4);
                    iArr[i4] = a6;
                    if (a6 > i3) {
                        i3 = a6;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = crVar.a(3) + 1;
                    int a7 = crVar.a(2);
                    if (a7 > 0) {
                        crVar.b(8);
                    }
                    for (int i7 = 0; i7 < (1 << a7); i7++) {
                        crVar.b(8);
                    }
                }
                crVar.b(2);
                int a8 = crVar.a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < a5; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        crVar.b(a8);
                        i9++;
                    }
                }
            }
        }
    }

    private static c[] c(cr crVar) {
        int a2 = crVar.a(6) + 1;
        c[] cVarArr = new c[a2];
        for (int i = 0; i < a2; i++) {
            cVarArr[i] = new c(crVar.c(), crVar.a(16), crVar.a(16), crVar.a(8));
        }
        return cVarArr;
    }

    private static void d(cr crVar) {
        int i;
        int a2 = crVar.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            if (crVar.a(16) <= 2) {
                crVar.b(24);
                crVar.b(24);
                crVar.b(24);
                int a3 = crVar.a(6) + 1;
                crVar.b(8);
                int[] iArr = new int[a3];
                for (int i3 = 0; i3 < a3; i3++) {
                    int a4 = crVar.a(3);
                    if (crVar.c()) {
                        i = crVar.a(5);
                    } else {
                        i = 0;
                    }
                    iArr[i3] = (i * 8) + a4;
                }
                for (int i4 = 0; i4 < a3; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        if ((iArr[i4] & (1 << i5)) != 0) {
                            crVar.b(8);
                        }
                    }
                }
            } else {
                throw ch.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    private static long a(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    private static a a(cr crVar) {
        if (crVar.a(24) == 5653314) {
            int a2 = crVar.a(16);
            int a3 = crVar.a(24);
            long[] jArr = new long[a3];
            boolean c2 = crVar.c();
            long j = 0;
            if (!c2) {
                boolean c3 = crVar.c();
                for (int i = 0; i < a3; i++) {
                    if (c3) {
                        if (crVar.c()) {
                            jArr[i] = crVar.a(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = crVar.a(5) + 1;
                    }
                }
            } else {
                int a4 = crVar.a(5) + 1;
                int i2 = 0;
                while (i2 < a3) {
                    int a5 = crVar.a(a(a3 - i2));
                    for (int i3 = 0; i3 < a5 && i2 < a3; i3++) {
                        jArr[i2] = a4;
                        i2++;
                    }
                    a4++;
                }
            }
            int a6 = crVar.a(4);
            if (a6 <= 2) {
                if (a6 == 1 || a6 == 2) {
                    crVar.b(32);
                    crVar.b(32);
                    int a7 = crVar.a(4) + 1;
                    crVar.b(1);
                    if (a6 != 1) {
                        j = a3 * a2;
                    } else if (a2 != 0) {
                        j = a(a3, a2);
                    }
                    crVar.b((int) (j * a7));
                }
                return new a(a2, a3, jArr, a6, c2);
            }
            throw ch.a("lookup type greater than 2 not decodable: " + a6, null);
        }
        throw ch.a("expected code book to start with [0x56, 0x43, 0x42] at " + crVar.b(), null);
    }

    public static d b(ah ahVar) {
        a(1, ahVar, false);
        int q = ahVar.q();
        int w = ahVar.w();
        int q2 = ahVar.q();
        int m = ahVar.m();
        if (m <= 0) {
            m = -1;
        }
        int m2 = ahVar.m();
        if (m2 <= 0) {
            m2 = -1;
        }
        int m3 = ahVar.m();
        if (m3 <= 0) {
            m3 = -1;
        }
        int w2 = ahVar.w();
        return new d(q, w, q2, m, m2, m3, (int) Math.pow(2.0d, w2 & 15), (int) Math.pow(2.0d, (w2 & 240) >> 4), (ahVar.w() & 1) > 0, Arrays.copyOf(ahVar.c(), ahVar.e()));
    }

    private static void a(int i, cr crVar) {
        int a2 = crVar.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = crVar.a(16);
            if (a3 != 0) {
                oc.b("VorbisUtil", "mapping type other than 0 not supported: " + a3);
            } else {
                int a4 = crVar.c() ? crVar.a(4) + 1 : 1;
                if (crVar.c()) {
                    int a5 = crVar.a(8) + 1;
                    for (int i3 = 0; i3 < a5; i3++) {
                        int i4 = i - 1;
                        crVar.b(a(i4));
                        crVar.b(a(i4));
                    }
                }
                if (crVar.a(2) != 0) {
                    throw ch.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (a4 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        crVar.b(4);
                    }
                }
                for (int i6 = 0; i6 < a4; i6++) {
                    crVar.b(8);
                    crVar.b(8);
                    crVar.b(8);
                }
            }
        }
    }

    public static b a(ah ahVar) {
        return a(ahVar, true, true);
    }

    public static b a(ah ahVar, boolean z, boolean z2) {
        if (z) {
            a(3, ahVar, false);
        }
        String c2 = ahVar.c((int) ahVar.p());
        int length = c2.length();
        long p = ahVar.p();
        String[] strArr = new String[(int) p];
        int i = length + 15;
        for (int i2 = 0; i2 < p; i2++) {
            String c3 = ahVar.c((int) ahVar.p());
            strArr[i2] = c3;
            i = i + 4 + c3.length();
        }
        if (z2 && (ahVar.w() & 1) == 0) {
            throw ch.a("framing bit expected to be set", null);
        }
        return new b(c2, strArr, i + 1);
    }

    public static c[] a(ah ahVar, int i) {
        a(5, ahVar, false);
        int w = ahVar.w() + 1;
        cr crVar = new cr(ahVar.c());
        crVar.b(ahVar.d() * 8);
        for (int i2 = 0; i2 < w; i2++) {
            a(crVar);
        }
        int a2 = crVar.a(6) + 1;
        for (int i3 = 0; i3 < a2; i3++) {
            if (crVar.a(16) != 0) {
                throw ch.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(crVar);
        d(crVar);
        a(i, crVar);
        c[] c2 = c(crVar);
        if (crVar.c()) {
            return c2;
        }
        throw ch.a("framing bit after modes not set as expected", null);
    }

    public static boolean a(int i, ah ahVar, boolean z) {
        if (ahVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ch.a("too short header: " + ahVar.a(), null);
        } else if (ahVar.w() != i) {
            if (z) {
                return false;
            }
            throw ch.a("expected header type " + Integer.toHexString(i), null);
        } else if (ahVar.w() == 118 && ahVar.w() == 111 && ahVar.w() == 114 && ahVar.w() == 98 && ahVar.w() == 105 && ahVar.w() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ch.a("expected characters 'vorbis'", null);
        }
    }
}
