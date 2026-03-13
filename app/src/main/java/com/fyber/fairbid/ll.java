package com.fyber.fairbid;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.views.HyBidAdView;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ll {
    @NotNull
    public static HyBidInterstitialAd a(@NotNull Context context, @NotNull String zoneId, @NotNull ul listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new HyBidInterstitialAd(context, zoneId, listener);
    }

    @NotNull
    public static HyBidInterstitialAd a(@NotNull Context context, @NotNull String zoneId, String str, @NotNull ul listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new HyBidInterstitialAd(context, str, zoneId, listener);
    }

    @NotNull
    public static HyBidRewardedAd a(@NotNull Context context, @NotNull String zoneId, @NotNull yl listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new HyBidRewardedAd(context, zoneId, listener);
    }

    @NotNull
    public static HyBidRewardedAd a(@NotNull Context context, @NotNull String zoneId, String str, @NotNull yl listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new HyBidRewardedAd(context, str, zoneId, listener);
    }

    @NotNull
    public static HyBidAdView a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new HyBidAdView(context);
    }
}
