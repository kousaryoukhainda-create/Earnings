package com.fyber.fairbid.ads;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class ImpressionDataExt {
    @NotNull
    public static final JSONObject getImpressionDataJsonObject(@NotNull ImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "<this>");
        return new JSONObject(getImpressionDataMap(impressionData));
    }

    @NotNull
    public static final Map<String, Object> getImpressionDataMap(@NotNull ImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "<this>");
        return C2148mJ.e(new JQ("advertiser_domain", impressionData.getAdvertiserDomain()), new JQ("campaign_id", impressionData.getCampaignId()), new JQ("country_code", impressionData.getCountryCode()), new JQ("creative_id", impressionData.getCreativeId()), new JQ("currency", impressionData.getCurrency()), new JQ("demand_source", impressionData.getDemandSource()), new JQ("impression_depth", Integer.valueOf(impressionData.getImpressionDepth())), new JQ("impression_id", impressionData.getImpressionId()), new JQ("request_id", impressionData.getRequestId()), new JQ("net_payout", Double.valueOf(impressionData.getNetPayout())), new JQ("network_instance_id", impressionData.getNetworkInstanceId()), new JQ("price_accuracy", Integer.valueOf(impressionData.getPriceAccuracy().getInternalCode())), new JQ("placement_type", Integer.valueOf(impressionData.getPlacementType().getInternalCode())), new JQ("rendering_sdk", impressionData.getRenderingSdk()), new JQ("rendering_sdk_version", impressionData.getRenderingSdkVersion()), new JQ("variant_id", impressionData.getVariantId()));
    }
}
