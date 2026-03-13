package defpackage;

import java.util.Objects;
import org.json.JSONObject;
/* renamed from: la0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2080la0 {
    public final String a;
    public final String b;
    public final String c;

    public C2080la0(JSONObject jSONObject) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2080la0)) {
            return false;
        }
        C2080la0 c2080la0 = (C2080la0) obj;
        if (this.a.equals(c2080la0.a) && this.b.equals(c2080la0.b) && Objects.equals(this.c, c2080la0.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.a);
        sb.append(", type: ");
        sb.append(this.b);
        sb.append(", offer token: ");
        return AbstractC0324Hi.h(sb, this.c, "}");
    }
}
