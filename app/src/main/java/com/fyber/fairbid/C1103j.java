package com.fyber.fairbid;

import android.view.View;
import com.adcolony.sdk.AdColonyAdView;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.internal.utils.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103j implements BannerWrapper {
    @NotNull
    public final AdColonyAdView a;
    @NotNull
    public final ScreenUtils b;

    public C1103j(@NotNull AdColonyAdView adColonyBannerView, @NotNull ScreenUtils screenUtils) {
        Intrinsics.checkNotNullParameter(adColonyBannerView, "adColonyBannerView");
        Intrinsics.checkNotNullParameter(screenUtils, "screenUtils");
        this.a = adColonyBannerView;
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
        return this.b.dpToPx(this.a.getAdSize().getHeight());
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        return this.b.dpToPx(this.a.getAdSize().getWidth());
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
        if (this.a != null) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final /* synthetic */ void onBannerAttachedToView() {
        G9.a(this);
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final void setSizeChangeListener(BannerWrapper.OnSizeChangeListener onSizeChangeListener) {
    }
}
