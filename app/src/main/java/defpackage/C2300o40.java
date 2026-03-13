package defpackage;

import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: o40  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2300o40 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;
    public final String b;
    public final long c;

    public C2300o40(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.TOKEN, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static C2300o40 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C2300o40(jSONObject.getString(Constants.TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new C2300o40(str, null, 0L);
    }
}
