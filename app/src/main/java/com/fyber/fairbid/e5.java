package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.FetchFailure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class e5 {
    @NotNull
    public final FetchFailure a;

    public e5(@NotNull FetchFailure fetchFailure) {
        Intrinsics.checkNotNullParameter(fetchFailure, "fetchFailure");
        this.a = fetchFailure;
    }
}
