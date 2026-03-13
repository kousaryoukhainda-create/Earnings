package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.common.lifecycle.FetchResult;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.display.NetworkModel;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class tm {
    public final NetworkAdapter a;
    @NotNull
    public final NetworkModel b;
    @NotNull
    public final FetchResult c;
    @NotNull
    public final FetchResult.Factory d;
    public a e;
    public boolean f;
    @NotNull
    public FetchResult g;
    public db h;
    @NotNull
    public final AtomicBoolean i;
    public FetchResult j;

    /* loaded from: classes.dex */
    public interface a {
        void a(@NotNull FetchResult fetchResult, @NotNull FetchResult fetchResult2);
    }

    public tm(NetworkAdapter networkAdapter, @NotNull NetworkModel networkModel, @NotNull FetchResult notFetchedResult, @NotNull FetchResult.Factory fetchResultFactory) {
        Intrinsics.checkNotNullParameter(networkModel, "networkModel");
        Intrinsics.checkNotNullParameter(notFetchedResult, "notFetchedResult");
        Intrinsics.checkNotNullParameter(fetchResultFactory, "fetchResultFactory");
        this.a = networkAdapter;
        this.b = networkModel;
        this.c = notFetchedResult;
        this.d = fetchResultFactory;
        this.g = notFetchedResult;
        this.i = new AtomicBoolean(false);
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    public final boolean b() {
        if (this.g.isSuccess()) {
            return true;
        }
        FetchResult fetchResult = this.j;
        if (fetchResult != null && fetchResult.isSuccess()) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String toString() {
        String valueOf;
        if (this.g.isSuccess()) {
            valueOf = "Fill";
        } else {
            valueOf = String.valueOf(this.g.getFetchFailure());
        }
        String format = String.format(Locale.ENGLISH, "\t+-- Network name: %s\n\t|\t+-- fetch result: %s\n\t|\t+-- instance id: %s\n\t|\t+-- pricing value: %f", Arrays.copyOf(new Object[]{this.b.getName(), valueOf, this.b.getInstanceId(), Double.valueOf(this.b.j)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    public final boolean a() {
        return this.g.isSuccess();
    }

    public final void a(@NotNull String reason) {
        FetchResult failedFetchResult;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.i.compareAndSet(false, true)) {
            db dbVar = this.h;
            long j = dbVar != null ? dbVar.a : 0L;
            Logger.debug("WaterfallMediationRequest - Stopping the request - current fetchResult=" + this.g + ", current fetchStartedMillis=" + j);
            FetchResult fetchResult = this.g;
            if (fetchResult == this.c) {
                if (j > 0) {
                    failedFetchResult = this.d.getFailedFetchResult(new FetchFailure(RequestFailure.TIMEOUT, reason));
                    Intrinsics.checkNotNullExpressionValue(failedFetchResult, "{\n                    fe…      )\n                }");
                } else {
                    failedFetchResult = this.d.getFailedFetchResult(new FetchFailure(RequestFailure.SKIPPED, reason));
                    Intrinsics.checkNotNullExpressionValue(failedFetchResult, "{\n                    fe…      )\n                }");
                }
                this.g = failedFetchResult;
                a aVar = this.e;
                if (aVar != null) {
                    aVar.a(fetchResult, failedFetchResult);
                }
            }
        }
    }

    public final boolean a(@NotNull FetchResult fetchResult) {
        Intrinsics.checkNotNullParameter(fetchResult, "fetchResult");
        if (this.f || this.i.get()) {
            return false;
        }
        FetchResult fetchResult2 = this.g;
        if (fetchResult2 != this.c) {
            FetchFailure fetchFailure = fetchResult2.getFetchFailure();
            if ((fetchFailure != null ? fetchFailure.getErrorType() : null) != RequestFailure.TIMEOUT) {
                return false;
            }
            if (!fetchResult.isSuccess()) {
                FetchFailure fetchFailure2 = fetchResult.getFetchFailure();
                if ((fetchFailure2 != null ? fetchFailure2.getErrorType() : null) == RequestFailure.SKIPPED) {
                    return false;
                }
            }
        }
        FetchResult fetchResult3 = this.g;
        this.g = fetchResult;
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(fetchResult3, fetchResult);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r0 == null) goto L12;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.fairbid.mediation.NetworkResult a(@org.jetbrains.annotations.NotNull com.fyber.fairbid.mediation.request.MediationRequest r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "mediationRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.fyber.fairbid.common.lifecycle.FetchResult r0 = r4.j
            if (r0 == 0) goto Lf
            if (r6 == 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L11
        Lf:
            com.fyber.fairbid.common.lifecycle.FetchResult r0 = r4.g
        L11:
            com.fyber.fairbid.mediation.NetworkResult$Builder r6 = new com.fyber.fairbid.mediation.NetworkResult$Builder
            com.fyber.fairbid.mediation.display.NetworkModel r1 = r4.b
            com.fyber.fairbid.mediation.abstr.NetworkAdapter r2 = r4.a
            java.lang.String r5 = r5.getRequestId()
            java.lang.String r3 = "mediationRequest.requestId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r6.<init>(r0, r1, r2, r5)
            com.fyber.fairbid.mediation.display.NetworkModel r5 = r6.getNetworkModel$fairbid_sdk_release()
            double r0 = r5.i
            r6.setCpm(r0)
            com.fyber.fairbid.mediation.display.NetworkModel r5 = r6.getNetworkModel$fairbid_sdk_release()
            double r0 = r5.j
            r6.setPricingValue(r0)
            com.fyber.fairbid.mediation.abstr.NetworkAdapter r5 = r6.getNetworkAdapter$fairbid_sdk_release()
            if (r5 == 0) goto L42
            java.lang.String r5 = r5.getMarketingName()
            r6.setDemandSource(r5)
        L42:
            com.fyber.fairbid.mediation.NetworkResult r5 = r6.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.tm.a(com.fyber.fairbid.mediation.request.MediationRequest, boolean):com.fyber.fairbid.mediation.NetworkResult");
    }
}
