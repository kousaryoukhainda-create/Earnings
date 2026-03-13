package com.fyber.fairbid;
/* renamed from: com.fyber.fairbid.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1119r0 {
    ADAPTER_NOT_FOUND("Adapter not found"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CREDENTIALS("Invalid credentials"),
    SDK_NOT_FOUND("SDK not found"),
    MISSING_ACTIVITIES("Missing activities"),
    NOT_CONFIGURED("Network not configured"),
    MINIMUM_OS_REQUIREMENTS_NOT_MET("Minimum os requirements not met"),
    INVALID_APS_META_DATA("Invalid Amazon APS 'meta_data'"),
    INTEGRATED_VERSION_BELOW_MINIMUM("Current SDK version is below minimum"),
    UNKNOWN("Unknown");
    
    public final String a;

    EnumC1119r0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
