package com.fyber.fairbid;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fyber.fairbid.internal.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public final class oi {
    public static int a = -1;

    /* loaded from: classes.dex */
    public static class a implements kh {
        public static final HashMap a = new HashMap();

        @Override // com.fyber.fairbid.kh
        public final synchronized Map<String, String> getParameters() {
            return a;
        }
    }

    @Deprecated
    public static void a(String str, Context context) {
        C2053lA.g("PrivacySettings", "Setting IAB US Privacy String to: ".concat(str != null ? str : "null"));
        if (context == null) {
            if (C2053lA.c) {
                C2053lA.i("PrivacySettings", "The context cannot be null, not setting the IAB US Privacy String");
                return;
            } else {
                Log.w("PrivacySettings", "The context cannot be null, not setting the IAB US Privacy String");
                return;
            }
        }
        context.getSharedPreferences("fyber.privacy", 0).edit().putString(Constants.IAB_US_PRIVACY_STRING_URL_KEY, str).apply();
        if (str == null) {
            a.a.remove(Constants.IAB_US_PRIVACY_STRING_URL_KEY);
        } else {
            a.a.put(Constants.IAB_US_PRIVACY_STRING_URL_KEY, str);
        }
    }

    public static void b(@NonNull Context context) {
        String str;
        a(context.getSharedPreferences("fyber.privacy", 0).getInt("gdpr_consent", -1), context);
        String string = context.getSharedPreferences("fyber.privacy", 0).getString(Constants.IAB_US_PRIVACY_STRING_URL_KEY, null);
        if (string != null) {
            str = string;
        } else {
            str = "null";
        }
        String concat = "Stored IAB US Privacy string = ".concat(str);
        if (C2053lA.c) {
            C2053lA.i("PrivacySettings", concat);
        } else {
            Log.w("PrivacySettings", concat);
        }
        if (string != null) {
            a.a.put(Constants.IAB_US_PRIVACY_STRING_URL_KEY, string);
        }
    }

    @Deprecated
    public static void a(Context context) {
        C2053lA.g("PrivacySettings", "Clearing IAB US Privacy String");
        if (context == null) {
            if (C2053lA.c) {
                C2053lA.i("PrivacySettings", "The context cannot be null, not clearing the IAB US Privacy String");
                return;
            } else {
                Log.w("PrivacySettings", "The context cannot be null, not clearing the IAB US Privacy String");
                return;
            }
        }
        context.getSharedPreferences("fyber.privacy", 0).edit().remove(Constants.IAB_US_PRIVACY_STRING_URL_KEY).apply();
        a.a.remove(Constants.IAB_US_PRIVACY_STRING_URL_KEY);
    }

    public static void a(int i, Context context) {
        String str;
        if (context == null) {
            int i2 = a;
            if (i2 == 0) {
                str = "false";
            } else if (i2 != 1) {
                str = "unknown";
            } else {
                str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            }
            String concat = "The context cannot be null. The SDK will keep using current user's consent value: ".concat(str);
            if (C2053lA.c) {
                C2053lA.i("PrivacySettings", concat);
                return;
            } else {
                Log.w("PrivacySettings", concat);
                return;
            }
        }
        if (i >= 0) {
            C2053lA.g("PrivacySettings", "Updating GDPR consent to : ".concat(i == 1 ? "YES" : "NO"));
        }
        a = i;
        HashMap hashMap = a.a;
        if (i != 0 && i != 1) {
            a.a.remove(Constants.GDPR_CONSENT_URL_KEY);
        } else {
            a.a.put(Constants.GDPR_CONSENT_URL_KEY, Integer.toString(i));
        }
        context.getSharedPreferences("fyber.privacy", 0).edit().putInt("gdpr_consent", i).apply();
    }
}
