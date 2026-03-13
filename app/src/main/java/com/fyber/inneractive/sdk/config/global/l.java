package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class l {
    public final Map<String, q> a = new HashMap();

    public q a(String str) {
        return this.a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.a.equals(((l) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return String.format("remoteConfig - features: %s", this.a.values());
    }

    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static l a(JSONObject jSONObject) throws Exception {
        int i = 1;
        l lVar = new l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        char c = 0;
        int i2 = 0;
        while (i2 < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            q qVar = new q();
            qVar.b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.a = new o(optJSONObject);
            } else {
                Object[] objArr = new Object[i];
                objArr[c] = qVar.b;
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                int i3 = 0;
                i = i;
                while (i3 < optJSONArray2.length()) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                    b bVar = new b();
                    bVar.a = jSONObject3.getString("id");
                    bVar.b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    ?? r0 = i;
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        k kVar = new k();
                        kVar.b = jSONObject4.getString("id");
                        kVar.c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.a = new o(optJSONObject2);
                        }
                        bVar.c.add(kVar);
                        r0 = 1;
                    }
                    b.a(bVar, jSONObject3.optJSONObject("include"), r0);
                    b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.c.put(bVar.a, bVar);
                    i3 += r0;
                    i = r0;
                }
            }
            lVar.a.put(qVar.b, qVar);
            i2 += i;
            c = 0;
            i = i;
        }
        return lVar;
    }
}
