package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaip  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaip extends zzaij {
    private static final String zza = "zzaip";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final /* synthetic */ zzaij zza(String str) throws zzaci {
        return (zzaip) zzb(str);
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij
    /* renamed from: zzc */
    public final zzaip zzb(String str) throws zzaci {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (optJSONObject != null) {
                this.zzc = zzae.zza(optJSONObject.optString("sharedSecretKey"));
                this.zzd = optJSONObject.optInt("verificationCodeLength");
                this.zze = zzae.zza(optJSONObject.optString("hashingAlgorithm"));
                this.zzf = optJSONObject.optInt("periodSec");
                this.zzb = zzae.zza(optJSONObject.optString("sessionInfo"));
                String optString = optJSONObject.optString("finalizeEnrollmentTime");
                try {
                    this.zzg = zzaoe.zza(zzaoe.zza(optString));
                } catch (ParseException unused) {
                    String str2 = zza;
                    Log.e(str2, "Failed to parse timestamp: " + optString);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij
    public final String zza() {
        return this.zzb;
    }
}
