package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1127v0 {
    public final double a;
    @NotNull
    public final SettableFuture<DisplayableFetchResult> b;

    public AbstractC1127v0(double d, @NotNull SettableFuture<DisplayableFetchResult> fetchFuture) {
        Intrinsics.checkNotNullParameter(fetchFuture, "fetchFuture");
        this.a = d;
        this.b = fetchFuture;
    }
}
