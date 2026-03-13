package defpackage;

import android.app.Notification;
/* renamed from: bP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0936bP {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
