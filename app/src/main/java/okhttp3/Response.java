package okhttp3;

import java.io.Closeable;
import okhttp3.Headers;
/* loaded from: classes2.dex */
public final class Response implements Closeable {
    public final Request b;
    public final Protocol c;
    public final int d;
    public final String f;
    public final Handshake g;
    public final Headers h;
    public final ResponseBody i;
    public final Response j;
    public final Response k;
    public final Response l;
    public final long m;
    public final long n;
    public volatile CacheControl o;

    /* loaded from: classes2.dex */
    public static class Builder {
        public Request a;
        public Protocol b;
        public String d;
        public Handshake e;
        public ResponseBody g;
        public Response h;
        public Response i;
        public Response j;
        public long k;
        public long l;
        public int c = -1;
        public Headers.Builder f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response.i == null) {
                if (response.j == null) {
                    if (response.k == null) {
                        if (response.l == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str.concat(".priorResponse != null"));
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            throw new IllegalArgumentException(str.concat(".body != null"));
        }

        public final Response a() {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c >= 0) {
                        if (this.d != null) {
                            return new Response(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public Response(Builder builder) {
        this.b = builder.a;
        this.c = builder.b;
        this.d = builder.c;
        this.f = builder.d;
        this.g = builder.e;
        Headers.Builder builder2 = builder.f;
        builder2.getClass();
        this.h = new Headers(builder2);
        this.i = builder.g;
        this.j = builder.h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
        this.n = builder.l;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.o;
        if (cacheControl == null) {
            CacheControl a = CacheControl.a(this.h);
            this.o = a;
            return a;
        }
        return cacheControl;
    }

    public final String b(String str, String str2) {
        String c = this.h.c(str);
        if (c != null) {
            return c;
        }
        return str2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Response$Builder, java.lang.Object] */
    public final Builder c() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.f;
        obj.e = this.g;
        obj.f = this.h.e();
        obj.g = this.i;
        obj.h = this.j;
        obj.i = this.k;
        obj.j = this.l;
        obj.k = this.m;
        obj.l = this.n;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.i;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        return "Response{protocol=" + this.c + ", code=" + this.d + ", message=" + this.f + ", url=" + this.b.a + '}';
    }
}
