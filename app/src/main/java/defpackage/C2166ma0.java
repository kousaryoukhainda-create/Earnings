package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: ma0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2166ma0 {
    public final JSONObject a;
    public final ArrayList b;

    public C2166ma0(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C2080la0(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }
}
