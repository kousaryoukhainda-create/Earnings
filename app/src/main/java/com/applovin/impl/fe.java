package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class fe extends oe implements MaxAd {
    private final int l;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    protected com.applovin.impl.mediation.g o;
    private final String p;
    private MaxAdWaterfallInfo q;
    private long r;
    private String s;
    private String t;
    private bd u;

    public fe(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(map, jSONObject, jSONObject2, jVar);
        String str;
        this.m = new AtomicBoolean();
        this.n = new AtomicBoolean();
        this.l = i;
        this.o = gVar;
        if (gVar != null) {
            str = gVar.b();
        } else {
            str = null;
        }
        this.p = str;
    }

    private long L() {
        return a("load_started_time_ms", 0L);
    }

    public static fe a(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new ge(i, map, jSONObject, jSONObject2, jVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new ie(i, map, jSONObject, jSONObject2, jVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new he(i, map, jSONObject, jSONObject2, jVar);
        }
        throw new IllegalArgumentException(AbstractC2437ph.g("Unsupported ad format: ", string));
    }

    public static /* synthetic */ JSONObject b(tl tlVar) {
        return JsonUtils.deepCopy(tlVar.a("ad_values", new JSONObject()));
    }

    public /* synthetic */ Bundle c(tl tlVar) {
        JSONObject a;
        if (tlVar.a("credentials")) {
            a = tlVar.a("credentials", new JSONObject());
        } else {
            a = tlVar.a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", T());
        }
        return JsonUtils.toBundle(a);
    }

    public static /* synthetic */ bd d(tl tlVar) {
        return new bd(tlVar.a("hybrid_ad_config", (JSONObject) null));
    }

    public static /* synthetic */ JSONObject e(tl tlVar) {
        return JsonUtils.deepCopy(tlVar.a("publisher_extra_info", new JSONObject()));
    }

    public static /* synthetic */ Double f(tl tlVar) {
        return Double.valueOf(JsonUtils.getDouble(tlVar.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    public static /* synthetic */ JSONObject g(tl tlVar) {
        return JsonUtils.deepCopy(tlVar.a("revenue_parameters", new JSONObject()));
    }

    public static /* synthetic */ String h(tl tlVar) {
        return JsonUtils.getString(tlVar.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public static /* synthetic */ JSONObject t(tl tlVar) {
        return b(tlVar);
    }

    public static /* synthetic */ JSONObject u(tl tlVar) {
        return g(tlVar);
    }

    public static /* synthetic */ Double v(tl tlVar) {
        return f(tlVar);
    }

    public static /* synthetic */ String x(tl tlVar) {
        return h(tlVar);
    }

    public static /* synthetic */ JSONObject y(tl tlVar) {
        return e(tlVar);
    }

    public static /* synthetic */ bd z(tl tlVar) {
        return d(tlVar);
    }

    public com.applovin.impl.mediation.g A() {
        return this.o;
    }

    public String B() {
        return a("bcode", "");
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public long E() {
        return a("bwt_ms", ((Long) this.a.a(ue.B7)).longValue());
    }

    public Bundle F() {
        JSONObject a;
        tl tlVar = this.i;
        if (tlVar != null) {
            return (Bundle) tlVar.a(new C2941vb0(this, 21));
        }
        if (c("credentials")) {
            a = a("credentials", new JSONObject());
        } else {
            a = a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", T());
        }
        return JsonUtils.toBundle(a);
    }

    public long G() {
        if (L() > 0) {
            return K() - L();
        }
        return -1L;
    }

    public bd H() {
        bd bdVar = this.u;
        if (bdVar != null) {
            return bdVar;
        }
        tl tlVar = this.i;
        if (tlVar != null) {
            this.u = (bd) tlVar.a(new C2394p80(25));
        } else {
            this.u = new bd(a("hybrid_ad_config", (JSONObject) null));
        }
        return this.u;
    }

    public MaxAdFormat I() {
        String a = a("haf", (String) null);
        if (!StringUtils.isValidString(a)) {
            return null;
        }
        return MaxAdFormat.formatFromString(a);
    }

    public int J() {
        return this.l;
    }

    public long K() {
        return a("load_completed_time_ms", 0L);
    }

    public String M() {
        return this.s;
    }

    public double N() {
        return a("price", -1.0f);
    }

    public JSONObject O() {
        tl tlVar = this.i;
        if (tlVar != null) {
            return (JSONObject) tlVar.a(new C2394p80(24));
        }
        return a("publisher_extra_info", new JSONObject());
    }

    public String P() {
        return JsonUtils.getString(Q(), "revenue_event", "");
    }

    public JSONObject Q() {
        tl tlVar = this.i;
        if (tlVar != null) {
            return (JSONObject) tlVar.a(new C2394p80(27));
        }
        return a("revenue_parameters", new JSONObject());
    }

    public String R() {
        return b("event_id", "");
    }

    public long S() {
        return a("twt_ms", ((Long) this.a.a(ue.C7)).longValue());
    }

    public String T() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public List U() {
        return b("mwf_info_urls");
    }

    public String V() {
        return b("waterfall_name", "");
    }

    public String W() {
        return b("waterfall_test_name", "");
    }

    public boolean X() {
        return StringUtils.isValidString(D());
    }

    public boolean Y() {
        if (I() != null) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        return a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public abstract fe a(com.applovin.impl.mediation.g gVar);

    public boolean a0() {
        com.applovin.impl.mediation.g gVar = this.o;
        if (gVar == null || !gVar.k() || !this.o.j()) {
            return false;
        }
        return true;
    }

    public boolean b0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void d0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void e0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.t;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.o;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(T());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.a.a(ue.y7)).booleanValue() && getFormat().isFullscreenAd() && !u().get()) {
            this.a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.a.I().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
                return 0.0d;
            }
            return 0.0d;
        }
        tl tlVar = this.i;
        if (tlVar != null) {
            return ((Double) tlVar.a(new C2394p80(28))).doubleValue();
        }
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        tl tlVar = this.i;
        if (tlVar != null) {
            return (String) tlVar.a(new C2394p80(29));
        }
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int a = a("ad_width", -3);
        int a2 = a("ad_height", -3);
        if (a != -3 && a2 != -3) {
            return new AppLovinSdkUtils.Size(a, a2);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.q;
    }

    public void i(String str) {
        this.s = str;
    }

    @Override // com.applovin.impl.oe
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + T() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject x = x();
        if (x.has(str)) {
            return JsonUtils.getString(x, str, str2);
        }
        Bundle l = l();
        if (l.containsKey(str)) {
            return l.getString(str);
        }
        JSONObject O = O();
        if (O.has(str)) {
            return JsonUtils.getString(O, str, str2);
        }
        return a(str, str2);
    }

    public void t() {
        this.o = null;
        this.q = null;
    }

    public AtomicBoolean u() {
        return this.m;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.n;
    }

    public JSONObject x() {
        tl tlVar = this.i;
        if (tlVar != null) {
            return (JSONObject) tlVar.a(new C2394p80(26));
        }
        return a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.g gVar;
        if (!a0() || (gVar = this.o) == null) {
            return null;
        }
        return gVar.d();
    }

    public String z() {
        return this.p;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject O = O();
        JsonUtils.putAll(O, jSONObject);
        a("publisher_extra_info", (Object) O);
    }

    public void h(String str) {
        this.t = str;
    }

    public void a(long j) {
        this.r = j;
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.q = maxAdWaterfallInfo;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject x = x();
        JsonUtils.putAll(x, jSONObject);
        a("ad_values", (Object) x);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
