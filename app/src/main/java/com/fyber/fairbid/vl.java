package com.fyber.fairbid;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class vl extends sl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(@NotNull ll verveSDKAPIWrapper, @NotNull Context context, @NotNull String zoneId, String str) {
        super(verveSDKAPIWrapper, context, zoneId, str);
        Intrinsics.checkNotNullParameter(verveSDKAPIWrapper, "verveSDKAPIWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
    }
}
