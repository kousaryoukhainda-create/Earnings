package defpackage;

import android.content.Context;
import android.util.Log;
import io.adjoe.sdk.Playtime;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: jl0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1930jl0 {
    public static final AtomicReference a = new AtomicReference();
    public static File b;

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (!((Boolean) C2176mf0.b.o(applicationContext).b("bp", Boolean.class, Boolean.FALSE)).booleanValue()) {
                return;
            }
            b = new File(applicationContext.getNoBackupFilesDir(), "pt_verbose_logs");
        } catch (Exception unused) {
            k(Playtime.TAG, "Uncaught Exception while configuring logs");
        }
    }

    public static void b(String str) {
        d("p", "Adjoe", str, null);
        if (Log.isLoggable("Adjoe", 4)) {
            Log.i("Adjoe", str);
        }
    }

    public static void c(String str, String str2) {
        d("d", str, str2, null);
    }

    public static void d(String str, String str2, String str3, Throwable th) {
        FileWriter fileWriter;
        if (b == null) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.sss").format(new Date()));
            sb.append(" - ");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            if (str3 != null) {
                sb.append(": ");
                sb.append(str3);
            }
            if (th != null) {
                sb.append(" - ");
                sb.append(th.toString());
            }
            sb.append('\n');
            String sb2 = sb.toString();
            if (sb2 == null) {
                return;
            }
            synchronized (AbstractC1930jl0.class) {
                FileWriter fileWriter2 = null;
                try {
                    try {
                        fileWriter = new FileWriter(b, true);
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused2) {
                }
                try {
                    fileWriter.write(sb2);
                    fileWriter.close();
                } catch (Exception unused3) {
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        fileWriter2.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        try {
                            fileWriter2.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception unused5) {
        }
    }

    public static void e(String str, Throwable th) {
        d("w", str, null, th);
    }

    public static void f(String str, String str2) {
        d("e", str, str2, null);
        Bg0 bg0 = (Bg0) a.get();
        if (bg0 != null) {
            bg0.a(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        d("e", str, str2, th);
        Bg0 bg0 = (Bg0) a.get();
        if (bg0 != null) {
            bg0.b(str, str2, th);
        }
    }

    public static void h(String str, String str2) {
        d("i", str, str2, null);
    }

    public static void i(String str, String str2, Throwable th) {
        d("w", str, str2, th);
    }

    public static void j(String str, String str2) {
        d("v", str, str2, null);
    }

    public static void k(String str, String str2) {
        d("w", str, str2, null);
    }
}
