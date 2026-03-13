package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbzz;
/* loaded from: classes3.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbeh.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    InterfaceFutureC2490qH zzb = new zzc(context).zzb();
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Updating ad debug logging enablement.");
                    zzbzz.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
