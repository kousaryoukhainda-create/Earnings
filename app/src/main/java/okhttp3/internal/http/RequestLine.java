package okhttp3.internal.http;

import okhttp3.HttpUrl;
/* loaded from: classes2.dex */
public final class RequestLine {
    private RequestLine() {
    }

    public static String a(HttpUrl httpUrl) {
        String d = httpUrl.d();
        String f = httpUrl.f();
        if (f != null) {
            return d + '?' + f;
        }
        return d;
    }
}
