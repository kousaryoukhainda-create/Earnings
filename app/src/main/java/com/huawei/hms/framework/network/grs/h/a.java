package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;
/* loaded from: classes2.dex */
public class a {
    public static String a() {
        return "6.0.11.300";
    }

    public static String b(Context context, String str, String str2) {
        return a(context, str, str2);
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.w("AgentUtil", "", e);
            return "";
        }
    }

    public static String a(Context context, String str, String str2) {
        if (context == null) {
            return String.format(Locale.ROOT, AbstractC0324Hi.f(str, "/%s"), a());
        }
        String packageName = (ContextHolder.getAppContext() == null ? context : ContextHolder.getAppContext()).getPackageName();
        String a = a(context);
        Locale locale = Locale.ROOT;
        String h = AbstractC2437ph.h("%s/%s (Linux; Android %s; %s) ", str, "/%s %s");
        String a2 = a();
        if (TextUtils.isEmpty(str2)) {
            str2 = "no_service_name";
        }
        return String.format(locale, h, packageName, a, Build.VERSION.RELEASE, Build.MODEL, a2, str2);
    }
}
