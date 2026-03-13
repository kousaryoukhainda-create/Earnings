package com.applovin.sdk;

import android.app.Activity;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public interface AppLovinCmpService {

    /* loaded from: classes.dex */
    public interface OnCompletedListener {
        void onCompleted(AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(@NonNull Activity activity, @NonNull OnCompletedListener onCompletedListener);
}
