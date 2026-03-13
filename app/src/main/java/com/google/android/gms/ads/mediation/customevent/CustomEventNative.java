package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
@Deprecated
/* loaded from: classes3.dex */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@NonNull Context context, @NonNull CustomEventNativeListener customEventNativeListener, String str, @NonNull NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle);
}
