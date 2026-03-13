package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdRequest;
@Deprecated
/* loaded from: classes3.dex */
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(@NonNull Context context, @NonNull CustomEventInterstitialListener customEventInterstitialListener, String str, @NonNull MediationAdRequest mediationAdRequest, Bundle bundle);

    void showInterstitial();
}
