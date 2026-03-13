package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzgan {
    public static char zza(long j) {
        boolean z;
        char c = (char) j;
        if (c == j) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzh(z, "Out of range: %s", j);
        return c;
    }

    public static char zzb(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
