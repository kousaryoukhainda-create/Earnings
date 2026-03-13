package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
/* renamed from: Lx  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0442Lx {
    public static /* synthetic */ NotificationChannel c(CharSequence charSequence, int i, String str) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannelGroup e(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void w() {
    }
}
