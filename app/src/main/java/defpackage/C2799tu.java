package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: tu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2799tu implements E20 {
    public final IF b;
    public long c;
    public boolean d;

    public C2799tu(IF fileHandle, long j) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.b = fileHandle;
        this.c = j;
    }

    @Override // defpackage.E20, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.E20, java.io.Flushable
    public final void flush() {
        if (!this.d) {
            IF r0 = this.b;
            synchronized (r0) {
                r0.g.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.E20
    public final G60 g() {
        return G60.d;
    }

    @Override // defpackage.E20
    public final void r(long j, C1995kb source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.d) {
            IF r0 = this.b;
            long j2 = this.c;
            r0.getClass();
            AbstractC2870uj.j(source.c, 0L, j);
            long j3 = j2 + j;
            while (j2 < j3) {
                C2765tZ c2765tZ = source.b;
                Intrinsics.b(c2765tZ);
                int min = (int) Math.min(j3 - j2, c2765tZ.c - c2765tZ.b);
                byte[] array = c2765tZ.a;
                int i = c2765tZ.b;
                synchronized (r0) {
                    Intrinsics.checkNotNullParameter(array, "array");
                    r0.g.seek(j2);
                    r0.g.write(array, i, min);
                }
                int i2 = c2765tZ.b + min;
                c2765tZ.b = i2;
                long j4 = min;
                j2 += j4;
                source.c -= j4;
                if (i2 == c2765tZ.c) {
                    source.b = c2765tZ.a();
                    BZ.a(c2765tZ);
                }
            }
            this.c += j;
            return;
        }
        throw new IllegalStateException("closed");
    }
}
