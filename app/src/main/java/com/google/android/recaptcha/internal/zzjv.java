package com.google.android.recaptcha.internal;

import com.applovin.exoplayer2.common.base.Ascii;
/* loaded from: classes.dex */
public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            if (zzb() == zzjvVar.zzb() && zzc(zzjvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i = zze[0] & 255;
        for (int i2 = 1; i2 < zze.length; i2++) {
            i |= (zze[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & Ascii.SI]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv zzjvVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
