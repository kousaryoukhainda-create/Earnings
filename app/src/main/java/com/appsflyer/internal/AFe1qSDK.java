package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFe1qSDK {
    public final AFd1aSDK AFInAppEventParameterName;
    @NonNull
    public final String AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    @NonNull
    public final String valueOf;
    @NonNull
    public final AFe1aSDK values;

    public AFe1qSDK() {
    }

    public static boolean AFKeystoreWrapper(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e, true);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFe1qSDK.class != obj.getClass()) {
            return false;
        }
        AFe1qSDK aFe1qSDK = (AFe1qSDK) obj;
        if (this.AFKeystoreWrapper != aFe1qSDK.AFKeystoreWrapper || !this.valueOf.equals(aFe1qSDK.valueOf)) {
            return false;
        }
        return this.AFInAppEventType.equals(aFe1qSDK.AFInAppEventType);
    }

    public final int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.AFInAppEventType.hashCode() + ((hashCode + ((this.AFKeystoreWrapper ? 1 : 0) * 31)) * 31);
        AFd1aSDK aFd1aSDK = this.AFInAppEventParameterName;
        if (aFd1aSDK != null) {
            return (hashCode2 * 31) + aFd1aSDK.hashCode();
        }
        return hashCode2;
    }

    public AFe1qSDK(String str) throws JSONException {
        AFe1aSDK aFe1aSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.valueOf = string;
                this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
                this.AFInAppEventType = str;
                if (string.startsWith("default")) {
                    aFe1aSDK = AFe1aSDK.DEFAULT;
                } else {
                    aFe1aSDK = AFe1aSDK.CUSTOM;
                }
                this.values = aFe1aSDK;
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                this.AFInAppEventParameterName = optJSONObject != null ? new AFd1aSDK(optJSONObject) : null;
                return;
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }
}
