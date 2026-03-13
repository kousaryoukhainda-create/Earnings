package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznb  reason: invalid package */
/* loaded from: classes3.dex */
final class zznb implements zzbe {
    private final SecretKey zza;

    public zznb(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.zza = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException(AbstractC2437ph.g("Keystore cannot load the key with ID: ", str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.zza, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new BadPaddingException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.zza);
            cipher.updateAAD(bArr2);
            if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) == bArr.length + 16) {
                byte[] iv = cipher.getIV();
                if (iv.length == 12) {
                    System.arraycopy(iv, 0, bArr3, 0, 12);
                    return bArr3;
                }
                throw new GeneralSecurityException("IV has unexpected length");
            }
            throw new GeneralSecurityException("encryption failed: bytesWritten is wrong");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
