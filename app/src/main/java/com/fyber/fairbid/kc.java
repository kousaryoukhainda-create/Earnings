package com.fyber.fairbid;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class kc extends xi {
    @NotNull
    public final AtomicBoolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(@NotNull com.fyber.fairbid.ads.banner.internal.a task, @NotNull y3 retrySchedule, @NotNull ScheduledExecutorService executorService) {
        super(task, retrySchedule, executorService);
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(retrySchedule, "retrySchedule");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f = new AtomicBoolean(true);
    }

    @Override // com.fyber.fairbid.xi
    public final void b() {
        super.b();
        this.f.set(true);
    }

    @Override // com.fyber.fairbid.xi
    public final void c() {
    }

    public final void e() {
        if (this.f.compareAndSet(true, false)) {
            super.c();
        }
    }
}
