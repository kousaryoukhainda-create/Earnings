package com.fyber.fairbid.mediation;

import com.fyber.fairbid.common.lifecycle.FetchResult;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.display.NetworkModel;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class NetworkResult {
    @NotNull
    public final FetchResult a;
    @NotNull
    public final NetworkModel b;
    public final NetworkAdapter c;
    public final double d;
    public final double e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Map<String, Object> j;
    @NotNull
    public final String k;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Builder {
        @NotNull
        public final FetchResult a;
        @NotNull
        public final NetworkModel b;
        public final NetworkAdapter c;
        @NotNull
        public final String d;
        public double e;
        public double f;
        public String g;
        public String h;
        public String i;
        public String j;
        public Map<String, ? extends Object> k;

        public Builder(@NotNull FetchResult fetchResult, @NotNull NetworkModel networkModel, NetworkAdapter networkAdapter, @NotNull String impressionId) {
            Intrinsics.checkNotNullParameter(fetchResult, "fetchResult");
            Intrinsics.checkNotNullParameter(networkModel, "networkModel");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            this.a = fetchResult;
            this.b = networkModel;
            this.c = networkAdapter;
            this.d = impressionId;
        }

        @NotNull
        public final NetworkResult build() {
            return new NetworkResult(this, null);
        }

        public final String getAdvertiserDomain$fairbid_sdk_release() {
            return this.h;
        }

        public final String getCampaignId$fairbid_sdk_release() {
            return this.j;
        }

        public final double getCpm$fairbid_sdk_release() {
            return this.e;
        }

        public final String getCreativeId$fairbid_sdk_release() {
            return this.i;
        }

        public final String getDemandSource$fairbid_sdk_release() {
            return this.g;
        }

        public final Map<String, Object> getExtraInstanceData$fairbid_sdk_release() {
            return this.k;
        }

        @NotNull
        public final FetchResult getFetchResult$fairbid_sdk_release() {
            return this.a;
        }

        @NotNull
        public final String getImpressionId$fairbid_sdk_release() {
            return this.d;
        }

        public final NetworkAdapter getNetworkAdapter$fairbid_sdk_release() {
            return this.c;
        }

        @NotNull
        public final NetworkModel getNetworkModel$fairbid_sdk_release() {
            return this.b;
        }

        public final double getPricingValue$fairbid_sdk_release() {
            return this.f;
        }

        @NotNull
        public final Builder setAdvertiserDomain(String str) {
            this.h = str;
            return this;
        }

        public final void setAdvertiserDomain$fairbid_sdk_release(String str) {
            this.h = str;
        }

        @NotNull
        public final Builder setCampaignId(String str) {
            this.j = str;
            return this;
        }

        public final void setCampaignId$fairbid_sdk_release(String str) {
            this.j = str;
        }

        @NotNull
        public final Builder setCpm(double d) {
            this.e = d;
            return this;
        }

        public final void setCpm$fairbid_sdk_release(double d) {
            this.e = d;
        }

        @NotNull
        public final Builder setCreativeId(String str) {
            this.i = str;
            return this;
        }

        public final void setCreativeId$fairbid_sdk_release(String str) {
            this.i = str;
        }

        @NotNull
        public final Builder setDemandSource(String str) {
            this.g = str;
            return this;
        }

        public final void setDemandSource$fairbid_sdk_release(String str) {
            this.g = str;
        }

        @NotNull
        public final Builder setExtraInstanceData(Map<String, ? extends Object> map) {
            this.k = map;
            return this;
        }

        public final void setExtraInstanceData$fairbid_sdk_release(Map<String, ? extends Object> map) {
            this.k = map;
        }

        @NotNull
        public final Builder setPricingValue(double d) {
            this.f = d;
            return this;
        }

        public final void setPricingValue$fairbid_sdk_release(double d) {
            this.f = d;
        }
    }

    public /* synthetic */ NetworkResult(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final String getAdvertiserDomain() {
        return this.g;
    }

    public final String getCampaignId() {
        return this.i;
    }

    public final double getCpm() {
        return this.d;
    }

    public final String getCreativeId() {
        return this.h;
    }

    public final String getDemandSource() {
        return this.f;
    }

    public final Map<String, Object> getExtraInstanceData() {
        return this.j;
    }

    @NotNull
    public final FetchResult getFetchResult() {
        return this.a;
    }

    @NotNull
    public final String getImpressionId() {
        return this.k;
    }

    public final NetworkAdapter getNetworkAdapter() {
        return this.c;
    }

    @NotNull
    public final NetworkModel getNetworkModel() {
        return this.b;
    }

    public final double getPricingValue() {
        return this.e;
    }

    @NotNull
    public String toString() {
        String format = String.format(Locale.ENGLISH, "<NetworkResult: %s>", Arrays.copyOf(new Object[]{this.b.getName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    public NetworkResult(Builder builder) {
        this.a = builder.getFetchResult$fairbid_sdk_release();
        this.b = builder.getNetworkModel$fairbid_sdk_release();
        this.c = builder.getNetworkAdapter$fairbid_sdk_release();
        this.d = builder.getCpm$fairbid_sdk_release();
        this.e = builder.getPricingValue$fairbid_sdk_release();
        this.f = builder.getDemandSource$fairbid_sdk_release();
        this.k = builder.getImpressionId$fairbid_sdk_release();
        this.g = builder.getAdvertiserDomain$fairbid_sdk_release();
        this.h = builder.getCreativeId$fairbid_sdk_release();
        this.i = builder.getCampaignId$fairbid_sdk_release();
        this.j = builder.getExtraInstanceData$fairbid_sdk_release();
    }
}
