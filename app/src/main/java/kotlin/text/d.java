package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes2.dex */
public class d extends D40 {
    public static String A(int i, String str) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                sb.append((CharSequence) str);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(' ');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "Desired length ", " is less than zero."));
    }

    public static String B(int i, String str) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "Desired length ", " is less than zero."));
    }

    public static final boolean C(int i, int i2, CharSequence other, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || str.length() - i2 < 0 || i > other.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!a.b(str.charAt(i3), other.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void D(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(AbstractC0324Hi.e(i, "Limit must be non-negative, but was ").toString());
    }

    public static final List E(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        D(i);
        int i2 = 0;
        int s = s(0, charSequence, str, z);
        if (s != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, s).toString());
                i2 = str.length() + s;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                s = s(i2, charSequence, str, z);
            } while (s != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return C0320He.a(charSequence.toString());
    }

    public static List F(CharSequence charSequence, String[] delimiters) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return E(0, charSequence, str, false);
            }
        }
        D(0);
        C0771Yo c0771Yo = new C0771Yo(charSequence, 0, 0, new E40(1, C2043l5.b(delimiters), false));
        Intrinsics.checkNotNullParameter(c0771Yo, "<this>");
        TZ tz = new TZ(c0771Yo);
        ArrayList arrayList = new ArrayList(C0372Je.f(tz));
        Iterator it = tz.iterator();
        while (true) {
            C0745Xo c0745Xo = (C0745Xo) it;
            if (c0745Xo.hasNext()) {
                C2057lE range = (C2057lE) c0745Xo.next();
                Intrinsics.checkNotNullParameter(charSequence, "<this>");
                Intrinsics.checkNotNullParameter(range, "range");
                arrayList.add(charSequence.subSequence(range.b, range.c + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List G(String str, char[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return E(0, str, String.valueOf(delimiters[0]), false);
        }
        D(0);
        C0771Yo c0771Yo = new C0771Yo(str, 0, 0, new E40(0, delimiters, false));
        Intrinsics.checkNotNullParameter(c0771Yo, "<this>");
        TZ tz = new TZ(c0771Yo);
        ArrayList arrayList = new ArrayList(C0372Je.f(tz));
        Iterator it = tz.iterator();
        while (true) {
            C0745Xo c0745Xo = (C0745Xo) it;
            if (c0745Xo.hasNext()) {
                C2057lE range = (C2057lE) c0745Xo.next();
                Intrinsics.checkNotNullParameter(str, "<this>");
                Intrinsics.checkNotNullParameter(range, "range");
                arrayList.add(str.subSequence(range.b, range.c + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static String H(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int u = u(0, 6, str, delimiter, false);
        if (u != -1) {
            String substring = str.substring(delimiter.length() + u, str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String I(String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int r = r(str);
        Intrinsics.checkNotNullParameter(str, "<this>");
        int lastIndexOf = str.lastIndexOf(46, r);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String J(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int u = u(0, 6, str, delimiter, false);
        if (u != -1) {
            String substring = str.substring(0, u);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static CharSequence K(String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean a = CharsKt__CharJVMKt.a(str.charAt(i));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1);
    }

    public static boolean p(String str, String other, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (u(0, 2, str, other, z) < 0) {
                return false;
            }
        } else if (t(str, other, 0, str.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int r(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int s(int i, CharSequence charSequence, String string, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        return t(charSequence, string, i, charSequence.length(), z, false);
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x0049 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int t(java.lang.CharSequence r8, java.lang.String r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r0 = -1
            r1 = 0
            if (r13 != 0) goto L15
            lE r13 = new lE
            if (r10 >= 0) goto L9
            r10 = 0
        L9:
            int r1 = r8.length()
            if (r11 <= r1) goto L10
            r11 = r1
        L10:
            r1 = 1
            r13.<init>(r10, r11, r1)
            goto L24
        L15:
            int r13 = r(r8)
            if (r10 <= r13) goto L1c
            r10 = r13
        L1c:
            if (r11 >= 0) goto L1f
            r11 = 0
        L1f:
            jE r13 = new jE
            r13.<init>(r10, r11, r0)
        L24:
            boolean r10 = r8 instanceof java.lang.String
            int r11 = r13.d
            int r1 = r13.c
            int r13 = r13.b
            if (r10 == 0) goto L50
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L50
            if (r11 <= 0) goto L36
            if (r13 <= r1) goto L3a
        L36:
            if (r11 >= 0) goto L67
            if (r1 > r13) goto L67
        L3a:
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            int r4 = r9.length()
            r2 = 0
            r3 = r13
            r5 = r9
            r7 = r12
            boolean r10 = defpackage.D40.k(r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L4c
            return r13
        L4c:
            if (r13 == r1) goto L67
            int r13 = r13 + r11
            goto L3a
        L50:
            if (r11 <= 0) goto L54
            if (r13 <= r1) goto L58
        L54:
            if (r11 >= 0) goto L67
            if (r1 > r13) goto L67
        L58:
            int r10 = r9.length()
            boolean r10 = C(r13, r10, r8, r9, r12)
            if (r10 == 0) goto L63
            return r13
        L63:
            if (r13 == r1) goto L67
            int r13 = r13 + r11
            goto L58
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.d.t(java.lang.CharSequence, java.lang.String, int, int, boolean, boolean):int");
    }

    public static /* synthetic */ int u(int i, int i2, CharSequence charSequence, String str, boolean z) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return s(i, charSequence, str, z);
    }

    public static int v(String str, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z && (str instanceof String)) {
            return str.indexOf(c, i);
        }
        return w(str, new char[]{c}, i, z);
    }

    public static final int w(CharSequence charSequence, char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            Intrinsics.checkNotNullParameter(chars, "<this>");
            int length = chars.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(chars[0], i);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i < 0) {
            i = 0;
        }
        int r = r(charSequence);
        if (i > r) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : chars) {
                if (a.b(c, charAt, z)) {
                    return i;
                }
            }
            if (i != r) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static boolean x(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt__CharJVMKt.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int y(int i, String str, String string) {
        int i2;
        if ((i & 2) != 0) {
            i2 = r(str);
        } else {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(str instanceof String)) {
            return t(str, string, i2, 0, false, true);
        }
        return str.lastIndexOf(string, i2);
    }

    public static List z(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        return RZ.b0(new C2129m5(str, 5));
    }
}
