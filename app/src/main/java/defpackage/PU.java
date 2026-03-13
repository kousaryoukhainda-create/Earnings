package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: PU  reason: default package */
/* loaded from: classes2.dex */
public final class PU implements InterfaceC2425pb {
    public final E20 b;
    public final C1995kb c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r2v1, types: [kb, java.lang.Object] */
    public PU(E20 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.b = sink;
        this.c = new Object();
    }

    public final InterfaceC2425pb a() {
        if (!this.d) {
            C1995kb c1995kb = this.c;
            long j = c1995kb.c;
            long j2 = 0;
            if (j != 0) {
                C2765tZ c2765tZ = c1995kb.b;
                Intrinsics.b(c2765tZ);
                C2765tZ c2765tZ2 = c2765tZ.g;
                Intrinsics.b(c2765tZ2);
                int i = c2765tZ2.c;
                if (i < 8192 && c2765tZ2.e) {
                    j -= i - c2765tZ2.b;
                }
                j2 = j;
            }
            if (j2 > 0) {
                this.b.r(j2, c1995kb);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final InterfaceC2425pb b(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.d) {
            this.c.A(source);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final InterfaceC2425pb c(int i) {
        if (!this.d) {
            this.c.C(i);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.E20, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        E20 e20 = this.b;
        if (!this.d) {
            try {
                C1995kb c1995kb = this.c;
                long j = c1995kb.c;
                if (j > 0) {
                    e20.r(j, c1995kb);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                e20.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final InterfaceC2425pb e(int i) {
        if (!this.d) {
            C1995kb c1995kb = this.c;
            C2765tZ y = c1995kb.y(4);
            int i2 = y.c;
            byte[] bArr = y.a;
            bArr[i2] = (byte) ((i >>> 24) & 255);
            bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
            bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
            bArr[i2 + 3] = (byte) (i & 255);
            y.c = i2 + 4;
            c1995kb.c += 4;
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.E20, java.io.Flushable
    public final void flush() {
        if (!this.d) {
            C1995kb c1995kb = this.c;
            long j = c1995kb.c;
            E20 e20 = this.b;
            if (j > 0) {
                e20.r(j, c1995kb);
            }
            e20.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.E20
    public final G60 g() {
        return this.b.g();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // defpackage.InterfaceC2425pb
    public final InterfaceC2425pb n(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.d) {
            this.c.F(string);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.E20
    public final void r(long j, C1995kb source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.d) {
            this.c.r(j, source);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.d) {
            int write = this.c.write(source);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
