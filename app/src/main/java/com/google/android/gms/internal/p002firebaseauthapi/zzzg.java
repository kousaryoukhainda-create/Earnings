package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzg  reason: invalid package */
/* loaded from: classes3.dex */
final class zzzg<JcePrimitiveT> implements zzzh<JcePrimitiveT> {
    private final zzzj<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzh
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : zzzd.zza(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzzg(zzzj<JcePrimitiveT> zzzjVar) {
        this.zza = zzzjVar;
    }
}
