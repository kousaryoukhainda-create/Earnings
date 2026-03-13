package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ul implements HyBidInterstitialAd.Listener {
    @NotNull
    public final pb<HyBidInterstitialAd, rl, pl> a;
    @NotNull
    public final ql b;
    public HyBidInterstitialAd c;

    public ul(@NotNull pb<HyBidInterstitialAd, rl, pl> interstitialTPNAdapter, @NotNull ql verveErrorHelper) {
        Intrinsics.checkNotNullParameter(interstitialTPNAdapter, "interstitialTPNAdapter");
        Intrinsics.checkNotNullParameter(verveErrorHelper, "verveErrorHelper");
        this.a = interstitialTPNAdapter;
        this.b = verveErrorHelper;
    }

    public final void a(@NotNull HyBidInterstitialAd hyBidInterstitialAd) {
        Intrinsics.checkNotNullParameter(hyBidInterstitialAd, "<set-?>");
        this.c = hyBidInterstitialAd;
    }

    public final void onInterstitialClick() {
        Intrinsics.checkNotNullParameter("onInterstitialClick", "message");
        Logger.debug("Verve Adapter - onInterstitialClick");
        this.a.onClick();
    }

    public final void onInterstitialDismissed() {
        Intrinsics.checkNotNullParameter("onInterstitialDismissed", "message");
        Logger.debug("Verve Adapter - onInterstitialDismissed");
        this.a.onClose();
    }

    public final void onInterstitialImpression() {
        Intrinsics.checkNotNullParameter("onInterstitialImpression", "message");
        Logger.debug("Verve Adapter - onInterstitialImpression");
        this.a.onImpression();
    }

    public final void onInterstitialLoadFailed(Throwable th) {
        String str;
        StringBuilder sb = new StringBuilder("onInterstitialLoadFailed. error: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        sb.append(str);
        String message = sb.toString();
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.debug("Verve Adapter - " + message);
        this.b.getClass();
        kl a = ql.a(th);
        if (a instanceof rl) {
            this.a.b(a);
        } else if (a instanceof pl) {
            this.a.a(a);
        }
    }

    public final void onInterstitialLoaded() {
        Intrinsics.checkNotNullParameter("onInterstitialLoaded", "message");
        Logger.debug("Verve Adapter - onInterstitialLoaded");
        pb<HyBidInterstitialAd, rl, pl> pbVar = this.a;
        HyBidInterstitialAd hyBidInterstitialAd = this.c;
        if (hyBidInterstitialAd != null) {
            pbVar.a((pb<HyBidInterstitialAd, rl, pl>) hyBidInterstitialAd);
        } else {
            Intrinsics.f("verveInterstitialAd");
            throw null;
        }
    }
}
