package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* renamed from: G00  reason: default package */
/* loaded from: classes2.dex */
public final class G00 {
    public static final C2741tB h = new C2741tB("Session", 8);
    public final C2811u20 a;
    public final C2381p2 b;
    public long d;
    public long e;
    public long f;
    public boolean c = false;
    public boolean g = true;

    public G00(C2811u20 c2811u20) {
        String str;
        Method method;
        this.d = -1L;
        this.e = -1L;
        this.f = 0L;
        this.a = c2811u20;
        this.b = new C2381p2(c2811u20);
        SharedPreferences sharedPreferences = c2811u20.a.getSharedPreferences("singular-pref-session", 0);
        this.d = sharedPreferences.getLong("id", -1L);
        C2741tB c2741tB = Ka0.a;
        this.e = sharedPreferences.getLong("lastSessionPauseTime", System.currentTimeMillis());
        this.f = sharedPreferences.getLong("seq", 0L);
        h.b("load() <= %s", toString());
        c(System.currentTimeMillis());
        Application application = c2811u20.a;
        if (!this.c && ((str = Ka0.e) == null || !str.equalsIgnoreCase("mParticle"))) {
            C2897v20 c2897v20 = new C2897v20(this);
            C2741tB c2741tB2 = C2897v20.b;
            try {
                Object newProxyInstance = Proxy.newProxyInstance(Application.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, c2897v20);
                Method[] methods = Application.class.getMethods();
                int length = methods.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        method = methods[i];
                        if (method.getName().equals("registerActivityLifecycleCallbacks")) {
                            break;
                        }
                        i++;
                    } else {
                        method = null;
                        break;
                    }
                }
                if (method != null) {
                    method.invoke(application, newProxyInstance);
                    c2741tB2.a("ActivityLifecycleCallbacks registration successful, Automatic session management will work.");
                } else {
                    c2741tB2.c("ActivityLifecycleCallbacks registration not available, Automatic session management will not work");
                }
            } catch (Throwable th) {
                c2741tB2.d("ActivityLifecycleCallbacks registration failed, Automatic session management will not work", th);
            }
        }
        a();
    }

    public final void a() {
        if (!this.g && this.c) {
            return;
        }
        C2741tB c2741tB = h;
        c2741tB.a("registerNetworkChangeReceiver()");
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.a.a.registerReceiver(this.b, intentFilter);
        } catch (Throwable th) {
            c2741tB.a("registering receiver failed with error: " + Ka0.c(th));
        }
    }

    public final void b(long j) {
        h.b("startNewSession() At %d", Long.valueOf(j));
        this.d = j;
        this.f = 0L;
        if (j > 0) {
            C2811u20 c2811u20 = this.a;
            if (c2811u20.b().getBoolean("stop_all_tracking", false)) {
                C2811u20.o.a("Tracking was stopped! not logging event!");
            } else {
                c2811u20.c.a().postAtFrontOfQueue(new E00(c2811u20, j, 1));
            }
        }
    }

    public final boolean c(long j) {
        boolean z;
        String str;
        C2741tB c2741tB = h;
        C2811u20 c2811u20 = this.a;
        if (c2811u20 == null) {
            c2741tB.a("can't start new session - singular instance is null");
            return false;
        }
        VX b = VX.b();
        C2468q20 c2468q20 = c2811u20.d;
        if (b.c(c2468q20.x, c2468q20.y).booleanValue()) {
            c2741tB.a("app is opened with push link");
            VX.b().b = Boolean.TRUE;
            b(j);
            return true;
        } else if (c2811u20.d.l != null) {
            c2741tB.a("app is opened with deeplink.so starting new session");
            b(j);
            return true;
        } else {
            C1935jp c = C1935jp.c();
            c.getClass();
            C3122xg b2 = C3122xg.b();
            Application application = c2811u20.a;
            c.b = c.b(b2, application);
            C2741tB c2741tB2 = C1935jp.f;
            c2741tB2.a("loaded previous sdid for comparison");
            C1935jp c2 = C1935jp.c();
            c2.getClass();
            C0264Fa b3 = c2.b(C3122xg.b(), application);
            if (c2.b == null && b3 != null) {
                z = true;
            } else {
                z = false;
            }
            c2.b = b3;
            if (z) {
                str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            } else {
                str = "false";
            }
            c2741tB2.a("is fresh sdid = ".concat(str));
            if (z) {
                c2741tB.a("starting new session because current sdid is fresh");
                b(j);
                return true;
            }
            if (this.d > 0) {
                if (j - this.e < c2811u20.d.i * 1000) {
                    c2741tB.a("session is not expired yet");
                    return false;
                }
            }
            c2741tB.a("session is expired. starting new session");
            b(j);
            return true;
        }
    }

    public final String toString() {
        return "{id=" + this.d + ", lastSessionPauseTime=" + this.e + ", seq=" + this.f + '}';
    }
}
