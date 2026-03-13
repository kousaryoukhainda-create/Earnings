package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* loaded from: classes3.dex */
public final class zzjm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zzb(Context context) {
        if (zza() && !zzd(context)) {
            return true;
        }
        return false;
    }

    public static boolean zzc(Context context) {
        if (zza() && !zzd(context)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
        r5 = true;
     */
    @android.annotation.TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzd(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.zzjm.zzb
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.zzjm> r0 = com.google.android.gms.internal.measurement.zzjm.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzjm.zzb     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L52
        L11:
            r2 = 1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.zzjm.zza     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L23
            java.lang.Object r3 = defpackage.Ga0.k(r7)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.zzjm.zza = r3     // Catch: java.lang.Throwable -> Lf
        L23:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.zzjm.zza     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L29
            r5 = 1
            goto L4c
        L29:
            boolean r6 = defpackage.Qi0.l(r3)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r7 != 0) goto L48
        L39:
            r5 = 1
            goto L48
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.zzjm.zza = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L48:
            if (r5 == 0) goto L4c
            com.google.android.gms.internal.measurement.zzjm.zza = r4     // Catch: java.lang.Throwable -> Lf
        L4c:
            if (r5 == 0) goto L50
            com.google.android.gms.internal.measurement.zzjm.zzb = r1     // Catch: java.lang.Throwable -> Lf
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjm.zzd(android.content.Context):boolean");
    }
}
