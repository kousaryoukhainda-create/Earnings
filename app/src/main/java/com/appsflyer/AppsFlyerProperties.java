package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1dSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static final AppsFlyerProperties valueOf = new AppsFlyerProperties();
    public boolean AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private boolean values = false;

    /* loaded from: classes.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        
        private final int AFInAppEventType;

        EmailsCryptType(int i) {
            this.AFInAppEventType = i;
        }

        public final int getValue() {
            return this.AFInAppEventType;
        }
    }

    private AppsFlyerProperties() {
    }

    private boolean AFKeystoreWrapper() {
        return this.values;
    }

    public static AppsFlyerProperties getInstance() {
        return valueOf;
    }

    public final boolean AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.parseInt(string);
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.parseLong(string);
    }

    public synchronized Object getObject(String str) {
        return this.AFInAppEventType.get(str);
    }

    public String getReferrer(AFb1dSDK aFb1dSDK) {
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        return aFb1dSDK.values("referrer", (String) null);
    }

    public synchronized String getString(String str) {
        return (String) this.AFInAppEventType.get(str);
    }

    public boolean isEnableLog() {
        AFLogger.LogLevel logLevel = AFLogger.LogLevel.NONE;
        if (getInt("logLevel", logLevel.getLevel()) > logLevel.getLevel()) {
            return true;
        }
        return false;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(AFb1dSDK aFb1dSDK) {
        try {
            if (AFKeystoreWrapper()) {
                return;
            }
            String values = aFb1dSDK.values("savedProperties", (String) null);
            if (values != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(values);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (this.AFInAppEventType.get(next) == null) {
                            this.AFInAppEventType.put(next, jSONObject.getString(next));
                        }
                    }
                    String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix"};
                    for (int i = 0; i < 3; i++) {
                        this.AFInAppEventType.remove(strArr[i]);
                    }
                    saveProperties(aFb1dSDK);
                    this.values = true;
                } catch (JSONException e) {
                    AFLogger.afErrorLog("Failed loading properties", e);
                }
                StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.values);
                AFLogger.afDebugLog(sb.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(String str) {
        this.AFInAppEventType.remove(str);
    }

    public synchronized void saveProperties(AFb1dSDK aFb1dSDK) {
        this.AFInAppEventType.remove("AppsFlyerKey");
        aFb1dSDK.AFInAppEventParameterName("savedProperties", new JSONObject(this.AFInAppEventType).toString());
    }

    public synchronized void set(String str, String str2) {
        this.AFInAppEventType.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.AFInAppEventType.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFInAppEventType.put(USER_EMAILS, str);
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFInAppEventType.put(str, strArr);
    }

    public synchronized void set(String str, int i) {
        this.AFInAppEventType.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        this.AFInAppEventType.put(str, Long.toString(j));
    }

    public synchronized void set(String str, boolean z) {
        this.AFInAppEventType.put(str, Boolean.toString(z));
    }
}
