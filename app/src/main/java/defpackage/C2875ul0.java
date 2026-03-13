package defpackage;

import java.util.Objects;
import org.json.JSONObject;
/* renamed from: ul0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2875ul0 {
    public final String a;
    public final long b;

    public C2875ul0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appName", this.a);
        jSONObject.put("lastUsedUnix", this.b);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2875ul0)) {
            return false;
        }
        C2875ul0 c2875ul0 = (C2875ul0) obj;
        if (this.b == c2875ul0.b && Objects.equals(this.a, c2875ul0.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b));
    }
}
