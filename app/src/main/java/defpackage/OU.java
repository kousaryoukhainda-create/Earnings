package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: OU  reason: default package */
/* loaded from: classes2.dex */
public final class OU extends OutputStream {
    public final /* synthetic */ PU b;

    public OU(PU pu) {
        this.b = pu;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        PU pu = this.b;
        if (!pu.d) {
            pu.flush();
        }
    }

    public final String toString() {
        return this.b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        PU pu = this.b;
        if (!pu.d) {
            pu.c.C((byte) i);
            pu.a();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        PU pu = this.b;
        if (!pu.d) {
            pu.c.B(data, i, i2);
            pu.a();
            return;
        }
        throw new IOException("closed");
    }
}
