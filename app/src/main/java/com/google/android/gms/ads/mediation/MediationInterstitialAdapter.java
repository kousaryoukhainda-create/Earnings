package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
@Deprecated
/* loaded from: classes3.dex */
public interface MediationInterstitialAdapter extends MediationAdapter {
    void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, Bundle bundle2);

    void showInterstitial();
}
