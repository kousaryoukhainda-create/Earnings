package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.gtm.zzfk;
/* loaded from: classes3.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    private zzfk zza;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfk();
        }
        this.zza.zza(context, intent);
    }
}
