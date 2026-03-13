package okhttp3.internal.cache;

import okhttp3.Request;
import okhttp3.Response;
/* loaded from: classes2.dex */
public final class CacheStrategy {
    public final Request a;
    public final Response b;

    /* loaded from: classes2.dex */
    public static class Factory {
    }

    public CacheStrategy(Request request, Response response) {
        this.a = request;
        this.b = response;
    }
}
