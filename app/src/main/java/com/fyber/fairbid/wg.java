package com.fyber.fairbid;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class wg implements x3<PAGBannerAd, FetchFailure> {
    @NotNull
    public final String a;
    @NotNull
    public final xg b;
    @NotNull
    public final SettableFuture<DisplayableFetchResult> c;
    @NotNull
    public final AdDisplay d;
    public PAGBannerAd e;

    public wg(@NotNull String instanceId, @NotNull xg pangleBanner) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(pangleBanner, "pangleBanner");
        this.a = instanceId;
        this.b = pangleBanner;
        SettableFuture<DisplayableFetchResult> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.c = create;
        AdDisplay build = AdDisplay.newBuilder().supportsBillableImpressionCallback(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …rue)\n            .build()");
        this.d = build;
    }

    @Override // com.fyber.fairbid.c4
    public final void a(Object obj) {
        PAGBannerAd ad = (PAGBannerAd) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.e = ad;
        this.c.set(new DisplayableFetchResult(this));
    }

    @Override // com.fyber.fairbid.c4
    public final void b(kl klVar) {
        FetchFailure loadError = (FetchFailure) klVar;
        Intrinsics.checkNotNullParameter(loadError, "loadError");
        this.c.set(new DisplayableFetchResult(loadError));
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.fairbid.d4
    public final void onClick() {
        this.d.clickEventStream.sendEvent(Boolean.TRUE);
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        B90 b90;
        PAGBannerAd pAGBannerAd = this.e;
        if (pAGBannerAd != null) {
            yg ygVar = new yg(pAGBannerAd);
            pAGBannerAd.setAdInteractionListener(new vg(this));
            this.d.displayEventStream.sendEvent(new DisplayResult(ygVar));
            b90 = B90.a;
        } else {
            b90 = null;
        }
        if (b90 == null) {
            this.d.displayEventStream.sendEvent(new DisplayResult(new DisplayResult.Error(DisplayResult.ErrorType.NOT_READY, "No banner ad available", RequestFailure.UNAVAILABLE)));
        }
        return this.d;
    }
}
