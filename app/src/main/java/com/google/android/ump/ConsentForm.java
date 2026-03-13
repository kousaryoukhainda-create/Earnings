package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
/* loaded from: classes.dex */
public interface ConsentForm {

    /* loaded from: classes.dex */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
