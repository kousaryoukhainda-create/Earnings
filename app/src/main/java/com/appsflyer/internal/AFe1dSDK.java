package com.appsflyer.internal;
/* loaded from: classes.dex */
public abstract class AFe1dSDK extends AFe1jSDK {
    public AFe1dSDK() {
        this(null, null);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }

    public AFe1dSDK(String str, Boolean bool) {
        super(str, null, Boolean.FALSE, null, bool);
    }
}
