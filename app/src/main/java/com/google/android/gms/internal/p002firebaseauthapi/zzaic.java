package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaic  reason: invalid package */
/* loaded from: classes3.dex */
public class zzaic implements zzaer<zzaic> {
    private static final String zza = "zzaic";
    private String zzb;
    private zzahs zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb */
    public final zzaic zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("email"));
            Strings.emptyToNull(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            Strings.emptyToNull(jSONObject.optString("displayName"));
            Strings.emptyToNull(jSONObject.optString("photoUrl"));
            this.zzc = zzahs.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = Strings.emptyToNull(jSONObject.optString(Constants.ID_TOKEN));
            this.zze = Strings.emptyToNull(jSONObject.optString("refreshToken"));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzaht> zze() {
        zzahs zzahsVar = this.zzc;
        if (zzahsVar != null) {
            return zzahsVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
