package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.adtransparency.interceptors.MetadataProvider;
import com.fyber.fairbid.adtransparency.interceptors.mintegral.MintegralInterceptor;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ee extends ud {
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

    public ee(@NotNull String unitId, @NotNull Context context, int i, @NotNull MintegralInterceptor metadataProvider, @NotNull AdDisplay adDisplay) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = unitId;
        this.b = context;
        this.c = i;
        this.d = metadataProvider;
        this.e = adDisplay;
        this.f = C2231nG.a(new ce(this));
        this.g = C2231nG.a(new de(this));
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        if (((C2474q50) this.f).b()) {
            return ((MBRewardVideoHandler) ((C2474q50) this.f).a()).isReady();
        }
        if (((C2474q50) this.g).b()) {
            return ((MBBidRewardVideoHandler) ((C2474q50) this.g).a()).isBidReady();
        }
        return false;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        Logger.debug("MintegralCachedRewardedAd - show() called");
        AdDisplay adDisplay = this.e;
        if (!isAvailable()) {
            adDisplay.displayEventStream.sendEvent(DisplayResult.NOT_READY);
        } else if (((C2474q50) this.f).b()) {
            ((MBRewardVideoHandler) ((C2474q50) this.f).a()).show("");
        } else if (((C2474q50) this.g).b()) {
            ((MBBidRewardVideoHandler) ((C2474q50) this.g).a()).showFromBid("");
        } else {
            this.e.displayEventStream.sendEvent(new DisplayResult(new DisplayResult.Error(DisplayResult.ErrorType.INTERNAL_ERROR, "Ad was not initialized", RequestFailure.INTERNAL)));
        }
        return adDisplay;
    }
}
