package com.fyber.fairbid;

import com.fyber.fairbid.a2;
import com.fyber.fairbid.xi;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class b2 extends xi implements a2.a {
    @NotNull
    public static final long[] g = {10, 20, 40, 80, 160, 300};
    @NotNull
    public final InterfaceC0263Ez f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(@NotNull Runnable task, @NotNull ScheduledExecutorService executorService, @NotNull InterfaceC0263Ez success) {
        super(task, new xi.a(g, TimeUnit.SECONDS), executorService);
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(success, "success");
        this.f = success;
    }

    @Override // com.fyber.fairbid.a2.a
    public final void a() {
        b();
    }

    @Override // com.fyber.fairbid.a2.a
    public final void onSuccess() {
        this.f.invoke();
    }
}
