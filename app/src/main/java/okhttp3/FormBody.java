package okhttp3;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class FormBody extends RequestBody {
    public static final MediaType a = MediaType.a("application/x-www-form-urlencoded");

    /* loaded from: classes2.dex */
    public static final class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
        }
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return a;
    }

    @Override // okhttp3.RequestBody
    public final void d(PU pu) {
        throw null;
    }
}
