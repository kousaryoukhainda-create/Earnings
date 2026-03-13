package defpackage;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;
/* renamed from: QO  reason: default package */
/* loaded from: classes.dex */
public abstract class QO {
    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }

    public static Parcelable a(Person person) {
        return person;
    }
}
