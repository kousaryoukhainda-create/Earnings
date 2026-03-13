package com.appsflyer.internal;

import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public abstract class AFf1uSDK extends AFf1pSDK {
    public AFf1uSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public static boolean valueOf() {
        if (AFa1eSDK.valueOf().valueOf(AFa1eSDK.valueOf().AFInAppEventType().values(), false) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}
