package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbc  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzbc {
    public static long zza(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = false;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        zzbb.zza(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long zzb(long j, long j2) {
        boolean z;
        long j3 = j - 1;
        boolean z2 = false;
        if ((1 ^ j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        zzbb.zza(z | z2, "checkedSubtract", j, 1L);
        return j3;
    }
}
