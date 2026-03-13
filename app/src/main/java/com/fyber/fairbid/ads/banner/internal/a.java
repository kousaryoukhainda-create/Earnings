package com.fyber.fairbid.ads.banner.internal;

import com.fyber.fairbid.ads.banner.internal.BannerView;
import com.fyber.fairbid.ai;
import com.fyber.fairbid.common.banner.BannerWrapper;
import com.fyber.fairbid.common.concurrency.PausableRunnable;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.da;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.m3;
import com.fyber.fairbid.mediation.display.NetworkModel;
import com.fyber.fairbid.mediation.request.MediationRequest;
import com.fyber.fairbid.xi;
import com.fyber.fairbid.y3;
import com.fyber.fairbid.z9;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final class a extends PausableRunnable {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BannerView e;
    public final /* synthetic */ int f;
    public final /* synthetic */ y3 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m3 m3Var, boolean z, BannerView bannerView, int i, y3 y3Var, int i2, ScheduledExecutorService scheduledExecutorService) {
        super(m3Var, scheduledExecutorService);
        this.d = z;
        this.e = bannerView;
        this.f = i;
        this.g = y3Var;
        this.h = i2;
    }

    @Override // com.fyber.fairbid.common.concurrency.PausableRunnable
    public final void b() {
        boolean z;
        BannerView bannerView = this.e;
        xi xiVar = bannerView.q;
        BannerWrapper bannerWrapper = bannerView.m;
        MediationRequest mediationRequest = bannerView.p;
        boolean z2 = this.d;
        int i = this.f;
        y3 y3Var = this.g;
        int i2 = this.h;
        B90 b90 = null;
        ai aiVar = null;
        ai aiVar2 = null;
        b90 = null;
        b90 = null;
        if (xiVar != null && bannerWrapper != null && mediationRequest != null) {
            if (!z2) {
                z9 z9Var = bannerView.g;
                MediationRequest mediationRequest2 = bannerView.b;
                z9Var.a(mediationRequest2, Integer.valueOf(mediationRequest2.getBannerRefreshInterval()));
            }
            String nonManualLog = "BannerView - The refresh interval (" + i + "s) has been reached";
            Intrinsics.checkNotNullParameter(nonManualLog, "nonManualLog");
            Intrinsics.checkNotNullParameter("BannerView - A manual refresh has been called.", "manualLog");
            if (this.d) {
                Logger.debug("BannerView - A manual refresh has been called.");
            } else {
                Logger.debug(nonManualLog);
            }
            if (!bannerWrapper.canRefresh()) {
                String nonManualLog2 = "BannerView - Banner is in a state where it cannot be refreshed. Waiting " + i + " more seconds until trying to refresh again";
                Intrinsics.checkNotNullParameter(nonManualLog2, "nonManualLog");
                Intrinsics.checkNotNullParameter("BannerView - Banner is in a state where it cannot be refreshed. Waiting for the next manual refresh.", "manualLog");
                if (this.d) {
                    Logger.debug("BannerView - Banner is in a state where it cannot be refreshed. Waiting for the next manual refresh.");
                } else {
                    Logger.debug(nonManualLog2);
                }
                z9 z9Var2 = bannerView.g;
                BannerView.b bVar = bannerView.n;
                if (bVar != null) {
                    aiVar = bVar.c;
                }
                z9Var2.c(mediationRequest, aiVar);
                xiVar.b();
                return;
            } else if (bannerView.getVisibility() == 0 && bannerView.getParent() != null) {
                int i3 = y3Var.d.get();
                Logger.debug("BannerView - Banner refresh attempt " + i3 + '/' + i2);
                boolean isDone = bannerView.o.isDone();
                if (isDone) {
                    y3Var.d.incrementAndGet();
                    z = c();
                } else {
                    bannerView.g.c(mediationRequest);
                    Logger.debug("BannerView - The banner refresh attempt was unsuccessful - there's an ongoing request");
                    z = false;
                }
                xiVar.b();
                if (!xiVar.e) {
                    if (z) {
                        Logger.debug("BannerView - About to perform a new banner fetch refresh");
                        if (bannerView.i.get()) {
                            Logger.debug("BannerView - The banner has already been destroyed, not proceeding with the refresh...");
                        } else {
                            MediationRequest mediationRequest3 = new MediationRequest(bannerView.b);
                            bannerView.p = mediationRequest3;
                            mediationRequest3.setRefresh();
                            da daVar = bannerView.f;
                            SettableFuture<BannerView.b> refreshedDisplayBannerResultFuture = bannerView.o;
                            Intrinsics.checkNotNullExpressionValue(refreshedDisplayBannerResultFuture, "refreshedDisplayBannerResultFuture");
                            BannerView.a aVar = new BannerView.a(refreshedDisplayBannerResultFuture);
                            SettableFuture<BannerView.b> refreshedDisplayBannerResultFuture2 = bannerView.o;
                            Intrinsics.checkNotNullExpressionValue(refreshedDisplayBannerResultFuture2, "refreshedDisplayBannerResultFuture");
                            daVar.a(mediationRequest3, aVar, new BannerView.c(refreshedDisplayBannerResultFuture2), bannerView.w);
                        }
                    }
                    String nonManualLog3 = "BannerView - Scheduling the next refresh attempt for " + i + 's';
                    Intrinsics.checkNotNullParameter(nonManualLog3, "nonManualLog");
                    Intrinsics.checkNotNullParameter("BannerView - The next refresh will occur with the refresh API call.", "manualLog");
                    if (this.d) {
                        Logger.debug("BannerView - The next refresh will occur with the refresh API call.");
                    } else {
                        Logger.debug(nonManualLog3);
                    }
                } else {
                    if (i3 == i2) {
                        bannerView.g.a(bannerView.b);
                    }
                    if (!isDone) {
                        bannerView.c();
                    }
                }
                b90 = B90.a;
            } else {
                Logger.debug("BannerView - The BannerView is neither visible nor is attached to parent, not proceeding with the refresh…");
                z9 z9Var3 = bannerView.g;
                BannerView.b bVar2 = bannerView.n;
                if (bVar2 != null) {
                    aiVar2 = bVar2.c;
                }
                z9Var3.b(mediationRequest, aiVar2);
                xiVar.b();
                return;
            }
        }
        if (b90 == null) {
            Logger.debug("BannerView - Something really weird happened - there's no bannerWrapper or no retryManager 🐢");
        }
    }

    public final boolean c() {
        String str;
        NetworkModel networkModel;
        ai aiVar;
        Logger.debug("BannerView - The refresh request process is finished.");
        boolean z = true;
        try {
            BannerView.b refreshedDisplayBannerResult = this.e.o.get();
            DisplayResult displayResult = refreshedDisplayBannerResult.a;
            ai aiVar2 = refreshedDisplayBannerResult.c;
            MediationRequest a = aiVar2.a.a();
            if (displayResult.isSuccess()) {
                Intrinsics.checkNotNullParameter(displayResult, "displayResult");
                if (displayResult.isSuccess() && displayResult.getBannerWrapper() != null && displayResult.getBannerWrapper().isViewAvailable()) {
                    BannerView bannerView = this.e;
                    Intrinsics.checkNotNullExpressionValue(refreshedDisplayBannerResult, "refreshedDisplayBannerResult");
                    bannerView.a(refreshedDisplayBannerResult, a);
                    z = false;
                } else {
                    if (displayResult.getBannerWrapper() == null) {
                        str = "BannerWrapper is null";
                    } else {
                        str = "BannerWrapper.getRealBannerView() is null";
                    }
                    BannerView bannerView2 = this.e;
                    z9 z9Var = bannerView2.g;
                    BannerView.b bVar = bannerView2.n;
                    if (bVar != null && (aiVar = bVar.c) != null) {
                        networkModel = aiVar.b();
                    } else {
                        networkModel = null;
                    }
                    z9Var.b(a, networkModel, str);
                    NetworkModel b = aiVar2.b();
                    Logger.error("BannerView - Banner refresh failed - " + ("Something unexpected happened - refresh request finished but there's no Banner View from " + ((b == null || (r3 = b.getName()) == null) ? "[unknown]" : "[unknown]") + " to be attached on screen"));
                }
            } else {
                this.e.g.b(a);
                DisplayResult.Error error = displayResult.getError();
                Logger.error("BannerView - Banner refresh failed - ".concat((error == null || (r1 = error.toString()) == null) ? "No error info available" : "No error info available"));
            }
        } catch (InterruptedException e) {
            Logger.error("BannerView - Banner refresh failed - " + e.getMessage());
        } catch (ExecutionException e2) {
            Logger.error("BannerView - Banner refresh failed - " + e2.getMessage());
        }
        this.e.o = SettableFuture.create();
        return z;
    }
}
