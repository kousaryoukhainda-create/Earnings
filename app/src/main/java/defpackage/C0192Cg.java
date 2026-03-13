package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: Cg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192Cg {
    public static final int[] s = {2, 4, 8, 16, 32, 64, UserVerificationMethods.USER_VERIFY_PATTERN, UserVerificationMethods.USER_VERIFY_HANDPRINT};
    public static final Pattern t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public int c;
    public HttpURLConnection f;
    public C2177mg g;
    public final ScheduledExecutorService h;
    public final C2950vg i;
    public final C1571hv j;
    public final InterfaceC0440Lv k;
    public final C2435pg l;
    public final Context m;
    public final String n;
    public final C0270Fg q;
    public boolean b = false;
    public final Random o = new Random();
    public final Clock p = DefaultClock.getInstance();
    public boolean d = false;
    public boolean e = false;
    public final Object r = new Object();

    public C0192Cg(C1571hv c1571hv, InterfaceC0440Lv interfaceC0440Lv, C2950vg c2950vg, C2435pg c2435pg, Context context, String str, LinkedHashSet linkedHashSet, C0270Fg c0270Fg, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - c0270Fg.c().a, 1);
        this.j = c1571hv;
        this.i = c2950vg;
        this.k = interfaceC0440Lv;
        this.l = c2435pg;
        this.m = context;
        this.n = str;
        this.q = c0270Fg;
    }

    public static boolean d(int i) {
        if (i != 408 && i != 429 && i != 502 && i != 503 && i != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z;
        if (!this.a.isEmpty() && !this.b && !this.d) {
            if (!this.e) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String c(String str) {
        String str2;
        C1571hv c1571hv = this.j;
        c1571hv.a();
        Matcher matcher = t.matcher(c1571hv.c.b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return AbstractC2437ph.j("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", str2, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [Fv, kw] */
    public final synchronized void e(long j) {
        try {
            if (!a()) {
                return;
            }
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
                this.h.schedule(new DH(this, 9), j, TimeUnit.MILLISECONDS);
            } else if (!this.e) {
                g(new C0285Fv("Unable to connect to the server. Check your connection and try again."));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(C2028kw c2028kw) {
        for (InterfaceC0348Ig interfaceC0348Ig : this.a) {
            interfaceC0348Ig.onError(c2028kw);
        }
    }

    public final synchronized void h() {
        this.c = 8;
    }

    public final synchronized void i() {
        e(Math.max(0L, this.q.c().b.getTime() - new Date(this.p.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z) {
        this.b = z;
    }

    public final void k(boolean z) {
        HttpURLConnection httpURLConnection;
        synchronized (this.r) {
            try {
                this.e = z;
                C2177mg c2177mg = this.g;
                if (c2177mg != null) {
                    c2177mg.b = z;
                }
                if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = this.f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            hv r9 = r6.j
            r9.a()
            Vv r0 = r9.c
            java.lang.String r1 = r0.a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.m
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L45:
            r1 = r4
            goto L63
        L47:
            r3 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            goto L63
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L63:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.b
            java.util.regex.Pattern r3 = defpackage.C0192Cg.t
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9d
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9d:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.n
            r1.put(r2, r3)
            vg r2 = r6.i
            Fg r2 = r2.h
            android.content.SharedPreferences r2 = r2.a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.1.2"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0192Cg.l(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mg] */
    public final synchronized C2177mg m(HttpURLConnection httpURLConnection) {
        ?? obj;
        C0166Bg c0166Bg = new C0166Bg(this);
        C2950vg c2950vg = this.i;
        C2435pg c2435pg = this.l;
        LinkedHashSet linkedHashSet = this.a;
        ScheduledExecutorService scheduledExecutorService = this.h;
        obj = new Object();
        obj.d = httpURLConnection;
        obj.f = c2950vg;
        obj.g = c2435pg;
        obj.c = linkedHashSet;
        obj.h = c0166Bg;
        obj.i = scheduledExecutorService;
        obj.j = new Random();
        obj.b = false;
        return obj;
    }

    public final void n(Date date) {
        C0270Fg c0270Fg = this.q;
        int i = c0270Fg.c().a + 1;
        int i2 = 8;
        if (i < 8) {
            i2 = i;
        }
        long millis = TimeUnit.MINUTES.toMillis(s[i2 - 1]);
        c0270Fg.f(i, new Date(date.getTime() + (millis / 2) + this.o.nextInt((int) millis)));
    }
}
