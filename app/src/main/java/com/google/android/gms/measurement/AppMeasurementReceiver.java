package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzhk;
/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends Fc0 implements zzhk.zza {
    private zzhk zza;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhk.zza
    public void doStartService(@NonNull Context context, @NonNull Intent intent) {
        Fc0.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzhk(this);
        }
        this.zza.zza(context, intent);
    }
}
