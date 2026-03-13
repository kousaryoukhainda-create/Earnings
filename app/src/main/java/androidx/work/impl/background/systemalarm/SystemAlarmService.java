package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SystemAlarmService extends KG {
    public static final String f = EI.e("SystemAlarmService");
    public C2731t50 c;
    public boolean d;

    public final void a() {
        this.d = true;
        EI.c().a(f, "All commands completed in dispatcher", new Throwable[0]);
        String str = Ec0.a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = Ec0.b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                EI.c().f(Ec0.a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.KG, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C2731t50 c2731t50 = new C2731t50(this);
        this.c = c2731t50;
        if (c2731t50.l != null) {
            EI.c().b(C2731t50.m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            c2731t50.l = this;
        }
        this.d = false;
    }

    @Override // defpackage.KG, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d = true;
        this.c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            EI.c().d(f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.c.e();
            C2731t50 c2731t50 = new C2731t50(this);
            this.c = c2731t50;
            if (c2731t50.l != null) {
                EI.c().b(C2731t50.m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                c2731t50.l = this;
            }
            this.d = false;
        }
        if (intent != null) {
            this.c.a(i2, intent);
            return 3;
        }
        return 3;
    }
}
