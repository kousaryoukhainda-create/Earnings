package defpackage;

import android.util.Log;
import java.util.Locale;
/* renamed from: Z2  reason: default package */
/* loaded from: classes.dex */
public final class Z2 {
    public static volatile Z2 c;
    public final BI a;
    public boolean b = false;

    public Z2() {
        BI bi;
        synchronized (BI.class) {
            try {
                if (BI.c == null) {
                    BI.c = new BI(0);
                }
                bi = BI.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = bi;
    }

    public static Z2 d() {
        if (c == null) {
            synchronized (Z2.class) {
                try {
                    if (c == null) {
                        c = new Z2();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        if (this.b) {
            this.a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    public final void f(String str) {
        if (this.b) {
            this.a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
