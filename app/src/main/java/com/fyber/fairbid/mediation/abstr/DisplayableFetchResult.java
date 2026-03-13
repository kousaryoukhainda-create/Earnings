package com.fyber.fairbid.mediation.abstr;

import com.fyber.fairbid.common.lifecycle.FetchFailure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class DisplayableFetchResult {
    public final CachedAd a;
    public final FetchFailure b;

    public DisplayableFetchResult(@NotNull CachedAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a = ad;
        this.b = null;
    }

    public final CachedAd getCachedAd() {
        return this.a;
    }

    public final FetchFailure getFetchFailure() {
        return this.b;
    }

    public final boolean isSuccess() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public DisplayableFetchResult(FetchFailure fetchFailure) {
        this.b = fetchFailure;
        this.a = null;
    }
}
