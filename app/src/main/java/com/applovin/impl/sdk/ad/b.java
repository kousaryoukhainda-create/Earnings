package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.d5;
import com.applovin.impl.eh;
import com.applovin.impl.hh;
import com.applovin.impl.lg;
import com.applovin.impl.qq;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sr;
import com.applovin.impl.tl;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import io.flutter.plugins.firebase.analytics.Constants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class b extends AppLovinAdImpl implements hh {
    private final List f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicReference i;
    private final Bundle j;
    private d k;

    /* renamed from: com.applovin.impl.sdk.ad.b$b */
    /* loaded from: classes.dex */
    public enum EnumC0030b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: classes.dex */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: classes.dex */
    public class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private d() {
            b.this = r4;
            this.a = AppLovinSdkUtils.dpToPx(j.m(), r4.m());
            this.b = AppLovinSdkUtils.dpToPx(j.m(), r4.o());
            this.c = AppLovinSdkUtils.dpToPx(j.m(), r4.k());
            this.d = AppLovinSdkUtils.dpToPx(j.m(), ((Integer) ((AppLovinAdBase) r4).sdk.a(sj.q1)).intValue());
            this.e = AppLovinSdkUtils.dpToPx(j.m(), ((Integer) ((AppLovinAdBase) r4).sdk.a(sj.p1)).intValue());
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f = CollectionUtils.synchronizedList();
        this.g = new AtomicBoolean();
        this.h = new AtomicBoolean();
        this.i = new AtomicReference();
        this.j = new Bundle();
    }

    public static /* synthetic */ m B(tl tlVar) {
        return s(tlVar);
    }

    public static /* synthetic */ Boolean C(tl tlVar) {
        return t(tlVar);
    }

    public static /* synthetic */ Boolean G(tl tlVar) {
        return u(tlVar);
    }

    public static /* synthetic */ Map I(tl tlVar) {
        return m(tlVar);
    }

    public static /* synthetic */ Bundle N(tl tlVar) {
        return k(tlVar);
    }

    public static /* synthetic */ String O(tl tlVar) {
        return p(tlVar);
    }

    public static /* synthetic */ String P(tl tlVar) {
        return n(tlVar);
    }

    public static /* synthetic */ d5 R(tl tlVar) {
        return h(tlVar);
    }

    public /* synthetic */ List a(tl tlVar) {
        return yp.a(tlVar.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List b(tl tlVar) {
        return yp.a(tlVar.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ Map c(tl tlVar) {
        try {
            return JsonUtils.toStringMap(tlVar.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.I();
            if (n.a()) {
                this.sdk.I().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    public /* synthetic */ List d(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List e(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List g(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public static /* synthetic */ d5 h(tl tlVar) {
        JSONObject a2 = tlVar.a("custom_tabs_settings", (JSONObject) null);
        if (a2 != null) {
            return new d5(a2);
        }
        return null;
    }

    public /* synthetic */ List i(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List j(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public static /* synthetic */ Bundle k(tl tlVar) {
        return JsonUtils.toBundle(tlVar.a("ah_parameters", (JSONObject) null));
    }

    public /* synthetic */ List l(tl tlVar) {
        return yp.a(tlVar.a("imp_urls", new JSONObject()), getClCode(), null, null, R(), V0(), this.sdk);
    }

    public static /* synthetic */ Map m(tl tlVar) {
        try {
            return JsonUtils.toStringMap(tlVar.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ String n(tl tlVar) {
        return JsonUtils.getString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    public static /* synthetic */ String o(tl tlVar) {
        return JsonUtils.getString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    public static /* synthetic */ String p(tl tlVar) {
        return JsonUtils.getString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_html_url", "");
    }

    public /* synthetic */ qq q(tl tlVar) {
        return new qq(tlVar.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    private String q0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject == null) {
            return null;
        }
        return stringFromAdObject.replace("{CLCODE}", getClCode());
    }

    public /* synthetic */ List r(tl tlVar) {
        return yp.a(tlVar.a("video_end_urls", new JSONObject()), getClCode(), q0(), this.sdk);
    }

    public static /* synthetic */ m s(tl tlVar) {
        JSONObject a2 = tlVar.a("web_view_settings", (JSONObject) null);
        if (a2 != null) {
            return new m(a2);
        }
        return null;
    }

    public static /* synthetic */ Boolean t(tl tlVar) {
        return JsonUtils.getBoolean(tlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public static /* synthetic */ Boolean u(tl tlVar) {
        return JsonUtils.getBoolean(tlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_url_contents", Boolean.FALSE);
    }

    public static /* synthetic */ Boolean v(tl tlVar) {
        return JsonUtils.getBoolean(tlVar.a("video_button_properties", (JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE);
    }

    public static /* synthetic */ String x(tl tlVar) {
        return o(tlVar);
    }

    public static /* synthetic */ Boolean y(tl tlVar) {
        return v(tlVar);
    }

    public boolean A0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(sj.S1));
    }

    public boolean B0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean C0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean D0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean E0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean F0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public abstract boolean G0();

    public AtomicBoolean H0() {
        return this.g;
    }

    public boolean I0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(sj.f2));
    }

    public boolean J0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public abstract boolean K0();

    public boolean L0() {
        boolean z;
        if (!yp.h(j.m()) && !yp.f(j.m()) && !((Boolean) this.sdk.a(sj.f6)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(z));
    }

    public boolean M0() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public abstract void N0();

    public boolean O0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean P0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(sj.j6));
    }

    public abstract String Q();

    public boolean Q0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return ((Boolean) tlVar.a(new C2394p80(8))).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public boolean R0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return ((Boolean) tlVar.a(new C2394p80(9))).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_url_contents", Boolean.FALSE).booleanValue();
    }

    public boolean S0() {
        return this.h.get();
    }

    public boolean T0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean U0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(sj.T0));
    }

    public boolean V0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public boolean W0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean X0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public List Y() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return this.sdk.c(sj.F0);
    }

    public boolean Y0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public List Z() {
        return getStringListFromAdObject("rea", X());
    }

    public boolean Z0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public String a0() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public boolean a1() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public String b0() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public boolean b1() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public String c0() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public boolean c1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public e.a d0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        if (intFromAdObject == -1) {
            return n();
        }
        return a(intFromAdObject);
    }

    public boolean d1() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return ((Boolean) tlVar.a(new C2394p80(12))).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE).booleanValue();
    }

    public List e0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean e1() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public eh f() {
        return (eh) this.i.getAndSet(null);
    }

    public c f0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        if ("ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_LANDSCAPE;
        }
        return cVar;
    }

    public boolean f1() {
        boolean z;
        if (AppLovinAdType.AUTO_INCENTIVIZED == getType()) {
            z = true;
        } else {
            z = false;
        }
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(z));
    }

    public Uri g0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean g1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public abstract lg getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (Bundle) tlVar.a(new C2394p80(15));
        }
        return JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public List getOpenMeasurementVerificationScriptResources() {
        List a2;
        Kf0 kf0 = new Kf0(this, 6);
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new C2941vb0(kf0, 8));
        }
        synchronized (this.adObjectLock) {
            a2 = a(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return a2;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        for (String str : stringListFromAdObject) {
            arrayList.add(str.replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public String h0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (String) tlVar.a(new C2394p80(14));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public boolean h1() {
        return getBooleanFromAdObject("track_auto_redirects", Boolean.FALSE);
    }

    public String i0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (String) tlVar.a(new C2394p80(10));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean i1() {
        String str = this.sdk.f0().getExtraParameters().get("should_use_exoplayer_if_available");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public abstract boolean isOpenMeasurementEnabled();

    public abstract Uri j();

    public String j0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (String) tlVar.a(new C2394p80(16));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html_url", "");
    }

    public boolean j1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public qq k0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (qq) tlVar.a(new Kf0(this, 9));
        }
        return new qq(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public abstract Uri l0();

    public long m0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long n0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public int o0() {
        return yp.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public List p0() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 2));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), q0(), this.sdk);
        }
        return a2;
    }

    public e r0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if ("top".equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return e.LEFT;
        }
        if ("right".equals(stringFromAdObject)) {
            return e.RIGHT;
        }
        return e.RESIZE_ASPECT;
    }

    public int s0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean t0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri u0();

    public int v0() {
        int i;
        if (yp.a(getSize())) {
            i = 1;
        } else if (((Boolean) this.sdk.a(sj.L5)).booleanValue()) {
            i = 0;
        } else {
            i = -1;
        }
        return getIntFromAdObject("whalt", i);
    }

    public List w() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 5));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public m w0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (m) tlVar.a(new C2394p80(17));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject == null) {
            return null;
        }
        return new m(jsonObjectFromAdObject);
    }

    public List x0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List y0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public boolean z0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(sj.R5));
    }

    private List K() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    public /* synthetic */ List f(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List A() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public boolean B() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public int C() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int D() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int E() {
        return yp.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public List F() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 3));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, R(), V0(), this.sdk);
        }
        return a2;
    }

    public int G() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(sj.U0)).intValue());
    }

    public boolean H() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String I() {
        return getStringFromFullResponse("event_id", null);
    }

    public List J() {
        List<Integer> K = K();
        if (K != null) {
            ArrayList arrayList = new ArrayList(K.size());
            for (Integer num : K) {
                arrayList.add(a(num.intValue()));
            }
            return arrayList;
        }
        return null;
    }

    public List L() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public Uri M() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public String N() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public String O() {
        return getStringFromAdObject("nia_message", "");
    }

    public String P() {
        return getStringFromAdObject("nia_title", "");
    }

    public Map R() {
        Map<String, String> stringMap;
        HashMap hashMap = new HashMap();
        try {
            tl tlVar = this.synchronizedAdObject;
            if (tlVar != null) {
                stringMap = (Map) tlVar.a(new C2394p80(11));
            } else {
                stringMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject()));
            }
            hashMap.putAll(stringMap);
        } catch (JSONException e2) {
            this.sdk.I();
            if (n.a()) {
                this.sdk.I().a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put(HttpConnection.USER_AGENT_HEADER, sr.a());
        }
        return hashMap;
    }

    public EnumC0030b S() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0030b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0030b.DO_NOT_DISMISS;
            }
        }
        return EnumC0030b.UNSPECIFIED;
    }

    public int T() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public long U() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public long V() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int W() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public List X() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public d5 x() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (d5) tlVar.a(new C2394p80(13));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new d5(jsonObjectFromAdObject);
        }
        return null;
    }

    public List y() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 8));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List z() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 11));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public /* synthetic */ List a(MotionEvent motionEvent, boolean z, boolean z2, tl tlVar) {
        return yp.a(tlVar.a("click_tracking_urls", new JSONObject()), a(motionEvent, z, z2), c(motionEvent, z, z2), R(), V0(), this.sdk);
    }

    public List d() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 10));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public Bundle e() {
        return this.j;
    }

    public List g() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 7));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public String h() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public List i() {
        return this.f;
    }

    public int k() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(sj.T1)).intValue());
    }

    public d l() {
        if (this.k == null) {
            this.k = new d();
        }
        return this.k;
    }

    public int m() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(sj.U1)).intValue());
    }

    public e.a n() {
        List K = K();
        int intFromAdObject = getIntFromAdObject("close_style", (K == null || K.size() <= 0) ? -1 : ((Integer) K.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int o() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(sj.V1)).intValue());
    }

    public long p() {
        List L = L();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (L == null || L.size() <= 0) ? 0L : ((Integer) L.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public int q() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int r() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public Bundle s() {
        Map hashMap;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            hashMap = (Map) tlVar.a(new Kf0(this, 4));
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.I();
                if (n.a()) {
                    this.sdk.I().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                hashMap = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString(HttpConnection.USER_AGENT_HEADER, sr.a());
        }
        return bundle;
    }

    public List t() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 0));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List u() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 1));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List v() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Kf0(this, 12));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    private String c(MotionEvent motionEvent, boolean z, boolean z2) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map a2 = a(motionEvent, z, z2);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a2);
        }
        return null;
    }

    public void b(boolean z) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    public void c(Uri uri) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public static /* synthetic */ List a(InterfaceC1006cA interfaceC1006cA, tl tlVar) {
        return (List) interfaceC1006cA.apply(tlVar.a("omid_verification_script_resources", (JSONArray) null));
    }

    public List d(MotionEvent motionEvent, boolean z, boolean z2) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map a2 = a(motionEvent, z, z2);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        for (String str : stringListFromAdObject) {
            arrayList.add(StringUtils.replace(str, a2));
        }
        return arrayList;
    }

    public List b(MotionEvent motionEvent, boolean z, boolean z2) {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new C2552r2(this, motionEvent, z, z2));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z, z2), c(motionEvent, z, z2), R(), V0(), this.sdk);
        }
        return a2;
    }

    public /* synthetic */ List a(MotionEvent motionEvent, boolean z, tl tlVar) {
        return yp.a(tlVar.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z), null, R(), V0(), this.sdk);
    }

    public static /* synthetic */ void a(String str, tl tlVar) {
        JsonUtils.putString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    public void c() {
        this.h.set(true);
    }

    public void a(eh ehVar) {
        this.i.set(ehVar);
    }

    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, Constants.PARAMETERS, null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.I();
                if (n.a()) {
                    this.sdk.I().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    public void b(Uri uri) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void a(Uri uri) {
        this.f.add(uri);
    }

    public void a(String str) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a(new C0650Tx(str, 3));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public List a(MotionEvent motionEvent, boolean z) {
        List a2;
        List list;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            list = (List) tlVar.a(new C0724Wt(this, motionEvent, z));
        } else {
            synchronized (this.adObjectLock) {
                a2 = yp.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z), null, R(), V0(), this.sdk);
            }
            list = a2;
        }
        return list.isEmpty() ? b(motionEvent, true, z) : list;
    }

    private Map a(MotionEvent motionEvent, boolean z, boolean z2) {
        Point b = z3.b(j.m());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        hashMap.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        hashMap.put("{IS_INSTALL}", String.valueOf(z2));
        return hashMap;
    }

    private e.a a(boolean z) {
        return z ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    public e.a a(int i) {
        if (i == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return e.a.INVISIBLE;
        }
        if (i == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
