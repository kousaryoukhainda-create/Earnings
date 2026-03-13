package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
/* renamed from: A2  reason: default package */
/* loaded from: classes.dex */
public abstract class A2 {
    public static AlarmManager.AlarmClockInfo a(long j, PendingIntent pendingIntent) {
        return new AlarmManager.AlarmClockInfo(j, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
        alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
    }
}
