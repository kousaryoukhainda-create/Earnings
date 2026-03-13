package defpackage;

import org.json.JSONObject;
/* renamed from: yl0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219yl0 extends Fi0 {
    public final String b;
    public final String c;

    public C3219yl0(JSONObject jSONObject) {
        this.b = jSONObject.getString("AppID");
        jSONObject.getString("Title");
        this.c = jSONObject.getString("Message");
    }
}
