package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
/* renamed from: Ch  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0193Ch extends BroadcastReceiver {
    public static final String a = EI.e("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EI.c().a(a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = C0761Ye.f;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
