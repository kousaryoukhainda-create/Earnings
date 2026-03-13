package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
@KeepForSdk
/* loaded from: classes3.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "add"
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            int r6 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r6
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1b
            r7[r1] = r8     // Catch: java.lang.Exception -> L1b
            java.lang.reflect.Method r7 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L1b
            goto L1c
        L1b:
            r7 = r6
        L1c:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r7
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L2b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2b
            r7[r1] = r8     // Catch: java.lang.Exception -> L2b
            r7[r2] = r3     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r4 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L2b
            goto L2c
        L2b:
            r4 = r6
        L2c:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r4
            java.lang.String r4 = "size"
            java.lang.reflect.Method r4 = r5.getMethod(r4, r6)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r4 = r6
        L36:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r4
            java.lang.String r4 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L45
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L45
            r7[r1] = r8     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Method r4 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L45
            goto L46
        L45:
            r4 = r6
        L46:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r4
            java.lang.String r4 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L55
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L55
            r7[r1] = r8     // Catch: java.lang.Exception -> L55
            java.lang.reflect.Method r4 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L55
            goto L57
        L55:
            r4 = r6
        L57:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r7 = "WorkSourceUtil"
            if (r4 == 0) goto L6e
            java.lang.String r4 = "createWorkChain"
            java.lang.reflect.Method r4 = r5.getMethod(r4, r6)     // Catch: java.lang.Exception -> L68
            goto L6f
        L68:
            r4 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r7, r8, r4)
        L6e:
            r4 = r6
        L6f:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r4 == 0) goto L92
            java.lang.String r4 = "android.os.WorkSource$WorkChain"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = "addNode"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L8c
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L8c
            r0[r1] = r9     // Catch: java.lang.Exception -> L8c
            r0[r2] = r3     // Catch: java.lang.Exception -> L8c
            java.lang.reflect.Method r0 = r4.getMethod(r8, r0)     // Catch: java.lang.Exception -> L8c
            goto L93
        L8c:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r7, r1, r0)
        L92:
            r0 = r6
        L93:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto La5
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r5.getMethod(r0, r6)     // Catch: java.lang.Exception -> La5
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> La6
            goto La6
        La5:
            r0 = r6
        La6:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource, int i, @NonNull String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i = -1;
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i = applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = zzg;
            if (method2 != null && (method = zzh) != null) {
                try {
                    Object invoke = method2.invoke(workSource, null);
                    int i2 = zza;
                    if (i != i2) {
                        method.invoke(invoke, Integer.valueOf(i), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i2), str2);
                } catch (Exception e) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e);
                }
            } else {
                add(workSource, i, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource, int i) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return null;
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static List<String> getNames(@NonNull WorkSource workSource) {
        int size;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            size = 0;
        } else {
            size = size(workSource);
        }
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@NonNull Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (AbstractC2525qi.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z = true;
            }
            zzj = Boolean.valueOf(z);
            return z;
        }
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        if (size(workSource) == 0) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return 0;
            }
        }
        return 0;
    }
}
