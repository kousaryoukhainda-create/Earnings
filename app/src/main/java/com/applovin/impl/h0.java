package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h0 {
    private static final Map e = new HashMap();
    private static final Object f = new Object();
    private JSONObject a;
    private final String b;
    private AppLovinAdSize c;
    private AppLovinAdType d;

    private h0(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.c = appLovinAdSize;
        this.d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z ? AbstractC0324Hi.f(lowerCase, "_bidding") : lowerCase;
        this.b = z2 ? AbstractC0324Hi.f(lowerCase, "_direct_sold") : lowerCase;
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static h0 b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static h0 c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static h0 h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static h0 j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static h0 k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static h0 l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static h0 m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize f2 = f();
        if (f2 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (f2 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (f2 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (f2 == AppLovinAdSize.INTERSTITIAL) {
            if (g() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (g() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (g() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (g() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        } else if (f2 == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            return this.b.equalsIgnoreCase(((h0) obj).b);
        }
        return false;
    }

    public AppLovinAdSize f() {
        if (this.c == null && JsonUtils.valueExists(this.a, "ad_size")) {
            this.c = AppLovinAdSize.fromString(JsonUtils.getString(this.a, "ad_size", null));
        }
        return this.c;
    }

    public AppLovinAdType g() {
        if (this.d == null && JsonUtils.valueExists(this.a, "ad_type")) {
            this.d = AppLovinAdType.fromString(JsonUtils.getString(this.a, "ad_type", null));
        }
        return this.d;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.b + ", zoneObject=" + this.a + '}';
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static h0 b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static h0 a(String str) {
        return a(null, null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f) {
                try {
                    h0 h0Var = (h0) e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (h0Var != null) {
                        h0Var.c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        h0Var.d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        h0 h0Var = new h0(appLovinAdSize, appLovinAdType, str, z, z2);
        synchronized (f) {
            try {
                String str2 = h0Var.b;
                Map map = e;
                if (map.containsKey(str2)) {
                    h0Var = (h0) map.get(str2);
                } else {
                    map.put(str2, h0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h0Var;
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
