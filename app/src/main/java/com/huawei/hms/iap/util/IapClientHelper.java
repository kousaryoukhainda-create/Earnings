package com.huawei.hms.iap.util;

import android.content.Intent;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.log.HMSLog;
/* loaded from: classes2.dex */
public class IapClientHelper {
    private static int a(Intent intent, String str, int i) {
        if (intent == null) {
            HMSLog.e("IapClientHelper", "parseIntDataFromIntent: intent is null.");
            return -1;
        }
        return c.a(intent, str, i);
    }

    @Deprecated
    public static int parseAccountFlagFromIntent(Intent intent) {
        return a(intent, "accountFlag", 0);
    }

    public static String parseCarrierIdFromIntent(Intent intent) {
        return a(intent, "carrierId", (String) null);
    }

    public static String parseCountryFromIntent(Intent intent) {
        return a(intent, HwPayConstant.KEY_COUNTRY, (String) null);
    }

    public static int parseRespCodeFromIntent(Intent intent) {
        return a(intent, "returnCode", -1);
    }

    public static String parseRespMessageFromIntent(Intent intent) {
        return a(intent, "errMsg", "");
    }

    private static String a(Intent intent, String str, String str2) {
        if (intent == null) {
            HMSLog.i("IapClientHelper", "parseStringDataFromIntent: intent is null.");
            return str2;
        }
        return c.a(intent, str, str2);
    }
}
