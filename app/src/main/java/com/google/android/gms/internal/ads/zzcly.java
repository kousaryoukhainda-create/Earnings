package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzcly implements zzcla {
    private final zzduv zza;

    public zzcly(zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES));
    }
}
