package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes3.dex */
public final class zzgjd {
    private static final ThreadLocal zza = new zzgjc();

    public static AlgorithmParameterSpec zza(byte[] bArr, int i, int i2) {
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        return new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, i, 12);
    }

    public static Cipher zzb() {
        return (Cipher) zza.get();
    }

    public static SecretKey zzc(byte[] bArr) throws GeneralSecurityException {
        zzgvm.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
