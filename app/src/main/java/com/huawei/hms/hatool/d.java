package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
@SuppressLint({"ApplySharedPref"})
/* loaded from: classes2.dex */
public class d {
    public static long a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getLong(str2, j) : j;
    }

    private static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String n = a1.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(n)) {
            return AbstractC2437ph.i("hms_", str, "_", packageName);
        }
        StringBuilder q = BK.q("hms_", str, "_", packageName, "_");
        q.append(n);
        return q.toString();
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getString(str2, str3) : str3;
    }

    public static void b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putLong(str2, j);
            edit.commit();
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static void a(Context context, String str, String... strArr) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "clearData(): parameter error.context,spname";
        } else if (strArr != null) {
            SharedPreferences b = b(context, str);
            if (b != null) {
                SharedPreferences.Editor edit = b.edit();
                if (strArr.length == 0) {
                    edit.clear();
                    edit.commit();
                    return;
                }
                for (String str3 : strArr) {
                    if (b.contains(str3)) {
                        edit.remove(str3);
                        edit.commit();
                    }
                }
                return;
            }
            return;
        } else {
            str2 = "clearData(): No data need to be deleted,keys is null";
        }
        v.f("hmsSdk", str2);
    }
}
