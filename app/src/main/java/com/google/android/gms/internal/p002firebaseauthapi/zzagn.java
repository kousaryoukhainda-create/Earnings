package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagn  reason: invalid package */
/* loaded from: classes3.dex */
public class zzagn implements zzaer<zzagn> {
    private static final String zza = "zzagn";
    private List<String> zzb;

    public zzagn() {
        zzaio.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb */
    public final zzagn zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString(Constants.PROVIDER_ID, null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                zzaio.zza();
            } else {
                new zzaio(1, zzajc.zza(jSONObject.optJSONArray("allProviders")));
            }
            this.zzb = zzajc.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e2) {
            e = e2;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
