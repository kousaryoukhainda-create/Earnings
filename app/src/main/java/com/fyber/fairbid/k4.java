package com.fyber.fairbid;

import android.view.View;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.internal.utils.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
/* loaded from: classes.dex */
public final class k4 implements BannerWrapper {
    @NotNull
    public final BannerAd a;
    @NotNull
    public final AdSize b;
    @NotNull
    public final ScreenUtils c;

    public k4(@NotNull BannerAd bannerAd, @NotNull AdSize bannerSize, @NotNull ScreenUtils screenUtils) {
        Intrinsics.checkNotNullParameter(bannerAd, "bannerAd");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(screenUtils, "screenUtils");
        this.a = bannerAd;
        this.b = bannerSize;
        this.c = screenUtils;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean canRefresh() {
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean destroyBanner(boolean z) {
        this.a.destroy();
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdHeight() {
        return this.c.dpToPx(this.b.getHeight());
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        return this.c.dpToPx(this.b.getWidth());
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    @NotNull
    public final View getRealBannerView() {
        View adView = this.a.adView();
        Intrinsics.checkNotNullExpressionValue(adView, "bannerAd.adView()");
        return adView;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean isUsingFullWidth() {
        return false;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean isViewAvailable() {
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final /* synthetic */ void onBannerAttachedToView() {
        G9.a(this);
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final void setSizeChangeListener(BannerWrapper.OnSizeChangeListener onSizeChangeListener) {
    }
}
