package com.fyber.fairbid;

import android.content.Context;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.fyber.fairbid.common.banner.BannerWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class g2 implements BannerWrapper {
    @NotNull
    public final AppLovinAdView a;

    public g2(@NotNull AppLovinAdView banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.a = banner;
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
        int i;
        boolean isTablet = AppLovinSdkUtils.isTablet(this.a.getContext());
        Context context = this.a.getContext();
        if (isTablet) {
            i = 90;
        } else {
            i = 50;
        }
        return AppLovinSdkUtils.dpToPx(context, i);
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
