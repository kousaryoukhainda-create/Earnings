package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzgat {
    public static byte zza(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzh(z, "out of range: %s", j);
        return (byte) j;
    }
}
