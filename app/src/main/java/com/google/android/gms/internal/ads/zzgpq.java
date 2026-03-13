package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes3.dex */
public final class zzgpq implements zzgog {
    public zzgpq(zzgnx zzgnxVar) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
