package com.huawei.hms.iap.util;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public class c {
    public static int a(@NonNull Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("safeGetIntExtra failed, "), "IntentUtils");
            return i;
        }
    }

    public static String a(@NonNull Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("safeGetStringExtra failed, "), "IntentUtils");
            return "";
        }
    }

    public static String a(@NonNull Intent intent, String str, String str2) {
        String a = a(intent, str);
        return TextUtils.isEmpty(a) ? str2 : a;
    }

    public static boolean a(@NonNull Intent intent, String str, boolean z) {
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("safeGetBooleanExtra failed, "), "IntentUtils");
            return z;
        }
    }
}
