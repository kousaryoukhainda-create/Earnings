package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzzt implements zzso {
    private static final zzix.zza zza = zzix.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzzw();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzzt(byte[] bArr) throws GeneralSecurityException {
        zzzz.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb2 = zzse.zzb(zza2.doFinal(new byte[16]));
        this.zzd = zzb2;
        this.zze = zzse.zzb(zzb2);
    }

    private static Cipher zza() throws GeneralSecurityException {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzso
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zza2;
        if (i <= 16) {
            Cipher zza3 = zza();
            zza3.init(1, this.zzc);
            int length = bArr.length;
            int i2 = length == 0 ? 1 : ((length - 1) / 16) + 1;
            if ((i2 << 4) == bArr.length) {
                zza2 = zzyt.zza(bArr, (i2 - 1) << 4, this.zzd, 0, 16);
            } else {
                zza2 = zzyt.zza(zzse.zza(Arrays.copyOfRange(bArr, (i2 - 1) << 4, bArr.length)), this.zze);
            }
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            for (int i3 = 0; i3 < i2 - 1; i3++) {
                zza(bArr2, bArr, i3 << 4, bArr3);
                if (zza3.doFinal(bArr3, 0, 16, bArr2) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            zza(bArr2, zza2, 0, bArr3);
            if (zza3.doFinal(bArr3, 0, 16, bArr2) == 16) {
                return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
