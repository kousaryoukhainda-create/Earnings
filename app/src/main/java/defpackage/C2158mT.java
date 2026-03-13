package defpackage;

import org.json.JSONObject;
/* renamed from: mT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158mT {
    public final int a;
    public final int b;

    public C2158mT(JSONObject jSONObject) {
        this.a = jSONObject.getInt("commitmentPaymentsCount");
        this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
