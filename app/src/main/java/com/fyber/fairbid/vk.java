package com.fyber.fairbid;

import android.view.View;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.internal.utils.ScreenUtils;
import com.unity3d.services.banners.BannerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class vk implements BannerWrapper {
    @NotNull
    public final BannerView a;
    @NotNull
    public final ScreenUtils b;

    public vk(@NotNull BannerView unityAdsBanner, @NotNull ScreenUtils screenUtils) {
        Intrinsics.checkNotNullParameter(unityAdsBanner, "unityAdsBanner");
        Intrinsics.checkNotNullParameter(screenUtils, "screenUtils");
        this.a = unityAdsBanner;
        this.b = screenUtils;
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
        return this.b.dpToPx(this.a.getSize().getHeight());
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        return this.b.dpToPx(this.a.getSize().getWidth());
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
