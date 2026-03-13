package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import com.hyprmx.android.sdk.placement.Placement;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class q9 extends n9<Placement> {
    @NotNull
    public final v9 a;
    @NotNull
    public final SettableFuture<DisplayableFetchResult> b;
    @NotNull
    public final String c;
    @NotNull
    public final ExecutorService d;
    @NotNull
    public final i9<q9> e;
    @NotNull
    public final AdDisplay f;
    public Placement g;
    public boolean h;

    public q9(@NotNull v9 hyprMXWrapper, @NotNull SettableFuture fetchFuture, @NotNull String placementName, @NotNull ExecutorService uiThreadExecutorService, @NotNull AdDisplay adDisplay) {
        t9 adsCache = t9.a;
        Intrinsics.checkNotNullParameter(hyprMXWrapper, "hyprMXWrapper");
        Intrinsics.checkNotNullParameter(fetchFuture, "fetchFuture");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(uiThreadExecutorService, "uiThreadExecutorService");
        Intrinsics.checkNotNullParameter(adsCache, "adsCache");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = hyprMXWrapper;
        this.b = fetchFuture;
        this.c = placementName;
        this.d = uiThreadExecutorService;
        this.e = adsCache;
        this.f = adDisplay;
    }

    public static final void b(q9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Placement placement = this$0.g;
        if (placement != null) {
            if (placement.isAdAvailable()) {
                this$0.e.b().remove(this$0.c);
                this$0.e.a().put(this$0.c, this$0);
                Placement placement2 = this$0.g;
                if (placement2 != null) {
                    placement2.showAd();
                    return;
                } else {
                    Intrinsics.f("hyprmxPlacement");
                    throw null;
                }
            }
            Logger.error("HyprMXCachedRewardedAd - HyprMX ad is not ready.");
            this$0.f.displayEventStream.sendEvent(DisplayResult.NOT_READY);
            return;
        }
        Intrinsics.f("hyprmxPlacement");
        throw null;
    }

    public final void a() {
        this.d.execute(new J0(this, 1));
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        Placement placement = this.g;
        if (placement != null) {
            return placement.isAdAvailable();
        }
        Intrinsics.f("hyprmxPlacement");
        throw null;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    @NotNull
    public final AdDisplay show() {
        this.d.execute(new J0(this, 0));
        return this.f;
    }

    public static final void a(q9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        v9 v9Var = this$0.a;
        String placementName = this$0.c;
        v9Var.getClass();
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Placement placement = v9Var.a.getPlacement(placementName);
        placement.setPlacementListener(u9.a);
        placement.loadAd();
        Intrinsics.checkNotNullParameter(placement, "<set-?>");
        this$0.g = placement;
    }
}
