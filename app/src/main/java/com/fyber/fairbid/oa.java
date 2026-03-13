package com.fyber.fairbid;

import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class oa implements ImpressionData {
    @NotNull
    public static final ImpressionData.PriceAccuracy h = ImpressionData.PriceAccuracy.UNDISCLOSED;
    @NotNull
    public final PlacementType a;
    public final int b;
    public final String c;
    @NotNull
    public final String d;
    @NotNull
    public final ImpressionData.PriceAccuracy e;
    @NotNull
    public final String f;
    @NotNull
    public final String g;

    public oa(@NotNull PlacementType placementType, int i, String str, @NotNull String impressionId) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        this.a = placementType;
        this.b = i;
        this.c = str;
        this.d = impressionId;
        this.e = h;
        this.f = "USD";
        this.g = getImpressionId();
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getAdvertiserDomain() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getCampaignId() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getCountryCode() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getCreativeId() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    @NotNull
    public final String getCurrency() {
        return this.f;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getDemandSource() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final int getImpressionDepth() {
        return this.b;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    @NotNull
    public final String getImpressionId() {
        return this.d;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    @NotNull
    public final String getJsonString() {
        return ImpressionData.DefaultImpls.getJsonString(this);
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final double getNetPayout() {
        return 0.0d;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getNetworkInstanceId() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    @NotNull
    public final PlacementType getPlacementType() {
        return this.a;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    @NotNull
    public final ImpressionData.PriceAccuracy getPriceAccuracy() {
        return this.e;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getRenderingSdk() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getRenderingSdkVersion() {
        return null;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    @NotNull
    public final String getRequestId() {
        return this.g;
    }

    @Override // com.fyber.fairbid.ads.ImpressionData
    public final String getVariantId() {
        return this.c;
    }
}
