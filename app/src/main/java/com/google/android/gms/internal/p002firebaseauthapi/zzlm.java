package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlm  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzlm {
    private static final byte[] zza = new byte[0];

    public static zzlq zza(zzke zzkeVar) throws GeneralSecurityException {
        zzce zzb = zzkeVar.zzb();
        if (zzb instanceof zzdz) {
            return new zzlo((zzdz) zzb);
        }
        if (zzb instanceof zzdk) {
            return new zzlp((zzdk) zzb);
        }
        if (zzb instanceof zzjh) {
            return new zzlr((zzjh) zzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(zzb)));
    }
}
