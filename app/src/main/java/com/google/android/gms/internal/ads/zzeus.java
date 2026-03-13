package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzeus implements zzetq {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfra zzc;

    public zzeus(AdvertisingIdClient.Info info, String str, zzfra zzfraVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzg.put("rdid", this.zza.getId());
                zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzg.put("idtype", "adid");
                zzfra zzfraVar = this.zzc;
                if (zzfraVar.zzc()) {
                    zzg.put("paidv1_id_android_3p", zzfraVar.zzb());
                    zzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                zzg.put("pdid", str);
                zzg.put("pdidtype", "ssaid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
