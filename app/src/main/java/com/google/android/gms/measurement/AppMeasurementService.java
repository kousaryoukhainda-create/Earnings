package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzns;
/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zzno {
    private zzns zza;

    private final zzns zzd() {
        if (this.zza == null) {
            this.zza = new zzns(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        return zzd().zzd(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zza();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(@NonNull Intent intent) {
        zzd();
        zzns.zzi(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        zzd().zzc(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NonNull Intent intent) {
        zzd();
        zzns.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzb(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzc(@NonNull Intent intent) {
        Fc0.completeWakefulIntent(intent);
    }
}
