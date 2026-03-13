package com.fyber.fairbid;

import android.view.View;
import com.fyber.fairbid.common.banner.BannerWrapper;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.views.HyBidAdView;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ol implements BannerWrapper {
    @NotNull
    public final HyBidAdView a;

    public ol(@NotNull HyBidAdView banAd) {
        Intrinsics.checkNotNullParameter(banAd, "banAd");
        this.a = banAd;
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
        return -2;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        return -2;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    @NotNull
    public final View getRealBannerView() {
        return this.a;
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
