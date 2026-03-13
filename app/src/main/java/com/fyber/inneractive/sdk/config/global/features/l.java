package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class l extends g {
    public l() {
        super("omsdk");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        l lVar = new l();
        a(lVar);
        return lVar;
    }

    public boolean d() {
        boolean a = a("enable", false);
        IAlog.a("OMSDK AB %s", String.valueOf(a));
        return a;
    }
}
