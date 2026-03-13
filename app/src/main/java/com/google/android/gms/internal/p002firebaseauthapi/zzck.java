package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzck  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzck {
    private static final zzck zza = new zzck();

    private zzck() {
    }

    public static zzck zza() {
        return zza;
    }

    public static zzck zza(zzck zzckVar) throws GeneralSecurityException {
        if (zzckVar != null) {
            return zzckVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
