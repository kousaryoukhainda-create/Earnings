package defpackage;

import android.app.Notification;
import android.net.Uri;
/* renamed from: PO  reason: default package */
/* loaded from: classes.dex */
public abstract class PO {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
