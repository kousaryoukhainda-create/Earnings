package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzefj implements zzecy {
    private final zzdpm zza;

    public zzefj(zzdpm zzdpmVar) {
        this.zza = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        return new zzecz(this.zza.zzc(str, jSONObject), new zzees(), str);
    }
}
