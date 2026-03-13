package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: rg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2606rg {
    public static final Date h = new Date(0);
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;
    public final JSONArray g;

    public C2606rg(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }

    public static C2606rg a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new C2606rg(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qg, java.lang.Object] */
    public static C2521qg c() {
        ?? obj = new Object();
        obj.b = new JSONObject();
        obj.d = h;
        obj.e = new JSONArray();
        obj.c = new JSONObject();
        obj.a = 0L;
        obj.f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.g;
            if (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    String string3 = jSONArray2.getString(i2);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2606rg)) {
            return false;
        }
        return this.a.toString().equals(((C2606rg) obj).a.toString());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
