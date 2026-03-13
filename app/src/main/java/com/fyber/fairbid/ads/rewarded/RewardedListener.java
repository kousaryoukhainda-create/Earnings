package com.fyber.fairbid.ads.rewarded;

import com.fyber.fairbid.ads.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface RewardedListener {
    void onAvailable(@NotNull String str);

    void onClick(@NotNull String str);

    void onCompletion(@NotNull String str, boolean z);

    void onHide(@NotNull String str);

    void onRequestStart(@NotNull String str, @NotNull String str2);

    void onShow(@NotNull String str, @NotNull ImpressionData impressionData);

    void onShowFailure(@NotNull String str, @NotNull ImpressionData impressionData);

    void onUnavailable(@NotNull String str);
}
