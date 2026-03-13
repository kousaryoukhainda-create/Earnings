package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.google.android.gms.tagmanager.DataLayer;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b1 implements o1 {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.a);
        jSONObject.put("eventtime", this.d);
        jSONObject.put(DataLayer.EVENT_KEY, this.b);
        jSONObject.put("event_session_name", this.e);
        jSONObject.put("first_session_event", this.f);
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.c));
        return jSONObject;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public JSONObject d() {
        JSONObject a = a();
        a.put("properties", n.b(this.c, o0.d().a()));
        return a;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.a = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optString(DataLayer.EVENT_KEY);
        this.c = n.a(jSONObject.optString("properties"), o0.d().a());
        this.a = jSONObject.optString("type");
        this.d = jSONObject.optString("eventtime");
        this.e = jSONObject.optString("event_session_name");
        this.f = jSONObject.optString("first_session_event");
    }
}
