package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class yl implements HyBidRewardedAd.Listener {
    @NotNull
    public final zi<HyBidRewardedAd, rl, pl> a;
    @NotNull
    public final ql b;
    public HyBidRewardedAd c;

    public yl(@NotNull zi<HyBidRewardedAd, rl, pl> verveRewardedAdapter, @NotNull ql verveErrorHelper) {
        Intrinsics.checkNotNullParameter(verveRewardedAdapter, "verveRewardedAdapter");
        Intrinsics.checkNotNullParameter(verveErrorHelper, "verveErrorHelper");
        this.a = verveRewardedAdapter;
        this.b = verveErrorHelper;
    }

    public final void a(@NotNull HyBidRewardedAd hyBidRewardedAd) {
        Intrinsics.checkNotNullParameter(hyBidRewardedAd, "<set-?>");
        this.c = hyBidRewardedAd;
    }

    public final void onReward() {
        Intrinsics.checkNotNullParameter("onReward", "message");
        Logger.debug("Verve Adapter - onReward");
        this.a.onReward();
    }

    public final void onRewardedClick() {
        Intrinsics.checkNotNullParameter("onRewardedClick", "message");
        Logger.debug("Verve Adapter - onRewardedClick");
        this.a.onClick();
    }

    public final void onRewardedClosed() {
        Intrinsics.checkNotNullParameter("onRewardedClosed", "message");
        Logger.debug("Verve Adapter - onRewardedClosed");
        this.a.onClose();
    }

    public final void onRewardedLoadFailed(Throwable th) {
        String str;
        StringBuilder sb = new StringBuilder("onRewardedLoadFailed. error: ");
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

    public final void onRewardedLoaded() {
        Intrinsics.checkNotNullParameter("onRewardedLoaded", "message");
        Logger.debug("Verve Adapter - onRewardedLoaded");
        zi<HyBidRewardedAd, rl, pl> ziVar = this.a;
        HyBidRewardedAd hyBidRewardedAd = this.c;
        if (hyBidRewardedAd != null) {
            ziVar.a((zi<HyBidRewardedAd, rl, pl>) hyBidRewardedAd);
        } else {
            Intrinsics.f("verveRewardedAd");
            throw null;
        }
    }

    public final void onRewardedOpened() {
        Intrinsics.checkNotNullParameter("onRewardedOpened", "message");
        Logger.debug("Verve Adapter - onRewardedOpened");
        this.a.onImpression();
    }
}
