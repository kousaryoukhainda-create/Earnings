package com.fyber.inneractive.sdk.config.global.features;
/* loaded from: classes.dex */
public class n extends g {
    public n() {
        super("single_tap");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        n nVar = new n();
        a(nVar);
        return nVar;
    }

    public String d() {
        String a = a("app_info_button_text", "App Info");
        if (a != null && a.length() > 30) {
            return a.substring(0, 30);
        }
        return a;
    }
}
