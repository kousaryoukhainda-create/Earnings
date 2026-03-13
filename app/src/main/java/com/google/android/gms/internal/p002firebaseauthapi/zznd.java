package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznd  reason: invalid package */
/* loaded from: classes3.dex */
public final class zznd implements zzca {
    private static final Object zza = new Object();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zznd$zza */
    /* loaded from: classes3.dex */
    public static final class zza {
        public zza() {
            zznd.zza();
        }
    }

    public zznd() throws GeneralSecurityException {
        this(new zza());
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) throws GeneralSecurityException {
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec build;
        synchronized (zza) {
            try {
                String zza2 = zzzz.zza("android-keystore://", str);
                if (!zznc.zzb(zza2)) {
                    a.g();
                    keySize = a.d(zza2).setKeySize(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    blockModes = keySize.setBlockModes(CodePackage.GCM);
                    encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
                    build = encryptionPaddings.build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(build);
                    keyGenerator.generateKey();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final boolean zzb(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return true;
        }
        return false;
    }

    private zznd(zza zzaVar) {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final zzbe zza(String str) throws GeneralSecurityException {
        zzne zzneVar;
        try {
            synchronized (zza) {
                zzneVar = new zzne(zzzz.zza("android-keystore://", str));
                byte[] zza2 = zzqg.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(zza2, zzneVar.zza(zzneVar.zzb(zza2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zzneVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
