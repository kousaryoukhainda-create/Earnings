package com.applovin.mediation.adapter;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
/* loaded from: classes.dex */
public interface MaxAppOpenAdapter {
    void loadAppOpenAd(@NonNull MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, @NonNull MaxAppOpenAdapterListener maxAppOpenAdapterListener);

    void showAppOpenAd(@NonNull MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, @NonNull MaxAppOpenAdapterListener maxAppOpenAdapterListener);
}
