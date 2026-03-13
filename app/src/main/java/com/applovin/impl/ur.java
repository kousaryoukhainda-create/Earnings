package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class ur {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final ah a = new ah();
    private final StringBuilder b = new StringBuilder();

    private static boolean a(ah ahVar) {
        int d2 = ahVar.d();
        int e = ahVar.e();
        byte[] c2 = ahVar.c();
        int i = d2 + 2;
        if (i > e) {
            return false;
        }
        int i2 = d2 + 1;
        if (c2[d2] != 47 || c2[i2] != 42) {
            return false;
        }
        while (true) {
            int i3 = i + 1;
            if (i3 < e) {
                if (((char) c2[i]) == '*' && ((char) c2[i3]) == '/') {
                    i += 2;
                    e = i;
                } else {
                    i = i3;
                }
            } else {
                ahVar.g(e - ahVar.d());
                return true;
            }
        }
    }

    private static boolean b(ah ahVar) {
        char a = a(ahVar, ahVar.d());
        if (a == '\t' || a == '\n' || a == '\f' || a == '\r' || a == ' ') {
            ahVar.g(1);
            return true;
        }
        return false;
    }

    private static String d(ah ahVar, StringBuilder sb) {
        f(ahVar);
        if (ahVar.a() >= 5 && "::cue".equals(ahVar.c(5))) {
            int d2 = ahVar.d();
            String b = b(ahVar, sb);
            if (b == null) {
                return null;
            }
            if ("{".equals(b)) {
                ahVar.f(d2);
                return "";
            }
            String d3 = "(".equals(b) ? d(ahVar) : null;
            if (")".equals(b(ahVar, sb))) {
                return d3;
            }
            return null;
        }
        return null;
    }

    public static void e(ah ahVar) {
        do {
        } while (!TextUtils.isEmpty(ahVar.l()));
    }

    public static void f(ah ahVar) {
        while (true) {
            for (boolean z = true; ahVar.a() > 0 && z; z = false) {
                if (!b(ahVar) && !a(ahVar)) {
                }
            }
            return;
        }
    }

    public List c(ah ahVar) {
        this.b.setLength(0);
        int d2 = ahVar.d();
        e(ahVar);
        this.a.a(ahVar.c(), ahVar.d());
        this.a.f(d2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d3 = d(this.a, this.b);
            if (d3 == null || !"{".equals(b(this.a, this.b))) {
                return arrayList;
            }
            vr vrVar = new vr();
            a(vrVar, d3);
            String str = null;
            boolean z = false;
            while (!z) {
                int d4 = this.a.d();
                String b = b(this.a, this.b);
                boolean z2 = b == null || "}".equals(b);
                if (!z2) {
                    this.a.f(d4);
                    a(this.a, vrVar, this.b);
                }
                str = b;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(vrVar);
            }
        }
    }

    public static String b(ah ahVar, StringBuilder sb) {
        f(ahVar);
        if (ahVar.a() == 0) {
            return null;
        }
        String a = a(ahVar, sb);
        if ("".equals(a)) {
            return "" + ((char) ahVar.w());
        }
        return a;
    }

    private static String a(ah ahVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int d2 = ahVar.d();
        int e = ahVar.e();
        while (d2 < e && !z) {
            char c2 = (char) ahVar.c()[d2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                d2++;
                sb.append(c2);
            }
        }
        ahVar.g(d2 - ahVar.d());
        return sb.toString();
    }

    private static String d(ah ahVar) {
        int i;
        int d2 = ahVar.d();
        int e = ahVar.e();
        loop0: while (true) {
            boolean z = false;
            while (d2 < e && !z) {
                i = d2 + 1;
                if (((char) ahVar.c()[d2]) == ')') {
                    z = true;
                    d2 = i;
                }
            }
            d2 = i;
        }
        return ahVar.c((d2 - 1) - ahVar.d()).trim();
    }

    private static void a(ah ahVar, vr vrVar, StringBuilder sb) {
        f(ahVar);
        String a = a(ahVar, sb);
        if (!"".equals(a) && ":".equals(b(ahVar, sb))) {
            f(ahVar);
            String c2 = c(ahVar, sb);
            if (c2 == null || "".equals(c2)) {
                return;
            }
            int d2 = ahVar.d();
            String b = b(ahVar, sb);
            if (!";".equals(b)) {
                if (!"}".equals(b)) {
                    return;
                }
                ahVar.f(d2);
            }
            if ("color".equals(a)) {
                vrVar.b(s3.a(c2));
            } else if ("background-color".equals(a)) {
                vrVar.a(s3.a(c2));
            } else {
                boolean z = true;
                if ("ruby-position".equals(a)) {
                    if ("over".equals(c2)) {
                        vrVar.d(1);
                    } else if ("under".equals(c2)) {
                        vrVar.d(2);
                    }
                } else if ("text-combine-upright".equals(a)) {
                    if (!"all".equals(c2) && !c2.startsWith("digits")) {
                        z = false;
                    }
                    vrVar.b(z);
                } else if ("text-decoration".equals(a)) {
                    if ("underline".equals(c2)) {
                        vrVar.d(true);
                    }
                } else if ("font-family".equals(a)) {
                    vrVar.a(c2);
                } else if ("font-weight".equals(a)) {
                    if ("bold".equals(c2)) {
                        vrVar.a(true);
                    }
                } else if ("font-style".equals(a)) {
                    if ("italic".equals(c2)) {
                        vrVar.c(true);
                    }
                } else if ("font-size".equals(a)) {
                    a(c2, vrVar);
                }
            }
        }
    }

    private static String c(ah ahVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int d2 = ahVar.d();
            String b = b(ahVar, sb);
            if (b == null) {
                return null;
            }
            if (!"}".equals(b) && !";".equals(b)) {
                sb2.append(b);
            } else {
                ahVar.f(d2);
                z = true;
            }
        }
        return sb2.toString();
    }

    private static char a(ah ahVar, int i) {
        return (char) ahVar.c()[i];
    }

    private static void a(String str, vr vrVar) {
        Matcher matcher = d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            oc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) b1.a((Object) matcher.group(2));
        str2.getClass();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                vrVar.c(3);
                break;
            case 1:
                vrVar.c(2);
                break;
            case 2:
                vrVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        vrVar.a(Float.parseFloat((String) b1.a((Object) matcher.group(1))));
    }

    private void a(vr vrVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                vrVar.d((String) b1.a((Object) matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] a = xp.a(str, "\\.");
        String str2 = a[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            vrVar.c(str2.substring(0, indexOf2));
            vrVar.b(str2.substring(indexOf2 + 1));
        } else {
            vrVar.c(str2);
        }
        if (a.length > 1) {
            vrVar.a((String[]) xp.a(a, 1, a.length));
        }
    }
}
