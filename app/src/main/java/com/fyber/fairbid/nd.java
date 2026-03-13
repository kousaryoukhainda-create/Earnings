package com.fyber.fairbid;

import com.facebook.ads.AdView;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class nd extends md {
    @NotNull
    public final AdView a;
    @NotNull
    public final AdDisplay b;

    public nd(@NotNull AdView bannerAd, @NotNull AdDisplay adDisplay) {
        Intrinsics.checkNotNullParameter(bannerAd, "bannerAd");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = bannerAd;
        this.b = adDisplay;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        return true;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        Logger.debug("MetaCachedBannerAd - onShow() called");
        this.b.displayEventStream.sendEvent(new DisplayResult(new ld(this.a)));
        return this.b;
    }
}
