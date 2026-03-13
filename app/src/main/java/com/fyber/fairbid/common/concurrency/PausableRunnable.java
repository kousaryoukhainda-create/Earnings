package com.fyber.fairbid.common.concurrency;

import com.fyber.fairbid.common.concurrency.PauseSignal;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class PausableRunnable implements Runnable {
    public final PauseSignal a;
    public final Executor b;
    public final a c = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PausableRunnable.this.b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements PauseSignal.a {
        public b() {
        }

        @Override // com.fyber.fairbid.common.concurrency.PauseSignal.a
        public final void a(PauseSignal pauseSignal) {
            PausableRunnable.this.a.c.remove(this);
            PausableRunnable pausableRunnable = PausableRunnable.this;
            pausableRunnable.b.execute(pausableRunnable.c);
        }

        @Override // com.fyber.fairbid.common.concurrency.PauseSignal.a
        public final void b(PauseSignal pauseSignal) {
        }
    }

    public PausableRunnable(PauseSignal pauseSignal, Executor executor) {
        this.a = pauseSignal;
        this.b = executor;
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.b.get()) {
            this.b.execute(this.c);
            return;
        }
        PauseSignal pauseSignal = this.a;
        pauseSignal.c.add(new b());
    }
}
