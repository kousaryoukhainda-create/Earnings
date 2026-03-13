package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmq  reason: invalid package */
/* loaded from: classes3.dex */
final class zzmq implements zzme {
    private final zzzc zza;
    private final zzly zzb;

    private zzmq(zzly zzlyVar, zzzc zzzcVar) {
        this.zzb = zzlyVar;
        this.zza = zzzcVar;
    }

    public static zzmq zza(zzzc zzzcVar) throws GeneralSecurityException {
        int i = zzmt.zza[zzzcVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new zzmq(new zzly("HmacSha512"), zzzc.NIST_P521);
                }
                throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(zzzcVar)));
            }
            return new zzmq(new zzly("HmacSha384"), zzzc.NIST_P384);
        }
        return new zzmq(new zzly("HmacSha256"), zzzc.NIST_P256);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzme
    public final byte[] zza(byte[] bArr, zzmh zzmhVar) throws GeneralSecurityException {
        byte[] zza = zzyz.zza(zzyz.zza(this.zza, zzmhVar.zza().zzb()), zzyz.zza(zzyz.zza(this.zza), zzzb.UNCOMPRESSED, bArr));
        byte[] zza2 = zzyt.zza(bArr, zzmhVar.zzb().zzb());
        byte[] zza3 = zzmn.zza(zza());
        zzly zzlyVar = this.zzb;
        return zzlyVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzlyVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzme
    public final byte[] zza() throws GeneralSecurityException {
        int i = zzmt.zza[this.zza.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzmn.zze;
                }
                throw new GeneralSecurityException("Could not determine HPKE KEM ID");
            }
            return zzmn.zzd;
        }
        return zzmn.zzc;
    }
}
