package com.fyber.fairbid;

import com.fyber.fairbid.mediation.display.NetworkModel;
import com.fyber.fairbid.sdk.ads.PMNAd;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class g3 extends b3 {
    @NotNull
    public final PMNAd d;
    @NotNull
    public final List<NetworkModel> e;
    @NotNull
    public final u2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(@NotNull PMNAd pmnAd, @NotNull List<NetworkModel> programmaticNetworks, long j, long j2, @NotNull u2 auctionData) {
        super(j, j2, auctionData, 0);
        Intrinsics.checkNotNullParameter(pmnAd, "pmnAd");
        Intrinsics.checkNotNullParameter(programmaticNetworks, "programmaticNetworks");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.d = pmnAd;
        this.e = programmaticNetworks;
        this.f = auctionData;
    }

    @Override // com.fyber.fairbid.b3
    @NotNull
    public final u2 a() {
        return this.f;
    }
}
