package defpackage;

import android.os.LocaleList;
import android.widget.TextView;
/* renamed from: k4  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1955k4 {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
