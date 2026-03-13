package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: rT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587rT {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final ArrayList k;

    public C2587rT(String str) {
        ArrayList arrayList;
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                this.f = jSONObject.optString("name");
                this.g = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.h = jSONObject.optString("skuDetailsToken");
                this.i = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList2.add(new C2502qT(optJSONArray.getJSONObject(i)));
                    }
                    this.j = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.j = arrayList;
                }
                JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList3.add(new C2244nT(optJSONArray2.getJSONObject(i2)));
                    }
                    this.k = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new C2244nT(optJSONObject));
                    this.k = arrayList3;
                    return;
                } else {
                    this.k = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final C2244nT a() {
        ArrayList arrayList = this.k;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (C2244nT) arrayList.get(0);
        }
        return null;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2587rT)) {
            return false;
        }
        return TextUtils.equals(this.a, ((C2587rT) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        AbstractC2437ph.w(sb, this.a, "', parsedJson=", obj, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        return AbstractC2437ph.m(sb, this.h, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
