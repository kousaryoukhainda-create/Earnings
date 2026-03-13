package com.fyber.inneractive.sdk.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.fyber.inneractive.sdk.protobuf.p1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class q1 {
    public static final b a;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(byte b) {
            return b >= 0;
        }

        public static boolean b(byte b) {
            return b < -32;
        }

        public static boolean c(byte b) {
            return b < -16;
        }

        public static boolean d(byte b) {
            return b > -65;
        }

        public static void a(byte b, byte b2, char[] cArr, int i) throws z {
            if (b >= -62 && !d(b2)) {
                cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & 63));
                return;
            }
            throw z.c();
        }

        public static void a(byte b, byte b2, byte b3, char[] cArr, int i) throws z {
            if (!d(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !d(b3)))) {
                cArr[i] = (char) (((b & Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
            throw z.c();
        }

        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws z {
            if (!d(b2)) {
                if ((((b2 + 112) + (b << Ascii.FS)) >> 30) == 0 && !d(b3) && !d(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                    return;
                }
            }
            throw z.c();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract int a(int i, byte[] bArr, int i2, int i3);

        public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        public final String a(ByteBuffer byteBuffer, int i, int i2) throws z {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = byteBuffer.get(i);
                    if (!a.a(b)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = byteBuffer.get(i);
                    if (a.a(b2)) {
                        cArr[i5] = (char) b2;
                        i5++;
                        i = i6;
                        while (i < i3) {
                            byte b3 = byteBuffer.get(i);
                            if (!a.a(b3)) {
                                break;
                            }
                            i++;
                            cArr[i5] = (char) b3;
                            i5++;
                        }
                    } else if (a.b(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.a(b2, byteBuffer.get(i6), cArr, i5);
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(b2)) {
                        if (i6 < i3 - 1) {
                            int i7 = i + 2;
                            i += 3;
                            a.a(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = byteBuffer.get(i6);
                        int i8 = i + 3;
                        i += 4;
                        a.a(b2, b4, byteBuffer.get(i + 2), byteBuffer.get(i8), cArr, i5);
                        i5 += 2;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        public abstract String a(byte[] bArr, int i, int i2) throws z;

        public abstract String b(ByteBuffer byteBuffer, int i, int i2) throws z;
    }

    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super(AbstractC0324Hi.d(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        b cVar;
        if (p1.g && p1.f && !com.fyber.inneractive.sdk.protobuf.d.a()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        a = cVar;
    }

    public static int a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean b(byte[] bArr, int i, int i2) {
        if (a.a(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr) {
        return a.a(0, bArr, 0, bArr.length) == 0;
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return a(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return a(b2, bArr[i]);
        }
        return a(b2);
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new d(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* loaded from: classes.dex */
    public static final class c extends b {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (r13[r14] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
            if (r13[r14] > (-65)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
            if (r13[r14] > (-65)) goto L48;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q1.c.a(int, byte[], int, int):int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String b(ByteBuffer byteBuffer, int i, int i2) throws z {
            return a(byteBuffer, i, i2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String a(byte[] bArr, int i, int i2) throws z {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!a.a(b)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (a.a(b2)) {
                        cArr[i5] = (char) b2;
                        i5++;
                        i = i6;
                        while (i < i3) {
                            byte b3 = bArr[i];
                            if (!a.a(b3)) {
                                break;
                            }
                            i++;
                            cArr[i5] = (char) b3;
                            i5++;
                        }
                    } else if (a.b(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.a(b2, bArr[i6], cArr, i5);
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(b2)) {
                        if (i6 < i3 - 1) {
                            int i7 = i + 2;
                            i += 3;
                            a.a(b2, bArr[i6], bArr[i7], cArr, i5);
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = bArr[i6];
                        int i8 = i + 3;
                        i += 4;
                        a.a(b2, b4, bArr[i + 2], bArr[i8], cArr, i5);
                        i5 += 2;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q1.c.a(java.lang.CharSequence, byte[], int, int):int");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (com.fyber.inneractive.sdk.protobuf.p1.a(r23, r9) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
            if (com.fyber.inneractive.sdk.protobuf.p1.a(r23, r9) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
            if (com.fyber.inneractive.sdk.protobuf.p1.a(r23, r9) > (-65)) goto L51;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(int r22, byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q1.e.a(int, byte[], int, int):int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String b(ByteBuffer byteBuffer, int i, int i2) throws z {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                long a = p1.a(byteBuffer) + i;
                long j = i2 + a;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (a < j) {
                    byte a2 = p1.e.a(a);
                    if (!a.a(a2)) {
                        break;
                    }
                    a++;
                    cArr[i3] = (char) a2;
                    i3++;
                }
                while (a < j) {
                    long j2 = a + 1;
                    p1.d dVar = p1.e;
                    byte a3 = dVar.a(a);
                    if (a.a(a3)) {
                        cArr[i3] = (char) a3;
                        i3++;
                        a = j2;
                        while (a < j) {
                            byte a4 = p1.e.a(a);
                            if (!a.a(a4)) {
                                break;
                            }
                            a++;
                            cArr[i3] = (char) a4;
                            i3++;
                        }
                    } else if (a.b(a3)) {
                        if (j2 < j) {
                            a += 2;
                            a.a(a3, dVar.a(j2), cArr, i3);
                            i3++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(a3)) {
                        if (j2 < j - 1) {
                            long j3 = a + 2;
                            a += 3;
                            a.a(a3, dVar.a(j2), dVar.a(j3), cArr, i3);
                            i3++;
                        } else {
                            throw z.c();
                        }
                    } else if (j2 < j - 2) {
                        long j4 = a + 3;
                        a += 4;
                        a.a(a3, dVar.a(j2), dVar.a(a + 2), dVar.a(j4), cArr, i3);
                        i3 += 2;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i3);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String a(byte[] bArr, int i, int i2) throws z {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte a = p1.a(bArr, i);
                    if (!a.a(a)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) a;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte a2 = p1.a(bArr, i);
                    if (a.a(a2)) {
                        cArr[i5] = (char) a2;
                        i5++;
                        i = i6;
                        while (i < i3) {
                            byte a3 = p1.a(bArr, i);
                            if (!a.a(a3)) {
                                break;
                            }
                            i++;
                            cArr[i5] = (char) a3;
                            i5++;
                        }
                    } else if (a.b(a2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.a(a2, p1.a(bArr, i6), cArr, i5);
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(a2)) {
                        if (i6 < i3 - 1) {
                            int i7 = i + 2;
                            i += 3;
                            a.a(a2, p1.a(bArr, i6), p1.a(bArr, i7), cArr, i5);
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i8 = i + 3;
                        i += 4;
                        a.a(a2, p1.a(bArr, i6), p1.a(bArr, i + 2), p1.a(bArr, i8), cArr, i5);
                        i5 += 2;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            String str;
            String str2;
            int i3;
            long j2;
            long j3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                p1.a(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= 128 || j4 >= j5) {
                    if (charAt2 >= 2048 || j4 > j5 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                            if (j4 <= j5 - 4) {
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char charAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j2 = 1;
                                        p1.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                        j3 = j5;
                                        p1.a(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j6 = j4 + 3;
                                        p1.a(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        j4 += 4;
                                        p1.a(bArr, j6, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        i4 = i5;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                throw new d(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new d(i4, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j4);
                            }
                        }
                        p1.a(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j7 = j4 + 2;
                        p1.a(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        j4 += 3;
                        p1.a(bArr, j7, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j8 = j4 + j;
                        p1.a(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        p1.a(bArr, j8, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    }
                    j3 = j5;
                    j2 = 1;
                } else {
                    p1.a(bArr, j4, (byte) charAt2);
                    j3 = j5;
                    str2 = str4;
                    j2 = j;
                    j4 += j;
                    str = str3;
                }
                i4++;
                str3 = str;
                str4 = str2;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        public static int a(byte[] bArr, int i, long j, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return q1.a(i, p1.a(bArr, j), p1.a(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return q1.a(i, p1.a(bArr, j));
            }
            return q1.a(i);
        }
    }
}
