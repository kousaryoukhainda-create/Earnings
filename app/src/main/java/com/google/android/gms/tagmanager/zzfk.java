package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
abstract class zzfk extends zzdx {
    public zzfk(String str) {
        super(str);
    }

    public abstract boolean zzc(String str, String str2, Map map);

    @Override // com.google.android.gms.tagmanager.zzdx
    public final boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map) {
        String zzm = zzfu.zzm(zzfu.zzk(zzamVar));
        String zzm2 = zzfu.zzm(zzfu.zzk(zzamVar2));
        if (zzm != zzfu.zzl() && zzm2 != zzfu.zzl()) {
            return zzc(zzm, zzm2, map);
        }
        return false;
    }
}
