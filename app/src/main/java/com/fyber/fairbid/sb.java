package com.fyber.fairbid;

import android.view.View;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.internal.Logger;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class sb implements BannerWrapper {
    @NotNull
    public final ISDemandOnlyBannerLayout a;
    @NotNull
    public final String b;

    public sb(@NotNull ISDemandOnlyBannerLayout ironSourceBannerView, @NotNull String instanceId) {
        Intrinsics.checkNotNullParameter(ironSourceBannerView, "ironSourceBannerView");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.a = ironSourceBannerView;
        this.b = instanceId;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean canRefresh() {
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final boolean destroyBanner(boolean z) {
        this.a.removeAllViews();
        this.a.removeBannerListener();
        IronSource.destroyISDemandOnlyBanner(this.b);
        Logger.debug("Is banner destroyed: " + this.a.isDestroyed());
        return true;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdHeight() {
        Logger.debug("BannerWrapper - getAdHeight: -2");
        return -2;
    }

    @Override // com.fyber.fairbid.common.banner.BannerWrapper
    public final int getAdWidth() {
        Logger.debug("BannerWrapper - getAdWidth: -2");
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
