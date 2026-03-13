package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahs  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzahs {
    private List<zzaht> zza;

    public zzahs() {
        this.zza = new ArrayList();
    }

    public static zzahs zza(JSONArray jSONArray) throws JSONException {
        zzaht zzahtVar;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    zzahtVar = new zzaht();
                } else {
                    zzahtVar = new zzaht(Strings.emptyToNull(jSONObject.optString("federatedId")), Strings.emptyToNull(jSONObject.optString("displayName")), Strings.emptyToNull(jSONObject.optString("photoUrl")), Strings.emptyToNull(jSONObject.optString(Constants.PROVIDER_ID)), null, Strings.emptyToNull(jSONObject.optString("phoneNumber")), Strings.emptyToNull(jSONObject.optString("email")));
                }
                arrayList.add(zzahtVar);
            }
            return new zzahs(arrayList);
        }
        return new zzahs(new ArrayList());
    }

    private zzahs(List<zzaht> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzaht> zza() {
        return this.zza;
    }
}
