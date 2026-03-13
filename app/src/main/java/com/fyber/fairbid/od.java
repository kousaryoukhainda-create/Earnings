package com.fyber.fairbid;

import com.facebook.ads.InterstitialAd;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class od extends md {
    @NotNull
    public final InterstitialAd a;
    @NotNull
    public final AdDisplay b;

    public od(@NotNull InterstitialAd interstitialAd, @NotNull AdDisplay adDisplay) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = interstitialAd;
        this.b = adDisplay;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        return this.a.isAdLoaded();
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        Logger.debug("MetaCachedInterstitialAd - show() called");
        AdDisplay adDisplay = this.b;
        if (!this.a.isAdLoaded()) {
            adDisplay.displayEventStream.sendEvent(DisplayResult.NOT_READY);
        } else {
            this.a.show();
        }
        return adDisplay;
    }
}
