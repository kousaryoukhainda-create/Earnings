package defpackage;

import androidx.annotation.NonNull;
import java.util.Locale;
/* renamed from: iI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1605iI {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (localeArr[i].equals(locale)) {
                    break;
                }
                i++;
            } else {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String a2 = AbstractC2570rC.a(locale);
                if (a2.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return a2.equals(AbstractC2570rC.a(locale2));
            }
        }
        return false;
    }
}
