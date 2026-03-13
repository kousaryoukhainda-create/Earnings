package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: qT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2502qT {
    public final String a;
    public final String b;
    public final String c;
    public final C2416pT d;
    public final ArrayList e;
    public final C2158mT f;

    public C2502qT(JSONObject jSONObject) {
        this.a = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.b = true == optString.isEmpty() ? null : optString;
        this.c = jSONObject.getString("offerIdToken");
        this.d = new C2416pT(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        this.f = optJSONObject != null ? new C2158mT(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString("title");
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
        }
        this.e = arrayList;
    }
}
