package com.fyber.inneractive.sdk.cache.session;

import com.applovin.sdk.AppLovinEventTypes;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    public HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, e> a = new a(this);

    /* loaded from: classes.dex */
    public class a extends HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, e> {
        public a(f fVar) {
            com.fyber.inneractive.sdk.cache.session.enums.b[] values;
            for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
                if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.NONE) {
                    put(bVar, new e());
                }
            }
        }
    }

    public JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<com.fyber.inneractive.sdk.cache.session.enums.b, e> entry : this.a.entrySet()) {
                com.fyber.inneractive.sdk.cache.session.enums.b key = entry.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", key.e().value());
                    if (key.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject2.put("subType", str);
                    jSONObject2.put("session_data", entry.getValue().a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
