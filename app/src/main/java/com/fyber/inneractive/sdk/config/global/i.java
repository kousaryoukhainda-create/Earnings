package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class i implements d {
    public Set<Long> a = new HashSet();
    public boolean b;

    public i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.a.add(Long.valueOf(optLong));
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        if (!this.a.isEmpty() && eVar != null && eVar.b != null) {
            for (Long l : this.a) {
                if (l.equals(eVar.b)) {
                    return !this.b;
                }
            }
            return this.b;
        }
        return false;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.a, Boolean.valueOf(this.b));
    }
}
