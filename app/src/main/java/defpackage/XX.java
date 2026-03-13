package defpackage;

import org.json.JSONObject;
/* renamed from: XX  reason: default package */
/* loaded from: classes2.dex */
public final class XX {
    public final boolean a;
    public final boolean b;

    public XX(JSONObject jSONObject) {
        this.a = false;
        this.b = false;
        try {
            if (jSONObject.has("AggregateAdmonEvents")) {
                this.a = jSONObject.getBoolean("AggregateAdmonEvents");
            }
            if (jSONObject.has("debug")) {
                this.b = jSONObject.getBoolean("debug");
            }
        } catch (Throwable th) {
            C2741tB c2741tB = YX.d;
            c2741tB.c("failed parsing admon batching json with error: " + Ka0.c(th));
        }
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AggregateAdmonEvents", this.a);
            jSONObject.put("debug", this.b);
            return jSONObject;
        } catch (Throwable th) {
            C2741tB c2741tB = YX.d;
            c2741tB.c("failed to create json object with error: " + Ka0.c(th));
            return new JSONObject();
        }
    }
}
