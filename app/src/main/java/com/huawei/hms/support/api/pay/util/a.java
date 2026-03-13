package com.huawei.hms.support.api.pay.util;

import android.content.Intent;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public class a {
    public static int a(@NonNull Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("safeGetIntExtra failed, "), "IntentUtils");
            return i;
        }
    }

    public static long a(@NonNull Intent intent, String str, long j) {
        try {
            return intent.getLongExtra(str, j);
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("safeGetLongExtra failed, "), "IntentUtils");
            return j;
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
}
