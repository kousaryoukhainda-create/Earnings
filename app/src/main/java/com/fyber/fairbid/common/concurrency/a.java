package com.fyber.fairbid.common.concurrency;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.gc;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.fyber.fairbid.common.concurrency.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0043a extends TimeoutException {
        public final long a;
        @NotNull
        public final TimeUnit b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0043a(long j, @NotNull TimeUnit unit, @NotNull String message) {
            super(message);
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = j;
            this.b = unit;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<V> implements Runnable {
        @NotNull
        public final gc<V> a;

        public b(@NotNull gc<V> future) {
            Intrinsics.checkNotNullParameter(future, "future");
            this.a = future;
        }

        public abstract void a(V v, Exception exc);

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    a(this.a.get(), null);
                } catch (Exception e) {
                    Logger.debug("found error, passing on");
                    throw new RuntimeException(e);
                }
            } catch (InterruptedException e2) {
                a(null, e2);
            } catch (ExecutionException e3) {
                a(null, e3);
            }
        }
    }

    public static final Object a(@NotNull SettableFuture future, Boolean bool) {
        Intrinsics.checkNotNullParameter(future, "future");
        Intrinsics.checkNotNullParameter(future, "future");
        Intrinsics.checkNotNullParameter("Error getting the result", "debugMessage");
        if (future.isDone()) {
            try {
                return future.get();
            } catch (Exception e) {
                Logger.debug("Error getting the result - " + e);
                return bool;
            }
        }
        return bool;
    }

    public static final boolean a(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            if (!((th != null ? th.getCause() : null) instanceof TimeoutException)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final SettableFuture a(@NotNull ArrayList futures, @NotNull ScheduledExecutorService executorService) {
        Intrinsics.checkNotNullParameter(futures, "futures");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        SettableFuture resultFuture = SettableFuture.create();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator it = futures.iterator();
        while (it.hasNext()) {
            ((gc) it.next()).addListener(new RunnableC2737t80(5, futures, atomicInteger, resultFuture), executorService);
        }
        if (futures.isEmpty()) {
            resultFuture.set(Boolean.TRUE);
        }
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        return resultFuture;
    }

    public static final void a(List futures, AtomicInteger seen, SettableFuture settableFuture) {
        Intrinsics.checkNotNullParameter(futures, "$futures");
        Intrinsics.checkNotNullParameter(seen, "$seen");
        if (futures.size() <= seen.addAndGet(1)) {
            settableFuture.set(Boolean.TRUE);
        }
    }

    @NotNull
    public static final <V> SettableFuture<V> a(@NotNull SettableFuture<V> future, @NotNull ScheduledExecutorService executorService, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(future, "future");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        executorService.schedule(new RunnableC2630rx(future, j, timeUnit, 2), j, timeUnit);
        return future;
    }

    public static final void a(SettableFuture future, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(future, "$future");
        Intrinsics.checkNotNullParameter(timeUnit, "$timeUnit");
        future.setException(new C0043a(j, timeUnit, "Timeout exception - " + j + ' ' + timeUnit));
    }

    public static final <V> void a(@NotNull SettableFuture<? extends V> sourceFuture, @NotNull SettableFuture<V> destFuture, Executor executor) {
        Intrinsics.checkNotNullParameter(sourceFuture, "sourceFuture");
        Intrinsics.checkNotNullParameter(destFuture, "destFuture");
        sourceFuture.addListener(new RunnableC1290ef0(1, destFuture, sourceFuture), executor);
    }

    public static final void a(SettableFuture destFuture, SettableFuture sourceFuture) {
        Intrinsics.checkNotNullParameter(destFuture, "$destFuture");
        Intrinsics.checkNotNullParameter(sourceFuture, "$sourceFuture");
        try {
            destFuture.set(sourceFuture.get());
        } catch (Exception e) {
            destFuture.setException(e);
        }
    }

    public static void a(@NotNull SettableFuture settableFuture, @NotNull Executor executor, @NotNull SettableFuture.Listener listener) {
        Intrinsics.checkNotNullParameter(settableFuture, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        settableFuture.addListener(listener, executor);
    }

    public static void a(@NotNull SettableFuture settableFuture, @NotNull ScheduledExecutorService executor, @NotNull ve listener) {
        Intrinsics.checkNotNullParameter(settableFuture, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        settableFuture.addListener(new C30(listener, 5), executor);
    }

    public static final void a(InterfaceC0263Ez tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
