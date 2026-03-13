package com.fyber.fairbid.common.concurrency;

import com.fyber.fairbid.d7;
import com.fyber.fairbid.gc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements gc<V> {
    public final a<V> a = new a<>();
    public final d7 b = new d7();

    @Deprecated
    public final void a() {
        d7 d7Var = this.b;
        synchronized (d7Var.a) {
            try {
                if (!d7Var.b) {
                    d7Var.b = true;
                    while (!d7Var.a.isEmpty()) {
                        d7.a aVar = (d7.a) d7Var.a.poll();
                        aVar.getClass();
                        try {
                            aVar.b.execute(aVar.a);
                        } catch (RuntimeException e) {
                            Logger logger = d7.c;
                            Level level = Level.SEVERE;
                            logger.log(level, "RuntimeException while executing runnable " + aVar.a + " with executor " + aVar.b, (Throwable) e);
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.fyber.fairbid.gc
    public void addListener(Runnable runnable, Executor executor) {
        boolean z;
        d7 d7Var = this.b;
        d7Var.getClass();
        if (runnable != null) {
            if (executor != null) {
                synchronized (d7Var.a) {
                    try {
                        if (!d7Var.b) {
                            d7Var.a.add(new d7.a(runnable, executor));
                            z = false;
                        } else {
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    try {
                        executor.execute(runnable);
                        return;
                    } catch (RuntimeException e) {
                        Logger logger = d7.c;
                        Level level = Level.SEVERE;
                        logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
                        return;
                    }
                }
                return;
            }
            throw new NullPointerException("Executor was null.");
        }
        throw new NullPointerException("Runnable was null.");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!this.a.a(null, null, 4)) {
            return false;
        }
        a();
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        a<V> aVar = this.a;
        if (aVar.tryAcquireSharedNanos(-1, timeUnit.toNanos(j))) {
            return aVar.a();
        }
        throw new TimeoutException("Timeout waiting for task.");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a.b();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.a.c();
    }

    public boolean set(V v) {
        boolean a2 = this.a.a(v, null, 2);
        if (a2) {
            a();
        }
        return a2;
    }

    public boolean setException(Throwable th) {
        a<V> aVar = this.a;
        th.getClass();
        boolean a2 = aVar.a(null, th, 2);
        if (a2) {
            a();
        }
        if (!(th instanceof Error)) {
            return a2;
        }
        throw ((Error) th);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        a<V> aVar = this.a;
        aVar.acquireSharedInterruptibly(-1);
        return aVar.a();
    }

    /* loaded from: classes.dex */
    public static final class a<V> extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 0;
        public V a;
        public Throwable b;

        public final V a() throws CancellationException, ExecutionException {
            int state = getState();
            if (state != 2) {
                if (state != 4) {
                    throw new IllegalStateException(AbstractC0324Hi.e(state, "Error, synchronizer in invalid state: "));
                }
                throw new CancellationException("Task was cancelled.");
            } else if (this.b == null) {
                return this.a;
            } else {
                throw new ExecutionException(this.b);
            }
        }

        public final boolean b() {
            if (getState() == 4) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            if ((getState() & 6) != 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final int tryAcquireShared(int i) {
            if (c()) {
                return 1;
            }
            return -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        public final boolean a(V v, Throwable th, int i) {
            if (compareAndSetState(0, 1)) {
                this.a = v;
                this.b = th;
                releaseShared(i);
                return true;
            }
            return false;
        }
    }
}
