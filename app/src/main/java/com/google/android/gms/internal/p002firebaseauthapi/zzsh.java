package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsh  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzsh implements zzqz {
    private static final zzix.zza zza = zzix.zza.zza;

    public zzsh(zzqp zzqpVar) throws GeneralSecurityException {
        if (zza.zza()) {
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
