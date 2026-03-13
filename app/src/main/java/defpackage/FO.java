package defpackage;

import android.app.Notification;
/* renamed from: FO  reason: default package */
/* loaded from: classes.dex */
public abstract class FO {
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }
}
