package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class o implements n {
    public JSONObject a;

    public o(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Double a(String str) {
        return Double.valueOf(this.a.optDouble(str, 0.0d));
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer b(String str) {
        if (this.a.has(str)) {
            try {
                return Integer.valueOf(this.a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String c(String str) {
        if (this.a.has(str)) {
            try {
                return this.a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean d(String str) {
        if (this.a.has(str)) {
            try {
                return Boolean.valueOf(this.a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String toString() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
