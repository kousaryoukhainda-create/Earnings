package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaia  reason: invalid package */
/* loaded from: classes3.dex */
public class zzaia implements zzaer<zzaia> {
    private static final String zza = "zzaia";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb */
    public final zzaia zza(String str) throws zzaci {
        try {
            this.zzb = Strings.emptyToNull(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
