package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Lo  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434Lo implements InterfaceC2346oe0, InterfaceC2540qs, Ie0 {
    public static final String l = EI.e("DelayMetCommandHandler");
    public final Context b;
    public final int c;
    public final String d;
    public final C2731t50 f;
    public final C2432pe0 g;
    public PowerManager.WakeLock j;
    public boolean k = false;
    public int i = 0;
    public final Object h = new Object();

    public C0434Lo(Context context, int i, String str, C2731t50 c2731t50) {
        this.b = context;
        this.c = i;
        this.f = c2731t50;
        this.d = str;
        this.g = new C2432pe0(context, c2731t50.c, this);
    }

    public final void a() {
        synchronized (this.h) {
            try {
                this.g.d();
                this.f.d.b(this.d);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    EI c = EI.c();
                    String str = l;
                    PowerManager.WakeLock wakeLock2 = this.j;
                    String str2 = this.d;
                    c.a(str, "Releasing wakelock " + wakeLock2 + " for WorkSpec " + str2, new Throwable[0]);
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2540qs
    public final void b(String str, boolean z) {
        EI c = EI.c();
        c.a(l, "onExecuted " + str + ", " + z, new Throwable[0]);
        a();
        int i = this.c;
        C2731t50 c2731t50 = this.f;
        Context context = this.b;
        if (z) {
            c2731t50.f(new A1(c2731t50, C0761Ye.c(context, this.d), i, 6));
        }
        if (this.k) {
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            c2731t50.f(new A1(c2731t50, intent, i, 6));
        }
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        String str = this.d;
        sb.append(str);
        sb.append(" (");
        this.j = Ec0.a(this.b, AbstractC2437ph.k(sb, this.c, ")"));
        EI c = EI.c();
        PowerManager.WakeLock wakeLock = this.j;
        String str2 = l;
        c.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.j.acquire();
        Fe0 k = this.f.g.C.n().k(str);
        if (k == null) {
            e();
            return;
        }
        boolean b = k.b();
        this.k = b;
        if (!b) {
            EI.c().a(str2, AbstractC2437ph.g("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
            return;
        }
        this.g.c(Collections.singletonList(k));
    }

    @Override // defpackage.InterfaceC2346oe0
    public final void d(ArrayList arrayList) {
        e();
    }

    public final void e() {
        synchronized (this.h) {
            try {
                if (this.i < 2) {
                    this.i = 2;
                    EI c = EI.c();
                    String str = l;
                    String str2 = this.d;
                    c.a(str, "Stopping work for WorkSpec " + str2, new Throwable[0]);
                    Context context = this.b;
                    String str3 = this.d;
                    Intent intent = new Intent(context, SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str3);
                    C2731t50 c2731t50 = this.f;
                    c2731t50.f(new A1(c2731t50, intent, this.c, 6));
                    if (this.f.f.e(this.d)) {
                        EI c2 = EI.c();
                        String str4 = this.d;
                        c2.a(str, "WorkSpec " + str4 + " needs to be rescheduled", new Throwable[0]);
                        Intent c3 = C0761Ye.c(this.b, this.d);
                        C2731t50 c2731t502 = this.f;
                        c2731t502.f(new A1(c2731t502, c3, this.c, 6));
                    } else {
                        EI c4 = EI.c();
                        String str5 = this.d;
                        c4.a(str, "Processor does not have WorkSpec " + str5 + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    EI c5 = EI.c();
                    String str6 = l;
                    String str7 = this.d;
                    c5.a(str6, "Already stopped work for " + str7, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2346oe0
    public final void f(List list) {
        if (!list.contains(this.d)) {
            return;
        }
        synchronized (this.h) {
            try {
                if (this.i == 0) {
                    this.i = 1;
                    EI c = EI.c();
                    String str = l;
                    String str2 = this.d;
                    c.a(str, "onAllConstraintsMet for " + str2, new Throwable[0]);
                    if (this.f.f.h(this.d, null)) {
                        this.f.d.a(this.d, this);
                    } else {
                        a();
                    }
                } else {
                    EI c2 = EI.c();
                    String str3 = l;
                    String str4 = this.d;
                    c2.a(str3, "Already started work for " + str4, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
