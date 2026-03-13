package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: uu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2885uu implements InterfaceC0817a30 {
    public final IF b;
    public long c;
    public boolean d;

    public C2885uu(IF fileHandle, long j) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.b = fileHandle;
        this.c = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        IF r0 = this.b;
        ReentrantLock reentrantLock = r0.f;
        reentrantLock.lock();
        try {
            int i = r0.d - 1;
            r0.d = i;
            if (i == 0) {
                if (r0.c) {
                    synchronized (r0) {
                        r0.g.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.InterfaceC0817a30
    public final long d(long j, C1995kb sink) {
        long j2;
        long j3;
        int i;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!this.d) {
            IF r4 = this.b;
            long j4 = this.c;
            r4.getClass();
            if (j >= 0) {
                long j5 = j + j4;
                long j6 = j4;
                while (true) {
                    if (j6 >= j5) {
                        break;
                    }
                    C2765tZ y = sink.y(1);
                    byte[] array = y.a;
                    int i2 = y.c;
                    int min = (int) Math.min(j5 - j6, 8192 - i2);
                    synchronized (r4) {
                        Intrinsics.checkNotNullParameter(array, "array");
                        r4.g.seek(j6);
                        i = 0;
                        while (true) {
                            if (i >= min) {
                                break;
                            }
                            int read = r4.g.read(array, i2, min - i);
                            if (read == -1) {
                                if (i == 0) {
                                    i = -1;
                                }
                            } else {
                                i += read;
                            }
                        }
                    }
                    if (i == -1) {
                        if (y.b == y.c) {
                            sink.b = y.a();
                            BZ.a(y);
                        }
                        if (j4 == j6) {
                            j3 = -1;
                            j2 = -1;
                        }
                    } else {
                        y.c += i;
                        long j7 = i;
                        j6 += j7;
                        sink.c += j7;
                    }
                }
                j2 = j6 - j4;
                j3 = -1;
                if (j2 != j3) {
                    this.c += j2;
                }
                return j2;
            }
            throw new IllegalArgumentException(BK.l(j, "byteCount < 0: ").toString());
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.InterfaceC0817a30
    public final G60 g() {
        return G60.d;
    }
}
