package com.iab.omid.library.applovin.adsession;

import com.fyber.fairbid.internal.Framework;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
/* loaded from: classes2.dex */
public enum Owner {
    NATIVE(Framework.NATIVE),
    JAVASCRIPT("javascript"),
    NONE(DevicePublicKeyStringDef.NONE);
    
    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
