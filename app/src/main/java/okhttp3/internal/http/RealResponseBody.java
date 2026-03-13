package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {
    public final String b;
    public final long c;
    public final QU d;

    public RealResponseBody(String str, long j, QU qu) {
        this.b = str;
        this.c = j;
        this.d = qu;
    }

    @Override // okhttp3.ResponseBody
    public final long a() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType b() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        try {
            return MediaType.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC2511qb e() {
        return this.d;
    }
}
