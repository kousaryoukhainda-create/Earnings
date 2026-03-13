package com.fyber.fairbid;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public final class z5 {
    public static boolean a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                return ((Boolean) loadClass.getMethod("hasNotchInScreen", null).invoke(loadClass, null)).booleanValue();
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
