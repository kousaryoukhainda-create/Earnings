package defpackage;

import java.util.Objects;
import org.json.JSONObject;
/* renamed from: hl0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1560hl0 extends C2875ul0 {
    @Override // defpackage.C2875ul0
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appName", this.a);
        jSONObject.put("lastUsedUnix", this.b);
        jSONObject.put("isIterruptiveNotification", true);
        return jSONObject;
    }

    @Override // defpackage.C2875ul0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1560hl0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1560hl0 c1560hl0 = (C1560hl0) obj;
        return true;
    }

    @Override // defpackage.C2875ul0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.TRUE);
    }
}
