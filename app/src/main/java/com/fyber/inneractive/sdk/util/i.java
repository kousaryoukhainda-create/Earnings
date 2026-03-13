package com.fyber.inneractive.sdk.util;

import java.util.Locale;
/* loaded from: classes.dex */
public enum i {
    DISPLAY("DISPLAY"),
    VIDEO_CTA("VIDEO_CTA"),
    VIDEO_CLICK("VIDEO_CLICK"),
    VAST_ENDCARD("VAST_ENDCARD"),
    DEFAULT_ENDCARD("DEFAULT_ENDCARD"),
    VIDEO_APP_INFO("VIDEO_APP_INFO"),
    FMP_ENDCARD("FMP_ENDCARD");
    
    private final String key;
    private String mVersion = "";
    private int mOrderShown = 0;

    i(String str) {
        this.key = str;
    }

    public void a(String str) {
        this.mVersion = str;
    }

    public String e() {
        return this.mVersion;
    }

    @Override // java.lang.Enum
    public String toString() {
        if ((this == FMP_ENDCARD && this.mOrderShown == 1) || this.mOrderShown == 2) {
            Locale locale = Locale.US;
            String str = this.key;
            int i = this.mOrderShown;
            return str + "_" + i;
        }
        return this.key;
    }

    public void a(int i) {
        this.mOrderShown = i;
    }
}
