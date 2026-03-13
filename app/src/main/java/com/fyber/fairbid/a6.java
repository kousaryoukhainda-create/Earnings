package com.fyber.fairbid;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class a6 implements u6 {
    @NotNull
    public final Map<String, String> a;

    public a6(@NotNull Map<String, String> customParams) {
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        this.a = customParams;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, String> a() {
        return this.a;
    }
}
