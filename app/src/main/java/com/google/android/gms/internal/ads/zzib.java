package com.google.android.gms.internal.ads;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzib extends zzbd {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzab zzf;
    public final int zzg;
    public final zzug zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
        Integer.toString(1006, 36);
    }

    private zzib(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzib zzb(Throwable th, String str, int i, zzab zzabVar, int i2, boolean z, int i3) {
        int i4;
        if (zzabVar == null) {
            i4 = 4;
        } else {
            i4 = i2;
        }
        return new zzib(1, th, null, i3, str, i, zzabVar, i4, z);
    }

    public static zzib zzc(IOException iOException, int i) {
        return new zzib(0, iOException, i);
    }

    public static zzib zzd(RuntimeException runtimeException, int i) {
        return new zzib(2, runtimeException, i);
    }

    public final zzib zza(zzug zzugVar) {
        String message = getMessage();
        int i = zzei.zza;
        return new zzib(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzugVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzib(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzab r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L59
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L5f
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzei.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            java.lang.String r0 = defpackage.AbstractC0324Hi.h(r2, r1, r0)
            goto L5f
        L59:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L5f:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6c
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L6c:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzab, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzib(java.lang.String r10, java.lang.Throwable r11, int r12, int r13, java.lang.String r14, int r15, com.google.android.gms.internal.ads.zzab r16, int r17, com.google.android.gms.internal.ads.zzug r18, long r19, boolean r21) {
        /*
            r9 = this;
            r7 = r9
            r8 = r21
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L1a
            r2 = r13
            if (r2 != r1) goto L18
            r2 = 1
        L16:
            r3 = 1
            goto L1c
        L18:
            r3 = 0
            goto L1c
        L1a:
            r2 = r13
            goto L16
        L1c:
            com.google.android.gms.internal.ads.zzcw.zzd(r3)
            if (r11 != 0) goto L22
            goto L23
        L22:
            r0 = 1
        L23:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            r7.zzc = r2
            r0 = r14
            r7.zzd = r0
            r0 = r15
            r7.zze = r0
            r0 = r16
            r7.zzf = r0
            r0 = r17
            r7.zzg = r0
            r0 = r18
            r7.zzh = r0
            r7.zzi = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.zzab, int, com.google.android.gms.internal.ads.zzug, long, boolean):void");
    }
}
