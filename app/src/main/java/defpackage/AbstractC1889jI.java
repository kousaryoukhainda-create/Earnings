package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* renamed from: jI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1889jI {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
