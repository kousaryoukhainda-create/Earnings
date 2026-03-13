package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
/* renamed from: B2  reason: default package */
/* loaded from: classes.dex */
public abstract class B2 {
    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
    }
}
