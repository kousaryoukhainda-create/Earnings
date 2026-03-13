package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class AFb1ySDK {
    public AFe1qSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final AFb1dSDK AFKeystoreWrapper;
    public long valueOf;

    public AFb1ySDK() {
    }

    private AFe1qSDK AFInAppEventType() {
        String values = this.AFKeystoreWrapper.values("af_remote_config", (String) null);
        if (values == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFe1qSDK(new String(Base64.decode(values, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }

    public AFb1ySDK(AFb1dSDK aFb1dSDK) {
        this.AFKeystoreWrapper = aFb1dSDK;
        this.AFInAppEventParameterName = AFInAppEventType();
        this.valueOf = aFb1dSDK.valueOf("af_rc_timestamp", 0L);
        this.AFInAppEventType = aFb1dSDK.valueOf("af_rc_max_age", 0L);
    }
}
