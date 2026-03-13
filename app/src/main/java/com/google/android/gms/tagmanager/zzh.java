package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzh extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ADWORDS_CLICK_REFERRER.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.COMPONENT.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.CONVERSION_ID.toString();
    private final Context zzd;

    public zzh(Context context) {
        super(zza, zzc);
        this.zzd = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar == null) {
            return zzfu.zza();
        }
        String zzm = zzfu.zzm(zzfu.zzk(zzamVar));
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar2 != null) {
            str = zzfu.zzm(zzfu.zzk(zzamVar2));
        } else {
            str = null;
        }
        Context context = this.zzd;
        Map map2 = zzcw.zza;
        String str2 = (String) map2.get(zzm);
        if (str2 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str2 = "";
            if (sharedPreferences != null) {
                str2 = sharedPreferences.getString(zzm, "");
            }
            map2.put(zzm, str2);
        }
        String zza2 = zzcw.zza(str2, str);
        if (zza2 != null) {
            return zzfu.zzb(zza2);
        }
        return zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
