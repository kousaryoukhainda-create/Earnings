package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class je implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final Map D;
    private final boolean E;
    private final boolean F;
    private final rn G;
    private final boolean H;
    private final String I;
    private final Map J;
    private final com.applovin.impl.sdk.j a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final String o;
    private final String p;
    private String q;
    private String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final int w;
    private final List x;
    private final List y;
    private final List z;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        
        private final String a;

        a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        
        private final String a;
        private final int b;
        private final String c;

        b(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:29|(4:30|31|32|33)|(6:35|36|(5:38|(2:40|(3:42|43|44))|102|43|44)(1:103)|45|46|47)|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f3, code lost:
        r23.I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01fa, code lost:
        if (com.applovin.impl.sdk.n.a() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fc, code lost:
        r23.I().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0205, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public je(org.json.JSONObject r22, com.applovin.impl.sdk.j r23) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.je.<init>(org.json.JSONObject, com.applovin.impl.sdk.j):void");
    }

    public boolean A() {
        return this.f;
    }

    public boolean B() {
        return this.g;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.n;
    }

    public boolean E() {
        return this.d;
    }

    public boolean F() {
        if (this.b == a.MISSING && this.k) {
            return true;
        }
        return false;
    }

    public boolean G() {
        return this.F;
    }

    public boolean H() {
        return this.l;
    }

    public boolean I() {
        return this.m;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(je jeVar) {
        return this.p.compareToIgnoreCase(jeVar.p);
    }

    public String b() {
        return this.q;
    }

    public String c() {
        return this.s;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.z;
    }

    public String g() {
        return this.p;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.w;
    }

    public int i() {
        return this.c;
    }

    public final String j() {
        String str;
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.o);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.b.b());
        sb.append("\nSDK     - ");
        String str2 = "UNAVAILABLE";
        if (!this.d || TextUtils.isEmpty(this.r)) {
            str = "UNAVAILABLE";
        } else {
            str = this.r;
        }
        sb.append(str);
        sb.append("\nAdapter - ");
        if (this.f && !TextUtils.isEmpty(this.s)) {
            str2 = this.s;
        }
        sb.append(str2);
        for (gh ghVar : n()) {
            if (!ghVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(ghVar.b());
                sb.append(": ");
                sb.append(ghVar.a());
            }
        }
        for (o6 o6Var : f()) {
            if (!o6Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(o6Var.b());
                sb.append(": ");
                sb.append(o6Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.t;
    }

    public List l() {
        return this.B;
    }

    public String m() {
        return this.o;
    }

    public List n() {
        return this.y;
    }

    public final com.applovin.impl.sdk.j o() {
        return this.a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.q.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a2 = ze.a(string, this.a);
            if (a2 != null) {
                String a3 = ze.a(a2);
                if (!this.r.equals(a3)) {
                    this.r = a3;
                    this.a.q().a(this.r, string);
                }
            }
        }
    }

    public String p() {
        return this.r;
    }

    public a q() {
        return this.b;
    }

    public List r() {
        return this.x;
    }

    public List s() {
        return this.A;
    }

    public rn t() {
        return this.G;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediatedNetwork{name=");
        sb.append(this.o);
        sb.append(", displayName=");
        sb.append(this.p);
        sb.append(", sdkAvailable=");
        sb.append(this.d);
        sb.append(", sdkVersion=");
        sb.append(this.r);
        sb.append(", adapterAvailable=");
        sb.append(this.f);
        sb.append(", adapterVersion=");
        return AbstractC0324Hi.h(sb, this.s, "}");
    }

    public List u() {
        return this.C;
    }

    public String v() {
        return this.u;
    }

    public String w() {
        return this.v;
    }

    public Map x() {
        return this.D;
    }

    public b y() {
        if (!this.i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !E() || !A())) {
            return b.INVALID_INTEGRATION;
        }
        if (!this.a.k0().c()) {
            return b.DISABLED;
        }
        if (this.j && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return b.NOT_INITIALIZED;
        }
        return b.READY;
    }

    public boolean z() {
        return this.E;
    }

    private a a() {
        a aVar;
        if (this.d) {
            if (this.f) {
                aVar = a.COMPLETE;
            } else if (this.h) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        for (gh ghVar : this.y) {
            if (!ghVar.c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        for (o6 o6Var : this.z) {
            if (!o6Var.c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.n || com.applovin.impl.sdk.j.w0()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.j jVar) {
        JSONArray r = BK.r("dependencies", jSONObject);
        JSONArray r2 = BK.r("dependencies_v2", jSONObject);
        ArrayList arrayList = new ArrayList(r2.length() + r.length());
        for (int i = 0; i < r.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(r, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new o6(jSONObject2, jVar));
            }
        }
        for (int i2 = 0; i2 < r2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(r2, i2, (JSONObject) null);
            if (jSONObject3 != null && o6.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new o6(jSONObject3, jVar));
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        ArrayList arrayList = new ArrayList();
        if (this.q.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            gh ghVar = new gh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.j.m());
            if (ghVar.c()) {
                arrayList.add(ghVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new gh(next, jSONObject2.getString(next), com.applovin.impl.sdk.j.m()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }
}
