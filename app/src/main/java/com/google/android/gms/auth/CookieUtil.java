package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes3.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    @NonNull
    public static String getCookieUrl(@NonNull String str, Boolean bool) {
        String str2;
        Preconditions.checkNotEmpty(str);
        if (true != zza(bool)) {
            str2 = "http";
        } else {
            str2 = HttpConnection.DEFAULT_SCHEME;
        }
        return AbstractC0324Hi.g(str2, "://", str);
    }

    @NonNull
    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (zza(bool)) {
            sb.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(";SameSite=null");
        }
        if (zza(null)) {
            sb.append(";SameParty");
        }
        return sb.toString();
    }

    private static boolean zza(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
