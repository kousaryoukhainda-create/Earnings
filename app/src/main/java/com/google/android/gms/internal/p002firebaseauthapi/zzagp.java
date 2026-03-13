package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagp  reason: invalid package */
/* loaded from: classes3.dex */
public class zzagp implements zzaes {
    private static final String zza = "zzagp";
    private final String zzb;
    private final String zzc;
    private final EmailAuthCredential zzd;
    private final String zze;
    private final String zzf;

    static {
        new Logger(zza, new String[0]);
    }

    public zzagp(EmailAuthCredential emailAuthCredential, String str, String str2) {
        this.zzd = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential);
        this.zzb = Preconditions.checkNotEmpty(emailAuthCredential.b);
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.d);
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        C2379p1 c2379p1;
        String str;
        String str2 = this.zzc;
        zzan zzanVar = C2379p1.d;
        Preconditions.checkNotEmpty(str2);
        String str3 = null;
        try {
            c2379p1 = new C2379p1(str2);
        } catch (IllegalArgumentException unused) {
            c2379p1 = null;
        }
        if (c2379p1 != null) {
            str = c2379p1.a;
        } else {
            str = null;
        }
        if (c2379p1 != null) {
            str3 = c2379p1.c;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put(Constants.ID_TOKEN, str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajc.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final EmailAuthCredential zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
