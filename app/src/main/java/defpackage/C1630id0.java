package defpackage;

import java.util.regex.Pattern;
/* renamed from: id0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630id0 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final NQ a = new NQ();
    public final StringBuilder b = new StringBuilder();

    public static String a(NQ nq, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = nq.b;
        int i2 = nq.c;
        while (i < i2 && !z) {
            char c2 = (char) nq.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        nq.H(i - nq.b);
        return sb.toString();
    }

    public static String b(NQ nq, StringBuilder sb) {
        c(nq);
        if (nq.a() == 0) {
            return null;
        }
        String a = a(nq, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) nq.u());
    }

    public static void c(NQ nq) {
        while (true) {
            for (boolean z = true; nq.a() > 0 && z; z = false) {
                int i = nq.b;
                byte[] bArr = nq.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = nq.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            nq.H(i2 - nq.b);
                        }
                    }
                } else {
                    nq.H(1);
                }
            }
            return;
        }
    }
}
