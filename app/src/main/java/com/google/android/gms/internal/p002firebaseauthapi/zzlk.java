package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlk  reason: invalid package */
/* loaded from: classes3.dex */
final class zzlk implements zzmb {
    private final int zza;

    public zzlk(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(AbstractC0324Hi.e(i, "Unsupported key length: "));
        }
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final byte[] zzc() throws GeneralSecurityException {
        int i = this.zza;
        if (i != 16) {
            if (i == 32) {
                return zzmn.zzj;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzmn.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.zza) {
            return new zzhr(bArr).zza(bArr2, bArr3, i, bArr4);
        }
        throw new InvalidAlgorithmParameterException(AbstractC0324Hi.e(bArr.length, "Unexpected key length: "));
    }
}
