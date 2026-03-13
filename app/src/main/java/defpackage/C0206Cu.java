package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
/* renamed from: Cu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206Cu implements XT {
    public Object b;
    public final Object c;
    public final Object d;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public C0206Cu(C1400fw c1400fw, VA va, Oc0 oc0, C1400fw c1400fw2, C1486gw c1486gw, C1314ew c1314ew, C0335Ht c0335Ht) {
        this.b = c1400fw;
        this.c = va;
        this.d = oc0;
        this.f = c1400fw2;
        this.g = c1486gw;
        this.h = c1314ew;
        this.i = c0335Ht;
    }

    public static synchronized void c(File file) {
        synchronized (C0206Cu.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f, str);
        file.mkdirs();
        return new File(file, str2);
    }

    @Override // defpackage.XT
    public Object get() {
        return new C1143cw((C1571hv) ((C1400fw) this.b).get(), (YT) ((VA) this.c).get(), (InterfaceC0440Lv) ((Oc0) this.d).get(), (YT) ((C1400fw) this.f).get(), (RemoteConfigManager) ((C1486gw) this.g).get(), (C0218Dg) ((C1314ew) this.h).get(), (SessionManager) ((C0335Ht) this.i).get());
    }

    public C0206Cu(Context context) {
        String str;
        String replaceAll;
        String str2 = ((C1963k8) C2999wB.m.r(context)).a;
        this.b = str2;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = AbstractC0957bf.h0(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.g = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.i = file5;
    }

    public C0206Cu(String str, C0206Cu c0206Cu, C3244z4 c3244z4) {
        this.f = new C0148Ao(this, false);
        this.g = new C0148Ao(this, true);
        this.h = new C0731Xa(9, false);
        this.i = new AtomicMarkableReference(null, false);
        this.b = str;
        this.c = new EM(c0206Cu);
        this.d = c3244z4;
    }
}
