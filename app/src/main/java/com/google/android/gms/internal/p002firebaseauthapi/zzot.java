package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzot  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzot {
    private static final zzot zza = new zzot();
    private final Map<Class<? extends zzce>, zzow<? extends zzce>> zzb = new HashMap();

    public static zzot zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzce> void zza(zzow<ParametersT> zzowVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            zzow<? extends zzce> zzowVar2 = this.zzb.get(cls);
            if (zzowVar2 != null && !zzowVar2.equals(zzowVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzowVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
