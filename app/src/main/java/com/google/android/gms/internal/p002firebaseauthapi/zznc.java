package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznc  reason: invalid package */
/* loaded from: classes3.dex */
public final class zznc {
    public static zzbe zza(String str) throws GeneralSecurityException {
        return new zznb(str, zza());
    }

    public static boolean zzb(String str) throws GeneralSecurityException {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
