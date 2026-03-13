package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzain  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzain extends zzaij {
    private static final String zza = "zzain";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij
    /* renamed from: zzc */
    public final zzain zzb(String str) throws zzaci {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzae.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final /* synthetic */ zzaij zza(String str) throws zzaci {
        return (zzain) zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij
    public final String zza() {
        return this.zzb;
    }
}
