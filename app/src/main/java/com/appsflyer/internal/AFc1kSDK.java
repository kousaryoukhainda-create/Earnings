package com.appsflyer.internal;
/* loaded from: classes.dex */
public class AFc1kSDK {
    public final long AFKeystoreWrapper;

    public AFc1kSDK(long j) {
        this.AFKeystoreWrapper = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((AFc1kSDK) obj).AFKeystoreWrapper) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.AFKeystoreWrapper;
        return (int) (j ^ (j >>> 32));
    }
}
