package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpa  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzpa {
    private static final zzpa zza = new zzpa();
    private final Map<String, zzce> zzb = new HashMap();

    public static zzpa zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzce zzceVar) throws GeneralSecurityException {
        try {
            if (this.zzb.containsKey(str)) {
                if (this.zzb.get(str).equals(zzceVar)) {
                    return;
                }
                String valueOf = String.valueOf(this.zzb.get(str));
                String valueOf2 = String.valueOf(zzceVar);
                throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
            }
            this.zzb.put(str, zzceVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza(Map<String, zzce> map) throws GeneralSecurityException {
        for (Map.Entry<String, zzce> entry : map.entrySet()) {
            zza(entry.getKey(), entry.getValue());
        }
    }
}
