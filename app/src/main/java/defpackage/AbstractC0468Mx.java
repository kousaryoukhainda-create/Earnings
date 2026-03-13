package defpackage;

import android.app.NotificationChannel;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.view.autofill.AutofillManager;
import java.util.Locale;
/* renamed from: Mx  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0468Mx {
    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ JobWorkItem f(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return AutofillManager.class;
    }

    public static /* synthetic */ Locale.LanguageRange l(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void n() {
    }
}
