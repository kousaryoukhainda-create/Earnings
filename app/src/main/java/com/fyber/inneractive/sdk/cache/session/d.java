package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    public HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, h> b;
    public f a = new f();
    public final Object c = new Object();
    public final Object d = new Object();
    public a e = null;

    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar, boolean z, JSONObject jSONObject);
    }

    public d(int i, a aVar) {
        this.b = new com.fyber.inneractive.sdk.cache.session.a(this, i);
    }

    public static JSONObject a(d dVar) {
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", dVar.a.a());
            for (Map.Entry<com.fyber.inneractive.sdk.cache.session.enums.b, h> entry : dVar.b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                com.fyber.inneractive.sdk.cache.session.enums.b key = entry.getKey();
                Iterator<e> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().a(true, true));
                }
                jSONObject.put(key.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void a(com.fyber.inneractive.sdk.cache.session.enums.b bVar, e eVar) {
        synchronized (this.d) {
            try {
                h hVar = this.b.get(bVar);
                if (hVar != null) {
                    hVar.add(eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(f fVar) {
        com.fyber.inneractive.sdk.cache.session.enums.b[] values;
        e eVar;
        for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
            if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.NONE && (eVar = fVar.a.get(bVar)) != null && eVar.a != 0) {
                a(bVar, eVar);
            }
        }
    }

    public int a() {
        int i;
        com.fyber.inneractive.sdk.config.i iVar = IAConfigManager.M.u.b;
        String num = Integer.toString(5);
        if (iVar.a.containsKey("number_of_sessions")) {
            num = iVar.a.get("number_of_sessions");
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
            i = 5;
        }
        if (i < 0) {
            return 5;
        }
        return i;
    }
}
