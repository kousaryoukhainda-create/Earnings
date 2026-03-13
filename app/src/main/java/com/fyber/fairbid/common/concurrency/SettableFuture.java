package com.fyber.fairbid.common.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class SettableFuture<V> extends AbstractFuture<V> {

    /* loaded from: classes.dex */
    public interface Listener<V> {
        void onComplete(V v, Throwable th);
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Listener a;

        public a(Listener listener) {
            this.a = listener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.onComplete(SettableFuture.this.get(), null);
            } catch (InterruptedException e) {
                this.a.onComplete(null, e);
            } catch (ExecutionException e2) {
                this.a.onComplete(null, e2);
            }
        }
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    public void addListener(Listener<V> listener, Executor executor) {
        addListener(new a(listener), executor);
    }

    @Override // com.fyber.fairbid.common.concurrency.AbstractFuture
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // com.fyber.fairbid.common.concurrency.AbstractFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }
}
