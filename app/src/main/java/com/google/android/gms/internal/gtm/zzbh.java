package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.HashMap;
import java.util.UUID;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbh extends com.google.android.gms.analytics.zzj {
    private int zza;

    public zzbh() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        Preconditions.checkNotZero(leastSignificantBits);
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", null);
        Boolean bool = Boolean.FALSE;
        hashMap.put("interstitial", bool);
        hashMap.put("automatic", bool);
        AbstractC0324Hi.t(this.zza, hashMap, "screenId", 0, "referrerScreenId");
        hashMap.put("referrerScreenName", null);
        hashMap.put("referrerUri", null);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbh zzbhVar = (zzbh) zzjVar;
        TextUtils.isEmpty(null);
        int i = this.zza;
        if (i != 0) {
            zzbhVar.zza = i;
        }
        TextUtils.isEmpty(null);
        if (!TextUtils.isEmpty(null)) {
            TextUtils.isEmpty(null);
        }
    }

    public final int zzd() {
        return this.zza;
    }
}
