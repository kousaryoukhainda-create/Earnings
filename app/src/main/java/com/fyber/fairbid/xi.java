package com.fyber.fairbid;

import androidx.annotation.NonNull;
import com.fyber.fairbid.internal.Logger;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class xi {
    public final Runnable a;
    public final ScheduledExecutorService b;
    public final c c;
    public ScheduledFuture d;
    public boolean e = false;

    /* loaded from: classes.dex */
    public static class a implements c {
        public final long[] a;
        public AtomicInteger b = new AtomicInteger(0);

        public a(@NonNull long[] jArr, @NonNull TimeUnit timeUnit) {
            this.a = new long[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                this.a[i] = timeUnit.toMillis(jArr[i]);
            }
        }

        @Override // com.fyber.fairbid.xi.c
        public final void a() {
            if (this.b.get() < this.a.length - 1) {
                this.b.incrementAndGet();
            }
        }

        @Override // com.fyber.fairbid.xi.c
        public final long b() {
            return Math.max(this.a[this.b.get()], 0L);
        }

        @Override // com.fyber.fairbid.xi.c
        public final boolean c() {
            return false;
        }

        @Override // com.fyber.fairbid.xi.c
        public final void reset() {
            this.b = new AtomicInteger(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b implements Runnable {
        public xi a;

        public static void a(b bVar, xi xiVar) {
            bVar.a = xiVar;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        long b();

        boolean c();

        void reset();
    }

    public xi(@NonNull Runnable runnable, @NonNull c cVar, @NonNull ScheduledExecutorService scheduledExecutorService) {
        if (runnable instanceof b) {
            b.a((b) runnable, this);
        }
        this.a = runnable;
        this.b = scheduledExecutorService;
        this.c = cVar;
    }

    public final synchronized boolean a(int i, TimeUnit timeUnit) {
        if (this.e) {
            return false;
        }
        if (this.c.c()) {
            this.e = true;
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            return false;
        }
        long millis = timeUnit.toMillis(i);
        if (millis > 0) {
            Logger.debug("RetryManager - scheduling the task run to be initially delayed " + millis + " ms");
        }
        this.d = this.b.schedule(this.a, millis, TimeUnit.MILLISECONDS);
        return true;
    }

    public synchronized void b() {
        ScheduledFuture scheduledFuture;
        if (this.e) {
            return;
        }
        if (this.c.c()) {
            this.e = true;
            ScheduledFuture scheduledFuture2 = this.d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
            }
            return;
        }
        if (!this.e && (scheduledFuture = this.d) != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (scheduledFuture.getDelay(timeUnit) > 50) {
                Locale locale = Locale.ENGLISH;
                long delay = this.d.getDelay(timeUnit);
                Logger.debug("RetryManager - Existing task is pending execution in " + delay + " ms, cancelling it");
                this.d.cancel(true);
            }
        }
        c();
    }

    public void c() {
        long b2 = this.c.b();
        if (b2 > 0) {
            Logger.debug("RetryManager - scheduling the task run retry to happen in " + b2 + " ms");
        }
        this.d = this.b.schedule(this.a, b2, TimeUnit.MILLISECONDS);
        this.c.a();
    }

    public final synchronized void d() {
        a(0, TimeUnit.SECONDS);
    }
}
