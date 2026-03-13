package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class c extends g {
    public com.fyber.inneractive.sdk.model.vast.a e;

    public c() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        c cVar = new c();
        a(cVar);
        return cVar;
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str) && this.e == null) {
            String a = a("install_" + str, (String) null);
            String a2 = a("skip_ad_" + str, (String) null);
            this.e = new com.fyber.inneractive.sdk.model.vast.a(a, a2, a("skip_in_" + str, (String) null));
        }
    }
}
