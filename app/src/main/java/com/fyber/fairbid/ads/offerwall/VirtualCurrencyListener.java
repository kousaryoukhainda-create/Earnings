package com.fyber.fairbid.ads.offerwall;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface VirtualCurrencyListener {
    void onVirtualCurrencyError(@NotNull VirtualCurrencyErrorResponse virtualCurrencyErrorResponse);

    void onVirtualCurrencySuccess(@NotNull VirtualCurrencySuccessfulResponse virtualCurrencySuccessfulResponse);
}
