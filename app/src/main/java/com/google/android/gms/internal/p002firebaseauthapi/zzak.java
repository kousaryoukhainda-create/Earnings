package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak  reason: invalid package */
/* loaded from: classes3.dex */
public class zzak<E> {
    public static int zza(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }
}
