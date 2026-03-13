package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmw  reason: invalid package */
/* loaded from: classes3.dex */
final class zzmw implements zzms {
    private zzmw() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final zzmv zza() throws GeneralSecurityException {
        byte[] zza = zzaac.zza();
        return new zzmv(zza, zzaac.zza(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzaac.zza(bArr, bArr2);
    }
}
