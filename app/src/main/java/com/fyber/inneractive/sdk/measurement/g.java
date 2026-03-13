package com.fyber.inneractive.sdk.measurement;
/* loaded from: classes.dex */
public enum g {
    VERIFICATION_RESOURCE_REJECTED(1),
    VERIFICATION_NOT_SUPPORTED(2),
    ERROR_DURING_RESOURCE_LOAD(3);
    
    public int mReason;

    g(int i) {
        this.mReason = i;
    }
}
