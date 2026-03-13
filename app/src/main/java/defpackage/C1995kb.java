package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: kb  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1995kb implements InterfaceC2511qb, InterfaceC2425pb, Cloneable, ByteChannel {
    public C2765tZ b;
    public long c;

    public final void A(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        B(source, 0, source.length);
    }

    public final void B(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        AbstractC2870uj.j(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2765tZ y = y(1);
            int min = Math.min(i3 - i, 8192 - y.c);
            int i4 = i + min;
            C2043l5.c(source, y.c, y.a, i, i4);
            y.c += min;
            i = i4;
        }
        this.c += j;
    }

    public final void C(int i) {
        C2765tZ y = y(1);
        int i2 = y.c;
        y.c = i2 + 1;
        y.a[i2] = (byte) i;
        this.c++;
    }

    public final void D(long j) {
        if (j == 0) {
            C(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C2765tZ y = y(i);
        int i2 = y.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            y.a[i3] = AbstractC1232e.a[(int) (15 & j)];
            j >>>= 4;
        }
        y.c += i;
        this.c += i;
    }

    public final void E(int i, int i2, String string) {
        char charAt;
        char c;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= string.length()) {
                    while (i < i2) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            C2765tZ y = y(1);
                            int i3 = y.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            byte[] bArr = y.a;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = string.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = y.c;
                            int i6 = (i3 + i) - i5;
                            y.c = i5 + i6;
                            this.c += i6;
                        } else {
                            if (charAt2 < 2048) {
                                C2765tZ y2 = y(2);
                                int i7 = y2.c;
                                byte[] bArr2 = y2.a;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                                y2.c = i7 + 2;
                                this.c += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = string.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    C2765tZ y3 = y(4);
                                    int i10 = y3.c;
                                    byte[] bArr3 = y3.a;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                    y3.c = i10 + 4;
                                    this.c += 4;
                                    i += 2;
                                } else {
                                    C(63);
                                    i = i8;
                                }
                            } else {
                                C2765tZ y4 = y(3);
                                int i11 = y4.c;
                                byte[] bArr4 = y4.a;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                                y4.c = i11 + 3;
                                this.c += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder i12 = AbstractC0324Hi.i(i2, "endIndex > string.length: ", " > ");
                i12.append(string.length());
                throw new IllegalArgumentException(i12.toString().toString());
            }
            throw new IllegalArgumentException(AbstractC0324Hi.d(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        throw new IllegalArgumentException(AbstractC0324Hi.e(i, "beginIndex < 0: ").toString());
    }

    public final void F(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        E(0, string.length(), string);
    }

    public final void G(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            C(i);
        } else if (i < 2048) {
            C2765tZ y = y(2);
            int i3 = y.c;
            byte[] bArr = y.a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            y.c = i3 + 2;
            this.c += 2;
        } else if (55296 <= i && i < 57344) {
            C(63);
        } else if (i < 65536) {
            C2765tZ y2 = y(3);
            int i4 = y2.c;
            byte[] bArr2 = y2.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr2[2 + i4] = (byte) ((i & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            y2.c = i4 + 3;
            this.c += 3;
        } else if (i <= 1114111) {
            C2765tZ y3 = y(4);
            int i5 = y3.c;
            byte[] bArr3 = y3.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[3 + i5] = (byte) ((i & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            y3.c = i5 + 4;
            this.c += 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            if (i != 0) {
                char[] cArr = AbstractC1281eb.a;
                char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i2 < 8 && cArr2[i2] == '0') {
                    i2++;
                }
                Intrinsics.checkNotNullParameter(cArr2, "<this>");
                if (i2 >= 0) {
                    if (i2 <= 8) {
                        str = new String(cArr2, i2, 8 - i2);
                    } else {
                        throw new IllegalArgumentException(AbstractC2437ph.c(i2, "startIndex: ", " > endIndex: 8"));
                    }
                } else {
                    throw new IndexOutOfBoundsException(AbstractC2437ph.c(i2, "startIndex: ", ", endIndex: 8, size: 8"));
                }
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean a() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final byte c(long j) {
        AbstractC2870uj.j(this.c, j, 1L);
        C2765tZ c2765tZ = this.b;
        if (c2765tZ != null) {
            long j2 = this.c;
            if (j2 - j < j) {
                while (j2 > j) {
                    c2765tZ = c2765tZ.g;
                    Intrinsics.b(c2765tZ);
                    j2 -= c2765tZ.c - c2765tZ.b;
                }
                return c2765tZ.a[(int) ((c2765tZ.b + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = c2765tZ.c;
                int i2 = c2765tZ.b;
                long j4 = (i - i2) + j3;
                if (j4 <= j) {
                    c2765tZ = c2765tZ.f;
                    Intrinsics.b(c2765tZ);
                    j3 = j4;
                } else {
                    return c2765tZ.a[(int) ((i2 + j) - j3)];
                }
            }
        } else {
            Intrinsics.b(null);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kb, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.c != 0) {
            C2765tZ c2765tZ = this.b;
            Intrinsics.b(c2765tZ);
            C2765tZ c = c2765tZ.c();
            obj.b = c;
            c.g = c;
            c.f = c;
            for (C2765tZ c2765tZ2 = c2765tZ.f; c2765tZ2 != c2765tZ; c2765tZ2 = c2765tZ2.f) {
                C2765tZ c2765tZ3 = c.g;
                Intrinsics.b(c2765tZ3);
                Intrinsics.b(c2765tZ2);
                c2765tZ3.b(c2765tZ2.c());
            }
            obj.c = this.c;
        }
        return obj;
    }

    @Override // defpackage.InterfaceC0817a30
    public final long d(long j, C1995kb sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            sink.r(j, this);
            return j;
        }
        throw new IllegalArgumentException(BK.l(j, "byteCount < 0: ").toString());
    }

    public final long e(C0343Ib targetBytes) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        C2765tZ c2765tZ = this.b;
        if (c2765tZ == null) {
            return -1L;
        }
        long j = this.c;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                c2765tZ = c2765tZ.g;
                Intrinsics.b(c2765tZ);
                j -= c2765tZ.c - c2765tZ.b;
            }
            byte[] bArr = targetBytes.b;
            if (bArr.length == 2) {
                byte b = bArr[0];
                byte b2 = bArr[1];
                while (j < this.c) {
                    i = (int) ((c2765tZ.b + j2) - j);
                    int i3 = c2765tZ.c;
                    while (i < i3) {
                        byte b3 = c2765tZ.a[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        i2 = c2765tZ.b;
                    }
                    j2 = j + (c2765tZ.c - c2765tZ.b);
                    c2765tZ = c2765tZ.f;
                    Intrinsics.b(c2765tZ);
                    j = j2;
                }
                return -1L;
            }
            while (j < this.c) {
                i = (int) ((c2765tZ.b + j2) - j);
                int i4 = c2765tZ.c;
                while (i < i4) {
                    byte b4 = c2765tZ.a[i];
                    for (byte b5 : bArr) {
                        if (b4 == b5) {
                            i2 = c2765tZ.b;
                        }
                    }
                    i++;
                }
                j2 = j + (c2765tZ.c - c2765tZ.b);
                c2765tZ = c2765tZ.f;
                Intrinsics.b(c2765tZ);
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (c2765tZ.c - c2765tZ.b) + j;
            if (j3 > 0) {
                break;
            }
            c2765tZ = c2765tZ.f;
            Intrinsics.b(c2765tZ);
            j = j3;
        }
        byte[] bArr2 = targetBytes.b;
        if (bArr2.length == 2) {
            byte b6 = bArr2[0];
            byte b7 = bArr2[1];
            while (j < this.c) {
                i = (int) ((c2765tZ.b + j2) - j);
                int i5 = c2765tZ.c;
                while (i < i5) {
                    byte b8 = c2765tZ.a[i];
                    if (b8 != b6 && b8 != b7) {
                        i++;
                    }
                    i2 = c2765tZ.b;
                }
                j2 = j + (c2765tZ.c - c2765tZ.b);
                c2765tZ = c2765tZ.f;
                Intrinsics.b(c2765tZ);
                j = j2;
            }
            return -1L;
        }
        while (j < this.c) {
            i = (int) ((c2765tZ.b + j2) - j);
            int i6 = c2765tZ.c;
            while (i < i6) {
                byte b9 = c2765tZ.a[i];
                for (byte b10 : bArr2) {
                    if (b9 == b10) {
                        i2 = c2765tZ.b;
                    }
                }
                i++;
            }
            j2 = j + (c2765tZ.c - c2765tZ.b);
            c2765tZ = c2765tZ.f;
            Intrinsics.b(c2765tZ);
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1995kb) {
                long j = this.c;
                C1995kb c1995kb = (C1995kb) obj;
                if (j == c1995kb.c) {
                    if (j != 0) {
                        C2765tZ c2765tZ = this.b;
                        Intrinsics.b(c2765tZ);
                        C2765tZ c2765tZ2 = c1995kb.b;
                        Intrinsics.b(c2765tZ2);
                        int i = c2765tZ.b;
                        int i2 = c2765tZ2.b;
                        long j2 = 0;
                        while (j2 < this.c) {
                            long min = Math.min(c2765tZ.c - i, c2765tZ2.c - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                byte b = c2765tZ.a[i];
                                int i4 = i2 + 1;
                                if (b == c2765tZ2.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == c2765tZ.c) {
                                C2765tZ c2765tZ3 = c2765tZ.f;
                                Intrinsics.b(c2765tZ3);
                                i = c2765tZ3.b;
                                c2765tZ = c2765tZ3;
                            }
                            if (i2 == c2765tZ2.c) {
                                c2765tZ2 = c2765tZ2.f;
                                Intrinsics.b(c2765tZ2);
                                i2 = c2765tZ2.b;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC0817a30
    public final G60 g() {
        return G60.d;
    }

    public final boolean h(C0343Ib bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.b.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (length < 0 || this.c < length) {
            return false;
        }
        byte[] bArr = bytes.b;
        if (bArr.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (c(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C2765tZ c2765tZ = this.b;
        if (c2765tZ == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2765tZ.c;
            for (int i3 = c2765tZ.b; i3 < i2; i3++) {
                i = (i * 31) + c2765tZ.a[i3];
            }
            c2765tZ = c2765tZ.f;
            Intrinsics.b(c2765tZ);
        } while (c2765tZ != this.b);
        return i;
    }

    public final byte i() {
        if (this.c != 0) {
            C2765tZ c2765tZ = this.b;
            Intrinsics.b(c2765tZ);
            int i = c2765tZ.b;
            int i2 = c2765tZ.c;
            int i3 = i + 1;
            byte b = c2765tZ.a[i];
            this.c--;
            if (i3 == i2) {
                this.b = c2765tZ.a();
                BZ.a(c2765tZ);
            } else {
                c2765tZ.b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.c >= j) {
                byte[] bArr = new byte[(int) j];
                l(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(BK.l(j, "byteCount: ").toString());
    }

    public final C0343Ib k(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.c >= j) {
                if (j >= 4096) {
                    C0343Ib x = x((int) j);
                    w(j);
                    return x;
                }
                return new C0343Ib(j(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(BK.l(j, "byteCount: ").toString());
    }

    public final void l(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public final int m() {
        if (this.c >= 4) {
            C2765tZ c2765tZ = this.b;
            Intrinsics.b(c2765tZ);
            int i = c2765tZ.b;
            int i2 = c2765tZ.c;
            if (i2 - i < 4) {
                return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
            }
            byte[] bArr = c2765tZ.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = i3 | ((bArr[i + 2] & 255) << 8) | (bArr[i4] & 255);
            this.c -= 4;
            if (i5 == i2) {
                this.b = c2765tZ.a();
                BZ.a(c2765tZ);
            } else {
                c2765tZ.b = i5;
            }
            return i6;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC2425pb
    public final /* bridge */ /* synthetic */ InterfaceC2425pb n(String str) {
        F(str);
        return this;
    }

    public final short p() {
        if (this.c >= 2) {
            C2765tZ c2765tZ = this.b;
            Intrinsics.b(c2765tZ);
            int i = c2765tZ.b;
            int i2 = c2765tZ.c;
            if (i2 - i < 2) {
                return (short) (((i() & 255) << 8) | (i() & 255));
            }
            int i3 = i + 1;
            byte[] bArr = c2765tZ.a;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.c -= 2;
            if (i4 == i2) {
                this.b = c2765tZ.a();
                BZ.a(c2765tZ);
            } else {
                c2765tZ.b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    public final short q() {
        short p = p();
        return (short) (((p & 255) << 8) | ((65280 & p) >>> 8));
    }

    @Override // defpackage.E20
    public final void r(long j, C1995kb source) {
        C2765tZ c2765tZ;
        C2765tZ c2765tZ2;
        C2765tZ b;
        int i;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            AbstractC2870uj.j(source.c, 0L, j);
            while (j > 0) {
                C2765tZ c2765tZ3 = source.b;
                Intrinsics.b(c2765tZ3);
                int i2 = c2765tZ3.c;
                Intrinsics.b(source.b);
                int i3 = 0;
                if (j < i2 - c2765tZ.b) {
                    C2765tZ c2765tZ4 = this.b;
                    if (c2765tZ4 != null) {
                        c2765tZ2 = c2765tZ4.g;
                    } else {
                        c2765tZ2 = null;
                    }
                    if (c2765tZ2 != null && c2765tZ2.e) {
                        long j2 = c2765tZ2.c + j;
                        if (c2765tZ2.d) {
                            i = 0;
                        } else {
                            i = c2765tZ2.b;
                        }
                        if (j2 - i <= 8192) {
                            C2765tZ c2765tZ5 = source.b;
                            Intrinsics.b(c2765tZ5);
                            c2765tZ5.d(c2765tZ2, (int) j);
                            source.c -= j;
                            this.c += j;
                            return;
                        }
                    }
                    C2765tZ c2765tZ6 = source.b;
                    Intrinsics.b(c2765tZ6);
                    int i4 = (int) j;
                    if (i4 > 0 && i4 <= c2765tZ6.c - c2765tZ6.b) {
                        if (i4 >= 1024) {
                            b = c2765tZ6.c();
                        } else {
                            b = BZ.b();
                            int i5 = c2765tZ6.b;
                            C2043l5.c(c2765tZ6.a, 0, b.a, i5, i5 + i4);
                        }
                        b.c = b.b + i4;
                        c2765tZ6.b += i4;
                        C2765tZ c2765tZ7 = c2765tZ6.g;
                        Intrinsics.b(c2765tZ7);
                        c2765tZ7.b(b);
                        source.b = b;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C2765tZ c2765tZ8 = source.b;
                Intrinsics.b(c2765tZ8);
                long j3 = c2765tZ8.c - c2765tZ8.b;
                source.b = c2765tZ8.a();
                C2765tZ c2765tZ9 = this.b;
                if (c2765tZ9 == null) {
                    this.b = c2765tZ8;
                    c2765tZ8.g = c2765tZ8;
                    c2765tZ8.f = c2765tZ8;
                } else {
                    C2765tZ c2765tZ10 = c2765tZ9.g;
                    Intrinsics.b(c2765tZ10);
                    c2765tZ10.b(c2765tZ8);
                    C2765tZ c2765tZ11 = c2765tZ8.g;
                    if (c2765tZ11 != c2765tZ8) {
                        Intrinsics.b(c2765tZ11);
                        if (c2765tZ11.e) {
                            int i6 = c2765tZ8.c - c2765tZ8.b;
                            C2765tZ c2765tZ12 = c2765tZ8.g;
                            Intrinsics.b(c2765tZ12);
                            int i7 = 8192 - c2765tZ12.c;
                            C2765tZ c2765tZ13 = c2765tZ8.g;
                            Intrinsics.b(c2765tZ13);
                            if (!c2765tZ13.d) {
                                C2765tZ c2765tZ14 = c2765tZ8.g;
                                Intrinsics.b(c2765tZ14);
                                i3 = c2765tZ14.b;
                            }
                            if (i6 <= i7 + i3) {
                                C2765tZ c2765tZ15 = c2765tZ8.g;
                                Intrinsics.b(c2765tZ15);
                                c2765tZ8.d(c2765tZ15, i6);
                                c2765tZ8.a();
                                BZ.a(c2765tZ8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.c -= j3;
                this.c += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C2765tZ c2765tZ = this.b;
        if (c2765tZ == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c2765tZ.c - c2765tZ.b);
        sink.put(c2765tZ.a, c2765tZ.b, min);
        int i = c2765tZ.b + min;
        c2765tZ.b = i;
        this.c -= min;
        if (i == c2765tZ.c) {
            this.b = c2765tZ.a();
            BZ.a(c2765tZ);
        }
        return min;
    }

    public final String s(long j, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.c >= j) {
                if (i == 0) {
                    return "";
                }
                C2765tZ c2765tZ = this.b;
                Intrinsics.b(c2765tZ);
                int i2 = c2765tZ.b;
                if (i2 + j > c2765tZ.c) {
                    return new String(j(j), charset);
                }
                int i3 = (int) j;
                String str = new String(c2765tZ.a, i2, i3, charset);
                int i4 = c2765tZ.b + i3;
                c2765tZ.b = i4;
                this.c -= j;
                if (i4 == c2765tZ.c) {
                    this.b = c2765tZ.a();
                    BZ.a(c2765tZ);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(BK.l(j, "byteCount: ").toString());
    }

    public final String toString() {
        long j = this.c;
        if (j <= 2147483647L) {
            return x((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.c).toString());
    }

    public final String u() {
        return s(this.c, AbstractC1543hd.a);
    }

    @Override // defpackage.InterfaceC2511qb
    public final InputStream v() {
        return new C1909jb(this, 0);
    }

    public final void w(long j) {
        while (j > 0) {
            C2765tZ c2765tZ = this.b;
            if (c2765tZ != null) {
                int min = (int) Math.min(j, c2765tZ.c - c2765tZ.b);
                long j2 = min;
                this.c -= j2;
                j -= j2;
                int i = c2765tZ.b + min;
                c2765tZ.b = i;
                if (i == c2765tZ.c) {
                    this.b = c2765tZ.a();
                    BZ.a(c2765tZ);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            C2765tZ y = y(1);
            int min = Math.min(i, 8192 - y.c);
            source.get(y.a, y.c, min);
            i -= min;
            y.c += min;
        }
        this.c += remaining;
        return remaining;
    }

    public final C0343Ib x(int i) {
        if (i == 0) {
            return C0343Ib.f;
        }
        AbstractC2870uj.j(this.c, 0L, i);
        C2765tZ c2765tZ = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.b(c2765tZ);
            int i5 = c2765tZ.c;
            int i6 = c2765tZ.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c2765tZ = c2765tZ.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C2765tZ c2765tZ2 = this.b;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.b(c2765tZ2);
            bArr[i7] = c2765tZ2.a;
            i2 += c2765tZ2.c - c2765tZ2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c2765tZ2.b;
            c2765tZ2.d = true;
            i7++;
            c2765tZ2 = c2765tZ2.f;
        }
        return new CZ(bArr, iArr);
    }

    public final C2765tZ y(int i) {
        if (i >= 1 && i <= 8192) {
            C2765tZ c2765tZ = this.b;
            if (c2765tZ == null) {
                C2765tZ b = BZ.b();
                this.b = b;
                b.g = b;
                b.f = b;
                return b;
            }
            C2765tZ c2765tZ2 = c2765tZ.g;
            Intrinsics.b(c2765tZ2);
            if (c2765tZ2.c + i <= 8192 && c2765tZ2.e) {
                return c2765tZ2;
            }
            C2765tZ b2 = BZ.b();
            c2765tZ2.b(b2);
            return b2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void z(C0343Ib byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.x(this, byteString.i());
    }

    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC2870uj.j(sink.length, i, i2);
        C2765tZ c2765tZ = this.b;
        if (c2765tZ == null) {
            return -1;
        }
        int min = Math.min(i2, c2765tZ.c - c2765tZ.b);
        int i3 = c2765tZ.b;
        C2043l5.c(c2765tZ.a, i, sink, i3, i3 + min);
        int i4 = c2765tZ.b + min;
        c2765tZ.b = i4;
        this.c -= min;
        if (i4 == c2765tZ.c) {
            this.b = c2765tZ.a();
            BZ.a(c2765tZ);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.E20
    public final void close() {
    }

    @Override // defpackage.E20, java.io.Flushable
    public final void flush() {
    }
}
