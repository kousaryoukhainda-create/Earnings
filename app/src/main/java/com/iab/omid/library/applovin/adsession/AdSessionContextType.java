package com.iab.omid.library.applovin.adsession;

import com.fyber.fairbid.internal.Framework;
/* loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(Framework.NATIVE),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
