package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzago  reason: invalid package */
/* loaded from: classes3.dex */
public class zzago implements zzaer<zzago> {
    private static final String zza = "zzago";
    private String zzb;
    private String zzc;
    private boolean zzd;
    private long zze;
    private List<zzahq> zzf;
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb */
    public final zzago zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString("email", null);
            this.zzb = jSONObject.optString(Constants.ID_TOKEN, null);
            this.zzc = jSONObject.optString("refreshToken", null);
            this.zzd = jSONObject.optBoolean("isNewUser", false);
            this.zze = jSONObject.optLong("expiresIn", 0L);
            this.zzf = zzahq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzg = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    public final long zza() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzg;
    }

    @NonNull
    public final String zzd() {
        return this.zzc;
    }

    public final List<zzahq> zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        if (!TextUtils.isEmpty(this.zzg)) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        return this.zzd;
    }

    @NonNull
    public final String zzb() {
        return this.zzb;
    }
}
