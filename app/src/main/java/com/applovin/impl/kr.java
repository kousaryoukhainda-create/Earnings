package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class kr {
    private final String a;
    private final String b;
    private final List c;

    public kr(JSONObject jSONObject) {
        this.a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }
}
