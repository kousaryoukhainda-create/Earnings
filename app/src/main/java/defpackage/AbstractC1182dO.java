package defpackage;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
/* renamed from: dO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1182dO {
    public static final Pattern a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            Z2.d().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null && (value = firstHeader.getValue()) != null) {
            return value;
        }
        return null;
    }

    public static void c(C1020cO c1020cO) {
        if (!((C0935bO) c1020cO.f.c).V()) {
            ZN zn = c1020cO.f;
            zn.k();
            C0935bO.v((C0935bO) zn.c);
        }
        c1020cO.c();
    }
}
