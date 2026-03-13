package defpackage;

import android.util.Log;
/* renamed from: EI  reason: default package */
/* loaded from: classes.dex */
public final class EI {
    public static EI b;
    public int a;

    public /* synthetic */ EI(int i) {
        this.a = i;
    }

    public static synchronized EI c() {
        EI ei;
        synchronized (EI.class) {
            try {
                if (b == null) {
                    b = new EI(3);
                }
                ei = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ei;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void d(String str, String str2, Throwable... thArr) {
        if (this.a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }
}
