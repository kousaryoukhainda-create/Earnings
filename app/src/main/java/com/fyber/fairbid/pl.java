package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.DisplayResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class pl implements kl {
    @NotNull
    public final DisplayResult.Error a;

    public pl(@NotNull DisplayResult.Error displayError) {
        Intrinsics.checkNotNullParameter(displayError, "displayError");
        this.a = displayError;
    }
}
