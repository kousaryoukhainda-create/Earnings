package defpackage;

import android.icu.util.ULocale;
import java.util.Locale;
/* renamed from: qC  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2485qC {
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
