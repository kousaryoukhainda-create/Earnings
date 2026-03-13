package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.internal.ActivityProvider;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class f4<AdAdapter> implements d1 {
    @NotNull
    public final SettableFuture<DisplayableFetchResult> a;
    @NotNull
    public final ExecutorService b;
    @NotNull
    public final Context c;
    @NotNull
    public final ActivityProvider d;
    @NotNull
    public final C1131x0 e;
    @NotNull
    public final Function1 f;
    @NotNull
    public final Function1 g;

    public f4(@NotNull SettableFuture fetchResultFuture, @NotNull ExecutorService uiThreadExecutorService, @NotNull Context context, @NotNull ActivityProvider activityProvider, @NotNull C1131x0 apsApiWrapper, @NotNull C1129w0 decodePricePoint, @NotNull Function1 loadMethod) {
        Intrinsics.checkNotNullParameter(fetchResultFuture, "fetchResultFuture");
        Intrinsics.checkNotNullParameter(uiThreadExecutorService, "uiThreadExecutorService");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(apsApiWrapper, "apsApiWrapper");
        Intrinsics.checkNotNullParameter(decodePricePoint, "decodePricePoint");
        Intrinsics.checkNotNullParameter(loadMethod, "loadMethod");
        this.a = fetchResultFuture;
        this.b = uiThreadExecutorService;
        this.c = context;
        this.d = activityProvider;
        this.e = apsApiWrapper;
        this.f = decodePricePoint;
        this.g = loadMethod;
    }

    public abstract AdAdapter a(double d, @NotNull String str);

    @Override // com.fyber.fairbid.d1
    public final void a(@NotNull String bidInfo, @NotNull String encodedPricePoint) {
        Intrinsics.checkNotNullParameter(bidInfo, "bidInfo");
        Intrinsics.checkNotNullParameter(encodedPricePoint, "encodedPricePoint");
        Object invoke = this.f.invoke(encodedPricePoint);
        if (((Number) invoke).doubleValue() == -1.0d) {
            invoke = null;
        }
        Double d = (Double) invoke;
        if (d != null) {
            this.g.invoke(a(d.doubleValue(), bidInfo));
            return;
        }
        this.a.set(new DisplayableFetchResult(new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "unknown price point")));
    }
}
