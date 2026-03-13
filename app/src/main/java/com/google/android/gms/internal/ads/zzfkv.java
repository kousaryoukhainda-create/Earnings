package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
/* loaded from: classes3.dex */
public enum zzfkv {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    private final String zze;

    zzfkv(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
