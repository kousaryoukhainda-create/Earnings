package com.fyber.fairbid;

import com.facebook.ads.RewardedVideoAd;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class pd extends md {
    @NotNull
    public final RewardedVideoAd a;
    @NotNull
    public final AdDisplay b;

    public pd(@NotNull RewardedVideoAd rewardedVideoAd, @NotNull AdDisplay adDisplay) {
        Intrinsics.checkNotNullParameter(rewardedVideoAd, "rewardedVideoAd");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = rewardedVideoAd;
        this.b = adDisplay;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        return this.a.isAdLoaded();
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        Logger.debug("MetaCachedRewardedVideoAd - show() called");
        AdDisplay adDisplay = this.b;
        if (!this.a.isAdLoaded()) {
            adDisplay.displayEventStream.sendEvent(DisplayResult.NOT_READY);
        } else {
            this.a.show();
        }
        return adDisplay;
    }
}
