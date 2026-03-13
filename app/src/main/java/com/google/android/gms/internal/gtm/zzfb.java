package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
/* loaded from: classes3.dex */
public final class zzfb {
    private long zzb;
    private final Clock zze;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final String zzd = "tracking";

    public zzfb(int i, long j, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long currentTimeMillis = this.zze.currentTimeMillis();
                double d = this.zza;
                if (d < 60.0d) {
                    double d2 = (currentTimeMillis - this.zzb) / 2000.0d;
                    if (d2 > 0.0d) {
                        d = Math.min(60.0d, d + d2);
                        this.zza = d;
                    }
                }
                this.zzb = currentTimeMillis;
                if (d >= 1.0d) {
                    this.zza = d - 1.0d;
                    return true;
                }
                String str = this.zzd;
                zzfc.zze("Excessive " + str + " detected; call ignored.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
