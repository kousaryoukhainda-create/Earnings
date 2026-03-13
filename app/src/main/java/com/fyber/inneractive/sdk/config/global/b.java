package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    public String a;
    public int b;
    public final List<k> c = new ArrayList();
    public List<d> d = new ArrayList();

    public static void a(b bVar, JSONObject jSONObject, boolean z) throws Exception {
        d cVar;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals("sdk")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        cVar = new c(jSONObject.getJSONArray(next), z);
                        break;
                    case 1:
                        cVar = new i(jSONObject.getJSONArray(next), z);
                        break;
                    case 2:
                        cVar = new h(jSONObject.getJSONArray(next), z);
                        break;
                    case 3:
                        cVar = new f(jSONObject.getString(next), z);
                        break;
                    case 4:
                        cVar = new j(jSONObject.getString(next), z);
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    bVar.d.add(cVar);
                } else {
                    IAlog.a("b: Unsupported filter type: ".concat(next), new Object[0]);
                }
            }
        }
    }

    public String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.a, this.c, this.d);
    }
}
