package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;
/* loaded from: classes.dex */
public final class AFe1cSDK extends AFe1dSDK {
    public AFe1cSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK AFKeystoreWrapper(String str) {
        return super.AFKeystoreWrapper(AFa1qSDK.AFInAppEventParameterName(str));
    }
}
