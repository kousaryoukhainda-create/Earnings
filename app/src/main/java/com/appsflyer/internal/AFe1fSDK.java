package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFe1fSDK extends AFa1qSDK {
    public final AFd1vSDK AFLogger$LogLevel;

    @Deprecated
    public AFe1fSDK() {
        this.AFLogger$LogLevel = null;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventType() {
        AFd1vSDK aFd1vSDK = this.AFLogger$LogLevel;
        if (aFd1vSDK != null) {
            return aFd1vSDK;
        }
        return AFd1vSDK.CACHED_EVENT;
    }

    public AFe1fSDK(String str, byte[] bArr, String str2, AFd1vSDK aFd1vSDK) {
        super(null, str, Boolean.FALSE);
        this.AFInAppEventType = str2;
        valueOf(bArr);
        this.AFLogger$LogLevel = aFd1vSDK;
    }
}
