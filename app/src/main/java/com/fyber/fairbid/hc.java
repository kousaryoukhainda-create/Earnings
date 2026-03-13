package com.fyber.fairbid;

import com.fyber.fairbid.ads.banner.BannerListener;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class hc {
    @NotNull
    public final AtomicReference<InterstitialListener> a = new AtomicReference<>();
    @NotNull
    public final AtomicReference<RewardedListener> b = new AtomicReference<>();
    @NotNull
    public final AtomicReference<BannerListener> c = new AtomicReference<>();
    @NotNull
    public final AtomicReference<InterstitialListener> d = new AtomicReference<>();
    @NotNull
    public final AtomicReference<RewardedListener> e = new AtomicReference<>();
    @NotNull
    public final AtomicReference<BannerListener> f = new AtomicReference<>();
}
