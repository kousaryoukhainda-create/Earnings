package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: pT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2416pT {
    public final ArrayList a;

    public C2416pT(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C2330oT(optJSONObject));
                }
            }
        }
        this.a = arrayList;
    }
}
