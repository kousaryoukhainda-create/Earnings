package okhttp3.internal.http;

import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
/* loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    public final ArrayList a;
    public final StreamAllocation b;
    public final HttpCodec c;
    public final RealConnection d;
    public final int e;
    public final Request f;
    public final Call g;
    public final EventListener h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    public RealInterceptorChain(ArrayList arrayList, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i, Request request, Call call, EventListener eventListener, int i2, int i3, int i4) {
        this.a = arrayList;
        this.d = realConnection;
        this.b = streamAllocation;
        this.c = httpCodec;
        this.e = i;
        this.f = request;
        this.g = call;
        this.h = eventListener;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public final Response a(Request request) {
        return b(request, this.b, this.c, this.d);
    }

    public final Response b(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = this.e;
        if (i < size) {
            this.l++;
            HttpCodec httpCodec2 = this.c;
            if (httpCodec2 != null) {
                if (!this.d.k(request.a)) {
                    throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
                }
            }
            if (httpCodec2 != null && this.l > 1) {
                throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
            }
            int i2 = i + 1;
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(arrayList, streamAllocation, httpCodec, realConnection, i2, request, this.g, this.h, this.i, this.j, this.k);
            Interceptor interceptor = (Interceptor) arrayList.get(i);
            Response a = interceptor.a(realInterceptorChain);
            if (httpCodec != null && i2 < arrayList.size() && realInterceptorChain.l != 1) {
                throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
            } else if (a != null) {
                if (a.i != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
            } else {
                throw new NullPointerException("interceptor " + interceptor + " returned null");
            }
        }
        throw new AssertionError();
    }
}
