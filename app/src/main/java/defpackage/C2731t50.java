package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: t50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2731t50 implements InterfaceC2540qs {
    public static final String m = EI.e("SystemAlarmDispatcher");
    public final Context b;
    public final YZ c;
    public final Ke0 d;
    public final C1616iT f;
    public final C3291ze0 g;
    public final C0761Ye h;
    public final Handler i;
    public final ArrayList j;
    public Intent k;
    public SystemAlarmService l;

    public C2731t50(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.b = applicationContext;
        this.h = new C0761Ye(applicationContext);
        this.d = new Ke0();
        C3291ze0 b0 = C3291ze0.b0(systemAlarmService);
        this.g = b0;
        C1616iT c1616iT = b0.F;
        this.f = c1616iT;
        this.c = b0.D;
        c1616iT.a(this);
        this.j = new ArrayList();
        this.k = null;
        this.i = new Handler(Looper.getMainLooper());
    }

    public final void a(int i, Intent intent) {
        EI c = EI.c();
        String str = m;
        c.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            EI.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.j) {
                try {
                    boolean isEmpty = this.j.isEmpty();
                    this.j.add(intent);
                    if (isEmpty) {
                        g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC2540qs
    public final void b(String str, boolean z) {
        String str2 = C0761Ye.f;
        Intent intent = new Intent(this.b, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        f(new A1(this, intent, 0, 6));
    }

    public final void c() {
        if (this.i.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public final boolean d() {
        c();
        synchronized (this.j) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        EI.c().a(m, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f.f(this);
        ScheduledExecutorService scheduledExecutorService = this.d.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.l = null;
    }

    public final void f(Runnable runnable) {
        this.i.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock a = Ec0.a(this.b, "ProcessCommand");
        try {
            a.acquire();
            this.g.D.v(new RunnableC2645s50(this, 0));
        } finally {
            a.release();
        }
    }
}
