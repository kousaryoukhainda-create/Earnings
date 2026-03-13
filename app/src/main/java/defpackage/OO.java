package defpackage;

import android.app.Notification;
import android.app.Person;
/* renamed from: OO  reason: default package */
/* loaded from: classes.dex */
public abstract class OO {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
