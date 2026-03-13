package com.fyber.fairbid;

import com.fyber.fairbid.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100h0 extends AbstractC1117q {
    @NotNull
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100h0(int i, @NotNull Constants.AdType adType, @NotNull String requestId) {
        super(adType, i, 0);
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.c = requestId;
    }
}
