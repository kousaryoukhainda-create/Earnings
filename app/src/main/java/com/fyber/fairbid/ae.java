package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.adtransparency.interceptors.MetadataProvider;
import com.fyber.fairbid.adtransparency.interceptors.mintegral.MintegralInterceptor;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import com.mbridge.msdk.newinterstitial.out.MBBidInterstitialVideoHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ae extends ud {
    @NotNull
    public final String a;
    @NotNull
    public final Context b;
    public final int c;
    @NotNull
    public final MetadataProvider d;
    @NotNull
    public final AdDisplay e;
    @NotNull
    public final InterfaceC2059lG f;
    @NotNull
    public final InterfaceC2059lG g;

    public ae(@NotNull String unitId, @NotNull Context context, int i, @NotNull MintegralInterceptor metadataProvider, @NotNull AdDisplay adDisplay) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = unitId;
        this.b = context;
        this.c = i;
        this.d = metadataProvider;
        this.e = adDisplay;
        this.f = C2231nG.a(new xd(this));
        this.g = C2231nG.a(new yd(this));
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        if (((C2474q50) this.f).b()) {
            return ((MBNewInterstitialHandler) ((C2474q50) this.f).a()).isReady();
        }
        if (((C2474q50) this.g).b()) {
            return ((MBBidInterstitialVideoHandler) ((C2474q50) this.g).a()).isBidReady();
        }
        return false;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        Logger.debug("MintegralCachedInterstitialAd - show() called");
        AdDisplay adDisplay = this.e;
        if (!isAvailable()) {
            adDisplay.displayEventStream.sendEvent(DisplayResult.NOT_READY);
        } else if (((C2474q50) this.f).b()) {
            ((MBNewInterstitialHandler) ((C2474q50) this.f).a()).show();
        } else if (((C2474q50) this.g).b()) {
            ((MBBidInterstitialVideoHandler) ((C2474q50) this.g).a()).showFromBid();
        } else {
            this.e.displayEventStream.sendEvent(new DisplayResult(new DisplayResult.Error(DisplayResult.ErrorType.INTERNAL_ERROR, "Ad was not initialized", RequestFailure.INTERNAL)));
        }
        return adDisplay;
    }
}
