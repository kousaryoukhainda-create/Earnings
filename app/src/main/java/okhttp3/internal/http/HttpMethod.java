package okhttp3.internal.http;
/* loaded from: classes2.dex */
public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean a(String str) {
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }
}
