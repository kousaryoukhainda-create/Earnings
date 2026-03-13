package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* loaded from: classes2.dex */
    public static final class BomAwareReader extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kb, java.lang.Object] */
    public static ResponseBody c(byte[] bArr) {
        final ?? obj = new Object();
        obj.A(bArr);
        final long length = bArr.length;
        return new ResponseBody() { // from class: okhttp3.ResponseBody.1
            @Override // okhttp3.ResponseBody
            public final long a() {
                return length;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType b() {
                return null;
            }

            @Override // okhttp3.ResponseBody
            public final InterfaceC2511qb e() {
                return obj;
            }
        };
    }

    public abstract long a();

    public abstract MediaType b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Util.d(e());
    }

    public abstract InterfaceC2511qb e();
}
