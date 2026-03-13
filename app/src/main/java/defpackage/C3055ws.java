package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;
/* renamed from: ws  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3055ws extends MediaDataSource {
    public long b;
    public final /* synthetic */ C0178Bs c;

    public C3055ws(C0178Bs c0178Bs) {
        this.c = c0178Bs;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.c.b.available()) {
                    return -1;
                }
                this.c.b(j);
                this.b = j;
            }
            if (i2 > this.c.b.available()) {
                i2 = this.c.b.available();
            }
            int read = this.c.read(bArr, i, i2);
            if (read >= 0) {
                this.b += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.b = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
