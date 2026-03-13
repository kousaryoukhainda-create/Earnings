package defpackage;

import org.json.JSONObject;
/* renamed from: Kg0  reason: default package */
/* loaded from: classes2.dex */
public final class Kg0 extends Fi0 {
    public final String b;
    public final int c;
    public final String d;

    public Kg0(JSONObject jSONObject) {
        this.b = jSONObject.getString("BundleURL");
        this.c = jSONObject.getInt("BundleVersion");
        this.d = jSONObject.getString("BundleCheckSum");
    }
}
