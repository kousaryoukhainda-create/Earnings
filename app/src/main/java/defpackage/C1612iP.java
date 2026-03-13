package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
/* renamed from: iP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612iP {
    public static String d;
    public static ServiceConnectionC1526hP g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public C1612iP(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC1021cP.a(this.b);
        }
        Context context = this.a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(int i, String str) {
        this.b.cancel(str, i);
    }

    public final void c(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.b;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            C1268eP c1268eP = new C1268eP(this.a.getPackageName(), i, str, notification);
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new ServiceConnectionC1526hP(this.a.getApplicationContext());
                    }
                    g.c.obtainMessage(0, c1268eP).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(str, i);
            return;
        }
        notificationManager.notify(str, i, notification);
    }
}
