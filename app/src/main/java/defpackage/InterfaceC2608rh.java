package defpackage;

import com.google.android.gms.measurement.AppMeasurement;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: rh  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2608rh {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final Set d;

    static {
        Locale locale = Locale.US;
        C2741tB c2741tB = Ka0.a;
        a = AbstractC2437ph.g("ac1e99ab.master; ", new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format((Object) 1751459376252L));
        b = "Singular/v12.9.1";
        c = "Singular/SDK-v12.9.1.PROD";
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList("st", "h", "stul", "p", "os", "a", "ca", "an", "i", "udid", "op", "su", "ve", "murl", "k", "u", "wurl", "singular_click_id", "referrer", "ip", "ipv6", "s", "redirect", "rt", "pl", "dkeys", "cur", "amt", "utime", "ut", "t", "av", "app_v", "c", "n", "v", "sdk", "dnt", "de", "br", "ab", "ma", "mo", "pr", "lag", "ddl_to", "is", "ddl_enabled", "ddl enabled", "install", "first", "idfa", "idfv", "aifa", "andi", "sing", "custom_user_id", "apid", "re", "_is_sl_click", "add_referrer", "web_gclid", "_no_hash_validation", "_hash_validated", "_api_key_validated", "_rejected_hash", "_rejected_api_key", "_rejected_no_adnetwork", "message_id", "trace_id", "request_id", "singular_link", "openuri", "preload", "atr_settings", "_p", "country_code", HwPayConstant.KEY_COUNTRY, "singular_device_id", "singular_custom_id", "SCID", "lc", "singular_link_resolve_required", "ua", "device_user_agent", "original_keyspace", "original_device_key", "original_message_id", "sng_debug_enabled", "_ddlUrl", "_ddlErr", "_ddlSource", "_attribution_info_network", "_attribution_info_source", "user_id", "_web_params", "_link_type", "originated_in_touchpoint_store", "_forward_params", "_dl", "_android_dl", "_ios_dl", "_ddl", "_force_redirect", "_android_force_redirect", "_ch", "__ch_enabled", "skan_postback_payload", "_no_traffic_filtering", "esp_link", "esp_domains", "_smtype", "att_authorization_status", "bd", "sng_ref", "is_admon_revenue", "e", "apns_token", "tok", AppMeasurement.FCM_ORIGIN, "fi", "gcm", "ri", "sh", "sw", "is_revenue_event", "purchase_receipt", "ecid", "install_ref", "attribution_token", "attr_ts", "attr_type", "adv_id", "adv_keyspace", "fps_status", "_samsung_redirect", "_fire_redirect", "lookup_platform", "touchpoint_platform", "ch_parsed", "conversion_event", "conversion_value", "counter_banner_showed", "install_id", "sdid", "global_properties", "dont_send_click_to_unilogs", "global_timeout", "ptix", "pshid", "ipon", "ci")));
    }
}
