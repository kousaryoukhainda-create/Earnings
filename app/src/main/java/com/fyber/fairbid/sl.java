package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class sl implements pb<HyBidInterstitialAd, rl, pl> {
    @NotNull
    public final SettableFuture<DisplayableFetchResult> a;
    @NotNull
    public final HyBidInterstitialAd b;
    @NotNull
    public final AdDisplay c;

    public sl(@NotNull ll verveSDKAPIWrapper, @NotNull Context context, @NotNull String zoneId, String str) {
        HyBidInterstitialAd a;
        Intrinsics.checkNotNullParameter(verveSDKAPIWrapper, "verveSDKAPIWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        SettableFuture<DisplayableFetchResult> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.a = create;
        ul ulVar = new ul(this, new ql());
        if (str != null) {
            verveSDKAPIWrapper.getClass();
            a = ll.a(context, zoneId, str, ulVar);
        } else {
            verveSDKAPIWrapper.getClass();
            a = ll.a(context, zoneId, ulVar);
        }
        this.b = a;
        this.c = te.a("newBuilder().build()");
        ulVar.a(a);
    }

    @Override // com.fyber.fairbid.c4
    public final void a(Object obj) {
        HyBidInterstitialAd ad = (HyBidInterstitialAd) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a.set(new DisplayableFetchResult(this));
    }

    @Override // com.fyber.fairbid.c4
    public final void b(kl klVar) {
        rl verveFetchFailure = (rl) klVar;
        Intrinsics.checkNotNullParameter(verveFetchFailure, "verveFetchFailure");
        this.a.set(new DisplayableFetchResult(verveFetchFailure.a));
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        return this.b.isReady();
    }

    @Override // com.fyber.fairbid.d4
    public final void onClick() {
        this.c.clickEventStream.sendEvent(Boolean.TRUE);
    }

    @Override // com.fyber.fairbid.i8
    public final void onClose() {
        this.c.closeListener.set(Boolean.TRUE);
    }

    @Override // com.fyber.fairbid.i8
    public final void onImpression() {
        this.c.displayEventStream.sendEvent(DisplayResult.SUCCESS);
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        if (this.b.isReady()) {
            this.b.show();
        } else {
            this.c.displayEventStream.sendEvent(DisplayResult.NOT_READY);
        }
        return this.c;
    }

    @Override // com.fyber.fairbid.i8
    public final void a(kl klVar) {
        pl displayFailure = (pl) klVar;
        Intrinsics.checkNotNullParameter(displayFailure, "displayFailure");
        this.c.displayEventStream.sendEvent(new DisplayResult(displayFailure.a));
    }
}
