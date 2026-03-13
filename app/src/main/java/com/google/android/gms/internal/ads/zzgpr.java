package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes3.dex */
public final class zzgpr implements zzgog {
    public zzgpr(zzgom zzgomVar) throws GeneralSecurityException {
        if (zzgks.zza(2)) {
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
