package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.IllegalFormatException;
import java.util.Locale;
/* renamed from: tB  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2741tB implements InterfaceC2068lP, InterfaceC0371Jd {
    public static final C2741tB d = new C2741tB("FOLD", 0);
    public static final C2741tB f = new C2741tB("HINGE", 0);
    public static boolean g = false;
    public static int h = 6;
    public final /* synthetic */ int b;
    public String c;

    public static boolean g(int i) {
        if (g && h <= i) {
            return true;
        }
        return false;
    }

    public static String k(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = BK.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return AbstractC0324Hi.g(str, " : ", str2);
    }

    public void a(String str) {
        if (g(3)) {
            Log.d("Singular", h(str));
        }
    }

    public void b(String str, Object... objArr) {
        if (g(3)) {
            Log.d("Singular", h(String.format(str, objArr)));
        }
    }

    public void c(String str) {
        if (g(6)) {
            Log.e("Singular", h(str));
        }
    }

    public void d(String str, Throwable th) {
        if (g(6)) {
            Log.e("Singular", h(str), th);
        }
    }

    public void e(String str, Object... objArr) {
        if (g(6)) {
            Log.e("Singular", h(String.format(str, objArr)));
        }
    }

    public void f(String str) {
        if (g(4)) {
            Log.i("Singular", h(str));
        }
    }

    public String h(String str) {
        return this.c + " [" + (Thread.currentThread().getName()) + "] - " + str;
    }

    public void i(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", k(this.c, str, objArr));
        }
    }

    @Override // defpackage.InterfaceC0371Jd
    public URL j(String str) {
        char c = File.separatorChar;
        File file = new File(this.c + c + str.replace('.', c) + ".class");
        if (file.exists()) {
            try {
                return file.getCanonicalFile().toURI().toURL();
            } catch (MalformedURLException | IOException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC0371Jd
    public InputStream n(String str) {
        try {
            char c = File.separatorChar;
            return new FileInputStream(this.c + c + str.replace('.', c) + ".class");
        } catch (FileNotFoundException | SecurityException unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC2068lP
    public Object t() {
        switch (this.b) {
            case 2:
                throw new RuntimeException(this.c);
            default:
                throw new RuntimeException(this.c);
        }
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return this.c;
            case 4:
                return this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C2741tB(String str, int i) {
        this.b = i;
        this.c = str;
    }

    public C2741tB(String str) {
        this.b = 9;
        this.c = AbstractC2437ph.e("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }
}
