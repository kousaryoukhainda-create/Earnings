package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: UX  reason: default package */
/* loaded from: classes2.dex */
public abstract class UX {
    public static final C2741tB a = new C2741tB(UX.class.getSimpleName(), 8);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = b((JSONObject) obj);
                }
                arrayList.add(obj);
            } catch (Throwable th) {
                a.a(Ka0.c(th));
            }
        }
        return arrayList;
    }

    public static HashMap b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = b((JSONObject) obj);
                }
                hashMap.put(next, obj);
            }
        } catch (Throwable th) {
            a.a(Ka0.c(th));
        }
        return hashMap;
    }
}
