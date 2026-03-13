package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.DisplayResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class d5 {
    @NotNull
    public final DisplayResult.Error a;

    public d5(@NotNull DisplayResult.Error displayError) {
        Intrinsics.checkNotNullParameter(displayError, "displayError");
        this.a = displayError;
    }
}
