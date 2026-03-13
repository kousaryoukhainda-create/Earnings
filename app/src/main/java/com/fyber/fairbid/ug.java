package com.fyber.fairbid;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ug implements PAGBannerAdLoadListener {
    @NotNull
    public final wg a;

    public ug(@NotNull wg pangleBannerAdapter) {
        Intrinsics.checkNotNullParameter(pangleBannerAdapter, "pangleBannerAdapter");
        this.a = pangleBannerAdapter;
    }

    public final void onAdLoaded(Object obj) {
        PAGBannerAd ad = (PAGBannerAd) obj;
        Intrinsics.checkNotNullParameter(ad, "bannerAd");
        wg wgVar = this.a;
        wgVar.getClass();
        Intrinsics.checkNotNullParameter(ad, "ad");
        wgVar.e = ad;
        wgVar.c.set(new DisplayableFetchResult(wgVar));
    }

    public final void onError(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        wg wgVar = this.a;
        FetchFailure loadError = zg.a(i);
        wgVar.getClass();
        Intrinsics.checkNotNullParameter(loadError, "loadError");
        wgVar.c.set(new DisplayableFetchResult(loadError));
    }
}
