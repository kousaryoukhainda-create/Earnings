package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziu  reason: invalid package */
/* loaded from: classes3.dex */
final class zziu extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            Cipher zza = zzzd.zza.zza("AES/GCM-SIV/NoPadding");
            if (!zzhc.zza(zza)) {
                return null;
            }
            return zza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
