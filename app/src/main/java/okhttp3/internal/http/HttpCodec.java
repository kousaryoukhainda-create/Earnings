package okhttp3.internal.http;

import okhttp3.Request;
import okhttp3.Response;
/* loaded from: classes2.dex */
public interface HttpCodec {
    void a();

    void b(Request request);

    RealResponseBody c(Response response);

    void cancel();

    Response.Builder d(boolean z);

    void e();

    E20 f(Request request, long j);
}
