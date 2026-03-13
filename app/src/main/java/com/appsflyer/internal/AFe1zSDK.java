package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFe1zSDK {
    private static final long AFKeystoreWrapper = TimeUnit.HOURS.toSeconds(24);
    private final AFb1gSDK AFInAppEventParameterName;
    private final AFb1ySDK values;

    public AFe1zSDK(AFb1gSDK aFb1gSDK, AFb1ySDK aFb1ySDK) {
        this.AFInAppEventParameterName = aFb1gSDK;
        this.values = aFb1ySDK;
    }

    public final boolean AFInAppEventParameterName() {
        if (this.values.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AFb1ySDK aFb1ySDK = this.values;
        if (currentTimeMillis - aFb1ySDK.valueOf > TimeUnit.SECONDS.toMillis(aFb1ySDK.AFInAppEventType)) {
            return true;
        }
        return false;
    }

    public final long AFKeystoreWrapper() {
        String AFInAppEventType = this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventType != null) {
            try {
                return Long.parseLong(AFInAppEventType);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                sb.append(e.getMessage());
                AFLogger.afErrorLog(sb.toString(), e);
                return AFKeystoreWrapper;
            }
        }
        return AFKeystoreWrapper;
    }

    public final boolean valueOf() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.staging"));
    }

    public final boolean values() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.sandbox"));
    }
}
