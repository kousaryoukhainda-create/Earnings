package defpackage;

import org.json.JSONObject;
/* renamed from: oT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330oT {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public C2330oT(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.c = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        this.f = jSONObject.optInt("recurrenceMode");
        this.e = jSONObject.optInt("billingCycleCount");
    }
}
