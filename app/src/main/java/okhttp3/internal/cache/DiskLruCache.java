package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: okhttp3.internal.cache.DiskLruCache$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends FaultHidingSink {
        @Override // okhttp3.internal.cache.FaultHidingSink
        public final void a() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 implements Iterator<Snapshot> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Snapshot next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("remove() before next()");
        }
    }

    /* loaded from: classes2.dex */
    public final class Editor {

        /* renamed from: okhttp3.internal.cache.DiskLruCache$Editor$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass1 extends FaultHidingSink {
            @Override // okhttp3.internal.cache.FaultHidingSink
            public final void a() {
                throw null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Entry {
    }

    /* loaded from: classes2.dex */
    public final class Snapshot implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    static {
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
    }
}
