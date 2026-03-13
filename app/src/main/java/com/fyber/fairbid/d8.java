package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.PauseSignal;
import com.fyber.fairbid.internal.ActivityProvider;
import com.fyber.fairbid.internal.ContextReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class d8 implements Runnable {
    @NotNull
    public final Runnable a;
    @NotNull
    public final PauseSignal b;
    @NotNull
    public final ExecutorService c;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public final ActivityProvider a;
        @NotNull
        public final ExecutorService b;

        public a(@NotNull ContextReference activityProvider, @NotNull ScheduledThreadPoolExecutor executor) {
            Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.a = activityProvider;
            this.b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements PauseSignal.a {
        public b() {
        }

        @Override // com.fyber.fairbid.common.concurrency.PauseSignal.a
        public final void a(@NotNull PauseSignal pauseSignal) {
            Intrinsics.checkNotNullParameter(pauseSignal, "pauseSignal");
            pauseSignal.c.remove(this);
            d8 d8Var = d8.this;
            d8Var.c.execute(d8Var.a);
        }

        @Override // com.fyber.fairbid.common.concurrency.PauseSignal.a
        public final void b(@NotNull PauseSignal pauseSignal) {
            Intrinsics.checkNotNullParameter(pauseSignal, "pauseSignal");
        }
    }

    public d8(Runnable runnable, m3 m3Var, ExecutorService executorService) {
        this.a = runnable;
        this.b = m3Var;
        this.c = executorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.b.get()) {
            this.c.execute(this.a);
            return;
        }
        PauseSignal pauseSignal = this.b;
        pauseSignal.c.add(new b());
    }
}
