package defpackage;

import android.app.Notification;
import android.app.job.JobInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.LocaleList;
/* renamed from: nI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2233nI {
    public static /* bridge */ /* synthetic */ Class C() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* bridge */ /* synthetic */ Notification.MessagingStyle d(Object obj) {
        return (Notification.MessagingStyle) obj;
    }

    public static /* synthetic */ JobInfo.TriggerContentUri e(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* bridge */ /* synthetic */ LocaleList h(Configuration configuration) {
        return configuration.getLocales();
    }

    public static /* bridge */ /* synthetic */ LocaleList j(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return Notification.MessagingStyle.class;
    }

    public static /* bridge */ /* synthetic */ String o(LocaleList localeList) {
        return localeList.toLanguageTags();
    }

    public static /* synthetic */ void p() {
    }
}
