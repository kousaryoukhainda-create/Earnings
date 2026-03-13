package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzcv;
import com.google.android.gms.internal.gtm.zzfd;
import com.google.android.gms.internal.gtm.zzfu;
/* loaded from: classes3.dex */
public class CampaignTrackingReceiver extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfu.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, Intent intent) {
        zzbx zzg = zzbx.zzg(context);
        zzfd zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzQ("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        zzm.zzO("CampaignTrackingReceiver received", action);
        if ("com.android.vending.INSTALL_REFERRER".equals(action) && !TextUtils.isEmpty(stringExtra)) {
            zza(context, stringExtra);
            zzg.zzj();
            zzg.zzj();
            int zzf = zzcv.zzf();
            if (stringExtra.length() > zzf) {
                zzm.zzS("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(zzf));
                stringExtra = stringExtra.substring(0, zzf);
            }
            zzg.zzf().zzf(stringExtra, new zzc(this, goAsync()));
            return;
        }
        zzm.zzQ("CampaignTrackingReceiver received unexpected intent without referrer extra");
    }

    public void zza(@NonNull Context context, @NonNull String str) {
    }
}
