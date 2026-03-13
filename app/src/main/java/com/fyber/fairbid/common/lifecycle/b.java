package com.fyber.fairbid.common.lifecycle;

import com.fyber.fairbid.common.lifecycle.DisplayResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class b extends DisplayResult {
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull DisplayResult.Error error) {
        super(error);
        Intrinsics.checkNotNullParameter(error, "error");
        this.i = true;
    }

    @Override // com.fyber.fairbid.common.lifecycle.DisplayResult
    public final boolean isBannerResult() {
        return this.i;
    }
}
