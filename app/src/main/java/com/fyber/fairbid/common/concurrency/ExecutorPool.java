package com.fyber.fairbid.common.concurrency;

import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.wm;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ExecutorPool {
    public static volatile ExecutorPool b;
    public final c a;

    /* loaded from: classes.dex */
    public static class b<V> extends FutureTask<V> implements RunnableScheduledFuture<V> {
        public b(Runnable runnable) {
            super(runnable, null);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return false;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return 0;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final V get() throws InterruptedException, ExecutionException {
            return null;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }
    }

    public ExecutorPool() {
        c cVar = new c();
        this.a = cVar;
        cVar.setKeepAliveTime(10L, TimeUnit.SECONDS);
        cVar.allowCoreThreadTimeOut(true);
        cVar.setThreadFactory(new a(0));
    }

    public static synchronized ScheduledThreadPoolExecutor getInstance() {
        c cVar;
        synchronized (ExecutorPool.class) {
            try {
                if (b == null) {
                    b = new ExecutorPool();
                }
                cVar = b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public Object clone() {
        return null;
    }

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public final AtomicInteger a;

        public a() {
            this.a = new AtomicInteger();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "FairBidThreadPool-" + this.a.getAndIncrement());
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ScheduledThreadPoolExecutor {
        public c() {
            super(10);
        }

        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            try {
                super.execute(new wm(runnable, this));
            } catch (RejectedExecutionException unused) {
                Logger.error("Runnable rejected because executor is shut down");
            }
        }

        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            try {
                return super.schedule(new wm(runnable, this), j, timeUnit);
            } catch (RejectedExecutionException unused) {
                Logger.error("Runnable rejected because executor is shut down");
                return new b(runnable);
            }
        }

        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            try {
                return super.submit(new wm(runnable, this));
            } catch (RejectedExecutionException unused) {
                Logger.error("Runnable rejected because executor is shut down");
                return SettableFuture.create();
            }
        }

        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            try {
                return super.submit(callable);
            } catch (RejectedExecutionException unused) {
                Logger.error("Runnable rejected because executor is shut down");
                return SettableFuture.create();
            }
        }

        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t) {
            try {
                return super.submit(runnable, t);
            } catch (RejectedExecutionException unused) {
                Logger.error("Runnable rejected because executor is shut down");
                return SettableFuture.create();
            }
        }
    }
}
