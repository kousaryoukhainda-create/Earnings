package com.google.android.gms.internal.auth;

import android.os.Build;
import android.os.UserManager;
/* loaded from: classes3.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r8) {
        /*
            boolean r0 = zzb()
            r1 = 0
            if (r0 == 0) goto L5e
            boolean r0 = com.google.android.gms.internal.auth.zzcc.zzb
            if (r0 == 0) goto Lc
            goto L5e
        Lc:
            java.lang.Class<com.google.android.gms.internal.auth.zzcc> r0 = com.google.android.gms.internal.auth.zzcc.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.auth.zzcc.zzb     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L5e
        L15:
            r8 = move-exception
            goto L5c
        L17:
            r2 = 1
            r3 = 1
        L19:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L41
            android.os.UserManager r4 = com.google.android.gms.internal.auth.zzcc.zza     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L29
            java.lang.Object r4 = defpackage.Ga0.k(r8)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.zzcc.zza = r4     // Catch: java.lang.Throwable -> L15
        L29:
            android.os.UserManager r4 = com.google.android.gms.internal.auth.zzcc.zza     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L2f
            r8 = 1
            goto L54
        L2f:
            boolean r6 = defpackage.Qi0.l(r4)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L43
            if (r6 != 0) goto L3f
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L43
            boolean r8 = r4.isUserRunning(r6)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L43
            if (r8 != 0) goto L41
        L3f:
            r8 = 1
            goto L50
        L41:
            r8 = 0
            goto L50
        L43:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.zzcc.zza = r5     // Catch: java.lang.Throwable -> L15
            int r3 = r3 + 1
            goto L19
        L50:
            if (r8 == 0) goto L54
            com.google.android.gms.internal.auth.zzcc.zza = r5     // Catch: java.lang.Throwable -> L15
        L54:
            if (r8 == 0) goto L58
            com.google.android.gms.internal.auth.zzcc.zzb = r2     // Catch: java.lang.Throwable -> L15
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto L5e
            return r2
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r8
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcc.zza(android.content.Context):boolean");
    }

    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
