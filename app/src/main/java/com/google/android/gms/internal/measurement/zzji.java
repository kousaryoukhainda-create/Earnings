package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
public final class zzji {
    private static zzjh zza;

    public static synchronized void zza(zzjh zzjhVar) {
        synchronized (zzji.class) {
            if (zza == null) {
                zza = zzjhVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }

    public static synchronized zzjh zzb() {
        zzjh zzjhVar;
        synchronized (zzji.class) {
            try {
                if (zza == null) {
                    zza(new zzjl());
                }
                zzjhVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjhVar;
    }
}
