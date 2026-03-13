package defpackage;

import io.flutter.embedding.android.KeyboardMap;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: QU  reason: default package */
/* loaded from: classes2.dex */
public final class QU implements InterfaceC2511qb {
    public final InterfaceC0817a30 b;
    public final C1995kb c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r2v1, types: [kb, java.lang.Object] */
    public QU(InterfaceC0817a30 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.b = source;
        this.c = new Object();
    }

    public final boolean a() {
        if (!this.d) {
            C1995kb c1995kb = this.c;
            if (c1995kb.a() && this.b.d(8192L, c1995kb) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
        throw new java.lang.IllegalArgumentException(("size=" + r8.c + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(byte r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QU.b(byte, long, long):long");
    }

    public final byte c() {
        t(1L);
        return this.c.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.d) {
            this.d = true;
            this.b.close();
            C1995kb c1995kb = this.c;
            c1995kb.w(c1995kb.c);
        }
    }

    @Override // defpackage.InterfaceC0817a30
    public final long d(long j, C1995kb sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            if (!this.d) {
                C1995kb c1995kb = this.c;
                if (c1995kb.c == 0 && this.b.d(8192L, c1995kb) == -1) {
                    return -1L;
                }
                return c1995kb.d(Math.min(j, c1995kb.c), sink);
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(BK.l(j, "byteCount < 0: ").toString());
    }

    public final C0343Ib e(long j) {
        t(j);
        return this.c.k(j);
    }

    public final void f(byte[] sink) {
        C1995kb c1995kb = this.c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            t(sink.length);
            c1995kb.l(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c1995kb.c;
                if (j > 0) {
                    int read = c1995kb.read(sink, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC0817a30
    public final G60 g() {
        return this.b.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
        r14.c -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Type inference failed for: r1v7, types: [kb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QU.h():long");
    }

    public final int i() {
        t(4L);
        return this.c.m();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    public final int j() {
        t(4L);
        int m = this.c.m();
        return ((m & 255) << 24) | (((-16777216) & m) >>> 24) | ((16711680 & m) >>> 8) | ((65280 & m) << 8);
    }

    public final long k() {
        long j;
        t(8L);
        C1995kb c1995kb = this.c;
        if (c1995kb.c >= 8) {
            C2765tZ c2765tZ = c1995kb.b;
            Intrinsics.b(c2765tZ);
            int i = c2765tZ.b;
            int i2 = c2765tZ.c;
            if (i2 - i < 8) {
                j = ((c1995kb.m() & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & c1995kb.m());
            } else {
                byte[] bArr = c2765tZ.a;
                long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
                int i3 = i + 7;
                int i4 = i + 8;
                long j3 = j2 | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
                c1995kb.c -= 8;
                if (i4 == i2) {
                    c1995kb.b = c2765tZ.a();
                    BZ.a(c2765tZ);
                } else {
                    c2765tZ.b = i4;
                }
                j = j3;
            }
            return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        }
        throw new EOFException();
    }

    public final short l() {
        t(2L);
        return this.c.p();
    }

    public final short m() {
        t(2L);
        return this.c.q();
    }

    public final String p(long j) {
        t(j);
        C1995kb c1995kb = this.c;
        c1995kb.getClass();
        return c1995kb.s(j, AbstractC1543hd.a);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kb, java.lang.Object] */
    public final String q(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long b = b((byte) 10, 0L, j2);
            C1995kb c1995kb = this.c;
            if (b != -1) {
                return AbstractC1232e.a(b, c1995kb);
            }
            if (j2 < Long.MAX_VALUE && s(j2) && c1995kb.c(j2 - 1) == 13 && s(1 + j2) && c1995kb.c(j2) == 10) {
                return AbstractC1232e.a(j2, c1995kb);
            }
            ?? out = new Object();
            long min = Math.min(32, c1995kb.c);
            long j3 = 0;
            c1995kb.getClass();
            Intrinsics.checkNotNullParameter(out, "out");
            AbstractC2870uj.j(c1995kb.c, 0L, min);
            if (min != 0) {
                out.c += min;
                C2765tZ c2765tZ = c1995kb.b;
                while (true) {
                    Intrinsics.b(c2765tZ);
                    long j4 = c2765tZ.c - c2765tZ.b;
                    if (j3 < j4) {
                        break;
                    }
                    j3 -= j4;
                    c2765tZ = c2765tZ.f;
                }
                while (min > 0) {
                    Intrinsics.b(c2765tZ);
                    C2765tZ c = c2765tZ.c();
                    int i = c.b + ((int) j3);
                    c.b = i;
                    c.c = Math.min(i + ((int) min), c.c);
                    C2765tZ c2765tZ2 = out.b;
                    if (c2765tZ2 == null) {
                        c.g = c;
                        c.f = c;
                        out.b = c;
                    } else {
                        C2765tZ c2765tZ3 = c2765tZ2.g;
                        Intrinsics.b(c2765tZ3);
                        c2765tZ3.b(c);
                    }
                    min -= c.c - c.b;
                    c2765tZ = c2765tZ.f;
                    j3 = 0;
                }
            }
            throw new EOFException("\\n not found: limit=" + Math.min(c1995kb.c, j) + " content=" + out.k(out.c).j() + (char) 8230);
        }
        throw new IllegalArgumentException(BK.l(j, "limit < 0: ").toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C1995kb c1995kb = this.c;
        if (c1995kb.c == 0 && this.b.d(8192L, c1995kb) == -1) {
            return -1;
        }
        return c1995kb.read(sink);
    }

    public final boolean s(long j) {
        C1995kb c1995kb;
        if (j >= 0) {
            if (!this.d) {
                do {
                    c1995kb = this.c;
                    if (c1995kb.c >= j) {
                        return true;
                    }
                } while (this.b.d(8192L, c1995kb) != -1);
                return false;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(BK.l(j, "byteCount < 0: ").toString());
    }

    public final void t(long j) {
        if (s(j)) {
            return;
        }
        throw new EOFException();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    public final void u(long j) {
        if (!this.d) {
            while (j > 0) {
                C1995kb c1995kb = this.c;
                if (c1995kb.c == 0 && this.b.d(8192L, c1995kb) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, c1995kb.c);
                c1995kb.w(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.InterfaceC2511qb
    public final InputStream v() {
        return new C1909jb(this, 1);
    }
}
