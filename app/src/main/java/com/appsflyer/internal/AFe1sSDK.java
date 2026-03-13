package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFe1sSDK {
    public final double AFInAppEventType;

    public AFe1sSDK() {
    }

    public static void AFInAppEventType(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }

    public static void values(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public AFe1sSDK(double d) {
        this.AFInAppEventType = d;
    }
}
