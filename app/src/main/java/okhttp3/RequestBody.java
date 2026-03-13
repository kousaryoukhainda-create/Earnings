package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public abstract class RequestBody {

    /* renamed from: okhttp3.RequestBody$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends RequestBody {
        @Override // okhttp3.RequestBody
        public final long a() {
            throw null;
        }

        @Override // okhttp3.RequestBody
        public final MediaType b() {
            return null;
        }

        @Override // okhttp3.RequestBody
        public final void d(PU pu) {
            Intrinsics.checkNotNullParameter(null, "byteString");
            if (!pu.d) {
                pu.c.z(null);
                throw null;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: okhttp3.RequestBody$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 extends RequestBody {
        @Override // okhttp3.RequestBody
        public final long a() {
            throw null;
        }

        @Override // okhttp3.RequestBody
        public final MediaType b() {
            return null;
        }

        @Override // okhttp3.RequestBody
        public final void d(PU pu) {
            C2902v5 source = null;
            try {
                source = AbstractC1424g90.m0(null);
                Intrinsics.checkNotNullParameter(source, "source");
                while (source.d(8192L, pu.c) != -1) {
                    pu.a();
                }
            } finally {
                Util.d(source);
            }
        }
    }

    public static void c(final byte[] bArr) {
        final int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = Util.a;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            new RequestBody() { // from class: okhttp3.RequestBody.2
                @Override // okhttp3.RequestBody
                public final long a() {
                    return length;
                }

                @Override // okhttp3.RequestBody
                public final MediaType b() {
                    return null;
                }

                @Override // okhttp3.RequestBody
                public final void d(PU pu) {
                    byte[] source = bArr;
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (!pu.d) {
                        pu.c.B(source, 0, length);
                        pu.a();
                        return;
                    }
                    throw new IllegalStateException("closed");
                }
            };
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public abstract void d(PU pu);
}
