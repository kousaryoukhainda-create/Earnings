package com.google.android.gms.tagmanager;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzaq extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.FUNCTION_CALL.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.FUNCTION_CALL_NAME.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ADDITIONAL_PARAMS.toString();
    private final zzap zzd;

    public zzaq(zzap zzapVar) {
        super(zza, zzb);
        this.zzd = zzapVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzm = zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzb)));
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar != null) {
            Object zzk = zzfu.zzk(zzamVar);
            if (!(zzk instanceof Map)) {
                Log.w("GoogleTagManager", "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzfu.zza();
            }
            for (Map.Entry entry : ((Map) zzk).entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        try {
            return zzfu.zzb(this.zzd.zza(zzm, hashMap));
        } catch (Exception e) {
            String message = e.getMessage();
            Log.w("GoogleTagManager", "Custom macro/tag " + zzm + " threw exception " + message);
            return zzfu.zza();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
