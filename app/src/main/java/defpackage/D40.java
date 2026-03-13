package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlin.text.d;
/* renamed from: D40  reason: default package */
/* loaded from: classes2.dex */
public class D40 extends c {
    public static String g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Intrinsics.c(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                sb.append(substring2);
                return sb.toString();
            }
            return str;
        }
        return str;
    }

    public static boolean h(String str, String suffix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z) {
            return str.endsWith(suffix);
        }
        return k(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean j(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final boolean k(int i, int i2, int i3, String str, String other, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!z) {
            return str.regionMatches(i, other, i2, i3);
        }
        return str.regionMatches(z, i, other, i2, i3);
    }

    public static String l(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return "";
            }
            int i2 = 1;
            if (i != 1) {
                int length = str.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(str.length() * i);
                    if (1 <= i) {
                        while (true) {
                            sb.append((CharSequence) str);
                            if (i2 == i) {
                                break;
                            }
                            i2++;
                        }
                    }
                    String sb2 = sb.toString();
                    Intrinsics.b(sb2);
                    return sb2;
                }
                char charAt = str.charAt(0);
                char[] cArr = new char[i];
                for (int i3 = 0; i3 < i; i3++) {
                    cArr[i3] = charAt;
                }
                return new String(cArr);
            }
            return str.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }

    public static String m(String str, char c, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = str.replace(c, c2);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    public static String n(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int s = d.s(0, str, oldValue, false);
        if (s >= 0) {
            int length = oldValue.length();
            int i = 1;
            if (length >= 1) {
                i = length;
            }
            int length2 = newValue.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i2 = 0;
                do {
                    sb.append((CharSequence) str, i2, s);
                    sb.append(newValue);
                    i2 = s + length;
                    if (s >= str.length()) {
                        break;
                    }
                    s = d.s(s + i, str, oldValue, false);
                } while (s > 0);
                sb.append((CharSequence) str, i2, str.length());
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static boolean o(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str.startsWith(prefix);
    }
}
