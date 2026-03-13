package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.concurrency.VerifiableSettableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121s0 {
    @NotNull
    public final ScheduledExecutorService a;
    public long b;
    @NotNull
    public final AtomicBoolean c;
    @NotNull
    public final AtomicBoolean d;
    @NotNull
    public final VerifiableSettableFuture<Boolean> e;
    @NotNull
    public final SettableFuture<Boolean> f;

    public C1121s0(@NotNull ScheduledExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.a = executorService;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        VerifiableSettableFuture<Boolean> a = VerifiableSettableFuture.a.a(VerifiableSettableFuture.Companion);
        this.e = a;
        SettableFuture<Boolean> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.f = create;
        com.fyber.fairbid.common.concurrency.a.a(a, create, executorService);
    }

    @NotNull
    public final VerifiableSettableFuture<Boolean> a() {
        return this.e;
    }
}
