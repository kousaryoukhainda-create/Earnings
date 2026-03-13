package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: im0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1647im0 {
    public static final Logger a = new Logger("JSONParser", new String[0]);

    /* JADX WARN: Type inference failed for: r0v0, types: [e5, Z10] */
    public static C1243e5 a(JSONObject jSONObject) {
        ?? z10 = new Z10();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            z10.put(next, obj);
        }
        return z10;
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map c(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        int size = zza.size();
        Logger logger = a;
        if (size < 2) {
            logger.e(AbstractC2437ph.g("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            C1243e5 d = d(new String(Base64Utils.decodeUrlSafeNoPadding(zza.get(1)), "UTF-8"));
            if (d == null) {
                return new HashMap();
            }
            return d;
        } catch (UnsupportedEncodingException e) {
            logger.e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    public static C1243e5 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return a(jSONObject);
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaag(e);
        }
    }
}
