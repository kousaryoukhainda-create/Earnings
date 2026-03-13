package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes3.dex */
public abstract class zzdx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG1.toString();

    public zzdx(String str) {
        super(str, zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        for (com.google.android.gms.internal.gtm.zzam zzamVar : map.values()) {
            if (zzamVar == zzfu.zza()) {
                return zzfu.zzb(Boolean.FALSE);
            }
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zza);
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        boolean z = false;
        if (zzamVar2 != null && zzamVar3 != null) {
            z = zzd(zzamVar2, zzamVar3, map);
        }
        return zzfu.zzb(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }

    public abstract boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map);
}
