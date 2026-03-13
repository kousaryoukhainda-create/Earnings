package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.pc;
import com.applovin.impl.sj;
import com.applovin.impl.z3;
/* loaded from: classes.dex */
public class n {
    private static boolean b;
    private final j a;

    public n(j jVar) {
        this.a = jVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!b || a()) {
            Log.e("AppLovinSdk", AbstractC2437ph.i("[", str, "] ", str2), th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (b && !a()) {
            return;
        }
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (b && !a()) {
            return;
        }
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void j(String str, String str2) {
        if (b && !a()) {
            return;
        }
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void l(String str, String str2) {
        j jVar = j.u0;
        if (jVar == null) {
            return;
        }
        jVar.I();
        if (a()) {
            j.u0.I().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int intValue;
        if (a(this.a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.a.a(sj.t)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                a(str, str2.substring(i3, Math.min(length, i3 + intValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        pc pcVar = new pc();
        pcVar.a().a(str).a();
        g("AppLovinSdk", pcVar.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        j jVar = j.u0;
        if (jVar == null) {
            return;
        }
        jVar.I();
        if (a()) {
            j.u0.I().a(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", AbstractC2437ph.i("[", str, "] ", str2), th);
    }

    public void a(String str, Throwable th) {
        if (z3.e()) {
            for (Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", AbstractC2437ph.i("[", str, "] ", str2), th);
    }

    public static boolean a() {
        return a(j.u0);
    }

    public static boolean a(j jVar) {
        return jVar != null && jVar.g0().c();
    }
}
