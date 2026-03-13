package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFf1ySDK implements AFf1vSDK {
    private String AFInAppEventType;

    private static String AFKeystoreWrapper(Activity activity) {
        String str;
        Uri AFInAppEventType = AFb1nSDK.AFInAppEventType(activity);
        if (AFInAppEventType != null) {
            str = AFInAppEventType.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (valueOf(str)) {
            return null;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final void AFInAppEventParameterName(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0) {
            this.AFInAppEventType = AFKeystoreWrapper(activity);
        }
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final String valueOf(Activity activity) {
        String str = this.AFInAppEventType;
        this.AFInAppEventType = null;
        return (str == null || str.length() == 0) ? AFKeystoreWrapper(activity) : str;
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    @NotNull
    public final String values(Activity activity) {
        String str;
        Uri AFInAppEventType = AFb1nSDK.AFInAppEventType(activity);
        if (AFInAppEventType != null) {
            str = AFInAppEventType.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private static boolean valueOf(String str) {
        return D40.o(str, "android-app://");
    }
}
