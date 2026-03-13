package com.applovin.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
abstract class i3 {
    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] a(byte[] bArr) {
        return xp.a >= 27 ? bArr : xp.c(a(xp.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (xp.a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(xp.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return xp.c(sb.toString());
        } catch (JSONException e) {
            oc.a("ClearKeyUtil", "Failed to adjust response data: " + xp.a(bArr), e);
            return bArr;
        }
    }
}
