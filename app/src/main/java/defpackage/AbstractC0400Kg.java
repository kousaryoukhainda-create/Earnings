package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
/* renamed from: Kg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0400Kg {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(@NonNull Configuration configuration, @NonNull C1975kI c1975kI) {
        configuration.setLocales((LocaleList) c1975kI.a.a());
    }
}
