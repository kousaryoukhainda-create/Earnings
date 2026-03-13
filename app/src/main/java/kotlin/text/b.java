package kotlin.text;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes2.dex */
public class b extends C2987w40 {
    public static String b(String str, String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Z70 Z = RZ.Z(new C2129m5(str, 5), new C3073x40(indent, 0));
        Intrinsics.checkNotNullParameter(Z, "<this>");
        Intrinsics.checkNotNullParameter("\n", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(Z, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter("\n", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i = 0;
        for (Object obj : Z.a) {
            Object invoke = Z.b.invoke(obj);
            i++;
            if (i > 1) {
                buffer.append((CharSequence) "\n");
            }
            C2987w40.a(buffer, invoke, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static String c(String str) {
        int i;
        Comparable comparable;
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        List z = d.z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z) {
            if (!d.x((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C0372Je.f(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i < length) {
                    if (!CharsKt__CharJVMKt.a(str2.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        z.size();
        int b = C0346Ie.b(z);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : z) {
            int i3 = i + 1;
            if (i >= 0) {
                String str3 = (String) obj2;
                if ((i == 0 || i == b) && d.x(str3)) {
                    str3 = null;
                } else {
                    Intrinsics.checkNotNullParameter(str3, "<this>");
                    if (i2 >= 0) {
                        int length3 = str3.length();
                        if (i2 <= length3) {
                            length3 = i2;
                        }
                        String line = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                        if (line != null) {
                            Intrinsics.checkNotNullParameter(line, "line");
                            str3 = line;
                        }
                    } else {
                        throw new IllegalArgumentException(AbstractC2437ph.c(i2, "Requested character count ", " is less than zero.").toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i = i3;
            } else {
                C0346Ie.e();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        C0553Qe.n(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static String d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "marginPrefix");
        if (!d.x(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            List z = d.z(str);
            int length = str.length();
            z.size();
            int b = C0346Ie.b(z);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : z) {
                int i2 = i + 1;
                String line = null;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if ((i != 0 && i != b) || !d.x(str2)) {
                        int length2 = str2.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                if (!CharsKt__CharJVMKt.a(str2.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 != -1) {
                            Intrinsics.checkNotNullParameter(str2, "<this>");
                            Intrinsics.checkNotNullParameter(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "prefix");
                            if (str2.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, i3)) {
                                line = str2.substring(HiAnalyticsConstant.REPORT_VAL_SEPARATOR.length() + i3);
                                Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                            }
                        }
                        if (line != null) {
                            Intrinsics.checkNotNullParameter(line, "line");
                        } else {
                            line = str2;
                        }
                    }
                    if (line != null) {
                        arrayList.add(line);
                    }
                    i = i2;
                } else {
                    C0346Ie.e();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            C0553Qe.n(arrayList, sb, "\n", "", "", -1, "...", null);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
