package com.fyber.fairbid;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class x8 extends FullScreenContentCallback {
    @NotNull
    public final r8<AdManagerInterstitialAd> a;

    public x8(@NotNull r8<AdManagerInterstitialAd> cachedAd) {
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
