package com.google.android.gms.internal.ads;

import com.fyber.fairbid.sdk.session.UserSessionStorage;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzbjn implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        if (map.keySet().contains(UserSessionStorage.START)) {
            zzcexVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcexVar.zzax(false);
        }
    }
}
