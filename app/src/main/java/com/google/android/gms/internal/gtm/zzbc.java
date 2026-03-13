package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.HashMap;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbc extends com.google.android.gms.analytics.zzj {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbc zzbcVar = (zzbc) zzjVar;
        int i = this.zza;
        if (i != 0) {
            zzbcVar.zza = i;
        }
        int i2 = this.zzb;
        if (i2 != 0) {
            zzbcVar.zzb = i2;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbcVar.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
