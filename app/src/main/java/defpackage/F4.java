package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.NonNull;
/* renamed from: F4  reason: default package */
/* loaded from: classes.dex */
public abstract class F4 {
    public static int a(AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    @NonNull
    public static String b(@NonNull Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
