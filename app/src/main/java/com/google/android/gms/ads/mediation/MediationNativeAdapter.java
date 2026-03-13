package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
@Deprecated
/* loaded from: classes3.dex */
public interface MediationNativeAdapter extends MediationAdapter {
    void requestNativeAd(@NonNull Context context, @NonNull MediationNativeListener mediationNativeListener, @NonNull Bundle bundle, @NonNull NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2);
}
