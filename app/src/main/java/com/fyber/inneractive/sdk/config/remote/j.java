package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class j {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Skip d;
    public Boolean e;
    public TapAction f;
    public Orientation g;
    public Integer h;
    public Integer i;
    public UnitDisplayType j;
    public List<Integer> k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        Boolean bool;
        Boolean bool2;
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int optInt = jSONObject.optInt("maxBitrate", Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt("minBitrate", Integer.MIN_VALUE);
        Integer valueOf2 = Integer.valueOf(optInt2);
        int optInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer valueOf3 = Integer.valueOf(optInt3);
        int optInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer valueOf4 = Integer.valueOf(optInt4);
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.b = valueOf;
        if (optInt2 == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.c = valueOf2;
        jVar.d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        if (jSONObject.has("muted")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("muted", true));
        } else {
            bool = null;
        }
        jVar.e = bool;
        if (jSONObject.has("autoPlay")) {
            bool2 = Boolean.valueOf(jSONObject.optBoolean("autoPlay", true));
        } else {
            bool2 = null;
        }
        jVar.a = bool2;
        jVar.g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f = TapAction.fromValue(jSONObject.optString("tap"));
        if (optInt3 == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        jVar.h = valueOf3;
        if (optInt4 != Integer.MIN_VALUE) {
            num = valueOf4;
        }
        jVar.i = num;
        jVar.j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt5 = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt5 != Integer.MIN_VALUE) {
                    jVar.k.add(Integer.valueOf(optInt5));
                }
            }
        }
        return jVar;
    }
}
