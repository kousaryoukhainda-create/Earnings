package defpackage;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
/* renamed from: cO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020cO extends L4 implements InterfaceC0902b00 {
    public static final Z2 k = Z2.d();
    public final List b;
    public final GaugeManager c;
    public final C2823u80 d;
    public final ZN f;
    public final WeakReference g;
    public String h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1020cO(defpackage.C2823u80 r3) {
        /*
            r2 = this;
            K4 r0 = defpackage.K4.a()
            com.google.firebase.perf.session.gauges.GaugeManager r1 = com.google.firebase.perf.session.gauges.GaugeManager.getInstance()
            r2.<init>(r0)
            ZN r0 = defpackage.C0935bO.b0()
            r2.f = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2.g = r0
            r2.d = r3
            r2.c = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            r2.b = r3
            r2.registerForAppState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1020cO.<init>(u80):void");
    }

    public static C1020cO d(C2823u80 c2823u80) {
        return new C1020cO(c2823u80);
    }

    @Override // defpackage.InterfaceC0902b00
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            k.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        ZN zn = this.f;
        if (((C0935bO) zn.c).T() && !((C0935bO) zn.c).Z()) {
            this.b.add(perfSession);
        }
    }

    public final void c() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.g);
        unregisterForAppState();
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.b) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        C1270eR[] d = PerfSession.d(unmodifiableList);
        if (d != null) {
            ZN zn = this.f;
            List asList = Arrays.asList(d);
            zn.k();
            C0935bO.E((C0935bO) zn.c, asList);
        }
        C0935bO c0935bO = (C0935bO) this.f.i();
        String str = this.h;
        if (str != null) {
            if (AbstractC1182dO.a.matcher(str).matches()) {
                k.a("Dropping network request from a 'User-Agent' that is not allowed");
                return;
            }
        } else {
            Pattern pattern = AbstractC1182dO.a;
        }
        if (!this.i) {
            C2823u80 c2823u80 = this.d;
            c2823u80.k.execute(new RunnableC2737t80(0, c2823u80, c0935bO, getAppState()));
            this.i = true;
        } else if (this.j) {
            k.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
    }

    public final void e(String str) {
        int i = 8;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 6;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 9;
                    break;
                case 7:
                    i = 10;
                    break;
                case '\b':
                    i = 5;
                    break;
                default:
                    i = 1;
                    break;
            }
            ZN zn = this.f;
            zn.k();
            C0935bO.F((C0935bO) zn.c, i);
        }
    }

    public final void f(int i) {
        ZN zn = this.f;
        zn.k();
        C0935bO.w((C0935bO) zn.c, i);
    }

    public final void g(long j) {
        ZN zn = this.f;
        zn.k();
        C0935bO.G((C0935bO) zn.c, j);
    }

    public final void h(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.g);
        ZN zn = this.f;
        zn.k();
        C0935bO.z((C0935bO) zn.c, j);
        a(perfSession);
        if (perfSession.d) {
            this.c.collectGaugeMetricOnce(perfSession.c);
        }
    }

    public final void i(String str) {
        ZN zn = this.f;
        if (str == null) {
            zn.k();
            C0935bO.y((C0935bO) zn.c);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt > 31 && charAt <= 127) {
                }
            }
            zn.k();
            C0935bO.x((C0935bO) zn.c, str);
            return;
        }
        k.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void k(long j) {
        ZN zn = this.f;
        zn.k();
        C0935bO.H((C0935bO) zn.c, j);
    }

    public final void m(long j) {
        ZN zn = this.f;
        zn.k();
        C0935bO.C((C0935bO) zn.c, j);
        if (SessionManager.getInstance().perfSession().d) {
            this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().c);
        }
    }

    public final void n(String str) {
        HttpUrl httpUrl;
        int lastIndexOf;
        if (str != null) {
            HttpUrl httpUrl2 = null;
            try {
                HttpUrl.Builder builder = new HttpUrl.Builder();
                builder.b(null, str);
                httpUrl = builder.a();
            } catch (IllegalArgumentException unused) {
                httpUrl = null;
            }
            if (httpUrl != null) {
                HttpUrl.Builder h = httpUrl.h();
                h.b = HttpUrl.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                h.c = HttpUrl.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                h.g = null;
                h.h = null;
                str = h.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        HttpUrl.Builder builder2 = new HttpUrl.Builder();
                        builder2.b(null, str);
                        httpUrl2 = builder2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (httpUrl2 == null) {
                        str = str.substring(0, 2000);
                    } else if (httpUrl2.d().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                        str = str.substring(0, lastIndexOf);
                    } else {
                        str = str.substring(0, 2000);
                    }
                }
            }
            ZN zn = this.f;
            zn.k();
            C0935bO.u((C0935bO) zn.c, str);
        }
    }
}
