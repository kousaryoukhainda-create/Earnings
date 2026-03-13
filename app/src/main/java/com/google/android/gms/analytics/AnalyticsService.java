package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.gtm.zzfo;
import com.google.android.gms.internal.gtm.zzfp;
/* loaded from: classes3.dex */
public final class AnalyticsService extends Service implements zzfo {
    private zzfp zza;

    private final zzfp zzb() {
        if (this.zza == null) {
            this.zza = new zzfp(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzfo
    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        zzb();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzb().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzb().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        zzb().zza(intent, i, i2);
        return 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzfo
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
