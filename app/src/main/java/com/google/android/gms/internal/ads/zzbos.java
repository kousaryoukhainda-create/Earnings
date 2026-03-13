package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzbos implements zzgbo {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final InterfaceFutureC2490qH zzb;

    public zzbos(InterfaceFutureC2490qH interfaceFutureC2490qH, String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        this.zzb = interfaceFutureC2490qH;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final InterfaceFutureC2490qH zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final InterfaceFutureC2490qH zzb(final Object obj) {
        return zzgch.zzn(this.zzb, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj2) {
                return zzbos.this.zzc(obj, (zzbnt) obj2);
            }
        }, zzbzw.zzg);
    }

    public final /* synthetic */ InterfaceFutureC2490qH zzc(Object obj, zzbnt zzbntVar) throws Exception {
        zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzbjo.zzo.zzc(uuid, new zzbor(this, zzcabVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbntVar.zzl(this.zza, jSONObject);
        return zzcabVar;
    }
}
