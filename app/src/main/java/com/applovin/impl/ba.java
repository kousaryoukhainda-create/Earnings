package com.applovin.impl;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class ba {
    private static final Set b = new HashSet(32);
    private static final Set c = new HashSet(16);
    public static final ba d = a("ad_req");
    public static final ba e = a("ad_imp");
    public static final ba f = a("max_ad_imp");
    public static final ba g = a("ad_session_start");
    public static final ba h = a("ad_imp_session");
    public static final ba i = a("max_ad_imp_session");
    public static final ba j = a("cached_files_expired");
    public static final ba k = a("cache_drop_count");
    public static final ba l = a("sdk_reset_state_count", true);
    public static final ba m = a("ad_response_process_failures", true);
    public static final ba n = a("response_process_failures", true);
    public static final ba o = a("incent_failed_to_display_count", true);
    public static final ba p = a("app_paused_and_resumed");
    public static final ba q = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final ba r = a("ad_shown_outside_app_count");
    public static final ba s = a("med_ad_req");
    public static final ba t = a("med_ad_response_process_failures", true);
    public static final ba u = a("med_waterfall_ad_no_fill", true);
    public static final ba v = a("med_waterfall_ad_adapter_load_failed", true);
    public static final ba w = a("med_waterfall_ad_invalid_response", true);
    private final String a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private ba(String str) {
        this.a = str;
    }

    private static ba a(String str) {
        return a(str, false);
    }

    public String b() {
        return this.a;
    }

    private static ba a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            Set set = b;
            if (!set.contains(str)) {
                set.add(str);
                ba baVar = new ba(str);
                if (z) {
                    c.add(baVar);
                }
                return baVar;
            }
            throw new IllegalArgumentException(AbstractC2437ph.g("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }

    public static Set a() {
        return c;
    }
}
