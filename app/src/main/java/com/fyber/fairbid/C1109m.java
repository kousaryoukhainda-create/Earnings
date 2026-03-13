package com.fyber.fairbid;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fyber.fairbid.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109m extends n5 {
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;

    /* renamed from: com.fyber.fairbid.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static C1109m a(JSONObject jSONObject, C1109m c1109m) {
            try {
                return new C1109m(jSONObject, c1109m);
            } catch (JSONException unused) {
                return new C1109m(null, null);
            }
        }
    }

    public C1109m(JSONObject jSONObject, C1109m c1109m) {
        boolean z;
        if (c1109m != null) {
            setDefaultValueProvider(c1109m);
        }
        boolean z2 = false;
        if (jSONObject != null) {
            if (jSONObject.has("enabled")) {
                put$fairbid_sdk_release("enabled", Boolean.valueOf(jSONObject.getBoolean("enabled")));
            }
            if (jSONObject.has("impression_delay")) {
                put$fairbid_sdk_release("impression_delay", jSONObject.getJSONArray("impression_delay").get(0));
            }
            if (jSONObject.has("click_delay")) {
                put$fairbid_sdk_release("click_delay", jSONObject.getJSONArray("click_delay").get(0));
            }
            if (jSONObject.has("shortest_edge")) {
                put$fairbid_sdk_release("shortest_edge", Integer.valueOf(jSONObject.getInt("shortest_edge")));
            }
        }
        boolean booleanValue = ((Boolean) get$fairbid_sdk_release("enabled", Boolean.FALSE)).booleanValue();
        this.c = booleanValue;
        int intValue = ((Number) get$fairbid_sdk_release("impression_delay", -1)).intValue();
        this.d = intValue;
        int intValue2 = ((Number) get$fairbid_sdk_release("click_delay", -1)).intValue();
        this.e = intValue2;
        this.f = ((Number) get$fairbid_sdk_release("shortest_edge", 0)).intValue();
        if (booleanValue && intValue2 != -1) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (booleanValue && intValue != -1) {
            z2 = true;
        }
        this.h = z2;
    }
}
