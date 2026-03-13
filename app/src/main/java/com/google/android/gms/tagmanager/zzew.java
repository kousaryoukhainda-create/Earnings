package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* loaded from: classes3.dex */
final class zzew implements zzeb {
    private long zzb;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final Clock zzd = DefaultClock.getInstance();

    @Override // com.google.android.gms.tagmanager.zzeb
    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long currentTimeMillis = this.zzd.currentTimeMillis();
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
                Log.w("GoogleTagManager", "No more tokens available.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
