package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsg  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzsg implements zzqz {
    private static final zzix.zza zza = zzix.zza.zzb;

    public zzsg(zzrc zzrcVar) throws GeneralSecurityException {
        if (zza.zza()) {
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
