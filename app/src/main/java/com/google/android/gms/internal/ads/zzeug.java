package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzeug implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeug(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeug.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeue zzc() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzv.zzq();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzB(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i3 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new zzeue(networkOperator, i, com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zzb), phoneType, z, i2);
    }
}
