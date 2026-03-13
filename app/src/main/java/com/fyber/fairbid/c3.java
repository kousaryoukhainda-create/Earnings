package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class c3 extends b3 {
    @NotNull
    public final oc d;
    @NotNull
    public final u2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(@NotNull oc marketplaceAuctionResponse, long j, long j2, @NotNull u2 auctionData) {
        super(j, j2, auctionData, 0);
        Intrinsics.checkNotNullParameter(marketplaceAuctionResponse, "marketplaceAuctionResponse");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.d = marketplaceAuctionResponse;
        this.e = auctionData;
    }

    @Override // com.fyber.fairbid.b3
    @NotNull
    public final u2 a() {
        return this.e;
    }
}
