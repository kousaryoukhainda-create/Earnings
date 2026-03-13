package com.fyber.fairbid;

import com.fyber.fairbid.ads.offerwall.OfferWallListener;
import com.fyber.fairbid.internal.ActivityProvider;
import com.fyber.fairbid.internal.ContextReference;
import com.fyber.fairbid.internal.Utils;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class yf {
    @NotNull
    public final Utils.ClockHelper a;
    @NotNull
    public final AtomicReference<OfferWallListener> b;
    @NotNull
    public final ha c;
    @NotNull
    public final ActivityProvider d;

    public yf(@NotNull Utils.ClockHelper clockHelper, @NotNull AtomicReference offerWallListener, @NotNull ha offerWallAnalyticsReporter, @NotNull ContextReference activityProvider) {
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        Intrinsics.checkNotNullParameter(offerWallListener, "offerWallListener");
        Intrinsics.checkNotNullParameter(offerWallAnalyticsReporter, "offerWallAnalyticsReporter");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.a = clockHelper;
        this.b = offerWallListener;
        this.c = offerWallAnalyticsReporter;
        this.d = activityProvider;
    }
}
