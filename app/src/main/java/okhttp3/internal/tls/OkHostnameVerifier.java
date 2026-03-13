package okhttp3.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static ArrayList a(X509Certificate x509Certificate) {
        List b = b(x509Certificate, 7);
        List b2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b2.size() + b.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    public static List b(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.security.cert.X509Certificate r8, java.lang.String r9) {
        /*
            java.util.regex.Pattern r0 = okhttp3.internal.Util.h
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            r0 = 7
            java.util.List r8 = b(r8, r0)
            int r0 = r8.size()
            r3 = 0
        L18:
            if (r3 >= r0) goto L2b
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L28
            goto Le9
        L28:
            int r3 = r3 + 1
            goto L18
        L2b:
            r1 = 0
            goto Le9
        L2e:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
            r0 = 2
            java.util.List r8 = b(r8, r0)
            java.util.Iterator r8 = r8.iterator()
        L3d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto Lbc
            int r3 = r9.length()
            if (r3 == 0) goto Lbc
            java.lang.String r3 = "."
            boolean r4 = r9.startsWith(r3)
            if (r4 != 0) goto Lbc
            java.lang.String r4 = ".."
            boolean r5 = r9.endsWith(r4)
            if (r5 == 0) goto L62
            goto Lbc
        L62:
            if (r0 == 0) goto Lbc
            int r5 = r0.length()
            if (r5 == 0) goto Lbc
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto Lbc
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L77
            goto Lbc
        L77:
            boolean r4 = r9.endsWith(r3)
            if (r4 != 0) goto L82
            java.lang.String r4 = r9.concat(r3)
            goto L83
        L82:
            r4 = r9
        L83:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L8d
            java.lang.String r0 = r0.concat(r3)
        L8d:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto La0
            boolean r0 = r4.equals(r0)
            goto Le7
        La0:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto Lbc
            r5 = 42
            int r5 = r0.indexOf(r5, r1)
            r6 = -1
            if (r5 == r6) goto Lb2
            goto Lbc
        Lb2:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto Lbe
        Lbc:
            r0 = 0
            goto Le7
        Lbe:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lc5
            goto Lbc
        Lc5:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto Ld0
            goto Lbc
        Ld0:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto Le6
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = r4.lastIndexOf(r0, r3)
            if (r0 == r6) goto Le6
            goto Lbc
        Le6:
            r0 = 1
        Le7:
            if (r0 == 0) goto L3d
        Le9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.OkHostnameVerifier.c(java.security.cert.X509Certificate, java.lang.String):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c((X509Certificate) sSLSession.getPeerCertificates()[0], str);
        } catch (SSLException unused) {
            return false;
        }
    }
}
