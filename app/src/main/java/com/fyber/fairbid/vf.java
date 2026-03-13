package com.fyber.fairbid;

import com.fyber.fairbid.ads.offerwall.OfferWallListener;
import com.fyber.fairbid.ads.offerwall.ShowOptions;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class vf extends uf {
    @NotNull
    public final AtomicReference<OfferWallListener> a;
    @NotNull
    public final ha b;
    public final long c;
    @NotNull
    public final ShowOptions d;

    public vf(@NotNull AtomicReference<OfferWallListener> listener, @NotNull ha analyticsReporter, long j, @NotNull ShowOptions showOptions) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(analyticsReporter, "analyticsReporter");
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        this.a = listener;
        this.b = analyticsReporter;
        this.c = j;
        this.d = showOptions;
    }

    @Override // com.fyber.fairbid.uf
    public final void a(String str, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.b.a(this.c, this.d, str, requestId);
        this.a.get().onClose(str);
    }
}
