package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.util.Clock;
/* loaded from: classes3.dex */
final class zzde implements zzeb {
    private long zzb;
    private final Clock zze;
    private final Object zzc = new Object();
    private double zza = Math.min(1, 5);
    private final String zzd = "refreshing";

    public zzde(int i, int i2, long j, long j2, String str, Clock clock) {
        this.zze = clock;
    }

    @Override // com.google.android.gms.tagmanager.zzeb
    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long currentTimeMillis = this.zze.currentTimeMillis();
                long j = currentTimeMillis - this.zzb;
                if (j < 5000) {
                    String str = this.zzd;
                    Log.w("GoogleTagManager", "Excessive " + str + " detected; call ignored.");
                    return false;
                }
                double d = this.zza;
                if (d < 5.0d) {
                    double d2 = j / 900000.0d;
                    if (d2 > 0.0d) {
                        d = Math.min(5.0d, d + d2);
                        this.zza = d;
                    }
                }
                this.zzb = currentTimeMillis;
                if (d >= 1.0d) {
                    this.zza = d - 1.0d;
                    return true;
                }
                String str2 = this.zzd;
                Log.w("GoogleTagManager", "Excessive " + str2 + " detected; call ignored.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
