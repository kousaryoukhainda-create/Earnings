package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFb1uSDK {
    private final boolean AFInAppEventType;
    final long AFKeystoreWrapper;
    final String valueOf;

    public AFb1uSDK() {
    }

    public static boolean AFInAppEventType(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean values(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }

    public AFb1uSDK(String str, long j, boolean z) {
        this.valueOf = str;
        this.AFKeystoreWrapper = j;
        this.AFInAppEventType = z;
    }
}
