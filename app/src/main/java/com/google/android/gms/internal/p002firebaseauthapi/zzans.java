package com.google.android.gms.internal.p002firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzans  reason: invalid package */
/* loaded from: classes3.dex */
final class zzans {
    private static boolean zza(byte b) {
        return b > -65;
    }

    public static /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zza(b2)) {
            if ((((b2 + 112) + (b << Ascii.FS)) >> 30) == 0 && !zza(b3) && !zza(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzalf.zzd();
    }

    public static /* synthetic */ void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static /* synthetic */ void zza(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zza(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !zza(b3)))) {
            cArr[i] = (char) (((b & Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw zzalf.zzd();
    }

    public static /* synthetic */ void zza(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !zza(b2)) {
            cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & 63));
            return;
        }
        throw zzalf.zzd();
    }
}
