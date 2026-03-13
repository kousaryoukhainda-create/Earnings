package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdb  reason: invalid package */
/* loaded from: classes3.dex */
final class zzdb implements zzbe {
    private final zzdc zza;
    private final zzpo<zzdc> zzb;
    private final zzon zzc;
    private final zzon zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzdc zzdcVar : this.zzb.zza(bArr)) {
            try {
                byte[] zza = zzdcVar.zza.zza(bArr, bArr2);
                this.zzd.zza(zzdcVar.zzb, bArr.length);
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzd.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb = this.zza.zza.zzb(bArr, bArr2);
            this.zzc.zza(this.zza.zzb, bArr.length);
            return zzb;
        } catch (GeneralSecurityException e) {
            this.zzc.zza();
            throw e;
        }
    }

    private zzdb(zzdc zzdcVar, zzpo<zzdc> zzpoVar, zzon zzonVar, zzon zzonVar2) {
        this.zza = zzdcVar;
        this.zzb = zzpoVar;
        this.zzc = zzonVar;
        this.zzd = zzonVar2;
    }
}
