package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102i0 extends AbstractC1117q {
    @NotNull
    public final gc<ia> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1102i0(@NotNull Constants.AdType adType, int i, @NotNull SettableFuture auditResultFuture) {
        super(adType, i, 0);
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(auditResultFuture, "auditResultFuture");
        this.c = auditResultFuture;
    }
}
