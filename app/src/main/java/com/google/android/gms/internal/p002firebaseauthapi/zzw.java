package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzw  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzw {
    public static int zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzae.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0324Hi.e(i2, "negative size: "));
            } else {
                zza = zzae.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i;
    }

    public static int zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, "index"));
        }
        return i;
    }

    private static String zzb(int i, int i2, String str) {
        if (i < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC0324Hi.e(i2, "negative size: "));
    }

    public static int zza(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, str));
        }
        return i;
    }

    public static <T> T zza(T t) {
        t.getClass();
        return t;
    }

    public static void zza(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(zzr.zza(obj));
        }
    }

    public static void zza(int i, int i2, int i3) {
        String zzb;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzb = zzb(i, i3, "start index");
            } else if (i2 >= 0 && i2 <= i3) {
                zzb = zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzb = zzb(i2, i3, "end index");
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }
}
