package defpackage;

import java.util.Arrays;
/* renamed from: Se  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605Se {
    public static final C0605Se h = new C0605Se(1, 2, 3, -1, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        AbstractC0324Hi.q(0, 1, 2, 3, 4);
        Ha0.H(5);
    }

    public C0605Se(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return AbstractC0324Hi.e(i, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return AbstractC0324Hi.e(i, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return AbstractC0324Hi.e(i, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(C0605Se c0605Se) {
        int i;
        int i2;
        int i3;
        int i4;
        if (c0605Se == null) {
            return true;
        }
        int i5 = c0605Se.a;
        if ((i5 == -1 || i5 == 1 || i5 == 2) && (((i = c0605Se.b) == -1 || i == 2) && (((i2 = c0605Se.c) == -1 || i2 == 3) && c0605Se.d == null && (((i3 = c0605Se.f) == -1 || i3 == 8) && ((i4 = c0605Se.e) == -1 || i4 == 8))))) {
            return true;
        }
        return false;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i == 16) {
                        return 6;
                    }
                    if (i == 18) {
                        return 7;
                    }
                    if (i != 6 && i != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean d() {
        if (this.a != -1 && this.b != -1 && this.c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0605Se.class != obj.getClass()) {
            return false;
        }
        C0605Se c0605Se = (C0605Se) obj;
        if (this.a == c0605Se.a && this.b == c0605Se.b && this.c == c0605Se.c && Arrays.equals(this.d, c0605Se.d) && this.e == c0605Se.e && this.f == c0605Se.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", ");
        String str2 = "NA";
        int i = this.e;
        if (i == -1) {
            str = "NA";
        } else {
            str = i + "bit Luma";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC0324Hi.h(sb, str2, ")");
    }
}
