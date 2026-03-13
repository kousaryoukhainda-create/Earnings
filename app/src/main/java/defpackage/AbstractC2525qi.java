package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.concurrent.Executor;
/* renamed from: qi  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2525qi {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new C1612iP(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    @NonNull
    public static Context createAttributionContext(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC2267ni.a(context, str);
        }
        return context;
    }

    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2009ki.a(context);
        }
        return null;
    }

    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC2267ni.b(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return AbstractC1638ii.a(context);
    }

    public static int getColor(@NonNull Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC1923ji.a(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5.c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            CW r1 = new CW
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.DW.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.DW.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            BW r5 = (defpackage.BW) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L9d
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L9c
        L54:
            java.lang.ThreadLocal r2 = defpackage.DW.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.AbstractC0657Ue.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8d
            defpackage.DW.a(r1, r9, r4, r8)
            r3 = r4
            goto L9c
        L8d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L98
            android.content.res.ColorStateList r3 = defpackage.AW.b(r0, r9, r8)
            goto L9c
        L98:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9)
        L9c:
            return r3
        L9d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2525qi.getColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r6 != 4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r4.getName().equals("locales") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r2.isEmpty() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context getContextForLanguage(@androidx.annotation.NonNull android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2525qi.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static File getDataDir(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2009ki.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC2267ni.c(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(@NonNull Context context, int i) {
        return AbstractC1638ii.b(context, i);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2181mi.a(context);
        }
        return new ExecutorC2625rs(new Handler(context.getMainLooper()), 0);
    }

    public static File getNoBackupFilesDir(@NonNull Context context) {
        return AbstractC1638ii.c(context);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context) {
        return context.getObbDirs();
    }

    @NonNull
    public static String getString(@NonNull Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) AbstractC1923ji.b(context, cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC1923ji.c(context, cls);
        }
        return (String) AbstractC2439pi.a.get(cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2009ki.c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (AbstractC2870uj.k(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC2437ph.h("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(@NonNull Context context, BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2095li.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(@NonNull Context context, BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 == 0 || (i & 4) == 0) {
            if (i2 != 0) {
                i |= 2;
            }
            int i3 = i;
            int i4 = i3 & 2;
            if (i4 == 0 && (i3 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
            if (i4 != 0 && (i3 & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 33) {
                return AbstractC2353oi.a(context, broadcastReceiver, intentFilter, str, handler, i3);
            }
            if (i5 >= 26) {
                return AbstractC2095li.a(context, broadcastReceiver, intentFilter, str, handler, i3);
            }
            if ((i3 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
