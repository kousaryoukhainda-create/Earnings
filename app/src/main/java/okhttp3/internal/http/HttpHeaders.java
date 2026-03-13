package okhttp3.internal.http;

import okhttp3.Response;
/* loaded from: classes2.dex */
public final class HttpHeaders {
    static {
        C0343Ib c0343Ib = C0343Ib.f;
        AbstractC1424g90.z("\"\\");
        AbstractC1424g90.z("\t ,=");
    }

    private HttpHeaders() {
    }

    public static long a(Response response) {
        String c = response.h.c("Content-Length");
        if (c != null) {
            try {
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return Long.parseLong(c);
    }

    public static boolean b(Response response) {
        if (response.b.b.equals("HEAD")) {
            return false;
        }
        int i = response.d;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(response) == -1 && !"chunked".equalsIgnoreCase(response.b("Transfer-Encoding", null))) {
            return false;
        }
        return true;
    }

    public static int c(int i, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x021d, code lost:
        if (okhttp3.internal.Util.h.matcher(r0).matches() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x035c, code lost:
        if (r0 != null) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(okhttp3.CookieJar r31, okhttp3.HttpUrl r32, okhttp3.Headers r33) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static int e(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
