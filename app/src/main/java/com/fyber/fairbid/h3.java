package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class h3 extends b3 {
    @NotNull
    public final u2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(@NotNull mk trackingUrls, long j, long j2, @NotNull u2 auctionData) {
        super(j, j2, auctionData, 0);
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.d = auctionData;
    }

    @Override // com.fyber.fairbid.b3
    @NotNull
    public final u2 a() {
        return this.d;
    }
}
