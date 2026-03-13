package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.s;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: K4  reason: default package */
/* loaded from: classes.dex */
public final class K4 implements Application.ActivityLifecycleCallbacks {
    public static final Z2 t = Z2.d();
    public static volatile K4 u;
    public final WeakHashMap b;
    public final WeakHashMap c;
    public final WeakHashMap d;
    public final WeakHashMap f;
    public final HashMap g;
    public final HashSet h;
    public final HashSet i;
    public final AtomicInteger j;
    public final C2823u80 k;
    public final C0218Dg l;
    public final C2999wB m;
    public final boolean n;
    public Timer o;
    public Timer p;
    public R4 q;
    public boolean r;
    public boolean s;

    public K4(C2823u80 c2823u80, C2999wB c2999wB) {
        C0218Dg e = C0218Dg.e();
        Z2 z2 = C2890uz.e;
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.f = new WeakHashMap();
        this.g = new HashMap();
        this.h = new HashSet();
        this.i = new HashSet();
        this.j = new AtomicInteger(0);
        this.q = R4.BACKGROUND;
        this.r = false;
        this.s = true;
        this.k = c2823u80;
        this.m = c2999wB;
        this.l = e;
        this.n = true;
    }

    public static K4 a() {
        if (u == null) {
            synchronized (K4.class) {
                try {
                    if (u == null) {
                        u = new K4(C2823u80.u, new C2999wB(19));
                    }
                } finally {
                }
            }
        }
        return u;
    }

    public final void b(String str) {
        synchronized (this.g) {
            try {
                Long l = (Long) this.g.get(str);
                if (l == null) {
                    this.g.put(str, 1L);
                } else {
                    this.g.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(C1228dw c1228dw) {
        synchronized (this.i) {
            this.i.add(c1228dw);
        }
    }

    public final void d(WeakReference weakReference) {
        synchronized (this.h) {
            this.h.add(weakReference);
        }
    }

    public final void e() {
        synchronized (this.i) {
            try {
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    if (((I4) it.next()) != null) {
                        try {
                            C1143cw.a();
                        } catch (IllegalStateException e) {
                            C1228dw.a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Activity activity) {
        C2670sQ c2670sQ;
        WeakHashMap weakHashMap = this.f;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        C2890uz c2890uz = (C2890uz) this.c.get(activity);
        VA va = c2890uz.b;
        boolean z = c2890uz.d;
        Z2 z2 = C2890uz.e;
        if (!z) {
            z2.a("Cannot stop because no recording was started");
            c2670sQ = new C2670sQ();
        } else {
            HashMap hashMap = c2890uz.c;
            if (!hashMap.isEmpty()) {
                z2.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                hashMap.clear();
            }
            C2670sQ a = c2890uz.a();
            try {
                ((C0335Ht) va.c).C(c2890uz.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                z2.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                a = new C2670sQ();
            }
            ((C0335Ht) va.c).D();
            c2890uz.d = false;
            c2670sQ = a;
        }
        if (!c2670sQ.b()) {
            t.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        AbstractC0946bZ.a(trace, (C2804tz) c2670sQ.a());
        trace.stop();
    }

    public final void g(String str, Timer timer, Timer timer2) {
        if (!this.l.u()) {
            return;
        }
        B70 N = E70.N();
        N.p(str);
        N.n(timer.b);
        N.o(timer.d(timer2));
        C1270eR c = SessionManager.getInstance().perfSession().c();
        N.k();
        E70.z((E70) N.c, c);
        int andSet = this.j.getAndSet(0);
        synchronized (this.g) {
            try {
                HashMap hashMap = this.g;
                N.k();
                E70.v((E70) N.c).putAll(hashMap);
                if (andSet != 0) {
                    N.m(andSet, "_tsns");
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k.c((E70) N.i(), R4.FOREGROUND_BACKGROUND);
    }

    public final void h(Activity activity) {
        if (this.n && this.l.u()) {
            C2890uz c2890uz = new C2890uz(activity);
            this.c.put(activity, c2890uz);
            if (activity instanceof s) {
                C0651Ty cb = new C0651Ty(this.m, this.k, this, c2890uz);
                this.d.put(activity, cb);
                C0647Tu c0647Tu = ((s) activity).getSupportFragmentManager().n;
                c0647Tu.getClass();
                Intrinsics.checkNotNullParameter(cb, "cb");
                ((CopyOnWriteArrayList) c0647Tu.d).add(new C0366Iy(cb));
            }
        }
    }

    public final void i(R4 r4) {
        this.q = r4;
        synchronized (this.h) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    J4 j4 = (J4) ((WeakReference) it.next()).get();
                    if (j4 != null) {
                        j4.onUpdateAppState(this.q);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h(activity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r0.d).remove(r3);
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityDestroyed(android.app.Activity r6) {
        /*
            r5 = this;
            java.util.WeakHashMap r0 = r5.c
            r0.remove(r6)
            java.util.WeakHashMap r0 = r5.d
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L55
            r0 = r6
            androidx.fragment.app.s r0 = (androidx.fragment.app.s) r0
            androidx.fragment.app.z r0 = r0.getSupportFragmentManager()
            java.util.WeakHashMap r1 = r5.d
            java.lang.Object r6 = r1.remove(r6)
            Ny r6 = (defpackage.AbstractC0495Ny) r6
            Tu r0 = r0.n
            r0.getClass()
            java.lang.String r1 = "cb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.Object r1 = r0.d
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.d     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch: java.lang.Throwable -> L4c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4c
            r3 = 0
        L34:
            if (r3 >= r2) goto L51
            java.lang.Object r4 = r0.d     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L4c
            Iy r4 = (defpackage.C0366Iy) r4     // Catch: java.lang.Throwable -> L4c
            Ty r4 = r4.a     // Catch: java.lang.Throwable -> L4c
            if (r4 != r6) goto L4e
            java.lang.Object r6 = r0.d     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch: java.lang.Throwable -> L4c
            r6.remove(r3)     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r6 = move-exception
            goto L53
        L4e:
            int r3 = r3 + 1
            goto L34
        L51:
            monitor-exit(r1)
            goto L55
        L53:
            monitor-exit(r1)
            throw r6
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K4.onActivityDestroyed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.b.isEmpty()) {
                this.m.getClass();
                this.o = new Timer();
                this.b.put(activity, Boolean.TRUE);
                if (this.s) {
                    i(R4.FOREGROUND);
                    e();
                    this.s = false;
                } else {
                    g("_bs", this.p, this.o);
                    i(R4.FOREGROUND);
                }
            } else {
                this.b.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.n && this.l.u()) {
                if (!this.c.containsKey(activity)) {
                    h(activity);
                }
                C2890uz c2890uz = (C2890uz) this.c.get(activity);
                boolean z = c2890uz.d;
                Activity activity2 = c2890uz.a;
                if (z) {
                    C2890uz.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    ((C0335Ht) c2890uz.b.c).v(activity2);
                    c2890uz.d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.k, this.m, this);
                trace.start();
                this.f.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.n) {
                f(activity);
            }
            if (this.b.containsKey(activity)) {
                this.b.remove(activity);
                if (this.b.isEmpty()) {
                    this.m.getClass();
                    Timer timer = new Timer();
                    this.p = timer;
                    g("_fs", this.o, timer);
                    i(R4.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
