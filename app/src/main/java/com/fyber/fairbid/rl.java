package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.FetchFailure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class rl implements kl {
    @NotNull
    public final FetchFailure a;

    public rl(@NotNull FetchFailure fetchFailure) {
        Intrinsics.checkNotNullParameter(fetchFailure, "fetchFailure");
        this.a = fetchFailure;
    }
}
