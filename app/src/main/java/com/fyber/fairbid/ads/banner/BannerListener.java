package com.fyber.fairbid.ads.banner;

import com.fyber.fairbid.ads.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface BannerListener {
    void onClick(@NotNull String str);

    void onError(@NotNull String str, @NotNull BannerError bannerError);

    void onLoad(@NotNull String str);

    void onRequestStart(@NotNull String str, @NotNull String str2);

    void onShow(@NotNull String str, @NotNull ImpressionData impressionData);
}
