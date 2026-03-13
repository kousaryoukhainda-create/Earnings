package com.fyber.fairbid.http.overrider;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class NoOpRequestOverrider implements RequestOverrider {
    @Override // com.fyber.fairbid.http.overrider.RequestOverrider
    @NotNull
    public String overrideUrl(@NotNull String method, @NotNull String url) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        return url;
    }
}
