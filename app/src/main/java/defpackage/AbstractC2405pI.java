package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;
/* renamed from: pI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2405pI {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
