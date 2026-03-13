package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
/* loaded from: classes3.dex */
public enum zzfkx {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    private final String zzj;

    zzfkx(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
