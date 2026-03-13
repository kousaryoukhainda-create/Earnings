package com.fyber.fairbid;

import com.fyber.fairbid.ads.offerwall.VirtualCurrencyListener;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class bg {
    @NotNull
    public final AtomicReference<VirtualCurrencyListener> a;
    @NotNull
    public final ha b;
    public final long c;

    public bg(@NotNull AtomicReference<VirtualCurrencyListener> vcsListener, @NotNull ha analyticsReporter, long j) {
        Intrinsics.checkNotNullParameter(vcsListener, "vcsListener");
        Intrinsics.checkNotNullParameter(analyticsReporter, "analyticsReporter");
        this.a = vcsListener;
        this.b = analyticsReporter;
        this.c = j;
    }
}
