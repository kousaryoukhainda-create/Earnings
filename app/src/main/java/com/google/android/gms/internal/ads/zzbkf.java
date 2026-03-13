package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzbkf implements zzbjp {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            try {
                zzbke zzbkeVar = (zzbke) this.zzb.remove(str);
                if (zzbkeVar == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Received result for unexpected method invocation: " + str);
                } else if (!TextUtils.isEmpty(str2)) {
                    zzbkeVar.zza(str3 + concat);
                } else if (str5 == null) {
                    zzbkeVar.zzb(null);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                            String jSONObject2 = jSONObject.toString(2);
                            com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject2);
                        }
                        zzbkeVar.zzb(jSONObject);
                    } catch (JSONException e) {
                        zzbkeVar.zza(e.getMessage());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceFutureC2490qH zzb(zzbmw zzbmwVar, String str, JSONObject jSONObject) {
        zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbkd(this, zzcabVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbmwVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcabVar.zzd(e);
        }
        return zzcabVar;
    }

    public final void zzc(String str, zzbke zzbkeVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkeVar);
        }
    }
}
