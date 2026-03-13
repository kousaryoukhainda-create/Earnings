package com.fyber.fairbid;

import com.fyber.fairbid.internal.Utils;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class j8 {
    @NotNull
    public final Utils.ClockHelper a;
    @NotNull
    public final LinkedHashMap b;

    public j8(@NotNull Utils.ClockHelper clockHelper) {
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        this.a = clockHelper;
        this.b = new LinkedHashMap();
    }
}
