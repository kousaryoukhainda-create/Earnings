package defpackage;

import android.util.Log;
import java.util.HashSet;
/* renamed from: lA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053lA {
    public static int b = 1;
    public static boolean c = false;
    public static final C2053lA d = new C2053lA();
    public final HashSet a = new HashSet();

    public static boolean a(int i) {
        if ((c && AbstractC0324Hi.A(i) >= AbstractC0324Hi.A(b)) || Log.isLoggable("Fyber", 2)) {
            return true;
        }
        return false;
    }

    public static void b(String str, String str2) {
        String str3;
        if (a(2)) {
            String concat = "[FYB] ".concat(str);
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            Log.d(concat, str3);
            d.f(2, str, str2, null);
        }
    }

    public static void c(Exception exc, String str, String str2) {
        String str3;
        if (a(5)) {
            String concat = "[FYB] ".concat(str);
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            Log.w(concat, str3, exc);
            d.f(5, str, str2, exc);
        }
    }

    public static void d(String str, String str2) {
        String str3;
        if (a(5)) {
            String concat = "[FYB] ".concat(str);
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            Log.e(concat, str3);
            d.f(5, str, str2, null);
        }
    }

    public static void e(String str, String str2) {
        String str3;
        if (a(3)) {
            String concat = "[FYB] ".concat(str);
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            Log.i(concat, str3);
            d.f(3, str, str2, null);
        }
    }

    public static void g(String str, String str2) {
        if (c) {
            e(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public static void h(String str, String str2) {
        String str3;
        if (a(1)) {
            String concat = "[FYB] ".concat(str);
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            Log.v(concat, str3);
            d.f(1, str, str2, null);
        }
    }

    public static void i(String str, String str2) {
        String str3;
        if (a(4)) {
            String concat = "[FYB] ".concat(str);
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            Log.w(concat, str3);
            d.f(4, str, str2, null);
        }
    }

    public final void f(int i, String str, String str2, Exception exc) {
        if (!this.a.isEmpty()) {
            new Thread(new DH(this, i, str, str2, exc)).start();
        }
    }
}
