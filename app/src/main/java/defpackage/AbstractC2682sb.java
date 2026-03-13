package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: sb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2682sb {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        C2596rb c2596rb = C2596rb.a;
        if (i >= 30) {
            c2596rb.a(30);
        }
        if (i >= 30) {
            c2596rb.a(31);
        }
        if (i >= 30) {
            c2596rb.a(33);
        }
        if (i >= 30) {
            c2596rb.a(1000000);
        }
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (a("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
