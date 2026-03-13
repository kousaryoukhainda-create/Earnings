package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
/* loaded from: classes2.dex */
public final class Request {
    public final HttpUrl a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final Map e;
    public volatile CacheControl f;

    /* loaded from: classes2.dex */
    public static class Builder {
        public HttpUrl a;
        public RequestBody d;
        public Map e = Collections.emptyMap();
        public String b = "GET";
        public Headers.Builder c = new Headers.Builder();

        public final Request a() {
            if (this.a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void b(String str, RequestBody requestBody) {
            if (str != null) {
                if (str.length() != 0) {
                    if (requestBody != null && !HttpMethod.a(str)) {
                        throw new IllegalArgumentException(AbstractC2437ph.h("method ", str, " must not have a request body."));
                    }
                    if (requestBody == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
                        throw new IllegalArgumentException(AbstractC2437ph.h("method ", str, " must have a request body."));
                    }
                    this.b = str;
                    this.d = requestBody;
                    return;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public final void c(String str) {
            this.c.b(str);
        }
    }

    public Request(Builder builder) {
        Map unmodifiableMap;
        this.a = builder.a;
        this.b = builder.b;
        Headers.Builder builder2 = builder.c;
        builder2.getClass();
        this.c = new Headers(builder2);
        this.d = builder.d;
        byte[] bArr = Util.a;
        Map map = builder.e;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.e = unmodifiableMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Request$Builder, java.lang.Object] */
    public final Builder a() {
        Map linkedHashMap;
        ?? obj = new Object();
        obj.e = Collections.emptyMap();
        obj.a = this.a;
        obj.b = this.b;
        obj.d = this.d;
        Map map = this.e;
        if (map.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        obj.e = linkedHashMap;
        obj.c = this.c.e();
        return obj;
    }

    public final String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tags=" + this.e + '}';
    }
}
