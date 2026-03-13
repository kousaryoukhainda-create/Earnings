package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public abstract class zzfxh {
    public static int zze(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    public abstract zzfxh zzb(Object obj);
}
