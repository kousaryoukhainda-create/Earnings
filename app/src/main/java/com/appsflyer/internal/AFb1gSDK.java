package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class AFb1gSDK {
    private static String values = "262";
    private Bundle AFInAppEventParameterName = null;
    public final AFb1dSDK AFInAppEventType;
    public final AFb1bSDK valueOf;

    public AFb1gSDK(AFb1bSDK aFb1bSDK, AFb1dSDK aFb1dSDK) {
        this.valueOf = aFb1bSDK;
        this.AFInAppEventType = aFb1dSDK;
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String valueOf() {
        StringBuilder sb = new StringBuilder("version: 6.12.2 (build ");
        sb.append(values);
        sb.append(")");
        return sb.toString();
    }

    public final String AFInAppEventType(String str) {
        Object obj;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.valueOf.AFInAppEventType.getPackageManager().getApplicationInfo(this.valueOf.AFInAppEventType.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final String values() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventType("CHANNEL");
        }
        if (string != null && string.equals("")) {
            return null;
        }
        return string;
    }

    public final boolean AFKeystoreWrapper(String str) {
        String AFInAppEventType = AFInAppEventType(str);
        if (AFInAppEventType != null) {
            return Boolean.parseBoolean(AFInAppEventType);
        }
        return false;
    }
}
