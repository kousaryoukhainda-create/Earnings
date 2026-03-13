package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzeoa implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeoa(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
            return registerReceiver;
        }
        return this.zzb.registerReceiver(null, intentFilter);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    @SuppressLint({"UnprotectedReceiver"})
    public final InterfaceFutureC2490qH zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoa.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeob zzc() throws Exception {
        boolean z;
        double d = -1.0d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlS)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            if (batteryManager != null) {
                d = batteryManager.getIntProperty(4) / 100.0d;
            }
            if (Build.VERSION.SDK_INT >= 23 && batteryManager != null) {
                z = batteryManager.isCharging();
            } else {
                z = zze(zzd());
            }
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            if (zzd != null) {
                d = zzd.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / zzd.getIntExtra("scale", -1);
            }
            z = zze;
        }
        return new zzeob(d, z);
    }
}
