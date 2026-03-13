package com.appsflyer.internal;
/* loaded from: classes.dex */
public abstract class AFe1jSDK extends AFa1qSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afErrorLogForExcManagerOnly;
    private final boolean getLevel;

    public AFe1jSDK() {
        this(null, null, null, null, null);
    }

    public final boolean AFVersionDeclaration() {
        return this.getLevel;
    }

    public final boolean afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }

    public final boolean getLevel() {
        return this.afErrorLogForExcManagerOnly;
    }

    public AFe1jSDK(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
        this.getLevel = bool2 != null ? bool2.booleanValue() : true;
    }
}
