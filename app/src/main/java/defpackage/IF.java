package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: IF  reason: default package */
/* loaded from: classes2.dex */
public final class IF implements Closeable {
    public final boolean b;
    public boolean c;
    public int d;
    public final ReentrantLock f;
    public final RandomAccessFile g;

    public IF(boolean z, RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.b = z;
        this.f = new ReentrantLock();
        this.g = randomAccessFile;
    }

    public static C2799tu a(IF r3) {
        if (r3.b) {
            ReentrantLock reentrantLock = r3.f;
            reentrantLock.lock();
            try {
                if (!r3.c) {
                    r3.d++;
                    reentrantLock.unlock();
                    return new C2799tu(r3, 0L);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            if (!this.c) {
                synchronized (this) {
                    length = this.g.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C2885uu c(long j) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            if (!this.c) {
                this.d++;
                reentrantLock.unlock();
                return new C2885uu(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d != 0) {
                return;
            }
            synchronized (this) {
                this.g.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.b) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                if (!this.c) {
                    synchronized (this) {
                        this.g.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }
}
