package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class AFf1cSDK {
    public String AFInAppEventType;
    public final WeakReference<Context> AFKeystoreWrapper;

    public AFf1cSDK(@NonNull Context context) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
    }
}
