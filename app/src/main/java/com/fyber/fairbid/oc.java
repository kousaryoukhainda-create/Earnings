package com.fyber.fairbid;

import androidx.annotation.NonNull;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class oc {
    public final Map<String, String> a;
    public final double b;
    public final JSONObject c;

    public oc(@NonNull JSONObject jSONObject, Map<String, String> map, double d) {
        this.c = jSONObject;
        this.a = map;
        this.b = d;
    }
}
