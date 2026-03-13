package com.fyber.inneractive.sdk.config;

import com.fyber.fairbid.internal.Framework;
import com.fyber.inneractive.sdk.util.m0;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a0 implements b0 {
    public String a;
    public String b;
    public t c;
    public x d;
    public y e;
    public c0 f;
    public e0 g;

    public d0 a() {
        return this.f;
    }

    public e0 b() {
        return this.g;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        m0.a(jSONObject, "id", this.a);
        m0.a(jSONObject, "spotId", this.b);
        m0.a(jSONObject, "display", this.c);
        m0.a(jSONObject, "monitor", this.d);
        m0.a(jSONObject, Framework.NATIVE, this.e);
        m0.a(jSONObject, "video", this.f);
        m0.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }
}
