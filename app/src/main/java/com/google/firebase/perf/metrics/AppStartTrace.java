package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, GG {
    public static ThreadPoolExecutor A;
    public static final Timer x = new Timer();
    public static final long y = TimeUnit.MINUTES.toMicros(1);
    public static volatile AppStartTrace z;
    public final C2823u80 c;
    public final C0218Dg d;
    public final B70 f;
    public Application g;
    public final Timer i;
    public final Timer j;
    public PerfSession s;
    public boolean b = false;
    public boolean h = false;
    public Timer k = null;
    public Timer l = null;
    public Timer m = null;
    public Timer n = null;
    public Timer o = null;
    public Timer p = null;
    public Timer q = null;
    public Timer r = null;
    public boolean t = false;
    public int u = 0;
    public final H4 v = new H4(this);
    public boolean w = false;

    public AppStartTrace(C2823u80 c2823u80, C2999wB c2999wB, C0218Dg c0218Dg, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer;
        long startElapsedRealtime;
        Timer timer2 = null;
        this.c = c2823u80;
        this.d = c0218Dg;
        A = threadPoolExecutor;
        B70 N = E70.N();
        N.p("_experiment_app_start_ttid");
        this.f = N;
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(startElapsedRealtime);
            timer = new Timer((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            timer = null;
        }
        this.i = timer;
        X8 x8 = (X8) C1571hv.e().c(X8.class);
        if (x8 != null) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(x8.b);
            timer2 = new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.j = timer2;
    }

    public static AppStartTrace b() {
        if (z != null) {
            return z;
        }
        C2823u80 c2823u80 = C2823u80.u;
        C2999wB c2999wB = new C2999wB(19);
        if (z == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (z == null) {
                        z = new AppStartTrace(c2823u80, c2999wB, C0218Dg.e(), new ThreadPoolExecutor(0, 1, y + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return z;
    }

    public static boolean d(Application application) {
        boolean z2;
        PowerManager powerManager;
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = application.getPackageName();
            String f = AbstractC0324Hi.f(packageName, ":");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(f))) {
                    if (Build.VERSION.SDK_INT < 23 && (powerManager = (PowerManager) application.getSystemService("power")) != null) {
                        z2 = powerManager.isInteractive();
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.j;
        if (timer != null) {
            return timer;
        }
        return x;
    }

    public final Timer c() {
        Timer timer = this.i;
        if (timer != null) {
            return timer;
        }
        return a();
    }

    public final void e(B70 b70) {
        if (this.p != null && this.q != null && this.r != null) {
            A.execute(new W1(8, this, b70));
            g();
        }
    }

    public final synchronized void f(Context context) {
        boolean z2;
        if (this.b) {
            return;
        }
        C1444gT.k.h.a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.w && !d((Application) applicationContext)) {
                z2 = false;
                this.w = z2;
                this.b = true;
                this.g = (Application) applicationContext;
            }
            z2 = true;
            this.w = z2;
            this.b = true;
            this.g = (Application) applicationContext;
        }
    }

    public final synchronized void g() {
        if (!this.b) {
            return;
        }
        C1444gT.k.h.b(this);
        this.g.unregisterActivityLifecycleCallbacks(this);
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:17:0x001d, B:19:0x003b), top: B:26:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = r4.t     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L3f
            com.google.firebase.perf.util.Timer r6 = r4.k     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto La
            goto L3f
        La:
            boolean r6 = r4.w     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r6 != 0) goto L1c
            android.app.Application r6 = r4.g     // Catch: java.lang.Throwable -> L1a
            boolean r6 = d(r6)     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto L18
            goto L1c
        L18:
            r6 = 0
            goto L1d
        L1a:
            r5 = move-exception
            goto L41
        L1c:
            r6 = 1
        L1d:
            r4.w = r6     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r5 = new com.google.firebase.perf.util.Timer     // Catch: java.lang.Throwable -> L1a
            r5.<init>()     // Catch: java.lang.Throwable -> L1a
            r4.k = r5     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r5 = r4.c()     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r6 = r4.k     // Catch: java.lang.Throwable -> L1a
            long r5 = r5.d(r6)     // Catch: java.lang.Throwable -> L1a
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.y     // Catch: java.lang.Throwable -> L1a
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L3d
            r4.h = r0     // Catch: java.lang.Throwable -> L1a
        L3d:
            monitor-exit(r4)
            return
        L3f:
            monitor-exit(r4)
            return
        L41:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View findViewById;
        if (!this.t && !this.h && this.d.f() && (findViewById = activity.findViewById(16908290)) != null) {
            findViewById.getViewTreeObserver().removeOnDrawListener(this.v);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [G4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [G4] */
    /* JADX WARN: Type inference failed for: r4v5, types: [G4] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View findViewById;
        try {
            if (!this.t && !this.h) {
                boolean f = this.d.f();
                if (f && (findViewById = activity.findViewById(16908290)) != null) {
                    findViewById.getViewTreeObserver().addOnDrawListener(this.v);
                    ViewTreeObserver$OnDrawListenerC0286Fw viewTreeObserver$OnDrawListenerC0286Fw = new ViewTreeObserver$OnDrawListenerC0286Fw(findViewById, new Runnable(this) { // from class: G4
                        public final /* synthetic */ AppStartTrace c;

                        {
                            this.c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.c;
                            switch (r2) {
                                case 0:
                                    if (appStartTrace.r == null) {
                                        appStartTrace.r = new Timer();
                                        B70 N = E70.N();
                                        N.p("_experiment_onDrawFoQ");
                                        N.n(appStartTrace.c().b);
                                        N.o(appStartTrace.c().d(appStartTrace.r));
                                        B70 b70 = appStartTrace.f;
                                        b70.l((E70) N.i());
                                        if (appStartTrace.i != null) {
                                            B70 N2 = E70.N();
                                            N2.p("_experiment_procStart_to_classLoad");
                                            N2.n(appStartTrace.c().b);
                                            N2.o(appStartTrace.c().d(appStartTrace.a()));
                                            b70.l((E70) N2.i());
                                        }
                                        if (appStartTrace.w) {
                                            str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                                        } else {
                                            str = "false";
                                        }
                                        b70.k();
                                        E70.y((E70) b70.c).put("systemDeterminedForeground", str);
                                        b70.m(appStartTrace.u, "onDrawCount");
                                        C1270eR c = appStartTrace.s.c();
                                        b70.k();
                                        E70.z((E70) b70.c, c);
                                        appStartTrace.e(b70);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        long j = appStartTrace.c().b;
                                        B70 b702 = appStartTrace.f;
                                        b702.n(j);
                                        b702.o(appStartTrace.c().d(appStartTrace.p));
                                        appStartTrace.e(b702);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        B70 N3 = E70.N();
                                        N3.p("_experiment_preDrawFoQ");
                                        N3.n(appStartTrace.c().b);
                                        N3.o(appStartTrace.c().d(appStartTrace.q));
                                        B70 b703 = appStartTrace.f;
                                        b703.l((E70) N3.i());
                                        appStartTrace.e(b703);
                                        return;
                                    }
                                    return;
                                default:
                                    Timer timer = AppStartTrace.x;
                                    appStartTrace.getClass();
                                    B70 N4 = E70.N();
                                    N4.p("_as");
                                    N4.n(appStartTrace.a().b);
                                    N4.o(appStartTrace.a().d(appStartTrace.m));
                                    ArrayList arrayList = new ArrayList(3);
                                    B70 N5 = E70.N();
                                    N5.p("_astui");
                                    N5.n(appStartTrace.a().b);
                                    N5.o(appStartTrace.a().d(appStartTrace.k));
                                    arrayList.add((E70) N5.i());
                                    if (appStartTrace.l != null) {
                                        B70 N6 = E70.N();
                                        N6.p("_astfd");
                                        N6.n(appStartTrace.k.b);
                                        N6.o(appStartTrace.k.d(appStartTrace.l));
                                        arrayList.add((E70) N6.i());
                                        B70 N7 = E70.N();
                                        N7.p("_asti");
                                        N7.n(appStartTrace.l.b);
                                        N7.o(appStartTrace.l.d(appStartTrace.m));
                                        arrayList.add((E70) N7.i());
                                    }
                                    N4.k();
                                    E70.x((E70) N4.c, arrayList);
                                    C1270eR c2 = appStartTrace.s.c();
                                    N4.k();
                                    E70.z((E70) N4.c, c2);
                                    R4 r4 = R4.FOREGROUND_BACKGROUND;
                                    appStartTrace.c.c((E70) N4.i(), r4);
                                    return;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT < 26 && (!findViewById.getViewTreeObserver().isAlive() || !findViewById.isAttachedToWindow())) {
                        findViewById.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2427pc(viewTreeObserver$OnDrawListenerC0286Fw, 1));
                        findViewById.getViewTreeObserver().addOnPreDrawListener(new BS(findViewById, new Runnable(this) { // from class: G4
                            public final /* synthetic */ AppStartTrace c;

                            {
                                this.c = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                AppStartTrace appStartTrace = this.c;
                                switch (r2) {
                                    case 0:
                                        if (appStartTrace.r == null) {
                                            appStartTrace.r = new Timer();
                                            B70 N = E70.N();
                                            N.p("_experiment_onDrawFoQ");
                                            N.n(appStartTrace.c().b);
                                            N.o(appStartTrace.c().d(appStartTrace.r));
                                            B70 b70 = appStartTrace.f;
                                            b70.l((E70) N.i());
                                            if (appStartTrace.i != null) {
                                                B70 N2 = E70.N();
                                                N2.p("_experiment_procStart_to_classLoad");
                                                N2.n(appStartTrace.c().b);
                                                N2.o(appStartTrace.c().d(appStartTrace.a()));
                                                b70.l((E70) N2.i());
                                            }
                                            if (appStartTrace.w) {
                                                str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                                            } else {
                                                str = "false";
                                            }
                                            b70.k();
                                            E70.y((E70) b70.c).put("systemDeterminedForeground", str);
                                            b70.m(appStartTrace.u, "onDrawCount");
                                            C1270eR c = appStartTrace.s.c();
                                            b70.k();
                                            E70.z((E70) b70.c, c);
                                            appStartTrace.e(b70);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.p == null) {
                                            appStartTrace.p = new Timer();
                                            long j = appStartTrace.c().b;
                                            B70 b702 = appStartTrace.f;
                                            b702.n(j);
                                            b702.o(appStartTrace.c().d(appStartTrace.p));
                                            appStartTrace.e(b702);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.q == null) {
                                            appStartTrace.q = new Timer();
                                            B70 N3 = E70.N();
                                            N3.p("_experiment_preDrawFoQ");
                                            N3.n(appStartTrace.c().b);
                                            N3.o(appStartTrace.c().d(appStartTrace.q));
                                            B70 b703 = appStartTrace.f;
                                            b703.l((E70) N3.i());
                                            appStartTrace.e(b703);
                                            return;
                                        }
                                        return;
                                    default:
                                        Timer timer = AppStartTrace.x;
                                        appStartTrace.getClass();
                                        B70 N4 = E70.N();
                                        N4.p("_as");
                                        N4.n(appStartTrace.a().b);
                                        N4.o(appStartTrace.a().d(appStartTrace.m));
                                        ArrayList arrayList = new ArrayList(3);
                                        B70 N5 = E70.N();
                                        N5.p("_astui");
                                        N5.n(appStartTrace.a().b);
                                        N5.o(appStartTrace.a().d(appStartTrace.k));
                                        arrayList.add((E70) N5.i());
                                        if (appStartTrace.l != null) {
                                            B70 N6 = E70.N();
                                            N6.p("_astfd");
                                            N6.n(appStartTrace.k.b);
                                            N6.o(appStartTrace.k.d(appStartTrace.l));
                                            arrayList.add((E70) N6.i());
                                            B70 N7 = E70.N();
                                            N7.p("_asti");
                                            N7.n(appStartTrace.l.b);
                                            N7.o(appStartTrace.l.d(appStartTrace.m));
                                            arrayList.add((E70) N7.i());
                                        }
                                        N4.k();
                                        E70.x((E70) N4.c, arrayList);
                                        C1270eR c2 = appStartTrace.s.c();
                                        N4.k();
                                        E70.z((E70) N4.c, c2);
                                        R4 r4 = R4.FOREGROUND_BACKGROUND;
                                        appStartTrace.c.c((E70) N4.i(), r4);
                                        return;
                                }
                            }
                        }, new Runnable(this) { // from class: G4
                            public final /* synthetic */ AppStartTrace c;

                            {
                                this.c = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                AppStartTrace appStartTrace = this.c;
                                switch (r2) {
                                    case 0:
                                        if (appStartTrace.r == null) {
                                            appStartTrace.r = new Timer();
                                            B70 N = E70.N();
                                            N.p("_experiment_onDrawFoQ");
                                            N.n(appStartTrace.c().b);
                                            N.o(appStartTrace.c().d(appStartTrace.r));
                                            B70 b70 = appStartTrace.f;
                                            b70.l((E70) N.i());
                                            if (appStartTrace.i != null) {
                                                B70 N2 = E70.N();
                                                N2.p("_experiment_procStart_to_classLoad");
                                                N2.n(appStartTrace.c().b);
                                                N2.o(appStartTrace.c().d(appStartTrace.a()));
                                                b70.l((E70) N2.i());
                                            }
                                            if (appStartTrace.w) {
                                                str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                                            } else {
                                                str = "false";
                                            }
                                            b70.k();
                                            E70.y((E70) b70.c).put("systemDeterminedForeground", str);
                                            b70.m(appStartTrace.u, "onDrawCount");
                                            C1270eR c = appStartTrace.s.c();
                                            b70.k();
                                            E70.z((E70) b70.c, c);
                                            appStartTrace.e(b70);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.p == null) {
                                            appStartTrace.p = new Timer();
                                            long j = appStartTrace.c().b;
                                            B70 b702 = appStartTrace.f;
                                            b702.n(j);
                                            b702.o(appStartTrace.c().d(appStartTrace.p));
                                            appStartTrace.e(b702);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.q == null) {
                                            appStartTrace.q = new Timer();
                                            B70 N3 = E70.N();
                                            N3.p("_experiment_preDrawFoQ");
                                            N3.n(appStartTrace.c().b);
                                            N3.o(appStartTrace.c().d(appStartTrace.q));
                                            B70 b703 = appStartTrace.f;
                                            b703.l((E70) N3.i());
                                            appStartTrace.e(b703);
                                            return;
                                        }
                                        return;
                                    default:
                                        Timer timer = AppStartTrace.x;
                                        appStartTrace.getClass();
                                        B70 N4 = E70.N();
                                        N4.p("_as");
                                        N4.n(appStartTrace.a().b);
                                        N4.o(appStartTrace.a().d(appStartTrace.m));
                                        ArrayList arrayList = new ArrayList(3);
                                        B70 N5 = E70.N();
                                        N5.p("_astui");
                                        N5.n(appStartTrace.a().b);
                                        N5.o(appStartTrace.a().d(appStartTrace.k));
                                        arrayList.add((E70) N5.i());
                                        if (appStartTrace.l != null) {
                                            B70 N6 = E70.N();
                                            N6.p("_astfd");
                                            N6.n(appStartTrace.k.b);
                                            N6.o(appStartTrace.k.d(appStartTrace.l));
                                            arrayList.add((E70) N6.i());
                                            B70 N7 = E70.N();
                                            N7.p("_asti");
                                            N7.n(appStartTrace.l.b);
                                            N7.o(appStartTrace.l.d(appStartTrace.m));
                                            arrayList.add((E70) N7.i());
                                        }
                                        N4.k();
                                        E70.x((E70) N4.c, arrayList);
                                        C1270eR c2 = appStartTrace.s.c();
                                        N4.k();
                                        E70.z((E70) N4.c, c2);
                                        R4 r4 = R4.FOREGROUND_BACKGROUND;
                                        appStartTrace.c.c((E70) N4.i(), r4);
                                        return;
                                }
                            }
                        }));
                    }
                    findViewById.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC0286Fw);
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new BS(findViewById, new Runnable(this) { // from class: G4
                        public final /* synthetic */ AppStartTrace c;

                        {
                            this.c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.c;
                            switch (r2) {
                                case 0:
                                    if (appStartTrace.r == null) {
                                        appStartTrace.r = new Timer();
                                        B70 N = E70.N();
                                        N.p("_experiment_onDrawFoQ");
                                        N.n(appStartTrace.c().b);
                                        N.o(appStartTrace.c().d(appStartTrace.r));
                                        B70 b70 = appStartTrace.f;
                                        b70.l((E70) N.i());
                                        if (appStartTrace.i != null) {
                                            B70 N2 = E70.N();
                                            N2.p("_experiment_procStart_to_classLoad");
                                            N2.n(appStartTrace.c().b);
                                            N2.o(appStartTrace.c().d(appStartTrace.a()));
                                            b70.l((E70) N2.i());
                                        }
                                        if (appStartTrace.w) {
                                            str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                                        } else {
                                            str = "false";
                                        }
                                        b70.k();
                                        E70.y((E70) b70.c).put("systemDeterminedForeground", str);
                                        b70.m(appStartTrace.u, "onDrawCount");
                                        C1270eR c = appStartTrace.s.c();
                                        b70.k();
                                        E70.z((E70) b70.c, c);
                                        appStartTrace.e(b70);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        long j = appStartTrace.c().b;
                                        B70 b702 = appStartTrace.f;
                                        b702.n(j);
                                        b702.o(appStartTrace.c().d(appStartTrace.p));
                                        appStartTrace.e(b702);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        B70 N3 = E70.N();
                                        N3.p("_experiment_preDrawFoQ");
                                        N3.n(appStartTrace.c().b);
                                        N3.o(appStartTrace.c().d(appStartTrace.q));
                                        B70 b703 = appStartTrace.f;
                                        b703.l((E70) N3.i());
                                        appStartTrace.e(b703);
                                        return;
                                    }
                                    return;
                                default:
                                    Timer timer = AppStartTrace.x;
                                    appStartTrace.getClass();
                                    B70 N4 = E70.N();
                                    N4.p("_as");
                                    N4.n(appStartTrace.a().b);
                                    N4.o(appStartTrace.a().d(appStartTrace.m));
                                    ArrayList arrayList = new ArrayList(3);
                                    B70 N5 = E70.N();
                                    N5.p("_astui");
                                    N5.n(appStartTrace.a().b);
                                    N5.o(appStartTrace.a().d(appStartTrace.k));
                                    arrayList.add((E70) N5.i());
                                    if (appStartTrace.l != null) {
                                        B70 N6 = E70.N();
                                        N6.p("_astfd");
                                        N6.n(appStartTrace.k.b);
                                        N6.o(appStartTrace.k.d(appStartTrace.l));
                                        arrayList.add((E70) N6.i());
                                        B70 N7 = E70.N();
                                        N7.p("_asti");
                                        N7.n(appStartTrace.l.b);
                                        N7.o(appStartTrace.l.d(appStartTrace.m));
                                        arrayList.add((E70) N7.i());
                                    }
                                    N4.k();
                                    E70.x((E70) N4.c, arrayList);
                                    C1270eR c2 = appStartTrace.s.c();
                                    N4.k();
                                    E70.z((E70) N4.c, c2);
                                    R4 r4 = R4.FOREGROUND_BACKGROUND;
                                    appStartTrace.c.c((E70) N4.i(), r4);
                                    return;
                            }
                        }
                    }, new Runnable(this) { // from class: G4
                        public final /* synthetic */ AppStartTrace c;

                        {
                            this.c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.c;
                            switch (r2) {
                                case 0:
                                    if (appStartTrace.r == null) {
                                        appStartTrace.r = new Timer();
                                        B70 N = E70.N();
                                        N.p("_experiment_onDrawFoQ");
                                        N.n(appStartTrace.c().b);
                                        N.o(appStartTrace.c().d(appStartTrace.r));
                                        B70 b70 = appStartTrace.f;
                                        b70.l((E70) N.i());
                                        if (appStartTrace.i != null) {
                                            B70 N2 = E70.N();
                                            N2.p("_experiment_procStart_to_classLoad");
                                            N2.n(appStartTrace.c().b);
                                            N2.o(appStartTrace.c().d(appStartTrace.a()));
                                            b70.l((E70) N2.i());
                                        }
                                        if (appStartTrace.w) {
                                            str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                                        } else {
                                            str = "false";
                                        }
                                        b70.k();
                                        E70.y((E70) b70.c).put("systemDeterminedForeground", str);
                                        b70.m(appStartTrace.u, "onDrawCount");
                                        C1270eR c = appStartTrace.s.c();
                                        b70.k();
                                        E70.z((E70) b70.c, c);
                                        appStartTrace.e(b70);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        long j = appStartTrace.c().b;
                                        B70 b702 = appStartTrace.f;
                                        b702.n(j);
                                        b702.o(appStartTrace.c().d(appStartTrace.p));
                                        appStartTrace.e(b702);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        B70 N3 = E70.N();
                                        N3.p("_experiment_preDrawFoQ");
                                        N3.n(appStartTrace.c().b);
                                        N3.o(appStartTrace.c().d(appStartTrace.q));
                                        B70 b703 = appStartTrace.f;
                                        b703.l((E70) N3.i());
                                        appStartTrace.e(b703);
                                        return;
                                    }
                                    return;
                                default:
                                    Timer timer = AppStartTrace.x;
                                    appStartTrace.getClass();
                                    B70 N4 = E70.N();
                                    N4.p("_as");
                                    N4.n(appStartTrace.a().b);
                                    N4.o(appStartTrace.a().d(appStartTrace.m));
                                    ArrayList arrayList = new ArrayList(3);
                                    B70 N5 = E70.N();
                                    N5.p("_astui");
                                    N5.n(appStartTrace.a().b);
                                    N5.o(appStartTrace.a().d(appStartTrace.k));
                                    arrayList.add((E70) N5.i());
                                    if (appStartTrace.l != null) {
                                        B70 N6 = E70.N();
                                        N6.p("_astfd");
                                        N6.n(appStartTrace.k.b);
                                        N6.o(appStartTrace.k.d(appStartTrace.l));
                                        arrayList.add((E70) N6.i());
                                        B70 N7 = E70.N();
                                        N7.p("_asti");
                                        N7.n(appStartTrace.l.b);
                                        N7.o(appStartTrace.l.d(appStartTrace.m));
                                        arrayList.add((E70) N7.i());
                                    }
                                    N4.k();
                                    E70.x((E70) N4.c, arrayList);
                                    C1270eR c2 = appStartTrace.s.c();
                                    N4.k();
                                    E70.z((E70) N4.c, c2);
                                    R4 r4 = R4.FOREGROUND_BACKGROUND;
                                    appStartTrace.c.c((E70) N4.i(), r4);
                                    return;
                            }
                        }
                    }));
                }
                if (this.m != null) {
                    return;
                }
                new WeakReference(activity);
                this.m = new Timer();
                this.s = SessionManager.getInstance().perfSession();
                Z2 d = Z2.d();
                d.a("onResume(): " + activity.getClass().getName() + ": " + a().d(this.m) + " microseconds");
                A.execute(new Runnable(this) { // from class: G4
                    public final /* synthetic */ AppStartTrace c;

                    {
                        this.c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        AppStartTrace appStartTrace = this.c;
                        switch (r2) {
                            case 0:
                                if (appStartTrace.r == null) {
                                    appStartTrace.r = new Timer();
                                    B70 N = E70.N();
                                    N.p("_experiment_onDrawFoQ");
                                    N.n(appStartTrace.c().b);
                                    N.o(appStartTrace.c().d(appStartTrace.r));
                                    B70 b70 = appStartTrace.f;
                                    b70.l((E70) N.i());
                                    if (appStartTrace.i != null) {
                                        B70 N2 = E70.N();
                                        N2.p("_experiment_procStart_to_classLoad");
                                        N2.n(appStartTrace.c().b);
                                        N2.o(appStartTrace.c().d(appStartTrace.a()));
                                        b70.l((E70) N2.i());
                                    }
                                    if (appStartTrace.w) {
                                        str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                                    } else {
                                        str = "false";
                                    }
                                    b70.k();
                                    E70.y((E70) b70.c).put("systemDeterminedForeground", str);
                                    b70.m(appStartTrace.u, "onDrawCount");
                                    C1270eR c = appStartTrace.s.c();
                                    b70.k();
                                    E70.z((E70) b70.c, c);
                                    appStartTrace.e(b70);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.p == null) {
                                    appStartTrace.p = new Timer();
                                    long j = appStartTrace.c().b;
                                    B70 b702 = appStartTrace.f;
                                    b702.n(j);
                                    b702.o(appStartTrace.c().d(appStartTrace.p));
                                    appStartTrace.e(b702);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.q == null) {
                                    appStartTrace.q = new Timer();
                                    B70 N3 = E70.N();
                                    N3.p("_experiment_preDrawFoQ");
                                    N3.n(appStartTrace.c().b);
                                    N3.o(appStartTrace.c().d(appStartTrace.q));
                                    B70 b703 = appStartTrace.f;
                                    b703.l((E70) N3.i());
                                    appStartTrace.e(b703);
                                    return;
                                }
                                return;
                            default:
                                Timer timer = AppStartTrace.x;
                                appStartTrace.getClass();
                                B70 N4 = E70.N();
                                N4.p("_as");
                                N4.n(appStartTrace.a().b);
                                N4.o(appStartTrace.a().d(appStartTrace.m));
                                ArrayList arrayList = new ArrayList(3);
                                B70 N5 = E70.N();
                                N5.p("_astui");
                                N5.n(appStartTrace.a().b);
                                N5.o(appStartTrace.a().d(appStartTrace.k));
                                arrayList.add((E70) N5.i());
                                if (appStartTrace.l != null) {
                                    B70 N6 = E70.N();
                                    N6.p("_astfd");
                                    N6.n(appStartTrace.k.b);
                                    N6.o(appStartTrace.k.d(appStartTrace.l));
                                    arrayList.add((E70) N6.i());
                                    B70 N7 = E70.N();
                                    N7.p("_asti");
                                    N7.n(appStartTrace.l.b);
                                    N7.o(appStartTrace.l.d(appStartTrace.m));
                                    arrayList.add((E70) N7.i());
                                }
                                N4.k();
                                E70.x((E70) N4.c, arrayList);
                                C1270eR c2 = appStartTrace.s.c();
                                N4.k();
                                E70.z((E70) N4.c, c2);
                                R4 r4 = R4.FOREGROUND_BACKGROUND;
                                appStartTrace.c.c((E70) N4.i(), r4);
                                return;
                        }
                    }
                });
                if (!f) {
                    g();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.t && this.l == null && !this.h) {
            this.l = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @InterfaceC0937bQ(AG.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.t && !this.h && this.o == null) {
            this.o = new Timer();
            B70 N = E70.N();
            N.p("_experiment_firstBackgrounding");
            N.n(c().b);
            N.o(c().d(this.o));
            this.f.l((E70) N.i());
        }
    }

    @InterfaceC0937bQ(AG.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.t && !this.h && this.n == null) {
            this.n = new Timer();
            B70 N = E70.N();
            N.p("_experiment_firstForegrounding");
            N.n(c().b);
            N.o(c().d(this.n));
            this.f.l((E70) N.i());
        }
    }
}
