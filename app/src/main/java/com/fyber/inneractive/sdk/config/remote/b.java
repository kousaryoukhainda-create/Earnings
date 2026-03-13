package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    public UnitDisplayType a;
    public Boolean b;
    public Integer c;
    public Integer d;

    public static b a(JSONObject jSONObject) {
        Boolean bool;
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        int optInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt("refresh", Integer.MIN_VALUE);
        Integer valueOf2 = Integer.valueOf(optInt2);
        bVar.a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (jSONObject.has("close")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("close", true));
        } else {
            bool = null;
        }
        bVar.b = bool;
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.d = valueOf;
        if (optInt2 != Integer.MIN_VALUE) {
            num = valueOf2;
        }
        bVar.c = num;
        return bVar;
    }
}
