package com.fyber.fairbid;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084a0 extends FullScreenContentCallback {
    @NotNull
    public final AbstractC1126v<InterstitialAd> a;

    public C1084a0(@NotNull AbstractC1126v<InterstitialAd> cachedAd) {
        Intrinsics.checkNotNullParameter(cachedAd, "cachedAd");
        this.a = cachedAd;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.a.c();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(@NotNull AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.a.b(adError);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        this.a.a();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.a.d();
    }
}
