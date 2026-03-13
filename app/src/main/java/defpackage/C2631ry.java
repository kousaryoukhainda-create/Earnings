package defpackage;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
/* renamed from: ry  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2631ry implements Serializable {
    public final NotificationDetails b;
    public final int c;
    public final ArrayList d;

    public C2631ry(NotificationDetails notificationDetails, int i, ArrayList arrayList) {
        this.b = notificationDetails;
        this.c = i;
        this.d = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.b + ", startMode=" + this.c + ", foregroundServiceTypes=" + this.d + '}';
    }
}
