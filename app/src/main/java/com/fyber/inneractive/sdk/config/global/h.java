package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class h implements d {
    public Set<String> a = new HashSet();
    public boolean b;

    public h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.a.add(optString);
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        if (!this.a.isEmpty() && eVar != null && eVar.c != null) {
            for (String str : this.a) {
                if (str.equals(eVar.c.value())) {
                    return !this.b;
                }
            }
            return this.b;
        }
        return false;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.a, Boolean.valueOf(this.b));
    }
}
