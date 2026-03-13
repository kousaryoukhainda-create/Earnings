package com.applovin.impl;

import java.util.HashSet;
/* loaded from: classes.dex */
public class uj {
    private final String a;
    private final Class b;
    public static final uj c = new uj("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final uj d = new uj("com.applovin.sdk.launched_before", Boolean.class);
    public static final uj e = new uj("com.applovin.sdk.latest_installed_version", String.class);
    public static final uj f = new uj("com.applovin.sdk.install_date", Long.class);
    public static final uj g = new uj("com.applovin.sdk.user_id", String.class);
    public static final uj h = new uj("com.applovin.sdk.compass_id", String.class);
    public static final uj i = new uj("com.applovin.sdk.compass_random_token", String.class);
    public static final uj j = new uj("com.applovin.sdk.applovin_random_token", String.class);
    public static final uj k = new uj("com.applovin.sdk.device_test_group", String.class);
    public static final uj l = new uj("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final uj m = new uj("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final uj n = new uj("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final uj o = new uj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final uj p = new uj("IABTCF_CmpSdkID", Object.class);
    public static final uj q = new uj("IABTCF_CmpSdkVersion", Object.class);
    public static final uj r = new uj("IABTCF_gdprApplies", Object.class);
    public static final uj s = new uj("IABTCF_TCString", String.class);
    public static final uj t = new uj("IABTCF_AddtlConsent", String.class);
    public static final uj u = new uj("IABTCF_VendorConsents", String.class);
    public static final uj v = new uj("IABTCF_VendorLegitimateInterests", String.class);
    public static final uj w = new uj("IABTCF_PurposeConsents", String.class);
    public static final uj x = new uj("IABTCF_PurposeLegitimateInterests", String.class);
    public static final uj y = new uj("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final uj z = new uj("com.applovin.sdk.stats", String.class);
    public static final uj A = new uj("com.applovin.sdk.task.stats", HashSet.class);
    public static final uj B = new uj("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final uj C = new uj("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final uj D = new uj("com.applovin.sdk.last_video_position", Integer.class);
    public static final uj E = new uj("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final uj F = new uj("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final uj G = new uj("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final uj H = new uj("com.applovin.sdk.persisted_data", String.class);
    public static final uj I = new uj("com.applovin.sdk.mediation_provider", String.class);
    public static final uj J = new uj("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final uj K = new uj("com.applovin.sdk.user_agent", String.class);
    public static final uj L = new uj("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final uj M = new uj("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final uj N = new uj("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final uj O = new uj("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final uj P = new uj("com.applovin.sdk.app_killed_last_ad_data", String.class);

    public uj(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public String a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public String toString() {
        return "Key{name='" + this.a + "', type=" + this.b + '}';
    }
}
