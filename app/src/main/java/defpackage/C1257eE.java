package defpackage;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
/* renamed from: eE  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257eE implements ResponseHandler {
    public final ResponseHandler a;
    public final Timer b;
    public final C1020cO c;

    public C1257eE(ResponseHandler responseHandler, Timer timer, C1020cO c1020cO) {
        this.a = responseHandler;
        this.b = timer;
        this.c = c1020cO;
    }

    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.m(this.b.c());
        this.c.f(httpResponse.getStatusLine().getStatusCode());
        Long a = AbstractC1182dO.a(httpResponse);
        if (a != null) {
            this.c.k(a.longValue());
        }
        String b = AbstractC1182dO.b(httpResponse);
        if (b != null) {
            this.c.i(b);
        }
        this.c.c();
        return this.a.handleResponse(httpResponse);
    }
}
