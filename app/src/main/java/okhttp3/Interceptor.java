package okhttp3;

import okhttp3.internal.http.RealInterceptorChain;
/* loaded from: classes2.dex */
public interface Interceptor {

    /* loaded from: classes2.dex */
    public interface Chain {
    }

    Response a(RealInterceptorChain realInterceptorChain);
}
