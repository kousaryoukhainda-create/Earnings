package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzkk {
    public static long zza(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j + j2;
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        zzkl.zza(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long zzb(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if ((1 ^ j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = (-1) + j;
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        zzkl.zza(z | z2, "checkedSubtract", j, 1L);
        return j3;
    }
}
