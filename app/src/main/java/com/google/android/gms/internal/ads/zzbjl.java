package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzbjl implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcexVar.zzde();
        } else if ("resume".equals(str)) {
            zzcexVar.zzdf();
        }
    }
}
