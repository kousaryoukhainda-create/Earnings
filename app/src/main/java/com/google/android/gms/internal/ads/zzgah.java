package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgah {
    public static long zza(double d) {
        zzfun.zzf(zzb(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits + doubleToRawLongBits;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean zzb(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }
}
