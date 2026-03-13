package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
/* loaded from: classes2.dex */
public class RegionUtils {
    private static String a(Context context) {
        if (context != null && context.getApplicationContext() != null) {
            return GrsApp.getInstance().getIssueCountryCode(context);
        }
        return "";
    }

    public static boolean isChinaROM(Context context) {
        return "CN".equalsIgnoreCase(a(context));
    }
}
