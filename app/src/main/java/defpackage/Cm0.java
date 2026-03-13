package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Cm0  reason: default package */
/* loaded from: classes.dex */
public abstract class Cm0 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap hashMap = a;
                if (hashMap.containsKey(string)) {
                    return Li0.d(((String) hashMap.get(string)) + ":" + string2);
                }
            }
            return Li0.d("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            return Li0.d("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }
}
