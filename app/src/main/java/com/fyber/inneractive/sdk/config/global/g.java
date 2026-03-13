package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    public static JSONArray a(Map<Class<? extends com.fyber.inneractive.sdk.config.global.features.g>, com.fyber.inneractive.sdk.config.global.features.g> map, boolean z) {
        String str;
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.g gVar : map.values()) {
                List<b> c = gVar.c();
                Map<String, k> map2 = gVar.d;
                Iterator it = ((ArrayList) c).iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    JSONObject jSONObject = new JSONObject();
                    if (bVar != null) {
                        str = bVar.a;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = map2.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z) {
                            Iterator<d> it2 = bVar.d.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    dVar = it2.next();
                                    if (c.class.equals(dVar.getClass())) {
                                        break;
                                    }
                                } else {
                                    dVar = null;
                                    break;
                                }
                            }
                            if (dVar != null && ((c) dVar).b) {
                                Set<Long> set = ((c) dVar).a;
                                JSONArray jSONArray2 = new JSONArray();
                                for (Long l : set) {
                                    jSONArray2.put(l);
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
