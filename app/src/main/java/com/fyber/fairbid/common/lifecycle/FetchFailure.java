package com.fyber.fairbid.common.lifecycle;

import com.fyber.fairbid.ads.RequestFailure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class FetchFailure {
    @NotNull
    public static final FetchFailure ADAPTER_NOT_STARTED;
    @NotNull
    public static final FetchFailure CAPPED;
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public static final FetchFailure NOT_READY;
    @NotNull
    public static final FetchFailure NO_FILL;
    @NotNull
    public static final FetchFailure TIMEOUT;
    @NotNull
    public static final FetchFailure UNKNOWN;
    @NotNull
    public final RequestFailure a;
    @NotNull
    public final String b;

    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        RequestFailure requestFailure = RequestFailure.TIMEOUT;
        NOT_READY = new FetchFailure(requestFailure, "Ad Not Ready");
        TIMEOUT = new FetchFailure(requestFailure, "Timed Out");
        NO_FILL = new FetchFailure(RequestFailure.NO_FILL, "No Fill");
        CAPPED = new FetchFailure(RequestFailure.CAPPED, "Capped");
        ADAPTER_NOT_STARTED = new FetchFailure(RequestFailure.ADAPTER_NOT_STARTED, "The adapter was not started");
        UNKNOWN = new FetchFailure(RequestFailure.UNKNOWN, "Unknown error");
    }

    public FetchFailure(@NotNull RequestFailure errorType, String str) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.a = errorType;
        this.b = str == null ? "Fetch failed - missing message" : str;
    }

    @NotNull
    public final RequestFailure getErrorType() {
        return this.a;
    }

    @NotNull
    public final String getMessage() {
        return this.b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RequestFailure{errorType=");
        sb.append(this.a);
        sb.append(", message='");
        return AbstractC0324Hi.h(sb, this.b, "'}");
    }
}
