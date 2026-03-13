package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhj  reason: invalid package */
/* loaded from: classes3.dex */
final class zzhj extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        boolean zzb;
        try {
            Cipher zza = zzzd.zza.zza("ChaCha20-Poly1305");
            zzb = zzhk.zzb(zza);
            if (!zzb) {
                return null;
            }
            return zza;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
