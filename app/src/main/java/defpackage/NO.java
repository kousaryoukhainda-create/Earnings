package defpackage;

import android.app.Notification;
/* renamed from: NO  reason: default package */
/* loaded from: classes.dex */
public abstract class NO {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
