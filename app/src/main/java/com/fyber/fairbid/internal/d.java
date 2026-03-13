package com.fyber.fairbid.internal;

import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.lk;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class d implements lk {
    @NotNull
    public final c a;
    @NotNull
    public final String b;
    public final long c;

    public d(@NotNull c fairBidTrackingIDsUtils, @NotNull Utils.ClockHelper clockHelper) {
        Intrinsics.checkNotNullParameter(fairBidTrackingIDsUtils, "fairBidTrackingIDsUtils");
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        this.a = fairBidTrackingIDsUtils;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.b = uuid;
        this.c = clockHelper.getCurrentTimeMillis();
    }

    @Override // com.fyber.fairbid.lk
    @NotNull
    public final String a() {
        return this.a.a();
    }
}
