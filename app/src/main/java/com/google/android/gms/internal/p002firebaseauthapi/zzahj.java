package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahj  reason: invalid package */
/* loaded from: classes3.dex */
public class zzahj implements zzaer<zzahj> {
    private static final String zza = "zzahj";
    private String zzb;

    public zzahj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb */
    public final zzahj zza(String str) throws zzaci {
        try {
            this.zzb = Strings.emptyToNull(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    public zzahj(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
