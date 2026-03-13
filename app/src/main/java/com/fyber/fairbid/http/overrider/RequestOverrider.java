package com.fyber.fairbid.http.overrider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface RequestOverrider {
    @NotNull
    String overrideUrl(@NotNull String str, @NotNull String str2);
}
