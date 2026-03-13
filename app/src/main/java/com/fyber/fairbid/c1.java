package com.fyber.fairbid;

import android.view.View;
import com.amazon.device.ads.DTBAdView;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.internal.utils.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class c1 implements BannerWrapper {
    @NotNull
    public final DTBAdView a;
    public final int b;
    public final int c;
    @NotNull
    public final ScreenUtils d;

    public c1(@NotNull DTBAdView dtbAdView, int i, int i2, @NotNull ScreenUtils screenUtils) {
        Intrinsics.checkNotNullParameter(dtbAdView, "dtbAdView");
        Intrinsics.checkNotNullParameter(screenUtils, "screenUtils");
        this.a = dtbAdView;
        this.b = i;
        this.c = i2;
        this.d = screenUtils;
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
        return this.d.dpToPx(this.c);
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        return this.d.dpToPx(this.b);
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
