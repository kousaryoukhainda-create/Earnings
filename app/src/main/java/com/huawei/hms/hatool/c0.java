package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes2.dex */
public class c0 {
    public static boolean a(Context context) {
        return System.currentTimeMillis() - d.a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    public static boolean a(Context context, String str) {
        int checkSelfPermission;
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
                v.f("hmsSdk", "not have read phone permission!");
                return true;
            }
            return false;
        }
        checkSelfPermission = context.checkSelfPermission(str);
        if (checkSelfPermission != 0) {
            v.f("hmsSdk", "not have read phone permission!");
            return true;
        }
        return false;
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean a(Context context, String str, int i) {
        String str2 = d.c(context, str) + ".xml";
        File file = new File(context.getFilesDir(), AbstractC2437ph.g("../shared_prefs/", str2));
        if (!file.exists()) {
            file = new File(context.getFilesDir(), AbstractC2437ph.g("../../shared_prefs/", context.getPackageName() + "_" + str2));
        }
        long length = file.length();
        if (length > i) {
            v.c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
            return true;
        }
        return false;
    }

    public static boolean a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            v.f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
