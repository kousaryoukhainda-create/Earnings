package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* renamed from: Ja0  reason: default package */
/* loaded from: classes.dex */
public abstract class Ja0 {
    public static Boolean a;

    public static boolean a(Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Z2 d = Z2.d();
            d.a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
