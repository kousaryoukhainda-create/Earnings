package com.fyber.fairbid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ra implements BannerWrapper {
    @NotNull
    public final InMobiBanner a;
    @NotNull
    public final ViewGroup b;

    public ra(@NotNull InMobiBanner banner, @NotNull FrameLayout bannerFrame) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(bannerFrame, "bannerFrame");
        this.a = banner;
        this.b = bannerFrame;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean canRefresh() {
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean destroyBanner(boolean z) {
        this.a.destroy();
        this.b.removeAllViews();
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdHeight() {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            return layoutParams.width;
        }
        return 0;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    @NotNull
    public final View getRealBannerView() {
        return this.b;
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
