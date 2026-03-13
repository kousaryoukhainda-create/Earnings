package defpackage;

import org.json.JSONObject;
/* renamed from: G2  reason: default package */
/* loaded from: classes.dex */
public final class G2 {
    public final String a;

    public G2(String str) {
        this.a = new JSONObject(str).optString("externalTransactionToken");
    }
}
