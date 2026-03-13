package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
/* loaded from: classes.dex */
public class c0 extends u {
    public final boolean a;

    public c0(boolean z) {
        this.a = z;
    }

    @Override // com.fyber.inneractive.sdk.mraid.u
    public String a() {
        String str;
        if (this.a) {
            str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
        } else {
            str = "false";
        }
        return "viewable: ".concat(str);
    }
}
