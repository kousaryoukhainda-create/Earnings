package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.PNAdView;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class nl implements PNAdView.Listener {
    @NotNull
    public final x3<HyBidAdView, rl> a;
    @NotNull
    public final ql b;
    public HyBidAdView c;

    public nl(@NotNull x3<HyBidAdView, rl> bannerTPNAdapter, @NotNull ql verveErrorHelper) {
        Intrinsics.checkNotNullParameter(bannerTPNAdapter, "bannerTPNAdapter");
        Intrinsics.checkNotNullParameter(verveErrorHelper, "verveErrorHelper");
        this.a = bannerTPNAdapter;
        this.b = verveErrorHelper;
    }

    public final void a(@NotNull HyBidAdView hyBidAdView) {
        Intrinsics.checkNotNullParameter(hyBidAdView, "<set-?>");
        this.c = hyBidAdView;
    }

    public final void onAdClick() {
        Intrinsics.checkNotNullParameter("onAdClick", "message");
        Logger.debug("Verve Adapter - onAdClick");
        this.a.onClick();
    }

    public final void onAdImpression() {
        Intrinsics.checkNotNullParameter("onAdImpression", "message");
        Logger.debug("Verve Adapter - onAdImpression");
    }

    public final void onAdLoadFailed(Throwable th) {
        StringBuilder sb = new StringBuilder("onAdLoadFailed (");
        sb.append(hashCode());
        sb.append(") - cached ad hash: ");
        HyBidAdView hyBidAdView = this.c;
        String str = null;
        if (hyBidAdView != null) {
            sb.append(hyBidAdView.hashCode());
            sb.append(" - error: ");
            if (th != null) {
                str = th.getMessage();
            }
            sb.append(str);
            String message = sb.toString();
            Intrinsics.checkNotNullParameter(message, "message");
            Logger.debug("Verve Adapter - " + message);
            this.b.getClass();
            kl a = ql.a(th);
            if (a instanceof rl) {
                this.a.b(a);
                return;
            } else if (a instanceof pl) {
                String message2 = "onAdLoadFailed with a display type error: " + a + " This is not expected";
                Intrinsics.checkNotNullParameter(message2, "message");
                Logger.error("Verve Adapter - " + message2);
                return;
            } else {
                return;
            }
        }
        Intrinsics.f("verveBannerAd");
        throw null;
    }

    public final void onAdLoaded() {
        StringBuilder sb = new StringBuilder("onAdLoaded (this hash:");
        sb.append(hashCode());
        sb.append(") - cached ad hash: ");
        HyBidAdView hyBidAdView = this.c;
        if (hyBidAdView != null) {
            sb.append(hyBidAdView.hashCode());
            String message = sb.toString();
            Intrinsics.checkNotNullParameter(message, "message");
            Logger.debug("Verve Adapter - " + message);
            x3<HyBidAdView, rl> x3Var = this.a;
            HyBidAdView hyBidAdView2 = this.c;
            if (hyBidAdView2 != null) {
                x3Var.a(hyBidAdView2);
                return;
            } else {
                Intrinsics.f("verveBannerAd");
                throw null;
            }
        }
        Intrinsics.f("verveBannerAd");
        throw null;
    }
}
