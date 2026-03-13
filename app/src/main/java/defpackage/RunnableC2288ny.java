package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;
/* renamed from: ny  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2288ny implements Runnable {
    public static final String f = EI.e("ForceStopRunnable");
    public static final long g = TimeUnit.DAYS.toMillis(3650);
    public final Context b;
    public final C3291ze0 c;
    public int d = 0;

    public RunnableC2288ny(Context context, C3291ze0 c3291ze0) {
        this.b = context.getApplicationContext();
        this.c = c3291ze0;
    }

    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (AbstractC2682sb.b()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + g;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC2288ny.a():void");
    }

    public final boolean b() {
        C0989c10 c0989c10 = this.c.B;
        c0989c10.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f;
        if (isEmpty) {
            EI.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a = AbstractC1530hT.a(this.b, c0989c10);
        EI c = EI.c();
        c.a(str, "Is default app process = " + a, new Throwable[0]);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f;
        C3291ze0 c3291ze0 = this.c;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                AbstractC2861ue0.a(this.b);
                EI.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.d + 1;
                    this.d = i;
                    if (i < 3) {
                        EI c = EI.c();
                        c.a(str, "Retrying after " + (i * 300), e);
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        EI.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        c3291ze0.B.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            c3291ze0.d0();
        }
    }
}
