package defpackage;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
/* renamed from: d60  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1161d60 {
    public static /* synthetic */ NotificationChannel b(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("playtime_default", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager i(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue k(Object obj) {
        return (AutofillValue) obj;
    }
}
