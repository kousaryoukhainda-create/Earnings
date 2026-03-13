package defpackage;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* renamed from: rC  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2570rC {
    public static final Method a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2485qC.c(AbstractC2485qC.a(AbstractC2485qC.b(locale)));
        }
        try {
            return AbstractC2399pC.a((Locale) a.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return AbstractC2399pC.a(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return AbstractC2399pC.a(locale);
        }
    }
}
