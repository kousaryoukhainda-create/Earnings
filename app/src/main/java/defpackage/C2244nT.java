package defpackage;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: nT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2244nT {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final C1314ew f;

    public C2244nT(JSONObject jSONObject) {
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        this.c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        C1314ew c1314ew = null;
        this.d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
        }
        zzco.zzk(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            optJSONObject.getInt("percentageDiscount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject2 != null) {
            optJSONObject2.getLong("startTimeMillis");
            optJSONObject2.getLong("endTimeMillis");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            optJSONObject3.getInt("maximumQuantity");
            optJSONObject3.getInt("remainingQuantity");
        }
        this.e = jSONObject.optString("serializedDocid");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            optJSONObject4.getLong("preorderReleaseTimeMillis");
            optJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getString("rentalPeriod");
            optJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
        if (optJSONObject6 != null) {
            c1314ew = new C1314ew(27);
            optJSONObject6.getString("type");
            JSONArray optJSONArray2 = optJSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList2.add(Integer.valueOf(optJSONArray2.getInt(i2)));
                }
            }
            JSONArray jSONArray = optJSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArray != null) {
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject optJSONObject7 = jSONArray.optJSONObject(i3);
                    if (optJSONObject7 != null) {
                        arrayList3.add(new C2330oT(optJSONObject7));
                    }
                }
            }
        }
        this.f = c1314ew;
    }
}
