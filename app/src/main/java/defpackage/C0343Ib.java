package defpackage;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ib  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0343Ib implements Serializable, Comparable {
    public static final C0343Ib f = new C0343Ib(new byte[0]);
    public final byte[] b;
    public transient int c;
    public transient String d;

    public C0343Ib(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.b = data;
    }

    public static final C0343Ib g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (AbstractC1281eb.d(str.charAt(i2 + 1)) + (AbstractC1281eb.d(str.charAt(i2)) << 4));
            }
            return new C0343Ib(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static int l(C0343Ib c0343Ib, C0343Ib other) {
        c0343Ib.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c0343Ib.k(0, other.b);
    }

    public static int p(C0343Ib c0343Ib, C0343Ib other) {
        c0343Ib.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c0343Ib.o(-1234567890, other.b);
    }

    public static final C0343Ib q(byte... data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return new C0343Ib(copyOf);
    }

    public static /* synthetic */ C0343Ib u(C0343Ib c0343Ib, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return c0343Ib.t(i, i2);
    }

    public String e() {
        byte[] map = AbstractC1147d.a;
        byte[] bArr = this.b;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr2[i2] = map[(b & 255) >> 2];
            bArr2[i2 + 1] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b2 & Ascii.SI) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i5 = i + 1;
                byte b4 = bArr[i];
                byte b5 = bArr[i5];
                bArr2[i2] = map[(b4 & 255) >> 2];
                bArr2[i2 + 1] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr2[i2 + 2] = map[(b5 & Ascii.SI) << 2];
                bArr2[i2 + 3] = 61;
            }
        } else {
            byte b6 = bArr[i];
            bArr2[i2] = map[(b6 & 255) >> 2];
            bArr2[i2 + 1] = map[(b6 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, AbstractC1543hd.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0343Ib) {
            C0343Ib c0343Ib = (C0343Ib) obj;
            int i = c0343Ib.i();
            byte[] bArr = this.b;
            if (i == bArr.length && c0343Ib.r(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(defpackage.C0343Ib r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.i()
            int r1 = r10.i()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.n(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.n(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0343Ib.compareTo(Ib):int");
    }

    public C0343Ib h(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.b, 0, i());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new C0343Ib(digestBytes);
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b);
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    public int i() {
        return this.b.length;
    }

    public String j() {
        byte[] bArr = this.b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC1281eb.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public int k(int i, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte[] bArr = this.b;
        int length = bArr.length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!AbstractC2870uj.d(bArr, max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] m() {
        return this.b;
    }

    public byte n(int i) {
        return this.b[i];
    }

    public int o(int i, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i == -1234567890) {
            i = i();
        }
        byte[] bArr = this.b;
        for (int min = Math.min(i, bArr.length - other.length); -1 < min; min--) {
            if (AbstractC2870uj.d(bArr, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean r(int i, int i2, int i3, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0) {
            byte[] bArr = this.b;
            if (i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && AbstractC2870uj.d(bArr, i, other, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean s(int i, C0343Ib other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.r(0, i, i2, this.b);
    }

    public C0343Ib t(int i, int i2) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i2 == -1234567890) {
            i2 = i();
        }
        if (i >= 0) {
            byte[] bArr = this.b;
            if (i2 <= bArr.length) {
                if (i2 - i >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    Intrinsics.checkNotNullParameter(bArr, "<this>");
                    C1871j5.a(i2, bArr.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
                    Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
                    return new C0343Ib(copyOfRange);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0120, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0124, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x015c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0163, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x016a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x019b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x019e, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a1, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f0, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0343Ib.toString():java.lang.String");
    }

    public C0343Ib v() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new C0343Ib(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final String w() {
        String str = this.d;
        if (str == null) {
            byte[] m = m();
            Intrinsics.checkNotNullParameter(m, "<this>");
            String str2 = new String(m, AbstractC1543hd.a);
            this.d = str2;
            return str2;
        }
        return str;
    }

    public void x(C1995kb buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.B(this.b, 0, i);
    }
}
