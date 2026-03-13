package defpackage;

import org.json.JSONObject;
/* renamed from: Ca  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186Ca {
    public final String a;

    public C0186Ca(String str) {
        this.a = new JSONObject(str).optString("countryCode");
    }
}
