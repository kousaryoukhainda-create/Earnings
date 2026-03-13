package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbd extends com.google.android.gms.analytics.zzj {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", null);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        String str;
        zzbd zzbdVar = (zzbd) zzjVar;
        zzbdVar.zza.addAll(this.zza);
        zzbdVar.zzb.addAll(this.zzb);
        for (Map.Entry entry : this.zzc.entrySet()) {
            String str2 = (String) entry.getKey();
            for (Product product : (List) entry.getValue()) {
                if (product != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!zzbdVar.zzc.containsKey(str)) {
                        zzbdVar.zzc.put(str, new ArrayList());
                    }
                    ((List) zzbdVar.zzc.get(str)).add(product);
                }
            }
        }
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map zzf() {
        return this.zzc;
    }
}
