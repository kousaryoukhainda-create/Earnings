package defpackage;

import com.fyber.fairbid.internal.Framework;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
/* renamed from: uG  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2832uG implements Z60 {
    public static final int[] j = {350, 0, 0, 0, 351, 352, 0, 0, 0, 353, 354, 0, 355, 0, 356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 357, 358, 359, 0};
    public static final K3 k;
    public final String g;
    public final int i;
    public int b = -1;
    public final StringBuilder c = new StringBuilder();
    public X60 d = new X60();
    public X60 f = null;
    public int h = 0;

    /* JADX WARN: Type inference failed for: r0v2, types: [K3, java.util.HashMap] */
    static {
        ?? hashMap = new HashMap();
        k = hashMap;
        hashMap.a(300, "abstract");
        hashMap.a(301, "boolean");
        hashMap.a(302, "break");
        hashMap.a(303, "byte");
        hashMap.a(304, "case");
        hashMap.a(305, "catch");
        hashMap.a(306, "char");
        hashMap.a(307, Constants.CLASS);
        hashMap.a(308, "const");
        hashMap.a(309, "continue");
        hashMap.a(310, "default");
        hashMap.a(311, "do");
        hashMap.a(312, "double");
        hashMap.a(313, "else");
        hashMap.a(314, "extends");
        hashMap.a(411, "false");
        hashMap.a(315, "final");
        hashMap.a(316, "finally");
        hashMap.a(317, "float");
        hashMap.a(318, "for");
        hashMap.a(319, "goto");
        hashMap.a(com.fyber.fairbid.internal.Constants.BANNER_FALLBACK_AD_WIDTH, "if");
        hashMap.a(321, "implements");
        hashMap.a(322, "import");
        hashMap.a(323, "instanceof");
        hashMap.a(324, "int");
        hashMap.a(325, "interface");
        hashMap.a(326, "long");
        hashMap.a(327, Framework.NATIVE);
        hashMap.a(328, "new");
        hashMap.a(412, "null");
        hashMap.a(329, "package");
        hashMap.a(330, "private");
        hashMap.a(331, "protected");
        hashMap.a(332, "public");
        hashMap.a(333, "return");
        hashMap.a(334, "short");
        hashMap.a(335, "static");
        hashMap.a(347, "strictfp");
        hashMap.a(336, "super");
        hashMap.a(337, "switch");
        hashMap.a(338, "synchronized");
        hashMap.a(339, "this");
        hashMap.a(340, "throw");
        hashMap.a(341, "throws");
        hashMap.a(342, "transient");
        hashMap.a(410, InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        hashMap.a(343, "try");
        hashMap.a(344, "void");
        hashMap.a(345, "volatile");
        hashMap.a(346, "while");
    }

    public C2832uG(String str) {
        this.g = str;
        this.i = str.length();
    }

    public static boolean d(int i) {
        if (i != 32 && i != 9 && i != 12 && i != 13 && i != 10) {
            return false;
        }
        return true;
    }

    public final int a() {
        X60 x60 = this.f;
        if (x60 == null) {
            return b(this.d);
        }
        this.d = x60;
        this.f = x60.a;
        return x60.b;
    }

    public final int b(X60 x60) {
        int c;
        long j2;
        int i;
        int c2;
        int c3;
        while (true) {
            int c4 = c();
            int i2 = 10;
            int i3 = -1;
            if (c4 == 47) {
                int c5 = c();
                if (c5 == 47) {
                    do {
                        c4 = c();
                        if (c4 == 10 || c4 == 13) {
                            break;
                        }
                    } while (c4 != -1);
                } else if (c5 == 42) {
                    while (true) {
                        c4 = c();
                        if (c4 == -1) {
                            break;
                        } else if (c4 == 42) {
                            int c6 = c();
                            if (c6 == 47) {
                                c4 = 32;
                                break;
                            }
                            this.b = c6;
                        }
                    }
                } else {
                    this.b = c5;
                    c4 = 47;
                }
            }
            if (!d(c4)) {
                if (c4 >= 0) {
                    if (c4 == 10) {
                        c4 = 10;
                    } else {
                        int i4 = 0;
                        if (c4 == 39) {
                            while (true) {
                                int c7 = c();
                                if (c7 != 39) {
                                    if (c7 == 92) {
                                        i4 = g();
                                    } else if (c7 < 32) {
                                        break;
                                    } else {
                                        i4 = c7;
                                    }
                                } else {
                                    x60.c = i4;
                                    c4 = 401;
                                    break;
                                }
                            }
                        } else {
                            StringBuilder sb = this.c;
                            if (c4 == 34) {
                                sb.setLength(0);
                                while (true) {
                                    int c8 = c();
                                    if (c8 != 34) {
                                        if (c8 == 92) {
                                            c8 = g();
                                        } else if (c8 != 10) {
                                            if (c8 < 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                        sb.append((char) c8);
                                    } else {
                                        while (true) {
                                            c3 = c();
                                            if (c3 != 10 && !d(c3)) {
                                                break;
                                            }
                                        }
                                        if (c3 != 34) {
                                            this.b = c3;
                                            x60.e = sb.toString();
                                            c4 = 406;
                                            break;
                                        }
                                    }
                                }
                                c4 = 500;
                            } else {
                                if (48 <= c4 && c4 <= 57) {
                                    int c9 = c();
                                    if (c4 == 48) {
                                        if (c9 != 88 && c9 != 120) {
                                            if (48 <= c9 && c9 <= 55) {
                                                long j3 = c9 - 48;
                                                while (true) {
                                                    c2 = c();
                                                    if (48 > c2 || c2 > 55) {
                                                        break;
                                                    }
                                                    j3 = (j3 * 8) + (c2 - 48);
                                                }
                                                x60.c = j3;
                                                if (c2 != 76 && c2 != 108) {
                                                    this.b = c2;
                                                    c4 = 402;
                                                }
                                                c4 = 403;
                                            }
                                        } else {
                                            long j4 = 0;
                                            while (true) {
                                                c = c();
                                                if (48 <= c && c <= 57) {
                                                    j2 = j4 * 16;
                                                    i = c - 48;
                                                } else if (65 <= c && c <= 70) {
                                                    j2 = j4 * 16;
                                                    i = c - 55;
                                                } else if (97 > c || c > 102) {
                                                    break;
                                                } else {
                                                    j2 = j4 * 16;
                                                    i = c - 87;
                                                }
                                                j4 = j2 + i;
                                            }
                                            x60.c = j4;
                                            if (c != 76 && c != 108) {
                                                this.b = c;
                                                c4 = 402;
                                            }
                                            c4 = 403;
                                        }
                                    }
                                    long j5 = c4 - 48;
                                    while (48 <= c9 && c9 <= 57) {
                                        j5 = ((j5 * 10) + c9) - 48;
                                        c9 = c();
                                    }
                                    x60.c = j5;
                                    if (c9 != 70 && c9 != 102) {
                                        if (c9 != 69 && c9 != 101 && c9 != 68 && c9 != 100 && c9 != 46) {
                                            if (c9 != 76 && c9 != 108) {
                                                this.b = c9;
                                                c4 = 402;
                                            }
                                            c4 = 403;
                                        } else {
                                            sb.setLength(0);
                                            sb.append(j5);
                                            c4 = f(sb, c9, x60);
                                        }
                                    } else {
                                        x60.d = j5;
                                        c4 = 404;
                                    }
                                } else if (c4 == 46) {
                                    int c10 = c();
                                    if (48 <= c10 && c10 <= 57) {
                                        sb.setLength(0);
                                        sb.append('.');
                                        c4 = f(sb, c10, x60);
                                    } else {
                                        this.b = c10;
                                        c4 = h(46);
                                    }
                                } else if (Character.isJavaIdentifierStart((char) c4)) {
                                    sb.setLength(0);
                                    do {
                                        sb.append((char) c4);
                                        c4 = c();
                                    } while (Character.isJavaIdentifierPart((char) c4));
                                    this.b = c4;
                                    String sb2 = sb.toString();
                                    K3 k3 = k;
                                    if (k3.containsKey(sb2)) {
                                        i3 = ((Integer) k3.get(sb2)).intValue();
                                    }
                                    if (i3 >= 0) {
                                        c4 = i3;
                                    } else {
                                        x60.e = sb2;
                                        c4 = 400;
                                    }
                                } else {
                                    c4 = h(c4);
                                }
                                i2 = 10;
                            }
                        }
                    }
                }
                if (c4 != i2) {
                    x60.b = c4;
                    return c4;
                }
            }
        }
    }

    public final int c() {
        int i = this.b;
        if (i < 0) {
            int i2 = this.h;
            if (i2 >= this.i) {
                return -1;
            }
            this.h = i2 + 1;
            return this.g.charAt(i2);
        }
        this.b = -1;
        return i;
    }

    public final int e(int i) {
        X60 x60 = this.f;
        if (x60 == null) {
            x60 = this.d;
            this.f = x60;
            x60.a = null;
            b(x60);
        }
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                if (x60.a == null) {
                    X60 x602 = new X60();
                    x60.a = x602;
                    b(x602);
                }
                x60 = x60.a;
                i = i2;
            } else {
                this.d = x60;
                return x60.b;
            }
        }
    }

    public final int f(StringBuilder sb, int i, X60 x60) {
        if (i != 69 && i != 101 && i != 68 && i != 100) {
            sb.append((char) i);
            while (true) {
                i = c();
                if (48 > i || i > 57) {
                    break;
                }
                sb.append((char) i);
            }
        }
        if (i == 69 || i == 101) {
            sb.append((char) i);
            i = c();
            if (i == 43 || i == 45) {
                sb.append((char) i);
                i = c();
            }
            while (48 <= i && i <= 57) {
                sb.append((char) i);
                i = c();
            }
        }
        try {
            x60.d = Double.parseDouble(sb.toString());
            if (i != 70 && i != 102) {
                if (i != 68 && i != 100) {
                    this.b = i;
                    return 405;
                }
                return 405;
            }
            return 404;
        } catch (NumberFormatException unused) {
            return 500;
        }
    }

    public final int g() {
        int c = c();
        if (c == 110) {
            return 10;
        }
        if (c == 116) {
            return 9;
        }
        if (c == 114) {
            return 13;
        }
        if (c == 102) {
            return 12;
        }
        return c;
    }

    public final int h(int i) {
        int c;
        if (33 <= i && i <= 63) {
            int i2 = j[i - 33];
            if (i2 == 0) {
                return i;
            }
            c = c();
            if (i == c) {
                if (i != 38) {
                    if (i != 43) {
                        if (i != 45) {
                            switch (i) {
                                case TokenParametersOuterClass$TokenParameters.PRIORSKIP_FIELD_NUMBER /* 60 */:
                                    int c2 = c();
                                    if (c2 == 61) {
                                        return 365;
                                    }
                                    this.b = c2;
                                    return 364;
                                case TokenParametersOuterClass$TokenParameters.PRIORCLICKTYPES_FIELD_NUMBER /* 61 */:
                                    return 358;
                                case TokenParametersOuterClass$TokenParameters.USERSESSIONS_FIELD_NUMBER /* 62 */:
                                    int c3 = c();
                                    if (c3 == 61) {
                                        return 367;
                                    }
                                    if (c3 == 62) {
                                        int c4 = c();
                                        if (c4 == 61) {
                                            return 371;
                                        }
                                        this.b = c4;
                                        return 370;
                                    }
                                    this.b = c3;
                                    return 366;
                            }
                        }
                        return 363;
                    }
                    return 362;
                }
                return 369;
            } else if (c == 61) {
                return i2;
            }
        } else if (i == 94) {
            c = c();
            if (c == 61) {
                return 360;
            }
        } else {
            if (i == 124) {
                c = c();
                if (c == 61) {
                    return 361;
                }
                if (c == 124) {
                    return 368;
                }
            }
            return i;
        }
        this.b = c;
        return i;
    }
}
