package com.fyber.fairbid;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class vg implements PAGBannerAdInteractionListener {
    @NotNull
    public final wg a;

    public vg(@NotNull wg pangleBannerAdapter) {
        Intrinsics.checkNotNullParameter(pangleBannerAdapter, "pangleBannerAdapter");
        this.a = pangleBannerAdapter;
    }

    public final void onAdClicked() {
        this.a.onClick();
    }

    public final void onAdDismissed() {
    }

    public final void onAdShowed() {
        this.a.d.billableImpressionListener.set(Boolean.TRUE);
    }
}
