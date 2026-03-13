package com.huawei.hms.iap.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private static boolean a() {
        try {
            Class.forName("com.huawei.hms.iapfull.pay.PayActivity");
            return true;
        } catch (ClassNotFoundException e) {
            HMSLog.w("FullSdkUtils", "className not found" + e.getMessage());
            return false;
        }
    }

    private static boolean b(Context context, String str) {
        String str2;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 16384) != null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "isAppInstalled NameNotFoundException:" + str;
            HMSLog.w("FullSdkUtils", str2);
            return false;
        } catch (RuntimeException e) {
            str2 = "isAppInstalled RuntimeException:" + e.getMessage();
            HMSLog.w("FullSdkUtils", str2);
            return false;
        }
        return false;
    }

    private static boolean a(Context context) {
        if (context == null) {
            HMSLog.e("FullSdkUtils", "context is null");
            return false;
        } else if (b(context, "com.huawei.hwid") || b(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE) || b(context, "com.huawei.hwid.tv")) {
            HMSLog.i("FullSdkUtils", "isHMSCoreInstalled true");
            return true;
        } else {
            HMSLog.w("FullSdkUtils", "isHMSCoreInstalled false");
            return false;
        }
    }

    private static boolean b(@NonNull String str) {
        try {
            return "fullsdk".equals(new JSONObject(new JSONObject(str).optString("accountInfo")).optString("routeMode"));
        } catch (JSONException unused) {
            HMSLog.e("FullSdkUtils", "isRouteToFullSDK: JSONException");
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        String str2;
        if (!a()) {
            str2 = "canUseFullSdk no fullsdk";
        } else if (a(str)) {
            if (b(str)) {
                HMSLog.i("FullSdkUtils", "canUseFullSdk route to fullsdk");
                return true;
            }
            return !a(context);
        } else {
            str2 = "canUseFullSdk no reserved account info";
        }
        HMSLog.i("FullSdkUtils", str2);
        return false;
    }

    private static boolean b(String str, String str2) {
        if (a()) {
            return IapFullAPIFactory.isCountryAndCurrencySupport(str, str2);
        }
        return false;
    }

    public static boolean a(Context context, String str, String str2) {
        return !a(context) && a(str) && a(str, str2);
    }

    public static boolean a(Context context, String str, String str2, String str3, String str4) {
        return !a(context) && a(str) && (a(str, str4) || b(str2, str3));
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.i("FullSdkUtils", "reservedInfor is null!");
            return false;
        }
        try {
        } catch (JSONException unused) {
            HMSLog.e("FullSdkUtils", "getAccountInfo: JSONException");
        }
        return new JSONObject(str).has("accountInfo");
    }

    private static boolean a(String str, String str2) {
        if (a()) {
            return IapFullAPIFactory.isWebPaySupport(str, str2);
        }
        return false;
    }
}
