package com.fyber.fairbid;

import com.fyber.fairbid.user.UserInfo;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l5 {
    public static final SimpleDateFormat b;
    public final JSONObject a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        b = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public l5() {
        JSONObject jSONObject = new JSONObject();
        this.a = jSONObject;
        try {
            String userId = UserInfo.getUserId();
            if (userId != null) {
                jSONObject.put("user_id", userId);
            } else {
                jSONObject.put("user_id", JSONObject.NULL);
            }
        } catch (JSONException unused) {
        }
    }
}
