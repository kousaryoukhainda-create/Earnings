package com.fyber.fairbid;

import android.os.Handler;
import android.os.Looper;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class e9 implements ExecutorService {
    public static e9 b;
    public final Handler a;

    public e9(Handler handler) {
        this.a = handler;
    }

    public static e9 a() {
        if (b == null) {
            b = new e9(new Handler(Looper.getMainLooper()));
        }
        return b;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        submit(runnable, Boolean.TRUE);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        throw new RuntimeException("not implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        throw new RuntimeException("not implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        SettableFuture create = SettableFuture.create();
        this.a.post(new I(4, create, callable));
        return create;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        throw new RuntimeException("not implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        throw new RuntimeException("not implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        SettableFuture create = SettableFuture.create();
        this.a.post(new RunnableC2737t80(15, new wm(runnable, this), create, t));
        return create;
    }

    public static /* synthetic */ void a(SettableFuture settableFuture, Callable callable) {
        try {
            settableFuture.set(callable.call());
        } catch (Exception e) {
            settableFuture.setException(e);
        }
    }

    public static /* synthetic */ void a(wm wmVar, SettableFuture settableFuture, Object obj) {
        wmVar.run();
        settableFuture.set(obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return submit(runnable, Boolean.TRUE);
    }
}
