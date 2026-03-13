package com.fyber.fairbid.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface ImpressionData {

    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @NotNull
        public static String getJsonString(@NotNull ImpressionData impressionData) {
            String jSONObject = ImpressionDataExt.getImpressionDataJsonObject(impressionData).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "impressionDataJsonObject.toString()");
            return jSONObject;
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public enum PriceAccuracy {
        UNDISCLOSED(0),
        PREDICTED(1),
        PROGRAMMATIC(2);
        
        public final int a;

        PriceAccuracy(int i) {
            this.a = i;
        }

        public final int getInternalCode() {
            return this.a;
        }
    }

    String getAdvertiserDomain();

    String getCampaignId();

    String getCountryCode();

    String getCreativeId();

    @NotNull
    String getCurrency();

    String getDemandSource();

    int getImpressionDepth();

    @NotNull
    String getImpressionId();

    @NotNull
    String getJsonString();

    double getNetPayout();

    String getNetworkInstanceId();

    @NotNull
    PlacementType getPlacementType();

    @NotNull
    PriceAccuracy getPriceAccuracy();

    String getRenderingSdk();

    String getRenderingSdkVersion();

    @NotNull
    String getRequestId();

    String getVariantId();
}
